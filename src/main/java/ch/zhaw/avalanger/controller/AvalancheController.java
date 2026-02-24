package ch.zhaw.avalanger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/avalanche")
public class AvalancheController {
	
	@GetMapping()
	public String getAllAvalanches() {
		return "no avalanches found";
	}
}
