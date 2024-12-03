package com.tradingapp.service;

import com.tradingapp.model.CoinDTO;
import com.tradingapp.response.ApiResponse;

public interface ChatBotService {
    ApiResponse getCoinDetails(String coinName);

    CoinDTO getCoinByName(String coinName);

    String simpleChat(String prompt);
}
