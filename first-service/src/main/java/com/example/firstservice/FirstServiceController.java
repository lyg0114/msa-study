package com.example.firstservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : iyeong-gyo
 * @package : com.example.firstservice
 * @since : 29.08.24
 */
@RestController
@RequestMapping("/")
public class FirstServiceController {

	@GetMapping("/welecome")
	public String firstServiceController() {
		return "Welecome to the First service.";
	}

}
