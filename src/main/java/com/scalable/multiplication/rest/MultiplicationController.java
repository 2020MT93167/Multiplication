package com.scalable.multiplication.rest;

import com.scalable.multiplication.domain.MultiplicationRequest;
import com.scalable.multiplication.domain.MultiplicationResponse;
import com.scalable.multiplication.service.MultiplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MultiplicationController {

    @Autowired
    MultiplicationService multiplicationService;

    @PostMapping("/multiply")
    public MultiplicationResponse add(@RequestBody MultiplicationRequest request) throws Exception {
        if (request.getFirstOperand() != null && request.getSecondOperand() != null)
            return multiplicationService.response(request);
        else
         return new MultiplicationResponse();
    }
}
