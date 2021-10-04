package com.example.dingding.service;

import com.example.dingding.domain.Announcement;
import com.example.dingding.domain.Dingding;

import java.util.List;

public interface DingdingService {
    void insert(Dingding dingding);
    Dingding getOneDD(Integer id);
    List<Announcement> getOneAnno();
}
