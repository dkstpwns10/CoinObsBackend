package com.api.func;

import java.net.HttpURLConnection;

import org.springframework.stereotype.Controller;

import com.api.service.UpbitAPI;

@Controller
public class Upbit {
	
	public String getAllMarketName() {
		
		try {
			UpbitAPI api = new UpbitAPI();
			api.getConn("market/all");
		}catch(Exception e) {
			
		}
		
		return null;
	}
}
