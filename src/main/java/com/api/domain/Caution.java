package com.api.domain;

import lombok.Data;

@Data
public class Caution {
	Boolean PRICE_FLUCTUATIONS;
	Boolean TRADING_VOLUME_SOARING;
	Boolean DEPOSIT_AMOUNT_SOARING;
	Boolean GLOBAL_PRICE_DIFFERENCES;
	Boolean CONCENTRATION_OF_SMALL_ACCOUNTS;
}
