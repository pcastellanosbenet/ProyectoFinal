package com.telefonica.Proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView hello(@RequestParam(required=false, defaultValue="World") String name) {
		
		return new ModelAndView("page2");
	}
	@RequestMapping(value="/irformulario")
	public ModelAndView agregar() {		
	    return new ModelAndView("redirect:/");
	}
	@RequestMapping(value="/allhotels")
	public String allhotels() {		
	    return "page4";
	}
	@RequestMapping(value="/contacus")
	public String contacus() {		
	    return "page5";
	}
}
