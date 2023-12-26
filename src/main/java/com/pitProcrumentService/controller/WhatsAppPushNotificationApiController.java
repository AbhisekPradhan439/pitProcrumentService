package com.pitProcrumentService.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pitProcrumentService.service.WhatsAppPushNotificationApiService;

@RestController
@RequestMapping("/api/WhatsAppPushnotification")
public class WhatsAppPushNotificationApiController {
	
	@Autowired
	private WhatsAppPushNotificationApiService whatsAppPushNotificationApiService;
	 @GetMapping("/notify")
	    public void whatsAppaPUshNotification() {
	        // Assuming you want to send a default message in this endpoint
	        whatsAppPushNotificationApiService.whatsAppPushNotification();
	    }
		/*
		 * @PostMapping("/api/post") public String handlePostRequest(@RequestBody
		 * Map<String, String> requestBody) { String phoneNumber =
		 * requestBody.get("phoneNumber"); String message = requestBody.get("message");
		 * 
		 * whatsAppPushNotificationApiService.whatsAppPushNotification(phoneNumber,
		 * message);
		 * 
		 * return "WhatsApp message sent to " + phoneNumber;
		 * 
		 * }
		 */
		
}
