package com.meganar.smarthrms.InternalMobility.dao;

import com.meganar.smarthrms.InternalMobility.model.NewOpenings;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class NewOpeningHibernateImpl implements NewOpeningDao{

    private EntityManager theEntityManager;
    @Autowired
    public NewOpeningHibernateImpl(EntityManager entityManager){
        theEntityManager=entityManager;
    }
    @Override
    public List<NewOpenings> findAll() {
        Session currentSession=theEntityManager.unwrap(Session.class);
        Query<NewOpenings>theQuery=currentSession.createQuery("from NewOpenings",NewOpenings.class);
        List<NewOpenings>openingList=theQuery.getResultList();
        return openingList;
    }

    @Override
    public NewOpenings findById(int theId) {
        Session currentSession=theEntityManager.unwrap(Session.class);
        NewOpenings openings=currentSession.get(NewOpenings.class,theId);

        return openings;
    }

    @Override
    public void save(NewOpenings newOpenings) {
        Session currentSession=theEntityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(newOpenings);

    }

    @Override
    public void deleteById(int theId) {
        Session currentSession=theEntityManager.unwrap(Session.class);
        Query theQuery=currentSession.createQuery("from NewOpenings where id=:NewOpeningsId");
        theQuery.setParameter("NewOpeningsId",theId);
        theQuery.executeUpdate();

    }
}
