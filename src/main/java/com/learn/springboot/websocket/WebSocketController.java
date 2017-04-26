package com.learn.springboot.websocket;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liutao on 17/4/26.
 *
 */
@Controller
public class WebSocketController {
	@Autowired
	private WebSocketService ws;

	// http://localhost:8080/Welcome1
	@RequestMapping("/Welcome1")
	@ResponseBody
	public String say2() throws Exception {
		ws.sendMessage();
		return "is ok";
	}
}