package net.spring.intranet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/principal")
public class PrincipalController {

	
	@RequestMapping(value = "/")
	public String index() {
			return "principal";
			
	}
	
	
	
	
}
