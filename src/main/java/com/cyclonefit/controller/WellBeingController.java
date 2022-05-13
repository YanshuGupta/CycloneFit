package com.cyclonefit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cyclonefit.dao.WellBeingRepository;
import com.cyclonefit.model.CycloneWellBeing;

@RestController
public class WellBeingController {

	@Autowired
	WellBeingRepository wellBeingRepository;
	
	@GetMapping("/wellbeing")
	public List<CycloneWellBeing> get() {
		return wellBeingRepository.findAll();
	}
	
	@PostMapping("/wellbeing")
	public CycloneWellBeing post(@RequestBody CycloneWellBeing cycloneWellBeing) {
		return wellBeingRepository.save(cycloneWellBeing);
	}
	
}
