package com.yuekao.servlet;





import com.yuekao.Service.Analyze;
import com.yuekao.Service.thecontainer;


import com.yuekao.mycrawlertest.db.mapper.SchoolMapper;
import com.yuekao.mycrawlertest.db.vo.School;
import com.yuekao.mycrawlertest.db.vo.pageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * 登录获取
 */
@Controller
public class Index {

    List<School> main = new ArrayList<>();
    @Autowired
    private SchoolMapper schoolMapper;

    @RequestMapping("/index")

    public String ftlIndex(HttpServletRequest request) {

        String page = request.getParameter("pageNum");
        int pageCurNum = 1;
        if (page != null) {
            pageCurNum = Integer.valueOf(page);
        }

        //获取全部文件个数
        int totalNum = schoolMapper.getToTalNum();
        //页数
        int pageNum = totalNum / 15;
        if ((totalNum % 15) != 0) {
            pageNum++;
        }
        List<pageBean> numbers = new ArrayList<>();
        for (int i = 1; i <= pageNum; i++) {
            pageBean p = new pageBean();
            p.setPageNum(i);
            numbers.add(p);

        }
        //给前端页面传入参数
        request.setAttribute("numbers", numbers);
        List<School> list;
        if (request.getSession().getAttribute("SchoolList" + pageCurNum) == null) {
            list = schoolMapper.getInfo((pageCurNum - 1) * 15, 15);
            request.getSession().setAttribute("SchoolList" + pageCurNum, list);
        } else {
            list = (List<School>) request.getSession().getAttribute("SchoolList" + pageCurNum);
        }
        list = (List<School>)request.getSession().getAttribute("SchoolList"+pageCurNum);
        request.setAttribute("list", list);
        request.setAttribute("pageNum", pageCurNum);
        return "my";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String refresh(HttpServletRequest request) {

        List<String[]> list = new ArrayList<>();
        thecontainer.addElements(list);
        int size = list.size();
        String ids = request.getParameter("pageNum");

        if (ids == null) {

            for (int i = 0; i < 15; i++) {

                String[] tmp = list.get(i);
                String[] tempMain = new String[2];
                Analyze analyze = new Analyze();
                analyze.regexMain(tmp[0], tmp[1], tmp[2], tmp[3], tmp[4], tmp[5]);
                tempMain[0] = Analyze.contents.trim();
                tempMain[1] = Analyze.date.trim();
                /*if (tempMain[0] == null && tempMain[1] == null) {
                    continue;
                }*/
                School school = schoolMapper.selectByPrimaryKey(i + 1);
                if (!tempMain[0].equals(school.getContents())) {
                    school.setContents(tempMain[0]);
                    school.setDate(tempMain[1]);
                    schoolMapper.updateByPrimaryKey(school);
                    main.add(school);
                }

            }
        } else {
            int start = (Integer.valueOf(ids) - 1) * 15;
            System.out.println(start);
            int finish = Integer.valueOf(ids) * 15;
            if(finish>size){
                finish=size;
            }
            System.out.println(finish);
            for (int i = start; i < finish; i++) {
                String[] tmp = list.get(i);
                String[] tempMain = new String[2];
                Analyze analyze = new Analyze();
                analyze.regexMain(tmp[0], tmp[1], tmp[2], tmp[3], tmp[4], tmp[5]);
                tempMain[0] = Analyze.contents.trim();
                tempMain[1] = Analyze.date.trim();
                School school = schoolMapper.selectByPrimaryKey(i + 1);
                if (!tempMain[0].equals(school.getContents())) {
                    school.setContents(tempMain[0]);
                    school.setDate(tempMain[1]);
                    schoolMapper.updateByPrimaryKey(school);
                    main.add(school);
                }
            }

            //System.out.println(main.size());
            request.setAttribute("list", main);

        }


        return "update";

    }
}





