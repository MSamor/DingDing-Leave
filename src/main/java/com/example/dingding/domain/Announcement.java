package com.example.dingding.domain;

import lombok.Data;

@Data
public class Announcement {
    private Integer id;
    private String title;
    private String content;
    private Integer is_open;
}
