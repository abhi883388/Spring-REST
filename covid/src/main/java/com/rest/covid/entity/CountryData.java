package com.rest.covid.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CountryData {
	
	private String active;
	private String confirmed;
	private String deaths;
	
	@JsonProperty("lastupdatedtime")
	private String lastUpdatedTime;
	private String recovered;
	private String state;
	
	@JsonProperty("statecode")
	private String stateCode;
	
	public CountryData() {
		super();
	}

	public CountryData(String active, String confirmed, String deaths, String lastUpdatedTime, String recovered,
			String state, String stateCode) {
		super();
		this.active = active;
		this.confirmed = confirmed;
		this.deaths = deaths;
		this.lastUpdatedTime = lastUpdatedTime;
		this.recovered = recovered;
		this.state = state;
		this.stateCode = stateCode;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(String confirmed) {
		this.confirmed = confirmed;
	}

	public String getDeaths() {
		return deaths;
	}

	public void setDeaths(String deaths) {
		this.deaths = deaths;
	}

	public String getLastUpdatedTime() {
		return lastUpdatedTime;
	}

	public void setLastUpdatedTime(String lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}

	public String getRecovered() {
		return recovered;
	}

	public void setRecovered(String recovered) {
		this.recovered = recovered;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	@Override
	public String toString() {
		return "CountryData [active=" + active + ", confirmed=" + confirmed + ", deaths=" + deaths
				+ ", lastUpdatedTime=" + lastUpdatedTime + ", recovered=" + recovered + ", state=" + state
				+ ", stateCode=" + stateCode + "]";
	}
	
	
	

}
