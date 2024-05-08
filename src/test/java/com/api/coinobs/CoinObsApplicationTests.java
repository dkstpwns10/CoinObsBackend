package com.api.coinobs;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.api.domain.Coin;
import com.api.service.UpbitAPI;
import com.google.gson.Gson;

@SpringBootTest
class CoinObsApplicationTests {

	@Test
	void contextLoads() throws IOException {
		UpbitAPI api = new UpbitAPI();
		List<Coin> listMarketVo = api.all_coins("market/all");
		Gson gson = new Gson();
		String json = gson.toJson(listMarketVo);
		System.out.println(json);

	}

}
