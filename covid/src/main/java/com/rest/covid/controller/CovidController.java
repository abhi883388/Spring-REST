package com.rest.covid.controller;


import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rest.covid.entity.CovidMaster;
import com.rest.covid.service.CovidService;

@Controller
@RequestMapping("/covid")
public class CovidController {
	
	@Autowired
	private CovidService covidService;
		
	private Logger logger = Logger.getLogger(getClass().getName());
	
	@GetMapping("/data")
	public ModelAndView getCovidData(ModelAndView theModel) {
		logger.info("Logger:: Inside /data mapping");
		CovidMaster covidMaster = covidService.getCovidData();
		theModel = new ModelAndView("main-page");
		theModel.addObject("covidData",covidMaster.getCountrydata());
		return theModel;
	}

}
