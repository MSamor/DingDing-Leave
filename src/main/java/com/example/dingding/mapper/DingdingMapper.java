package com.example.dingding.mapper;

import com.example.dingding.domain.Announcement;
import com.example.dingding.domain.Dingding;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DingdingMapper {

//    private Integer id;
//    private String department;
//    private String destination;
//    private String end_time;
//    private String instructor;
//    private String name;
//    private String particulars;
//    private String request_end_time
//    private String request_start_ti
//    private String start_time;
//    private Integer student_id;

    @Insert("insert into forms(department,destination,end_time,instructor,name," +
            "particulars,request_end_time,request_start_time," +
            "start_time,student_id) values(#{department},#{destination},#{end_time},#{instructor},#{name}," +
            "#{particulars},#{request_end_time},#{request_start_time},#{start_time},#{student_id})")
    @Options(useGeneratedKeys = true, keyColumn="id",keyProperty="id")
    void insert(Dingding dingding);

    @Select("select * from forms where id=#{id}")
    Dingding getOneDD(Integer id);

    @Select("select * from announcement")
    List<Announcement> getOneAnno();
}
