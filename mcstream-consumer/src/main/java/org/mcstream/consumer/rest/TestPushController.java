/**
 * 
 */
package org.mcstream.consumer.rest;

import org.apache.commons.lang.math.RandomUtils;
import org.mcstream.consumer.remote.StreamReceiveRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.macaitech.mcstream.common.bo.StreamCommandData;
import com.macaitech.mcstream.common.bo.StreamContent;
import com.macaitech.mcstream.common.enums.ContentType;
import com.macaitech.mcstream.common.enums.DataCommandType;
import com.macaitech.mcstream.common.vo.Result;
import com.macaitech.mcstream.push.PushService;

/**
 * @author yuhui.tang
 *
 */
@RestController
public class TestPushController {
	
	private PushService pushService;
	
	@Autowired
	private StreamReceiveRemote receiveRemote;

	 public TestPushController() {
		super();
		this.pushService = PushService.getInstance("D:\\work\\fqueue");
	}


	@GetMapping("/stream-push")
    public Result pushStream() {
		String contentId =String.valueOf(RandomUtils.nextInt());
		StreamContent streamContent = new StreamContent(ContentType.ContentType_Article.getType(), contentId);
		StreamCommandData commandData = 
				new StreamCommandData(DataCommandType.DataCommandType_Insert, streamContent);
		//this.pushService.push(commandData);
		String json = JSONObject.toJSONString(commandData);
		
    	this.receiveRemote.receiveStream(json);
    	return new Result<>();
    }
	
}
