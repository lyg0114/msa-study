package com.example.secondservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : iyeong-gyo
 * @package : com.example.firstservice
 * @since : 29.08.24
 */
@RestController
@RequestMapping("/second-service")
public class SecondServiceController {

	@GetMapping("/welecome")
	public String secondServiceController() {
		return "Welecome to the Second service.";
	}

	private void print() {

	}
}
