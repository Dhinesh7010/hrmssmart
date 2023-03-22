package com.meganar.smarthrms.InternalMobility.service;

import com.meganar.smarthrms.InternalMobility.model.Employee;
import com.meganar.smarthrms.InternalMobility.model.NewOpenings;

import java.util.List;

public interface NewOpeningService {
    public List<NewOpenings> findAll();
    public NewOpenings findById(int theId);
    public void save(NewOpenings theNewOpenings);
    public  void deleteById(int theId);
}
