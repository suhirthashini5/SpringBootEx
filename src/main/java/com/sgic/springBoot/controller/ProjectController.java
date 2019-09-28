package com.sgic.springBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.springBoot.model.Project;
import com.sgic.springBoot.repository.ProjectRepositories;

@RestController
@RequestMapping("/api/v1")
public class ProjectController {
	@Autowired
	ProjectRepositories projectRepositories;

	@PostMapping(value = "/project")
	public ResponseEntity<?> createNote(@RequestBody Project project) {
		projectRepositories.save(project);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
//	@GetMapping("/project")
//	  public List<Project> getEmployee() {
//		return projectRepositories.findAll();
//
//	}
}
