package com.inventario;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppControlller {
 
	@GetMapping("")
 public String verPaginaDeInicio() {
	 return "index";
 }
}
