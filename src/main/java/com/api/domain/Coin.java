package com.api.domain;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class Coin {

	 String market;
	@SerializedName("korean_name")
	 String name_kr;
	
	@SerializedName("english_name")
	 String name_en;
	 @SerializedName("market_warning")
	 Boolean warning;
	  @SerializedName("market_event")
	  MarketEvent caution;
	  
	  public String getMarket() {
			return market;
		}
		public void setMarket(String market) {
			this.market = market;
		}
		public String getName_kr() {
			return name_kr;
		}
		public void setName_kr(String name_kr) {
			this.name_kr = name_kr;
		}
		public String getName_en() {
			return name_en;
		}
		public void setName_en(String name_en) {
			this.name_en = name_en;
		}
		public Boolean getWarning() {
			return warning;
		}
		public void setWarning(Boolean warning) {
			this.warning = warning;
		}
		public MarketEvent getCaution() {
			return caution;
		}
		public void setCaution(MarketEvent caution) {
			this.caution = caution;
		}


		class MarketEvent {
			private Boolean warning;
			private Caution caution;
			public Boolean getWarning() {
				return warning;
			}
			public void setWarning(Boolean warning) {
				this.warning = warning;
			}
			public Caution getCaution() {
				return caution;
			}
			public void setCaution(Caution caution) {
				this.caution = caution;
			}
	
    
		}

		class Caution {
			@SerializedName("PRICE_FLUCTUATIONS")
		    private Boolean priceFluctuations;
		    @SerializedName("TRADING_VOLUME_SOARING")
		    private Boolean tradingVolumeSoaring;
		    @SerializedName("DEPOSIT_AMOUNT_SOARING")
		    private Boolean depositAmountSoaring;
		    @SerializedName("GLOBAL_PRICE_DIFFERENCES")
		    private Boolean globalPriceDifferences;
		    @SerializedName("CONCENTRATION_OF_SMALL_ACCOUNTS")
		    private Boolean concentrationOfSmallAccounts;
			
		    public Boolean getPriceFluctuations() {
				return priceFluctuations;
			}
			public void setPriceFluctuations(Boolean priceFluctuations) {
				this.priceFluctuations = priceFluctuations;
			}
			public Boolean getTradingVolumeSoaring() {
				return tradingVolumeSoaring;
			}
			public void setTradingVolumeSoaring(Boolean tradingVolumeSoaring) {
				this.tradingVolumeSoaring = tradingVolumeSoaring;
			}
			public Boolean getDepositAmountSoaring() {
				return depositAmountSoaring;
			}
			public void setDepositAmountSoaring(Boolean depositAmountSoaring) {
				this.depositAmountSoaring = depositAmountSoaring;
			}
			public Boolean getGlobalPriceDifferences() {
				return globalPriceDifferences;
			}
			public void setGlobalPriceDifferences(Boolean globalPriceDifferences) {
				this.globalPriceDifferences = globalPriceDifferences;
			}
			public Boolean getConcentrationOfSmallAccounts() {
				return concentrationOfSmallAccounts;
			}
			public void setConcentrationOfSmallAccounts(Boolean concentrationOfSmallAccounts) {
				this.concentrationOfSmallAccounts = concentrationOfSmallAccounts;
			}
		}
		/*@Override
		public String toString() {
			String market;
			String name_kr;
			String name_en;
			Boolean warning;
			MarketEvent caution;
				  
			
		    return "Coin{" +
		            "market='" + market + '\'' +
		            ", name_kr='" + name_kr + '\'' +
		            ", name_en='" + name_en + '\'' +
		            ", warning=" + warning +
		            ", caution=" + caution +
		            '}';
		}*/
}