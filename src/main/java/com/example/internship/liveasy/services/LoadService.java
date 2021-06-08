package com.example.internship.liveasy.services;

import com.example.internship.liveasy.entities.Load;

import java.util.List;

public interface LoadService {
    public List<Load> getLoads();

    Load getLoad(Long loadId);

    List<Load> getLoadByShipperId(Long shipperId);

    Load addLoad(Load load);

    Load updateLoad(Load load);

    void deleteLoad(Long loadId);
}

