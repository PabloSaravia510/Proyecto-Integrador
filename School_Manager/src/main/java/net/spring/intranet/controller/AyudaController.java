package net.spring.intranet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ayuda")
public class AyudaController {

	
	@RequestMapping(value = "/")
	public String index() {
			return "ayuda";
			
	}
	
}
