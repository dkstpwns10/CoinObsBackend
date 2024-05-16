package com.api.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.http.HttpClient;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

import com.api.domain.Candle;
import com.api.domain.Candle.DayCandle;
import com.api.domain.Candle.MinuteCandle;
import com.api.domain.Candle.MonthCandle;
import com.api.domain.Candle.WeekCandle;
import com.api.domain.Coin;
import com.api.domain.Ticker;

import javax.xml.crypto.AlgorithmMethod;

import com.auth0.jwt.algorithms.Algorithm;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import okhttp3.OkHttp;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;




public class UpbitAPI{
	
	private String url = "https://api.upbit.com/v1/";
	
	
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
	
	public List<Ticker> ticker(String query) throws IOException, NumberFormatException {
		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
		  .url(url+query)
		  .get()
		  .addHeader("accept", "application/json")
		  .build();
		
		Response response = client.newCall(request).execute();
		
		return new Gson().fromJson(response.body().string(), new TypeToken<List<Ticker>>() {}.getType());
	
	}
	
	public List<MinuteCandle> minuteCandle(String query) throws IOException{
		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
		  .url(url+query)
		  .get()
		  .addHeader("accept", "application/json")
		  .build();
		
		Response response = client.newCall(request).execute();
		return new Gson().fromJson(response.body().string(), new TypeToken<List<Candle.MinuteCandle>>() {}.getType());
		
	}
	
	public List<DayCandle> dayCandle(String query) throws IOException{
		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
		  .url(url+query)
		  .get()
		  .addHeader("accept", "application/json")
		  .build();
		
		Response response = client.newCall(request).execute();
		return new Gson().fromJson(response.body().string(), new TypeToken<List<DayCandle>>() {}.getType());
		
	}
	
	public List<WeekCandle> weekCandle(String query) throws IOException{
		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
		  .url(url+query)
		  .get()
		  .addHeader("accept", "application/json")
		  .build();
		
		Response response = client.newCall(request).execute();
		return new Gson().fromJson(response.body().string(), new TypeToken<List<WeekCandle>>() {}.getType());
		
	}
	
	public List<MonthCandle> monthCandle(String query) throws IOException{
		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
		  .url(url+query)
		  .get()
		  .addHeader("accept", "application/json")
		  .build();
		
		Response response = client.newCall(request).execute();
		return new Gson().fromJson(response.body().string(), new TypeToken<List<MonthCandle>>() {}.getType());
		
	}
	
}