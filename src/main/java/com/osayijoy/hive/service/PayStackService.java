package com.osayijoy.hive.service;

import com.osayijoy.hive.dto.request.BankTransferDto;
import com.osayijoy.hive.dto.request.PayStackPaymentRequest;
import com.osayijoy.hive.dto.response.ListBanksResponse;
import com.osayijoy.hive.dto.response.PayStackResponse;
import com.osayijoy.hive.dto.response.TransactionResponse;
import com.osayijoy.hive.dto.response.VerifyTransactionResponse;
import com.osayijoy.hive.entity.User;
import reactor.core.publisher.Mono;


import java.io.IOException;
import java.security.Principal;
import java.util.List;

public interface PayStackService {

    PayStackResponse initTransaction(Principal principal, PayStackPaymentRequest request) throws Exception;

    VerifyTransactionResponse verifyPayment(String reference) throws IOException;

    List<ListBanksResponse> fetchBanks(String provider);

    Mono<TransactionResponse> transferFunds(BankTransferDto dto, String provider, User user) throws InterruptedException;


}
