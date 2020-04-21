package com.rest.covid.entity;

import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CovidMaster {
	
	@JsonProperty("statewise")
	private List<CountryData> countrydata;

	public List<CountryData> getCountrydata() {
		return countrydata;
	}

	public void setCountrydata(List<CountryData> countrydata) {
		this.countrydata = countrydata;
	}

	public CovidMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CovidMaster(List<CountryData> countrydata) {
		super();
		this.countrydata = countrydata;
	}

		

}
