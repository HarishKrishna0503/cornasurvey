package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.services.CoronaVirusDataServices;
import com.example.demo.model.LocationStates;
import java.util.List;

@Controller
public class HomeController {
      
	
	CoronaVirusDataServices crnservices;
	@Autowired
	public void  setcrnServices(CoronaVirusDataServices crnservices) {
		this.crnservices=crnservices;
	}
	@GetMapping("/")
	public String home(Model model) {
		List <LocationStates>  allstates=crnservices.getAllstates();
		int totalDeathsReported=allstates.stream().mapToInt(stat->stat.getLatestTotalDeaths()).sum();
		model.addAttribute("LocationStates",allstates);
		model.addAttribute("totalDeathsReported",totalDeathsReported);
        return"Home";
	}
  	
}
 