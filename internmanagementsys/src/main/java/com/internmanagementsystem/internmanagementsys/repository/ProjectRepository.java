package com.internmanagementsystem.internmanagementsys.repository;

import com.internmanagementsystem.internmanagementsys.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
