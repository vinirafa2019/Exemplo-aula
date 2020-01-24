package com.example.demo.Controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/home")
public class PortifolioController {
	@RequestMapping("/projetos")
	public ModelAndView novo() {
		ModelAndView mv = new ModelAndView("Projetos");
		return mv;
	}
	@RequestMapping
	public ModelAndView pesquisar() {
		ModelAndView mv= new ModelAndView("Home");
		return mv;
	}
	@RequestMapping("/skills")
	public ModelAndView skills() {
		ModelAndView mv = new ModelAndView("skills");
		return mv;
	}
	@RequestMapping("/contatos")
	public ModelAndView contato() {
		ModelAndView mv = new ModelAndView("Contatos");
		return mv;
	}

}
