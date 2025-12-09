package com.leo.email.services;

import com.leo.email.models.EmailModel;
import com.leo.email.repsitories.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    EmailRepository emailRepository;

    public void sendEmail(EmailModel emailModel) {

    }
}
