package com.yueniu.ynstream.receive.service;

import org.springframework.stereotype.Component;

import com.yueniu.ynstream.common.exception.SystemErrorType;
import com.yueniu.ynstream.common.vo.Result;

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
