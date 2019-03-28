package com.yuekao.servlet;
import com.yuekao.Service.Analyze;
import com.yuekao.mycrawlertest.db.mapper.SchoolMapper;
import com.yuekao.mycrawlertest.db.vo.School;
import com.yuekao.mycrawlertest.db.vo.pageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


/*
<<<<<<< HEAD
 *后台逻辑页面是否需要更新
 */



@Controller

public class checkUpdate {

    @Autowired
    private SchoolMapper schoolMapper;
    @Autowired
    private common c;
    @RequestMapping(value = "/search",method = RequestMethod.GET)
    /**
     * 搜索获取
     */
    public String getSearch(@RequestParam("schoolName") String name,HttpServletRequest request){
        //利用机构名称进行模糊查询
        List<School> school = schoolMapper.selectBySchool(name);
        //获取个数
        int totalNum = school.size();
        int pageNum = totalNum/15;
        if ((totalNum%15)!=0){
            pageNum++;
        }
        List<pageBean> numbers = new ArrayList<>();
        for(int i = 1;i<=pageNum;i++){
            pageBean p = new pageBean();
            p.setPageNum(i);
            numbers.add(p);

        }
        request.setAttribute("numbers",numbers);
        String  page = request.getParameter("pageNum");
        int pageCurNum = 1;
        if(page!=null){
            pageCurNum = Integer.valueOf(page);
        }
        request.setAttribute("numbers",numbers);

        request.setAttribute("list",school);
        return "my";
    }

    /*
     * 东南大学*/

    @RequestMapping(value = "/index/1",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdateSeu(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yzb.seu.edu.cn/6676/list.htm","<div id=newslist.*?/div>","<a .*?a>","<div id=newslist.*?/div>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);



    }
    /*
    中国教育在线
     */
    @RequestMapping(value = "/index/2",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate1(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://kaoyan.eol.cn/nnews/","<div class=\"listbox\".*?/div>","<a .*?a>","<div class=\"tline clearfix\".*?/div>","<span class=\"time.*?</span>","UTF-8");
        return c.show(request,id,schoolName);


    }
    /*

     * 学信网*/

    @RequestMapping(value = "/index/3",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate2(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("https://yz.chsi.com.cn/kyzx/kydt/","<ul class=\"news-list.*?/ul>","<a .*?a>","<ul class=\"news-list.*?/ul>","<span class=\"span-time.*?</span>","UTF-8");

        return c.show(request,id,schoolName);



    }
    /*
    中公考研
     */
    @RequestMapping(value = "/index/4",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate3(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://www.kaoyan365.cn/dongtai/","<li class=\"zg_list_left03_wrap.*?/li>","<a .*?a>","<li class=\"zg_list_left03_wrap.*?/li>","\\d{4}-\\d{2}-\\d{2}","GBK");

        return c.show(request,id,schoolName);



    }
    /*
  新东方
     */
    @RequestMapping(value = "/index/5",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate4(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://kaoyan.koolearn.com/dongtai/","<ul class=\"xqy_entry_list.*?/ul>","<a .*?a>","<ul class=\"xqy_entry_list.*?/ul>","\\d{4}-\\d{2}-\\d{2}","UTF-8");
        return c.show(request,id,schoolName);



    }
    /*
  清华大学
   */
    @RequestMapping(value = "/index/6",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate5(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yz.tsinghua.edu.cn/publish/yjszs/8550/index.html","<div class=\"infor_t.*?/div>","<a .*?a>","<div class=\"infor_t.*","<div class=\"time.*?/div>","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
北京大学
 */
    @RequestMapping(value = "/index/7",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate6(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("https://admission.pku.edu.cn/zsxx/sszs/index.htm","<ul class=\"zsxx_cont_list.*?/ul>","<a .*?p>","<ul class=\"zsxx_cont_list.*?/li>","<span class=.*?/span>","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
中国科学技术大学
*/
    @RequestMapping(value = "/index/8",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate7(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yz.ustc.edu.cn/list_1.htm","<td class=\"bt02.*?/td>","<a .*?a>","<ul class=\"zsxx_cont_list.*?/li>","<span class=.*?/span>","GBK");

        return c.show(request,id,schoolName);



    }
    /*
复旦大学
*/
    @RequestMapping(value = "/index/9",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate8(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://www.gsao.fudan.edu.cn/15157/list.htm","<ul class=\"cols_list clearfix.*?/ul>","<a .*?a>","<ul class=\"cols_list clearfix.*?/ul>","<span class=\"cols_meta.*?/span>","UTF-8");

        return c.show(request,id,schoolName);



    }
    /*
中国人民大学
*/
    @RequestMapping(value = "/index/10",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate9(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://pgs.ruc.edu.cn/sszs/jzml.htm","<li id=\"line_u12_0.*?/li>","<a .*?a>","<li id=\"line_u12_0.*?/li>","<span.*?/span>","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
上海交通大学
*/
    @RequestMapping(value = "/index/11",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate10(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){


        new Analyze().regexMain("https://yzb.sjtu.edu.cn/index/zkxx/sszs.htm","<li id=\"lineu9_0.*?/li>","<a .*?a>","<li id=\"lineu9_0.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8");
        return c.show(request,id,schoolName);



    }
    /*
南京大学
*/
    @RequestMapping(value = "/index/12",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate11(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://grawww.nju.edu.cn/912/list.htm","<li class=\"list_item i1.*?/li>","<a .*?a>","<li class=\"list_item i1.*?/li>","<span class='Article_PublishDate'.*?/span>","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
    同济大学
     */
    @RequestMapping(value = "/index/13",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate12(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("https://yz.tongji.edu.cn/zsxw/sszs.htm","<li id=\"line_u6_0.*?/li>","<a .*?a>","<li id=\"line_u6_0.*?/li>","<span .*?/span>","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
    浙江大学
     */
    @RequestMapping(value = "/index/14",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate13(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://grs.zju.edu.cn/yjszs/redir.php?catalog_id=131815","<ul class=\"common-news-list.*?/ul>","<a .*?a>","<ul class=\"common-news-list.*?/ul>","<span .*?/span>","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
      上海财经大学
     */
    @RequestMapping(value = "/index/15",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate14(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("https://gs.shufe.edu.cn/Home/NewsList/142","<div class=\"col-lg-12 news-list.*?/div>","<a .*?a>","<div class=\"col-lg-12 news-list.*?/div>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
          南开大学
         */
    @RequestMapping(value = "/index/16",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate15(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yzb.nankai.edu.cn/5509/list.htm","<div id=\"wp_news_w9.*?/div>","<a href.*?a>","<div id=\"wp_news_w9.*?/div>","<span class=\"col_news_date\".*?/span>","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
          北京航空航天大学
         */
    @RequestMapping(value = "/index/17",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate16(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yzb.buaa.edu.cn/xlss.htm","<li id=\"line_u6_0.*?/li>","<a .*?a>","<li id=\"line_u6_0.*?/li>","<span.*?/span>","UTF-8");
        return c.show(request,id,schoolName);


    }
    /*
         中央财经大学
        */
    @RequestMapping(value = "/index/18",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate17(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://gs.cufe.edu.cn/zsgz/sszs_sz_.htm","<li id=\"line_u8_0.*?/li>","<a .*?a>","<li id=\"line_u8_0.*?/li>","<span.*?/span>","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
        北京师范大学
       */
    @RequestMapping(value = "/index/19",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate19(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yz.bnu.edu.cn/list/master","<ul style=\"min-height:200px;.*?/ul>","<a href.*?a>","<ul style=\"min-height:200px;.*?/ul>","\\d{4}-\\d{2}-\\d{2}","UTF-8");
        return c.show(request,id,schoolName);


    }
    /*
       武汉大学
       */
    @RequestMapping(value = "/index/20",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate20(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://www.gs.whu.edu.cn/zsxx/sszs.htm","<div class=\"cont-top.*?/ul>","<a href.*?a>","<ul style=\"min-height:200px;.*?/ul>","<span class=\"pull-right text-muted.*?/span>","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
       对外经济贸易大学
       */
    @RequestMapping(value = "/index/21",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate21(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yjsy.uibe.edu.cn/infoArticleList.do?columnId=2705","<ul class=\"articleList.*?/ul>","<a href.*?a>","<ul class=\"articleList.*?/ul>","<span.*?/span>","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
       西安交通大学
       */
    @RequestMapping(value = "/index/22",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate22(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yz.xjtu.edu.cn/lmy.jsp?urltype=tree.TreeTempUrl&wbtreeid=1009","<div class=\"lilist.*?/div>","<a href.*?a>","<div class=\"lilist.*?/li>","</div>.*?<div class=\"lilishij.*?/div>","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
       天津大学
       */
    @RequestMapping(value = "/index/23",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate23(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yzb.tju.edu.cn/xwzx/tkss_xw/","<td class=\"table_dian.*?/td>","<a href.*?a>","<td width=\"60.*?/td>","\\d{4}-\\d{2}-\\d{2}","GBK");


        return c.show(request,id,schoolName);


    }
    /*
       华中科技大学
       */
    @RequestMapping(value = "/index/24",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate24(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://gszs.hust.edu.cn/zsxx/ggtz.htm","<li id=\"line_u8_0.*?/li>","<a href.*?a>","<li id=\"line_u8_0.*?/li>","<span.*?/span>","UTF-8");


        return c.show(request,id,schoolName);


    }
    /*
       北京理工大学
       */
    @RequestMapping(value = "/index/25",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate25(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://grd.bit.edu.cn/zsgz/ssyjs/tzgg_ss/index.htm","</h2.*?<a.*?<ul.*?li>.*?<span.*?/li>","<a href=\"1.*?a>","<h2.*?<ul.*?<li>.*?<span.*?/li>.*?/ul>","<span.*?/span>","UTF-8");


        return c.show(request,id,schoolName);


    }
    /*
      北京外国语大学
       */
    @RequestMapping(value = "/index/26",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate26(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("https://graduate.bfsu.edu.cn/zsxx/sszs.htm","<li id=\"line_u8_0.*?li>","<a.*?a>","<li id=\"line_u8_0.*?li>","<span.*?/span>","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
       中山大学
       */
    @RequestMapping(value = "/index/27",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate27(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://graduate.sysu.edu.cn/gra02/g02a/g02a03/index.htm","<ul class=\"lists2.*?/ul>","<a href.*?a>","<ul class=\"lists2.*?/ul>","<span class=\".*?/span>","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
       中国政法大学
       */
    @RequestMapping(value = "/index/28",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate28(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("https://yjsy.cupl.edu.cn/site/index_1.aspx?id=4BE8BCF7EC281A97#","<div class=\"my_list_2.*?<li class=\"clearfix.*?li>","<a.*?a>","<li class=\"clearfix.*?li>","<I.*?I>","UTF-8");


        return c.show(request,id,schoolName);


    }
    /*
       华东师范大学
       */
    @RequestMapping(value = "/index/29",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate29(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://www.yjsy.ecnu.edu.cn/yjszs/list.htm","<td class=\"bottomtdborder.*?/tbody>","<a.*?a>","<td class=\"bottomtdborder.*?/tbody>","<div style=\"white-space:nowrap.*?/div>","UTF-8");


        return c.show(request,id,schoolName);


    }
    /*
       哈尔滨工业大学
       */
    @RequestMapping(value = "/index/30",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate30(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yzb.hit.edu.cn/8822/list.htm","<div id=\"wp_news_w16.*?/div>","<a href.*?a>","<div id=\"wp_news_w16.*?/div>","<span class=\"tt2.*?/span>","UTF-8");


        return c.show(request,id,schoolName);


    }
    /*
      北京邮电大学
       */
    @RequestMapping(value = "/index/31",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate31(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("https://yzb.bupt.edu.cn/list/list.php?p=2_1_1","<ul class=\"padlr20 ovhi.*?/ul>","<a.*?a>","<ul class=\"padlr20 ovhi.*?/ul>","<font.*?/font>","UTF-8");


        return c.show(request,id,schoolName);


    }
    /*
       厦门大学
       */
    @RequestMapping(value = "/index/32",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate32(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("https://zs.xmu.edu.cn/5826/list.htm","<div class=\"col-lg-10 col-md-10 col-sm-9 col-xs-10 list-news-title.*?/div>","<a href.*?a>","<div class=\"col-lg-2 col-md-2 col-sm-3 col-xs-2 news-date.*?/div>","\\d{4}-\\d{2}-\\d{2}","UTF-8");


        return c.show(request,id,schoolName);


    }
    /*
       上海外国语大学
       */
    @RequestMapping(value = "/index/33",method = RequestMethod.GET)
    @ResponseBody
    public School  isUpdate33(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://graduate.shisu.edu.cn/3211/list.htm","<div class=\"cont-top.*?/ul>","<a href.*?a>","<ul style=\"min-height:200px;.*?/ul>","<span class=\"pull-right text-muted.*?/span>","UTF-8");

        return c.showSisu(request,id,schoolName);


    }
    /*
       西北工业大学
       */
    @RequestMapping(value = "/index/34",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate34(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){



        new Analyze().regexMain("http://yzb.nwpu.edu.cn/new/sszs/zsgg.htm","<div class=\"cno-head.*?/li>","<a.*?a>","<div class=\"cno-head.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
       西南财经大学
       */
    @RequestMapping(value = "/index/35",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate35(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yz.swufe.edu.cn/web/3389.html","<div class=\"content.*?/div>","<a href.*?a>","<div class=\"content.*?/div>","<span.*?/span>","GBK");

        return c.show(request,id,schoolName);


    }
    /*
       中南大学
       */
    @RequestMapping(value = "/index/36",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate36(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://gra.csu.edu.cn/yjsy/PYGL/wjtz1_2.html","<tr onmouseover=\".*?/tr>","<a.*?a>","<tr onmouseover=\".*?/tr>","<span.*?/span>","UTF-8");
        return c.show(request,id,schoolName);


    }
    /*
       大连理工大学
       */
    @RequestMapping(value = "/index/37",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate37(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){


        new Analyze().regexMain("http://gs.dlut.edu.cn/yjszs/sss/qgtk.htm","<DIV class=\"list.*?/LI>","<A href.*?A>","<DIV class=\"list.*?/LI>","<SPAN class=\".*?/SPAN>","UTF-8");
        return c.show(request,id,schoolName);


    }
    /*
       中国传媒大学
       */
    @RequestMapping(value = "/index/38",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate38(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yz.cuc.edu.cn/listWYFHY/list_2_1.htm","<tr.*?/tr>","<a.*?a>","</td.*?/tr>","\\d{4}-\\d{2}-\\d{2}","GBK");

        return c.show(request,id,schoolName);


    }
    /*
      四川大学
       */
    @RequestMapping(value = "/index/39",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate39(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("https://yz.scu.edu.cn/zsxx/newslist/a/gk","<ul class=\"data-list.*?/ul>","<a href.*?a>","<ul class=\"data-list.*?/ul>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
       电子科技大学
       */
    @RequestMapping(value = "/index/40",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate40(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("https://yz.uestc.edu.cn/shuoshizhaosheng/","<td.*?<li>.*?/li>","<li.*?<strong>.*?a>","<td.*?<ul>.*?/ul>","\\d{4}-\\d{2}-\\d{2}","UTF-8");


        return c.show(request,id,schoolName);


    }
    /*
       中南财经政法大学
       */
    @RequestMapping(value = "/index/41",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate41(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yzb.zuel.edu.cn/4639/listm.htm","<li class=\"list_item i1.*?/li>","<a href.*?a>","<ul style=\"min-height:200px;.*?/ul>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
      华南理工大学
      */
    @RequestMapping(value = "/index/42",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate42(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://www2.scut.edu.cn/graduate/14670/list.htm","<li class=\"list-item.*?/li>","<a href.*?a>","<li class=\"list-item.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
      吉林大学
      */
    @RequestMapping(value = "/index/43",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate43(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://zsb.jlu.edu.cn/list/28.html","<span class=\"list_time.*?/div>","<a  href.*?a>","<span class=\"list_time.*?/span>","<span class=\"list_time.*?/span>","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
      南京航空航天大学
      */
    @RequestMapping(value = "/index/44",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate44(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://www.graduate.nuaa.edu.cn/2108/list.htm","<div frag=\"面板2.*?/div>","<a href.*?title.*?/a>","<div frag=\"面板2.*?/div>","\\d{4}/\\d{2}/\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
      湖南大学
      */
    @RequestMapping(value = "/index/45",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate45(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://gra.hnu.edu.cn/zsxx/sszs.htm","<li id=\"line_u7_0.*?/li>","<a href.*?a>","<li id=\"line_u7_0.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
      重庆大学
      */
    @RequestMapping(value = "/index/46",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate46(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yz.cqu.edu.cn/ss_news.html","<div class=\"list_cont_1.*?/div>","<a href.*?a>","<div class=\"list_cont_2.*?/div>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
      北京科技大学
      */
    @RequestMapping(value = "/index/47",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate47(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yzxc.ustb.edu.cn/zsjz/sszs1/index.htm","<table class=\"tablelist_l.*?/table>","<a href.*?a>","<table class=\"tablelist_l.*?/table>","\\d{4}-\\d{2}-\\d{2}","GBK");


        return c.show(request,id,schoolName);


    }
    /*
     北京交通大学
     */
    @RequestMapping(value = "/index/48",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate48(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("https://gs.bjtu.edu.cn/cms/zszt/item/?cat=3","<div class=\"mainleft_box.*?<li class=\"main_li.*?<div class=\"main_a.*?/div>","<a href.*?a>","<div class=\"mainleft_box.*?<li class=\"main_li.*?<div class=\"main_a.*?/div>","\\d{4}-\\d{2}-\\d{2}","UTF-8");


        return c.show(request,id,schoolName);


    }
    /*
    山东大学
    */
    @RequestMapping(value = "/index/49",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate49(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("https://gs.bjtu.edu.cn/cms/zszt/item/?cat=3","<div class=\"mainleft_box.*?<li class=\"main_li.*?<div class=\"main_a.*?/div>","<a href.*?a>","<div class=\"mainleft_box.*?<li class=\"main_li.*?<div class=\"main_a.*?/div>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
    华东理工大学
    */
    @RequestMapping(value = "/index/50",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate50(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://gschool.ecust.edu.cn/7962/list.htm","<li class=\"list_item i1.*?/li>","<a href.*?a>","<li class=\"list_item i1.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
   西安电子科技大学
   */
    @RequestMapping(value = "/index/51",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate51(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("https://gr.xidian.edu.cn/yjsy/yjszs.htm","<li id=\"lineu14_0.*?/li>","<a href.*?a>","<li id=\"lineu14_0.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8");


        return c.show(request,id,schoolName);


    }
    /*
  天津医科大学
  */
    @RequestMapping(value = "/index/52",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate52(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://gs.tmu.edu.cn/3111/list.htm","<div class=\"listbox.*?/div>","<a href.*?a>","<div class=\"listbox.*?/div>","\\d{4}-\\d{2}-\\d{2}","UTF-8");


        return c.show(request,id,schoolName);


    }
    /*
 南京理工大学
 */
    @RequestMapping(value = "/index/53",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate53(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://gs.njust.edu.cn/zsw/zsxx/list.htm","<li class=\"list_item i2.*?/li>","<a href.*?a>","<li class=\"list_item i2.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8");


        return c.show(request,id,schoolName);


    }
    /*
中国农业大学
*/
    @RequestMapping(value = "/index/54",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate54(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yz.cau.edu.cn/infoArticleList.do?columnId=10402","<div class=\"articleList.*?/div>","<a href.*?a>","<div class=\"articleList.*?/div>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
华中师范大学
*/
    @RequestMapping(value = "/index/55",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate55(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://gs.ccnu.edu.cn/zsgz/ssyjs.htm","<LI id=\"line_u10_0.*?/LI>","<A.*?A>","<LI id=\"line_u10_0.*?/LI>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
中国海洋大学
*/
    @RequestMapping(value = "/index/56",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate56(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yz.ouc.edu.cn/5926/list.htm","<li class=\"list_item i1.*?/li>","<a href.*?a>","<li class=\"list_item i1.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
哈尔滨工程大学
*/
    @RequestMapping(value = "/index/57",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate57(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yzb.hrbeu.edu.cn/3279/list.htm","<li class=\"list_item i1.*?/li>","<a href.*?a>","<li class=\"list_item i1.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
中央民族大学
*/
    @RequestMapping(value = "/index/58",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate58(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://grs.muc.edu.cn/pglist.asp?c=3000000001","<div style=\'padding-left:22px.*?/div>","<a.*?a>","<div style=\'padding-left:22px.*?/a>","\\d{4}-\\d{2}-\\d{2}","GBK");

        return c.show(request,id,schoolName);


    }
    /*
华北电力大学
*/
    @RequestMapping(value = "/index/59",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate59(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yjsy.ncepu.edu.cn/zsxx/sszsxx/index.htm","<div class=\"listTitle listTitle2.*?/div.*?/li>","<a href.*?title.*?a>","<div class=\"listTitle listTitle2.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
北京中医药大学
*/
    @RequestMapping(value = "/index/60",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate60(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yanjiusheng.bucm.edu.cn/zsjy/sszs/index.htm","<div class=\"ul_list.*?/li>","<a href.*?a>","<div class=\"ul_list.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
暨南大学
*/
    @RequestMapping(value = "/index/61",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate61(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("https://yz.jnu.edu.cn/jnss/list.htm","<li class=\"list_item i1.*?/li>","<a href.*?a>","<li class=\"list_item i1.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
 苏州大学
 */
    @RequestMapping(value = "/index/62",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate62(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yjs.suda.edu.cn/sszs1/index.jhtml","<div class=\"content.*?/div>","<a href.*?a>","<div class=\"content.*?/div>","\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
 武汉理工大学
 */
    @RequestMapping(value = "/index/63",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate63(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://gd.whut.edu.cn/channels/17.html","<td valign=\"top.*?/table>","<a href.*?/a>","<table width=\".*?class=\"news_list.*?/table>","\\d{4}-\\d{2}-\\d{2}","UTF-8" );

        return c.show(request,id,schoolName);


    }
    /*
东北大学
*/
    @RequestMapping(value = "/index/64",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate64(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://www.graduate.neu.edu.cn/dongda/qgtk/index.jhtml","<div class=\"msgUnit_list.*?/ul>","<a href.*?/a>","<div class=\"msgUnit_list.*?/ul>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
兰州大学
*/
    @RequestMapping(value = "/index/65",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate65(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yz.lzu.edu.cn/lzupage/B20160906113221.html","<ul class=\"lists.*?/ul>","<a href.*?/a>","<ul class=\"lists.*?/ul>","\\d{4}-\\d{2}-\\d{2}","GBK");

        return c.show(request,id,schoolName);


    }
    /*
中国药科大学
*/
    @RequestMapping(value = "/index/66",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate66(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yjsy.cpu.edu.cn/_t283/6281/list.htm","<div class=\"entry.*?/div>","<a href.*?/a>","<div class=\"entry.*?/div>","\\d{4}-\\d{2}-\\d{2}","UTF-8");


        return c.show(request,id,schoolName);


    }
    /*
东华大学
*/
    @RequestMapping(value = "/index/67",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate67(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yjszs.dhu.edu.cn/7128/list.htm","<li class=\"list_item i1.*?/li>","<a href.*?/a>","<li class=\"list_item i1.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8");


        return c.show(request,id,schoolName);


    }
    /*
河海大学
*/
    @RequestMapping(value = "/index/68",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate68(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://gs.hhu.edu.cn/3518/list.htm","<div id=newslist.*?/div>","<a href.*?/a>","<div id=newslist.*?/div>","\\d{4}-\\d{2}-\\d{2}","UTF-8");


        return c.show(request,id,schoolName);


    }
    /*
北京林业大学
*/
    @RequestMapping(value = "/index/69",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate69(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://graduate.bjfu.edu.cn/yjszs/zsdt/index.html","<div class=\"newslist.*?/div>","<a href.*?/a>","<div class=\"newslist.*?/div>","\\d{2}-\\d{2}-\\d{2}","GBK");

        return c.show(request,id,schoolName);


    }
    /*
河北工业大学
*/
    @RequestMapping(value = "/index/70",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate70(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yjs.hebut.edu.cn/zsgz/zsgztzgg/index.htm","<ul style=\"min-height:300px;.*?/ul>","<a href.*?/a>","<ul style=\"min-height:300px;.*?/ul>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
北京工业大学
*/
    @RequestMapping(value = "/index/71",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate71(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yanzhao.bjut.edu.cn/sszs/xsx/","<td colspan=\"2.*?/a>","<a.*?/a>","<td colspan=\"2.*?/td>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
江南大学
*/
    @RequestMapping(value = "/index/72",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate72(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yz.jiangnan.edu.cn/sszs/tzgg.htm","<div class=\"list_content.*?/div>","<a.*?/a>","<div class=\"list_content.*?/div>","\\d{4}-\\d{2}-\\d{2}","UTF-8");


        return c.show(request,id,schoolName);


    }
    /*
北京化工大学
*/
    @RequestMapping(value = "/index/73",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate73(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://graduate.buct.edu.cn/zsgz/zxtz/index.htm","<div class=\"list02.*?/div>","<a.*?/a>","<div class=\"list02.*?/div>","\\d{4}-\\d{2}-\\d{2}","UTF-8");


        return c.show(request,id,schoolName);


    }
    /*
西南交通大学（页面爬取不全）
*/
    @RequestMapping(value = "/index/74",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate74(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("https://gs.swjtu.edu.cn/ws/rs/c/01","<div class=\"title.*?/div>","<a.*?/a>","<div class=\"remark.*?/div>","\\d{4}-\\d{2}-\\d{2}","UTF-8");


        return c.show(request,id,schoolName);


    }
    /*
上海大学
*/
    @RequestMapping(value = "/index/75",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate75(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yjsb.shu.edu.cn/","<div class=\"slide\" style=\"margin-top:5px;.*?<div class=\"innewsli.*?/div>","</span><a.*?/a>","<div class=\"slide\" style=\"margin-top:5px;.*?<div class=\"innewsli.*?/div>","\\d{4}-\\d{2}-\\d{2}","GBK");


        return c.show(request,id,schoolName);


    }
    /*
南京师范大学(需要修改)
*/
    @RequestMapping(value = "/index/76",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate76(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){


        new Analyze().regexMain("http://yz.njnu.edu.cn/homepage_show.jsp?wid=2&parentid=/","<div class=\"slide\" style=\"margin-top:5px;.*?<div class=\"innewsli.*?/div>","</span><a.*?/a>","<div class=\"slide\" style=\"margin-top:5px;.*?<div class=\"innewsli.*?/div>","\\d{4}-\\d{2}-\\d{2}","GBK");

        return c.show(request,id,schoolName);


    }
    /*
中国地质大学（武汉）
*/
    @RequestMapping(value = "/index/77",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate77(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://front.zhinengdayi.com/page/list/PVKZRL/697?curPage=1&pageSize=10","<div class=\"subList_content_msg.*?/div>","<span class=\"title.*?/span>","<div class=\"subList_content_msg.*?/div>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
中国地质大学（北京）（提供的网址怎么和武汉的一样？）
*/
    @RequestMapping(value = "/index/78",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate78(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){


        new Analyze().regexMain("http://www.cugb.edu.cn/gmoreInfo.action?bigClassId=15","<li class=\"clearfix.*?/li>","<a.*?/a>","<li class=\"clearfix.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8");


        return c.show(request,id,schoolName);


    }
    /*
西北大学
*/
    @RequestMapping(value = "/index/79",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate79(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yzb.nwu.edu.cn/news_list.aspx?category_id=60","<div class=\"row min_hgt.*?/div>","<a.*?/a>","<div class=\"row min_hgt.*?/div>","\\d{4}-\\d{2}-\\d{2}","UTF-8");
        return c.show(request,id,schoolName);


    }
    /*
东北师范大学
*/
    @RequestMapping(value = "/index/80",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate80(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yjsy.nenu.edu.cn/z_s1/s_s/j_z.htm","<li class=\"cleafix.*?/li>","<a.*?/a>","<li class=\"cleafix.*?/li>","<p.*?/p>.*?</p>","UTF-8");
        return c.show(request,id,schoolName);


    }
    /*
长安大学
*/
    @RequestMapping(value = "/index/81",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate81(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yzb.chd.edu.cn/2769/list.htm","<li class=\"list_item i1.*?/li>","<a.*?/a>","<li class=\"list_item i1.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8");


        return c.show(request,id,schoolName);


    }
    /*
中国矿业大学（北京）
*/
    @RequestMapping(value = "/index/82",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate82(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yjs.cumtb.edu.cn/zsgz/sszs.htm","<li id=\"line_u6_0.*?/li>","<a.*?/a>","<li id=\"line_u6_0.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
华中农业大学
*/
    @RequestMapping(value = "/index/83",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate83(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yjs.hzau.edu.cn/zsgz/sszs.htm","<LI id=\"line_u3_0.*?/LI>","<A.*?/A>","<LI id=\"line_u3_0.*?/LI>","\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
合肥工业大学(爬取不全)
*/
    @RequestMapping(value = "/index/84",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate84(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yjszs.hfut.edu.cn/more.jsp?cid=10","<LI id=\"line_u3_0.*?/LI>","<A.*?/A>","<LI id=\"line_u3_0.*?/LI>","\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }

    /*
 广西大学
 */
    @RequestMapping(value = "/index/85",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate85(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yjsc.gxu.edu.cn/zsxx/sszs.htm","<tr id=\"line124084_0.*?/tr>","<a.*?/a>","<tr id=\"line124084_0.*?/tr>","\\d{4}/\\d{2}/\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
中国石油大学（华东）
*/
    @RequestMapping(value = "/index/86",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate86(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://zs.gs.upc.edu.cn/sszs/list.htm","<div id=\"wp_news_w7.*?/div>","<a.*?/a>","<div id=\"wp_news_w7.*?/div>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
陕西师范大学
*/
    @RequestMapping(value = "/index/87",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate87(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yz.snnu.edu.cn/tzgg/ssyjszs.htm","<DIV class=\"lightgreybox.*?/li>","<li.*?/a>","<DIV class=\"lightgreybox.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
南京农业大学
*/
    @RequestMapping(value = "/index/88",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate88(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://grasch.njau.edu.cn/zsgz/sszs.htm","<TD height=\"28.*?style=\"FONT-SIZE: 14px\".*?/TR>","<A.*?/A>","<TD height=\"28.*?style=\"FONT-SIZE: 14px\".*?/TR>","\\d{4}-\\d{2}-\\d{2}","UTF-8");


        return c.show(request,id,schoolName);


    }
    /*
湖南师范大学
*/
    @RequestMapping(value = "/index/89",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate89(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yjsy.hunnu.edu.cn/index.php/cms/item-list-category-24.shtml","<table width=\"686.*?/table>","<a.*?/a>","<table width=\"686.*?/table>","\\d{4}-\\d{2}-\\d{2}","GBK");

        return c.show(request,id,schoolName);


    }
    /*
福州大学
*/
    @RequestMapping(value = "/index/90",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate90(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yjsy.fzu.edu.cn/html/zsgz/ssyjszs/1.html","<div cmsid=\"29025460.*?/ul>","<a.*?/a>","<div cmsid=\"29025460.*?/ul>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
大连海事大学
*/
    @RequestMapping(value = "/index/91",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate91(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://grs.dlmu.edu.cn/zs/ssyjs.htm","<div class=\"list_bd.*?/ul>","<a.*?/a>","<div class=\"list_bd.*?/ul>","\\d{2}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
西北农林科技大学
*/
    @RequestMapping(value = "/index/92",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate92(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yz.nwsuaf.edu.cn/info.do?columnId=1081","<div class=\"articleList.*?/ul>","<a.*?/a>","<div class=\"articleList.*?/ul>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
西南大学
*/
    @RequestMapping(value = "/index/93",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate93(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yanzhao.swu.edu.cn/s/yanzhao/news1/","<div class=\"ct-body.*?/ul>","<a.*?/a>","<div class=\"ct-body.*?/ul>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
中国矿业大学
*/
    @RequestMapping(value = "/index/94",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate94(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yjsb.cumt.edu.cn/sszs/list.htm","<li class=\"list_item i1.*?/li>","<a.*?/a>","<li class=\"list_item i1.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
云南大学
*/
    @RequestMapping(value = "/index/95",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate95(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://www.grs.ynu.edu.cn/zsgz/qrzssyjs.htm","<li id=\"line_u1_0.*?/li>","<a.*?/a>","<li id=\"line_u1_0.*?/li>","\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
    太原理工大学
*/
    @RequestMapping(value = "/index/96",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate96(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yz.tyut.edu.cn/sszs.htm","<DIV align=\"left.*?text-align:left; line-height:35px;.*?/DIV>","<A.*?/A>","<DIV align=\"left.*?text-align:left; line-height:35px;.*?/DIV>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
 华南师范大学
*/
    @RequestMapping(value = "/index/97",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate97(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yz.scnu.edu.cn/tongzhigonggao/ssgg/","<div class=\"listmod cl.*?/div>","<a.*?/a>","<div class=\"listmod cl.*?/div>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
北京体育大学
*/
    @RequestMapping(value = "/index/98",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate98(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://zs.bsu.edu.cn/sszs/index.htm","<ul class=\"newsList.*?/ul>","<a.*?/a>","<ul class=\"newsList.*?/ul>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
中国石油大学（北京）
*/
    @RequestMapping(value = "/index/99",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate99(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://www.cup.edu.cn/graduate/zhaosheng/graduatedrecruit/index.htm","<ul class=\"win_list listS1.*?/ul>","<a.*?/a>","<ul class=\"win_list listS1.*?/ul>","\\d{4}-\\d{2}-\\d{2}","GBK");

        return c.show(request,id,schoolName);


    }
    /*
安徽大学
*/
    @RequestMapping(value = "/index/100",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate100(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://graschool.ahu.edu.cn/9539/list.htm","<div id=\"wp_news_w09.*?/a>","<a.*?/a>","<div id=\"wp_news_w09.*?/a>.*?/td>.*?/td>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
    东北林业大学（不能获取）
*/
    @RequestMapping(value = "/index/101",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate101(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yz.nefu.edu.cn/index/ggb/9.htm","<li id=\"line_u8_0.*?/li>","<a.*?/a>","<li id=\"line_u8_0.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
   东北农业大学
*/
    @RequestMapping(value = "/index/102",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate102(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://graduate.neau.edu.cn/zsgz/xwdt.htm","<tr id=\"line54076_0.*?/tr>","<a.*?/a>","<tr id=\"line54076_0.*?/tr>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
  辽宁大学(ａｊａｘ）
*/
    @RequestMapping(value = "/index/103",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate103(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://grs.lnu.edu.cn/zsgz/sszs.htm","<TR id=\"line13579_0.*?/TR>","<A.*?/A>","<TR id=\"line13579_0.*?/TR>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
南昌大学
*/
    @RequestMapping(value = "/index/104",method = RequestMethod.GET)
    @ResponseBody
    public School isUpdate104(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://zjc.ncu.edu.cn/zs/html/c/27/","<li class=\"am-list-item-dated.*?/li>","<a.*?/a>","<li class=\"am-list-item-dated.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8");


        return c.show(request,id,schoolName);


    }
    /*
延边大学
*/
    @RequestMapping(value = "/index/105",method = RequestMethod.GET)
    @ResponseBody

    public School isUpdate105(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://grad.ybu.edu.cn/tzgg/zs.htm","<div class=\"lanmu.*?/div>","<A.*?/A>","<div class=\"lanmu-list.*?/div>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
内蒙古大学
*/
    @RequestMapping(value = "/index/106",method = RequestMethod.GET)
    @ResponseBody

    public School isUpdate106(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://gs.imu.edu.cn/zsgz/ssszs/tzgg.htm","<li id=\"line_u8_0.*?/li>","<a.*?/a>","<li id=\"line_u8_0.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8");
        return c.show(request,id,schoolName);


    }
    /*
四川农业大学
*/
    @RequestMapping(value = "/index/107",method = RequestMethod.GET)
    @ResponseBody

    public School isUpdate107(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yan.sicau.edu.cn/index/zs/sszs.htm","<LI id=\"line_u7_0.*?/LI>","<A.*?/A>","<LI id=\"line_u7_0.*?/LI>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
海南大学
*/
    @RequestMapping(value = "/index/108",method = RequestMethod.GET)
    @ResponseBody

    public School isUpdate108(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://www.hainu.edu.cn/stm/zy_yjs/shtml_liebiao.asp@bbsid=3835.shtml","<li class=\"jinghua0.*?/li>","<a.*?/a>","<li class=\"jinghua0.*?/li>","<span.*?/span>","GBK");

        return c.show(request,id,schoolName);


    }
    /*
贵州大学
*/
    @RequestMapping(value = "/index/109",method = RequestMethod.GET)
    @ResponseBody

    public School isUpdate109(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://gs.gzu.edu.cn/sszs/list.htm","<div class=\"list_cont_title.*?/div>","<a.*?/a>","<div class=\"list_cont_title.*?/div>","<span.*?/span>","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
郑州大学(网络不可达)
*/
    @RequestMapping(value = "/index/110",method = RequestMethod.GET)
    @ResponseBody

    public School isUpdate110(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){


        new Analyze().regexMain("http://gs.zzu.edu.cn/zsgz/sszsjz.htm","<li id=\"line_u8_1.*?/li>","<a.*?/a>","<li id=\"line_u8_1.*?/li>","<span.*?/span>","UTF-8");


        return c.show(request,id,schoolName);


    }
    /*
新疆大学
*/
    @RequestMapping(value = "/index/111",method = RequestMethod.GET)
    @ResponseBody

    public School isUpdate111(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://gs.xju.edu.cn/zsxx/ssyjs.htm","<a class=\"c42336.*?/a>","<a class.*?/a>","<tr id=\"line42336_0.*?/tr>","\\d{4}/\\d{2}/\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
宁夏大学
 */
    @RequestMapping(value = "/index/112",method = RequestMethod.GET)
    @ResponseBody

    public School isUpdate112(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("https://graduate.nxu.edu.cn/zsxx/zsdt.htm","<li id=\"lineu8_1.*?/li>","<a.*?/a>","<li id=\"lineu8_1.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8");


        return c.show(request,id,schoolName);


    }
    /*
石河子大学
*/
    @RequestMapping(value = "/index/113",method = RequestMethod.GET)
    @ResponseBody

    public School isUpdate113(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yz.shzu.edu.cn/lqcx/list.htm","<li class=\"list_item i1.*?/li>","<a.*?/a>","<li class=\"list_item i1.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
青海大学
*/
    @RequestMapping(value = "/index/114",method = RequestMethod.GET)
    @ResponseBody

    public School isUpdate114(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://yjs.qhu.edu.cn/zsgz/xlsszs/index.htm","<div class=\"articleList articleList2.*?/li>","<a.*?/a>","<div class=\"articleList articleList2.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
    /*
考研帮
*/
    @RequestMapping(value = "/index/115",method = RequestMethod.GET)
    @ResponseBody

    public School isUpdate115(@RequestParam ("id") Integer id, @RequestParam("schoolName") String schoolName, HttpServletRequest request){

        new Analyze().regexMain("http://www.kaoyan.com/hot/","<ul class=\"list areaZslist.*?/ul>","<a.*?/a>","<div class=\"articleList articleList2.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8");

        return c.show(request,id,schoolName);


    }
}

