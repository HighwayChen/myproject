package com.yuekao.mycrawlertest.db.vo;

import java.util.Date;

public class School {
    private Integer id;

    private String schoolName;

    private String contents;

    private String date;


    private String URL;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName == null ? null : schoolName.trim();
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents == null ? null : contents.trim();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public void setURL(String URL){this.URL=URL; }

    public String getURL(){return URL;}


}