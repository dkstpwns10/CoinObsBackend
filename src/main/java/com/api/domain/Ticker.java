package com.api.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ticker {
	String market;
	String trade_date;
	String trade_time;
	String trade_date_kst;
	String trade_time_kst;
	long trade_timestamp;
	double opening_price;
	double high_price;
	double low_price;
	double trade_price;
	double prev_closing_price;
	String change;
	double change_price;
	double change_rate;
	double signed_change_price;
	double signed_change_rate;
	double trade_volume;
	double acc_trade_price;
	double acc_trade_price_24h;
	double acc_trade_volume;
	double acc_trade_volume_24h;
	double highest_52_week_price;
	String highest_52_week_date;
	double lowest_52_week_price;
	double lowest_52_week_date;
	long timestamp;
}
