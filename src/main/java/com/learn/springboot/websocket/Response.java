package com.learn.springboot.websocket;

/**
 * Created by liutao on 17/4/26. 服务器向浏览器发送的此类消息。
 */
public class Response {
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	private String responseMessage;

	public Response(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public String getResponseMessage() {
		return responseMessage;
	}
}