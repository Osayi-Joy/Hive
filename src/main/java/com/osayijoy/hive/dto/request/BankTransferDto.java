package com.osayijoy.hive.dto.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@Data
@RequiredArgsConstructor
public class BankTransferDto {

    @Positive
    private  BigDecimal amount;
    @NotEmpty
    private  String currencyCode;
    @NotEmpty
    private  String narration;
    @NotEmpty
    private  String beneficiaryAccountNumber;
    String beneficiaryAccountName;
    @NotEmpty
    private  String beneficiaryBankCode;
    String transactionReference;
    int maxRetryAttempt = 0;
    String callBackUrl;

}
