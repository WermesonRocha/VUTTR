package com.bossabox.vuttr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bossabox.vuttr.entity.Tools;
import com.bossabox.vuttr.repository.ToolsRepository;

@Service
public class ToolsService {
	
	@Autowired
	private ToolsRepository toolsRepository;
	
	
	public List<Tools> getAppUsers() {
		return toolsRepository.findAll();
	}

}
