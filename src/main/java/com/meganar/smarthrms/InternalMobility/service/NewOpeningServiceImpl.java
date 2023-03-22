package com.meganar.smarthrms.InternalMobility.service;

import com.meganar.smarthrms.InternalMobility.dao.NewOpeningDao;
import com.meganar.smarthrms.InternalMobility.model.Employee;
import com.meganar.smarthrms.InternalMobility.model.NewOpenings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class NewOpeningServiceImpl implements NewOpeningService {
    private NewOpeningDao newOpeningDao;
    @Autowired
    public NewOpeningServiceImpl(NewOpeningDao theNewOpeingDao){
        newOpeningDao=theNewOpeingDao;
    }


    @Override
    @Transactional
    public List<NewOpenings> findAll() {
        return newOpeningDao.findAll();
    }

    @Override
    @Transactional
    public NewOpenings findById(int theId) {
        return newOpeningDao.findById(theId);
    }

    @Override
    @Transactional
    public void save(NewOpenings theNewOpenings) {
        newOpeningDao.save(theNewOpenings);

    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        newOpeningDao.deleteById(theId);

    }
}
