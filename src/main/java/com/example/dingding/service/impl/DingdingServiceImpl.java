package com.example.dingding.service.impl;

import com.example.dingding.domain.Announcement;
import com.example.dingding.domain.Dingding;
import com.example.dingding.mapper.DingdingMapper;
import com.example.dingding.service.DingdingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DingdingServiceImpl implements DingdingService {
    @Autowired
    DingdingMapper dingdingMapper;

    @Override
    public void insert(Dingding dingding) {
        dingdingMapper.insert(dingding);
    }

    @Override
    public Dingding getOneDD(Integer id) {
        return dingdingMapper.getOneDD(id);
    }

    @Override
    public List<Announcement> getOneAnno() {
        return dingdingMapper.getOneAnno();
    }
}
