package com.internmanagementsystem.internmanagementsys.services;

import com.internmanagementsystem.internmanagementsys.beans.ResponseBean;
import com.internmanagementsystem.internmanagementsys.models.Designation;
import org.springframework.stereotype.Service;


public interface DesignationService {
    public ResponseBean addDesignation(Designation designation);
}
