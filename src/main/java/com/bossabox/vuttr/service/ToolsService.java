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

	public List<Tools> getAllTools() {
		return toolsRepository.findAll();
	}

	public List<Tools> getToolsWithTag(String tag) {
		return toolsRepository.findByTagsName(tag);
	}

	public Tools addTool(Tools tool) {
		return toolsRepository.save(tool);
	}

	public void deleteTool(int id) {
		toolsRepository.delete(id);
	}

	public Tools getTool(int id) {
		return toolsRepository.findOne(id);
	}

}
