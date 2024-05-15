package com.api.coinobs;

import java.io.IOException;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.api.controller.UpbitAPI;
import com.api.domain.Candle;
import com.api.domain.Candle.DayCandle;
import com.api.domain.Candle.MinuteCandle;
import com.api.domain.Coin;
import com.api.domain.Ticker;
import com.api.service.Upbit;
import com.google.gson.Gson;


@SpringBootApplication
public class CoinObsApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(CoinObsApplication.class, args);
		
		UpbitAPI api = new UpbitAPI();
		List<Coin> listMarketVo = api.all_coins("market/all");
		Upbit upbit = new Upbit();
		List<MinuteCandle> ticker = upbit.getMinuteCandle("KRW-BTC");
		Gson gson = new Gson();
		String json = gson.toJson(ticker);
		
		String markets = "";
		for (Candle.MinuteCandle v : ticker) {
			System.out.println("["+v.getMarket()+"]["+v.getTimestamp()+"]["+v.getTrade_price()+"]"+v.getTimestamp()+v.getCandle_date_time_kst());
		}
	}
	
	
}
