package com.osayijoy.hive.service;

import com.osayijoy.hive.dto.request.FundWalletRequest;
import com.osayijoy.hive.dto.response.PayStackResponse;
import com.osayijoy.hive.dto.response.VerifyTransactionResponse;

import java.security.Principal;

public interface PaymentService {



    PayStackResponse initiatePaymentAndSaveToPaymentLog(FundWalletRequest taskerPaymentRequest, Principal principal) throws Exception;

    VerifyTransactionResponse verifyAndCompletePayment(String reference , Principal principal) throws Exception;


    VerifyTransactionResponse verifyAndCompletePayment(String reference) throws Exception;
}
