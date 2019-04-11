package com.telefonica.Proyecto.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.telefonica.modelo.Cliente;
import com.telefonica.modelo.Usuario;

import com.telefonica.service.UsuarioService;


@Controller
public class HomeController {
	
	@Autowired
	private UsuarioService usuarioService;
	
//	@Autowired
//	private HotelService vueloService;

	@RequestMapping(value="/")
	public ModelAndView hello() {
		
		return new ModelAndView("page2");
	}
	
	@RequestMapping(value="/irformulario", method = RequestMethod.POST)
	public void user(HttpServletRequest request, HttpServletResponse response) throws IOException {	
		
		String webUser = null;
		String webPass= null;	
		boolean datos = false;
		Gson gson = new Gson();
		String userJSON = request.getParameter("userJSON");		
		
		Usuario userLogged = gson.fromJson(userJSON, Usuario.class);
		
		for(Usuario u: usuarioService.getUsuarios()) {
			if(u.getClave().equals(userLogged.getClave()) &&  u.getUsuario().equals(userLogged.getUsuario())) {
				datos = true;
				webUser = u.getUsuario();
				webPass = u.getClave();
			}
		}	
		
		PrintWriter out = response.getWriter();	
		
		if (datos) {
			HttpSession sesion = request.getSession();
			sesion.setAttribute("webUser", webUser);			
			out.print("OK");
		}
		else {
			out.print("ERROR");			
		}
				
	}
	@RequestMapping(value="/page3")
	public String form() {		
	    return "page3";
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
