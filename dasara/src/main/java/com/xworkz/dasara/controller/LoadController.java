package com.xworkz.dasara.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping ("/")
public class LoadController {

	public LoadController() {
		System.out.println("controller created "+this.getClass().getSimpleName());
	}
	@RequestMapping("start.do")
	public String onClick() {
		System.out.println("load controller is running ");
		return "index.jsp";
		
	}

}
