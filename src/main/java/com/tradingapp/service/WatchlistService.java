package com.tradingapp.service;

import com.tradingapp.model.Coin;
import com.tradingapp.model.User;
import com.tradingapp.model.Watchlist;

public interface WatchlistService {

    Watchlist findUserWatchlist(Long userId) throws Exception;

    Watchlist createWatchList(User user);

    Watchlist findById(Long id) throws Exception;

    Coin addItemToWatchlist(Coin coin,User user) throws Exception;
}
