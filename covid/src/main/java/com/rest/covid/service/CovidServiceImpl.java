package com.rest.covid.service;

import java.util.Arrays;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.rest.covid.entity.CovidMaster;

@Service
public class CovidServiceImpl implements CovidService {

	@Autowired
	private RestTemplate restTemplate;
	
	Logger logger = Logger.getLogger(getClass().getName());
	
	@Override
	public CovidMaster getCovidData() {
		HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		logger.info("Http Headers::"+headers);
		ResponseEntity<CovidMaster> response = restTemplate.exchange("https://api.covid19india.org/data.json",
				HttpMethod.GET,entity,new ParameterizedTypeReference<CovidMaster>() {});
		logger.info("Response received::"+response);
		CovidMaster covidMaster = response.getBody();
		logger.info("Data size::"+covidMaster.getCountrydata().size());
		
		return covidMaster;
	}

}
