package com.accp.handler;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accp.service.AirService;

@Controller
public class AirHandler {
	
	@Resource
	private AirService as;
	public void setAs(AirService as) {
		this.as = as;
	}

	@RequestMapping("/findAll")
	public String findAll(HttpServletRequest req) {
		req.getSession().setAttribute("list",as.findAll());
		return "findAll";
	}
}
