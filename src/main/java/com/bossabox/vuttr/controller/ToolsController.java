package com.bossabox.vuttr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bossabox.vuttr.entity.Tools;
import com.bossabox.vuttr.service.ToolsService;

@RestController
@RequestMapping("/tools")
public class ToolsController {
	@Autowired
	private ToolsService toolsService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Tools>> getTools() {
		return new ResponseEntity<List<Tools>>(toolsService.getAllTools(), HttpStatus.OK);
	}

	@RequestMapping(params = "tag", method = RequestMethod.GET)
	public ResponseEntity<List<Tools>> getToolsTag(@RequestParam("tag") String tag) {
		return new ResponseEntity<List<Tools>>(toolsService.getToolsWithTag(tag), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Tools> addTool(@RequestBody Tools tool) {
		return new ResponseEntity<Tools>(toolsService.addTool(tool), HttpStatus.OK);
	}

}
