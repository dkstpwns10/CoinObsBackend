package com.api.service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.List;

import org.springframework.stereotype.Controller;

import com.api.controller.UpbitAPI;
import com.api.domain.Candle.DayCandle;
import com.api.domain.Candle.MinuteCandle;
import com.api.domain.Coin;
import com.api.domain.Ticker;
import com.google.gson.Gson;

@Controller
public class Upbit {
	
	public List<Coin> getAllMarketName() throws IOException {
		UpbitAPI api = new UpbitAPI();
		List<Coin> coin_list = api.all_coins("market/all");
		
		return coin_list;
	}
	
	public List<Ticker> getTicker(String query) throws IOException {
		UpbitAPI api = new UpbitAPI();
		List<Ticker> ticker = api.ticker("ticker?markets="+query);
		
		return ticker;
	}
	
	public List<MinuteCandle> getMinuteCandle(String query) throws IOException {
		UpbitAPI api = new UpbitAPI();
		List<MinuteCandle> minuteCandle = api.minuteCandle("candles/minutes/1?market="+query+"&count=100");
		
		return minuteCandle;
	}
}
