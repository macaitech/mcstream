/**
 * 
 */
package org.mcstream.consumer.remote;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.macaitech.mcstream.common.vo.Result;

/**
 * @author yuhui.tang
 *
 */
@FeignClient(name= "mcstream-receive")
public interface StreamReceiveRemote {
	
	
	@PostMapping("/stream-receive")
    public Result receiveStream(@RequestBody String json) ;
}
