package com.api.func;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.List;

import org.springframework.stereotype.Controller;

import com.api.domain.Coin;
import com.api.service.UpbitAPI;

@Controller
public class Upbit {
	
	public List<Coin> getAllMarketName() throws IOException {
		UpbitAPI api = new UpbitAPI();
		List<Coin> coin_list = api.all_coins("market/all");
		
		return coin_list;
	}
}
