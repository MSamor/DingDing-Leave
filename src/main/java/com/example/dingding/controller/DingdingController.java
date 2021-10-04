package com.example.dingding.controller;

import com.example.dingding.domain.Announcement;
import com.example.dingding.domain.Dingding;
import com.example.dingding.domain.Res;
import com.example.dingding.service.impl.DingdingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DingdingController {

    @Autowired
    DingdingServiceImpl dingdingService;

    @PostMapping("/dingding")
    public Res insert(@RequestBody Dingding dingding) {
        dingdingService.insert(dingding);
        final Res res = new Res();
        res.setStatus(200);
        res.setContent(dingding);
        return res;
    }

    @GetMapping("/dingding")
    public Res getOneDD(Integer id) {
        final Dingding dingding = dingdingService.getOneDD(id);
        final Res res = new Res();
        res.setStatus(200);
        res.setContent(dingding);
        return res;
    }

    @GetMapping("/anno")
    public Res getOneAnno() {
        final List<Announcement> announcementList = dingdingService.getOneAnno();
        final Res res = new Res();
        res.setStatus(200);
        res.setContent(announcementList);
        return res;
    }

    @GetMapping("/info")
    public Res getInfo() {
        final Res res = new Res();
        res.setStatus(200);
        res.setContent("docker 部署成功");
        return res;
    }
}
