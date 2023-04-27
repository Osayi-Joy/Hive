package com.osayijoy.hive.service;


import com.osayijoy.hive.dto.response.TransactionResponse;
import com.osayijoy.hive.dto.response.WalletResponseDto;
import com.osayijoy.hive.entity.Task;
import com.osayijoy.hive.entity.User;
import com.osayijoy.hive.entity.Wallet;

import java.math.BigDecimal;
import java.security.Principal;
import java.util.List;

public interface WalletService {



    boolean creditDoerWallet(User doer, BigDecimal creditAmount);

    WalletResponseDto getWalletByUser(Principal principal);

    void withdrawFromWalletBalance(User user, BigDecimal amount);

    boolean fundTaskerWallet(User tasker, BigDecimal amountToFund);

    boolean debitTaskerWalletToEscrow(Wallet wallet, BigDecimal amount);

    boolean refundTaskerFromEscrowWallet(Task taskToCancel);

    List<TransactionResponse> getWalletHistory(Principal principal);
}
