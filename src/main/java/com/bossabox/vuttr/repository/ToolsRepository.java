package com.bossabox.vuttr.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bossabox.vuttr.entity.Tools;

public interface ToolsRepository extends CrudRepository<Tools, Integer> {
	List<Tools> findAll();
	
	List<Tools> findByTagsName(String tag);

}
