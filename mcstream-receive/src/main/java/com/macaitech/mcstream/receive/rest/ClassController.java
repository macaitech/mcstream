package com.macaitech.mcstream.receive.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.macaitech.mcstream.common.vo.Result;
import com.macaitech.mcstream.receive.service.ClassService;

import java.util.Map;

@RestController
public class ClassController {

    @Autowired
    private ClassService classService;

    @GetMapping("/classes")
    public Result hello(@RequestParam String name) {
        return classService.users(name);
    }

    @PostMapping("/classes")
    public Result hello(@RequestBody Map map) {
        return classService.users(map);
    }

}
