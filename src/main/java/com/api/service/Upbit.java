package com.api.service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.List;

import org.springframework.stereotype.Controller;

import com.api.controller.UpbitAPI;
import com.api.domain.Candle.DayCandle;
import com.api.domain.Candle.MinuteCandle;
import com.api.domain.Candle.MonthCandle;
import com.api.domain.Candle.WeekCandle;
import com.api.domain.Coin;
import com.api.domain.Ticker;
import com.google.gson.Gson;

@Controller
public class Upbit {
	//코인종목
	public List<Coin> getAllMarketName() throws IOException {
		UpbitAPI api = new UpbitAPI();
		List<Coin> coin_list = api.all_coins("market/all");
		
		return coin_list;
	}
	//현재가
	public List<Ticker> getTicker(String query) throws IOException {
		UpbitAPI api = new UpbitAPI();
		List<Ticker> ticker = api.ticker("ticker?markets="+query);
		
		return ticker;
	}
	//1분 차트
	public List<MinuteCandle> getMinuteCandle(String query) throws IOException {
		UpbitAPI api = new UpbitAPI();
		List<MinuteCandle> minuteCandle = api.minuteCandle("candles/minutes/1?market="+query+"&count=100");
		
		return minuteCandle;
	}
	//1일차트
	public List<DayCandle> getDayCandle(String query) throws IOException {
		UpbitAPI api = new UpbitAPI();
		List<DayCandle> dayCandle = api.dayCandle("candles/days?market="+query+"&count=100");
		
		return dayCandle;
	}
	//주간차트
	public List<WeekCandle> getWeekCandle(String query) throws IOException {
		UpbitAPI api = new UpbitAPI();
		List<WeekCandle> weekCandle = api.weekCandle("candles/weeks?market="+query+"&count=100");
		
		return weekCandle;
	}
	//한달차트
	public List<MonthCandle> getMonthCandle(String query) throws IOException {
		UpbitAPI api = new UpbitAPI();
		List<MonthCandle> monthCandle = api.monthCandle("candles/months?market="+query+"&count=100");
		
		return monthCandle;
	}
	
}
