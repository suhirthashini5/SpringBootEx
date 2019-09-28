package com.sgic.springBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgic.springBoot.model.Project;

@Repository
public interface ProjectRepositories extends JpaRepository<Project, Long> {

}
