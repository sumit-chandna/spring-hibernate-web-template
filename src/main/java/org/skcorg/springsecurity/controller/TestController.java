package org.skcorg.springsecurity.controller;

import org.skcorg.springsecurity.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class TestController {
	@Autowired
	private TestService testService;

	public TestService getTestService() {
		return testService;
	}

	public void setTestService(TestService testService) {
		this.testService = testService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String home() {
		return "index";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/test")
	@ResponseBody
	public String test() {
		return testService.getData();
	}
}
