package com.tradingapp.service;

import com.tradingapp.domain.WalletTransactionType;
import com.tradingapp.model.Wallet;
import com.tradingapp.model.WalletTransaction;

import java.util.List;

public interface WalletTransactionService {
    WalletTransaction createTransaction(Wallet wallet,
                                        WalletTransactionType type,
                                        String transferId,
                                        String purpose,
                                        Long amount
    );

    List<WalletTransaction> getTransactions(Wallet wallet, WalletTransactionType type);

}
