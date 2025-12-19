package com.example.loans.service.impl;

import com.example.loans.constants.LoansConstants;
import com.example.loans.dto.LoansDto;
import com.example.loans.entity.Loans;
import com.example.loans.exception.LoanAlreadyExistsException;
import com.example.loans.exception.ResourceNotFoundException;
import com.example.loans.mapper.LoansMapper;
import com.example.loans.repository.LoansRepository;
import com.example.loans.service.ILoansService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Random;

@Service
@AllArgsConstructor
public class LoansServiceImpl implements ILoansService {

    private LoansRepository loansRepository;

    @Override
    public void createLoan(String mobileNumber) {
        if(loansRepository.findByMobileNumber(mobileNumber).isPresent()) {
            throw new LoanAlreadyExistsException("Loan already exists with Mobile Number: " + mobileNumber);
        }
        loansRepository.save(createNewLoan(mobileNumber));
    }

    public Loans createNewLoan(String mobileNumber) {
        Loans newLoan = new Loans();
        newLoan.setMobileNumber(mobileNumber);
        newLoan.setLoanNumber(String.valueOf(100000000000L + new Random().nextInt(900000000)));
        newLoan.setLoanType(LoansConstants.HOME_LOAN);
        newLoan.setTotalLoan(100000);
        newLoan.setAmountPaid(0);
        newLoan.setOutstandingAmount(100000);
        return newLoan;
    }

    @Override
    public LoansDto fetchLoan(String mobileNumber) {
        Loans loans = loansRepository.findByMobileNumber(mobileNumber).orElseThrow(
                () -> new ResourceNotFoundException("Loans", "Mobile Number", mobileNumber)
        );
        return LoansMapper.mapToLoansDto(loans, new LoansDto());
    }

    @Override
    public boolean updateLoan(LoansDto loansDto) {
        Loans loans = loansRepository.findByMobileNumber(loansDto.getMobileNumber()).orElseThrow(
                () -> new ResourceNotFoundException("Loans", "Mobile Number", loansDto.getMobileNumber())
        );
        LoansMapper.mapToLoans(loansDto, loans);
        loansRepository.save(loans);
        return true;
    }

    @Override
    public boolean deleteLoan(String mobileNumber) {
        Loans loans = loansRepository.findByMobileNumber(mobileNumber).orElseThrow(
                () -> new ResourceNotFoundException("Loans", "Mobile Number", mobileNumber)
        );
        loansRepository.deleteById(loans.getLoanId());
        return true;
    }

}
