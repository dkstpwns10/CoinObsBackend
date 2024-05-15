package com.api.domain;

public class Candle {
	
	public class MinuteCandle{
		String market;
		String candle_date_time_utc;
		String candle_date_time_kst;
		Double opening_price;
		Double high_price;
		Double low_price;
		Double trade_price;
		long timestamp;
		Double candle_acc_trade_price;
		Double candle_acc_trade_volume;
		int unit;
		public String getMarket() {
			return market;
		}
		public void setMarket(String market) {
			this.market = market;
		}
		public String getCandle_date_time_utc() {
			return candle_date_time_utc;
		}
		public void setCandle_date_time_utc(String candle_date_time_utc) {
			this.candle_date_time_utc = candle_date_time_utc;
		}
		public String getCandle_date_time_kst() {
			return candle_date_time_kst;
		}
		public void setCandle_date_time_kst(String candle_date_time_kst) {
			this.candle_date_time_kst = candle_date_time_kst;
		}
		public Double getOpening_price() {
			return opening_price;
		}
		public void setOpening_price(Double opening_price) {
			this.opening_price = opening_price;
		}
		public Double getHigh_price() {
			return high_price;
		}
		public void setHigh_price(Double high_price) {
			this.high_price = high_price;
		}
		public Double getLow_price() {
			return low_price;
		}
		public void setLow_price(Double low_price) {
			this.low_price = low_price;
		}
		public Double getTrade_price() {
			return trade_price;
		}
		public void setTrade_price(Double trade_price) {
			this.trade_price = trade_price;
		}
		public long getTimestamp() {
			return timestamp;
		}
		public void setTimestamp(long timestamp) {
			this.timestamp = timestamp;
		}
		public Double getCandle_acc_trade_price() {
			return candle_acc_trade_price;
		}
		public void setCandle_acc_trade_price(Double candle_acc_trade_price) {
			this.candle_acc_trade_price = candle_acc_trade_price;
		}
		public Double getCandle_acc_trade_volume() {
			return candle_acc_trade_volume;
		}
		public void setCandle_acc_trade_volume(Double candle_acc_trade_volume) {
			this.candle_acc_trade_volume = candle_acc_trade_volume;
		}
		public int getUnit() {
			return unit;
		}
		public void setUnit(int unit) {
			this.unit = unit;
		}
	}
		
	
	public class DayCandle{
		String market;
		String candle_date_time_utc;
		String candle_date_time_kst;
		Double opening_price;
		Double high_price;
		Double low_price;
		Double trade_price;
		long timestamp;
		Double candle_acc_trade_price;
		Double candle_acc_trade_volume;
		Double prev_closing_price;
		Double change_price;
		Double change_rate;
		Double converted_trade_price;
		public String getMarket() {
			return market;
		}
		public void setMarket(String market) {
			this.market = market;
		}
		public String getCandle_date_time_utc() {
			return candle_date_time_utc;
		}
		public void setCandle_date_time_utc(String candle_date_time_utc) {
			this.candle_date_time_utc = candle_date_time_utc;
		}
		public String getCandle_date_time_kst() {
			return candle_date_time_kst;
		}
		public void setCandle_date_time_kst(String candle_date_time_kst) {
			this.candle_date_time_kst = candle_date_time_kst;
		}
		public Double getOpening_price() {
			return opening_price;
		}
		public void setOpening_price(Double opening_price) {
			this.opening_price = opening_price;
		}
		public Double getHigh_price() {
			return high_price;
		}
		public void setHigh_price(Double high_price) {
			this.high_price = high_price;
		}
		public Double getLow_price() {
			return low_price;
		}
		public void setLow_price(Double low_price) {
			this.low_price = low_price;
		}
		public Double getTrade_price() {
			return trade_price;
		}
		public void setTrade_price(Double trade_price) {
			this.trade_price = trade_price;
		}
		public long getTimestamp() {
			return timestamp;
		}
		public void setTimestamp(long timestamp) {
			this.timestamp = timestamp;
		}
		public Double getCandle_acc_trade_price() {
			return candle_acc_trade_price;
		}
		public void setCandle_acc_trade_price(Double candle_acc_trade_price) {
			this.candle_acc_trade_price = candle_acc_trade_price;
		}
		public Double getCandle_acc_trade_volume() {
			return candle_acc_trade_volume;
		}
		public void setCandle_acc_trade_volume(Double candle_acc_trade_volume) {
			this.candle_acc_trade_volume = candle_acc_trade_volume;
		}
		public Double getPrev_closing_price() {
			return prev_closing_price;
		}
		public void setPrev_closing_price(Double prev_closing_price) {
			this.prev_closing_price = prev_closing_price;
		}
		public Double getChange_price() {
			return change_price;
		}
		public void setChange_price(Double change_price) {
			this.change_price = change_price;
		}
		public Double getChange_rate() {
			return change_rate;
		}
		public void setChange_rate(Double change_rate) {
			this.change_rate = change_rate;
		}
		public Double getConverted_trade_price() {
			return converted_trade_price;
		}
		public void setConverted_trade_price(Double converted_trade_price) {
			this.converted_trade_price = converted_trade_price;
		}
		
	}
	
	public class WeekCandle{
		String market;
		String candle_date_time_utc;
		String candle_date_time_kst;
		Double opening_price;
		Double high_price;
		Double low_price;
		Double trade_price;
		long timestamp;
		Double candle_acc_trade_price;
		Double candle_acc_trade_volume;
		String first_day_of_period;
		public String getMarket() {
			return market;
		}
		public void setMarket(String market) {
			this.market = market;
		}
		public String getCandle_date_time_utc() {
			return candle_date_time_utc;
		}
		public void setCandle_date_time_utc(String candle_date_time_utc) {
			this.candle_date_time_utc = candle_date_time_utc;
		}
		public String getCandle_date_time_kst() {
			return candle_date_time_kst;
		}
		public void setCandle_date_time_kst(String candle_date_time_kst) {
			this.candle_date_time_kst = candle_date_time_kst;
		}
		public Double getOpening_price() {
			return opening_price;
		}
		public void setOpening_price(Double opening_price) {
			this.opening_price = opening_price;
		}
		public Double getHigh_price() {
			return high_price;
		}
		public void setHigh_price(Double high_price) {
			this.high_price = high_price;
		}
		public Double getLow_price() {
			return low_price;
		}
		public void setLow_price(Double low_price) {
			this.low_price = low_price;
		}
		public Double getTrade_price() {
			return trade_price;
		}
		public void setTrade_price(Double trade_price) {
			this.trade_price = trade_price;
		}
		public long getTimestamp() {
			return timestamp;
		}
		public void setTimestamp(long timestamp) {
			this.timestamp = timestamp;
		}
		public Double getCandle_acc_trade_price() {
			return candle_acc_trade_price;
		}
		public void setCandle_acc_trade_price(Double candle_acc_trade_price) {
			this.candle_acc_trade_price = candle_acc_trade_price;
		}
		public Double getCandle_acc_trade_volume() {
			return candle_acc_trade_volume;
		}
		public void setCandle_acc_trade_volume(Double candle_acc_trade_volume) {
			this.candle_acc_trade_volume = candle_acc_trade_volume;
		}
		public String getFirst_day_of_period() {
			return first_day_of_period;
		}
		public void setFirst_day_of_period(String first_day_of_period) {
			this.first_day_of_period = first_day_of_period;
		}
		
	}
	
	public class MonthCandle{
		String market;
		String candle_date_time_utc;
		String candle_date_time_kst;
		Double opening_price;
		Double high_price;
		Double low_price;
		Double trade_price;
		long timestamp;
		Double candle_acc_trade_price;
		Double candle_acc_trade_volume;
		String first_day_of_period;
		public String getMarket() {
			return market;
		}
		public void setMarket(String market) {
			this.market = market;
		}
		public String getCandle_date_time_utc() {
			return candle_date_time_utc;
		}
		public void setCandle_date_time_utc(String candle_date_time_utc) {
			this.candle_date_time_utc = candle_date_time_utc;
		}
		public String getCandle_date_time_kst() {
			return candle_date_time_kst;
		}
		public void setCandle_date_time_kst(String candle_date_time_kst) {
			this.candle_date_time_kst = candle_date_time_kst;
		}
		public Double getOpening_price() {
			return opening_price;
		}
		public void setOpening_price(Double opening_price) {
			this.opening_price = opening_price;
		}
		public Double getHigh_price() {
			return high_price;
		}
		public void setHigh_price(Double high_price) {
			this.high_price = high_price;
		}
		public Double getLow_price() {
			return low_price;
		}
		public void setLow_price(Double low_price) {
			this.low_price = low_price;
		}
		public Double getTrade_price() {
			return trade_price;
		}
		public void setTrade_price(Double trade_price) {
			this.trade_price = trade_price;
		}
		public long getTimestamp() {
			return timestamp;
		}
		public void setTimestamp(long timestamp) {
			this.timestamp = timestamp;
		}
		public Double getCandle_acc_trade_price() {
			return candle_acc_trade_price;
		}
		public void setCandle_acc_trade_price(Double candle_acc_trade_price) {
			this.candle_acc_trade_price = candle_acc_trade_price;
		}
		public Double getCandle_acc_trade_volume() {
			return candle_acc_trade_volume;
		}
		public void setCandle_acc_trade_volume(Double candle_acc_trade_volume) {
			this.candle_acc_trade_volume = candle_acc_trade_volume;
		}
		public String getFirst_day_of_period() {
			return first_day_of_period;
		}
		public void setFirst_day_of_period(String first_day_of_period) {
			this.first_day_of_period = first_day_of_period;
		}
		
	}

}
