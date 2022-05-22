package com.internmanagementsystem.internmanagementsys.repository;

import com.internmanagementsystem.internmanagementsys.models.Interns;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternRepository extends JpaRepository <Interns, Long>{

}