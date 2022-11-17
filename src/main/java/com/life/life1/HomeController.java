package com.life.life1;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
@RequestMapping("HOME")

	public String home(HttpServletRequest req) {
		ArrayList <String> al=new ArrayList<>();
		HttpSession session=req.getSession();
		al.add("dhd");
		al.add("ganesh");
		session.setAttribute("data", al);
		return "home";
	}
	
}
