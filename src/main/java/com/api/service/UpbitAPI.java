package com.api.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.http.HttpClient;
import java.util.List;

import com.api.domain.Coin;

import javax.xml.crypto.AlgorithmMethod;

import com.auth0.jwt.algorithms.Algorithm;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import okhttp3.OkHttp;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;




public class UpbitAPI{
	
	String url = "https://api.upbit.com/v1/";
	
	
	
	public List<Coin> all_coins(String query) throws IOException {
		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
		  .url(url+query)
		  .get()
		  .addHeader("accept", "application/json")
		  .build();

		Response response = client.newCall(request).execute();
		return new Gson().fromJson(response.body().string(), new TypeToken<List<Coin>>() {}.getType());
	}
}
	/*
	 
	OkHttpClient client = new OkHttpClient();
	URL baseURL=null;
	
	String url = "https://api.upbit.com/v1/";
	
	public HttpURLConnection getConn(String query) {
		baseURL = new URL(url);
		Algorithm algorithm = Algorithm.HMAC256("secretKey");
		
		try {
			HttpURLConnection conn = (HttpURLConnection) baseURL.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Authorization", authToken);
            conn.setRequestProperty("Content-Type", "application/json");
            int responseResult = conn.getResponseCode();
            if(responseResult == HttpURLConnection.HTTP_OK) {
            	BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            	String inputLine;
            	System.out.println();
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
		return conn;
		
	}
	
}*/