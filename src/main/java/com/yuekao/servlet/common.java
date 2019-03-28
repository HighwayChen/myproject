/**
 * Author Highway
 */
package com.yuekao.servlet;

import com.yuekao.Service.Analyze;
import com.yuekao.mycrawlertest.db.mapper.SchoolMapper;
import com.yuekao.mycrawlertest.db.vo.School;
import com.yuekao.mycrawlertest.db.vo.pageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Service
public class common {

    @Autowired
    private SchoolMapper schoolMapper;

    /**
     *
     * @param request
     * @param id           获取当前页面的页数
     * @param schoolName 　获取当前学校名
     * @return
     */

    public  School show(HttpServletRequest request, Integer id, String schoolName) {
        int i = 0;
        if(id%15==0){
            i=id/15;
        }
        else{
            i=id/15+1;
        }
        //获取爬虫得到的内容信息
        String getHtmlContent = Analyze.contents.trim();
        //获取爬虫得到的日期信息
        String getHtmlDate = Analyze.date.trim();
        //传参数
        request.setAttribute("href", getHtmlContent);
        request.setAttribute("date", getHtmlDate);
        School school = schoolMapper.selectByPrimaryKey(id);
        //获取数据中对应id的内容信息
        String getSqlContent = school.getContents();
        //获取数据中对应id的时间信息
        String getSqlDate = school.getDate();
        //数据库内容与爬取内容进行比较,如果相同则不跳转，不同则会提示并且更新数据库

        if (getHtmlContent.equals(getSqlContent) && getHtmlDate.equals(getSqlDate)) {
            return school;
        }
        //数据库更新
        else {

            school.setContents(getHtmlContent);
            school.setDate(getHtmlDate);
            school.setSchoolName(schoolName);
            school.setId(id);
            //System.out.println(getHtmlContent);
            schoolMapper.updateByPrimaryKey(school);
            //返回提示页面
            school.setContents("<font color=\"red\">"+getHtmlContent+"</font>");

            HttpSession session = request.getSession();
            List<School> schoolList = (List<School>) session.getAttribute("SchoolList"+i);
            for(School s:schoolList){
                if(s.getId().equals(school.getId())){
                    s.setContents(school.getContents());
                }
            }
            session.setAttribute("SchoolList"+i,schoolList);
            return school;
        }

    }
    //上海外国语大学单独提取工作

    /**
     * 基本内容同上
     * @param request
     * @param id
     * @param schoolName
     * @return
     */
    public  School showSisu(HttpServletRequest request, Integer id, String schoolName) {
        //获取目标内容
        String getHtmlContent = Analyze.sisuContents;
        //获取目标日期
        String getHtmlDate = Analyze.sisuDate;
        School school = schoolMapper.selectByPrimaryKey(id);
        request.setAttribute("href", getHtmlContent);
        request.setAttribute("date", getHtmlDate);
        //System.out.println(getHtmlContent);
        String getSqlContent = schoolMapper
                .selectByPrimaryKey(id)
                .getContents();
        String getSqlDate = schoolMapper.selectByPrimaryKey(id).getDate();
        //System.out.println(id);
        //System.out.println(schoolName);

        if (getHtmlContent.equals(getSqlContent) && getHtmlDate.equals(getSqlDate)) {

            return school;

        } else {

            school.setContents(getHtmlContent);
            school.setDate(getHtmlDate);
            school.setSchoolName(schoolName);
            school.setId(id);
            //System.out.println(getHtmlContent);
            schoolMapper.updateByPrimaryKey(school);
            //school.setContents("<p style=\"color:red\"> " + getHtmlContent + "</p>");

            return school;
        }

    }
}