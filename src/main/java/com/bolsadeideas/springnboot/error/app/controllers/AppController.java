package com.bolsadeideas.springnboot.error.app.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class AppController {

	@SuppressWarnings("unused")
	@GetMapping("/index")
	public String index() {
		Integer valor = 100 / 0;
		//Integer valor = Integer.parseInt("10xaaaa");
		return "index";
	}

}
