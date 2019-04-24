/**
 * 
 */
package com.macaitech.mcstream.receive.rest;

import java.util.Map;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.macaitech.mcstream.common.vo.Result;

/**
 * @author yuhui.tang
 *
 */
@RestController
public class ReceiveController {
	
    @PostMapping("/stream-receive")
    public Result receiveStream(@RequestBody String jsonContent) {
    	    	
    	System.out.println(jsonContent);
    	
    	return new Result<>();
    }
    
    @GetMapping("/stream-receive-test")
    public Result receiveTest() {
    	
    	Result result = new Result<>();
    	Map<String,String> data = new HashedMap();
    	data.put("test", "ok");
    	result.success(data);
    	return result;
    }
}
