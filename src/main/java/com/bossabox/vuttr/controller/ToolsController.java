package com.bossabox.vuttr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bossabox.vuttr.entity.Tools;
import com.bossabox.vuttr.service.ToolsService;

@RestController
@RequestMapping("/tools")
public class ToolsController {
	@Autowired
	private ToolsService toolsService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Tools> getMethod() {
		return toolsService.getAppUsers();
	}

}
