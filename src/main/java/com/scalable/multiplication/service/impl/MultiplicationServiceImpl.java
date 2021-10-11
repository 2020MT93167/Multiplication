package com.scalable.multiplication.service.impl;

import com.scalable.multiplication.domain.MultiplicationRequest;
import com.scalable.multiplication.domain.MultiplicationResponse;
import com.scalable.multiplication.service.MultiplicationService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class MultiplicationServiceImpl implements MultiplicationService {
    @Override
    public MultiplicationResponse response(MultiplicationRequest request) throws Exception {
        MultiplicationResponse resp = new MultiplicationResponse();
        final BigDecimal firstOperand = getOperand(request.getFirstOperand());
        final BigDecimal secondOperand = getOperand(request.getSecondOperand());

        final BigDecimal result = firstOperand.multiply(secondOperand);
        resp.setResult(result.toString());
        return resp;
    }

    private BigDecimal getOperand(final BigDecimal operand ) throws Exception {
        return Optional.ofNullable(operand).orElseThrow(Exception::new);
    }
}
