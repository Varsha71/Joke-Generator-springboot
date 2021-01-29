package com.JokeGenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
	
	@Autowired
	JokeReceivingService jserv;
	
	@GetMapping("/")
	public String getView(ModelMap model,@RequestParam String cate) {
		//data received from http resp
		JokeResponseBody resp;
		if(org.thymeleaf.util.StringUtils.isEmpty(cate))
		{
			 resp=jserv.getResponse("Programming");
		}
		else {
			
		 resp=jserv.getResponse(cate);
		}
		
		model.put("resp", resp);
		
		return "index";
	}

}
