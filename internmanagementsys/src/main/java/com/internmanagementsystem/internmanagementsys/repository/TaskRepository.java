package com.internmanagementsystem.internmanagementsys.repository;

import com.internmanagementsystem.internmanagementsys.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
