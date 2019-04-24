package com.macaitech.mcstream.receive.service;

import org.springframework.stereotype.Component;

import com.macaitech.mcstream.common.exception.SystemErrorType;
import com.macaitech.mcstream.common.vo.Result;

import java.util.Map;

@Component
public class ClassServiceFallback implements ClassService {
    @Override
    public Result users(String name) {
        return Result.fail(SystemErrorType.SYSTEM_BUSY);
    }

    @Override
    public Result users(Map map) {
        return Result.fail(SystemErrorType.SYSTEM_BUSY);
    }
}
