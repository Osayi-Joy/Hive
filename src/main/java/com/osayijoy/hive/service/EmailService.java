package com.osayijoy.hive.service;



import com.osayijoy.hive.dto.request.EmailDto;

import java.io.IOException;

public interface EmailService {

    void sendEmail(EmailDto emailDto) throws IOException;

}