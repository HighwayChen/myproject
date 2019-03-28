package com.yuekao.mycrawlertest.db.mapper;

import com.yuekao.mycrawlertest.db.vo.School;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SchoolMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(School record);

    int insertSelective(School record);

    School selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(School record);

    int updateByPrimaryKey(School record);

    List<School> getInfo(@Param("cur") int cur, @Param("num") int num);

    int getToTalNum();

    List<School> selectBySchool(@Param("school") String school );

    List<String> getAllUrl();

}