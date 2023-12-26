package com.pitProcrumentService.service.impl;

import com.pitProcrumentService.service.WhatsAppPushNotificationApiService;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import org.springframework.stereotype.Service;

@Service
public class WhatsAppPushNotificationApiServiceImpl implements WhatsAppPushNotificationApiService {

    @Override
    public void whatsAppPushNotification() {
        final String ACCOUNT_SID = "AC1d1015506271303a515a90a85e076545";
        final String AUTH_TOKEN = "86cd85c3c0fca7603d4e8caafc2de561";

        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message twilioMessage = Message.creator(
                new com.twilio.type.PhoneNumber("whatsapp:+918847867439"),
                new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
                "Welcome")
            .create();

        System.out.println("WhatsApp Message SID: " + twilioMessage.getSid());
    }
}



