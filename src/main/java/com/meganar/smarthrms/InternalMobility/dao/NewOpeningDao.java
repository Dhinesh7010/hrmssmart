package com.meganar.smarthrms.InternalMobility.dao;

import com.meganar.smarthrms.InternalMobility.model.NewOpenings;

import java.util.List;

public interface NewOpeningDao {
    public List<NewOpenings>findAll();
    public NewOpenings findById(int theId);
    public void save(NewOpenings newOpenings);
    public void deleteById(int theId);
}
