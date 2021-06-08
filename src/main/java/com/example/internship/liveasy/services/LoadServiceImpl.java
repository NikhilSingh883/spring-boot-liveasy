package com.example.internship.liveasy.services;

import com.example.internship.liveasy.dao.LoadDao;
import com.example.internship.liveasy.entities.Load;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoadServiceImpl implements LoadService {

    @Autowired
    LoadDao loadDao;

    @Override
    public List<Load> getLoads() {
        return loadDao.findAll();
    }

    @Override
    public Load getLoad(Long loadId) {
        return loadDao.getById(loadId);
    }

    @Override
    public List<Load> getLoadByShipperId(Long shipperId) {
        return loadDao.findByShipperIdEquals(shipperId);
    }

    @Override
    public Load addLoad(Load load) {
        return loadDao.save(load);
    }

    @Override
    public Load updateLoad(Load load) {
        return loadDao.save(load);
    }

    @Override
    public void deleteLoad(Long loadId) {
        loadDao.deleteById(loadId);
    }
}
