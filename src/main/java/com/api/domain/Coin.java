package com.api.domain;

import lombok.Data;

@Data
@SuppressWarnings("unused")
public class Coin {
	private String market;
	private String name_kr;
	private String name_en;
	private Boolean warning;
	private Caution caution;
	
}
