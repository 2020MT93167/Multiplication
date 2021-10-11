package com.scalable.multiplication.service;

import com.scalable.multiplication.domain.MultiplicationRequest;
import com.scalable.multiplication.domain.MultiplicationResponse;

public interface MultiplicationService {
    MultiplicationResponse response(MultiplicationRequest request) throws Exception;
}
