package com.yuekao.Service;

import com.yuekao.Service.Analyze;

import java.util.List;

public class thecontainer {

    public  static void addElements(List<String[]> container){
        //1.东南大学
        container.add(new String[]{"http://yzb.seu.edu.cn/6676/list.htm","<div id=newslist.*?/div>","<a .*?a>","<div id=newslist.*?/div>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //2.中国教育在线
        container.add(new String[]{"http://kaoyan.eol.cn/nnews/","<div class=\"listbox\".*?/div>","<a .*?a>","<div class=\"tline clearfix\".*?/div>","<span class=\"time.*?</span>","UTF-8"});
        //3.学信网
        container.add(new String[]{"https://yz.chsi.com.cn/kyzx/kydt/","<ul class=\"news-list.*?/ul>","<a .*?a>","<ul class=\"news-list.*?/ul>","<span class=\"span-time.*?</span>","UTF-8"});
        //4.中公考研
        container.add(new String[]{"http://www.kaoyan365.cn/dongtai/","<li class=\"zg_list_left03_wrap.*?/li>","<a .*?a>","<li class=\"zg_list_left03_wrap.*?/li>","\\d{4}-\\d{2}-\\d{2}","GBK"});
        //5.新东方
        container.add(new String[]{"http://kaoyan.koolearn.com/dongtai/","<ul class=\"xqy_entry_list.*?/ul>","<a .*?a>","<ul class=\"xqy_entry_list.*?/ul>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //6.清华大学
        container.add(new String[]{"http://yz.tsinghua.edu.cn/publish/yjszs/8550/index.html","<div class=\"infor_t.*?/div>","<a .*?a>","<div class=\"infor_t.*","<div class=\"time.*?/div>","UTF-8"});
        //7.北京大学
        container.add(new String[]{"https://admission.pku.edu.cn/zsxx/sszs/index.htm","<ul class=\"zsxx_cont_list.*?/ul>","<a .*?p>","<ul class=\"zsxx_cont_list.*?/li>","<span class=.*?/span>","UTF-8"});
        //8.中国科学技术大学
        container.add(new String[]{"http://yz.ustc.edu.cn/list_1.htm","<td class=\"bt02.*?/td>","<a .*?a>","<ul class=\"zsxx_cont_list.*?/li>","<span class=.*?/span>","GBK"});
        //9.复旦大学
        container.add(new String[]{"http://www.gsao.fudan.edu.cn/15157/list.htm","<ul class=\"cols_list clearfix.*?/ul>","<a .*?a>","<ul class=\"cols_list clearfix.*?/ul>","<span class=\"cols_meta.*?/span>","UTF-8"});
        //10.中国人民大学
        container.add(new String[]{"http://pgs.ruc.edu.cn/sszs/jzml.htm","<li id=\"line_u12_0.*?/li>","<a .*?a>","<li id=\"line_u12_0.*?/li>","<span.*?/span>","UTF-8"});
        //11.上海交通大学
        container.add(new String[]{"https://yzb.sjtu.edu.cn/index/zkxx/sszs.htm","<li id=\"lineu9_0.*?/li>","<a .*?a>","<li id=\"lineu9_0.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //12.南京大学
        container.add(new String[]{"http://grawww.nju.edu.cn/912/list.htm","<li class=\"list_item i1.*?/li>","<a .*?a>","<li class=\"list_item i1.*?/li>","<span class='Article_PublishDate'.*?/span>","UTF-8"});
        //13.同济大学
        container.add(new String[]{"https://yz.tongji.edu.cn/zsxw/sszs.htm","<li id=\"line_u6_0.*?/li>","<a .*?a>","<li id=\"line_u6_0.*?/li>","<span .*?/span>","UTF-8"});
        //14.浙江大学
        container.add(new String[]{"http://grs.zju.edu.cn/yjszs/redir.php?catalog_id=131815","<ul class=\"common-news-list.*?/ul>","<a .*?a>","<ul class=\"common-news-list.*?/ul>","<span .*?/span>","UTF-8"});
        //15.上海财经大学
        container.add(new String[]{"https://gs.shufe.edu.cn/Home/NewsList/142","<div class=\"col-lg-12 news-list.*?/div>","<a .*?a>","<div class=\"col-lg-12 news-list.*?/div>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //16.南开大学
        container.add(new String[]{"http://yzb.nankai.edu.cn/5509/list.htm","<div id=\"wp_news_w9.*?/div>","<a href.*?a>","<div id=\"wp_news_w9.*?/div>","<span class=\"col_news_date\".*?/span>","UTF-8"});
        //17.北京航空航天大学
        container.add(new String[]{"http://yzb.buaa.edu.cn/xlss.htm","<li id=\"line_u6_0.*?/li>","<a .*?a>","<li id=\"line_u6_0.*?/li>","<span.*?/span>","UTF-8"});
        //18.中央财经大学
        container.add(new String[]{"http://gs.cufe.edu.cn/zsgz/sszs_sz_.htm","<li id=\"line_u8_0.*?/li>","<a .*?a>","<li id=\"line_u8_0.*?/li>","<span.*?/span>","UTF-8"});
        //19.北京师范大学
        container.add(new String[]{"http://yz.bnu.edu.cn/list/master","<ul style=\"min-height:200px;.*?/ul>","<a href.*?a>","<ul style=\"min-height:200px;.*?/ul>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //20.武汉大学
        container.add(new String[]{"http://www.gs.whu.edu.cn/zsxx/sszs.htm","<div class=\"cont-top.*?/ul>","<a href.*?a>","<ul style=\"min-height:200px;.*?/ul>","<span class=\"pull-right text-muted.*?/span>","UTF-8"});
        //21.对外经济贸易大学
        container.add(new String[]{"http://yjsy.uibe.edu.cn/infoArticleList.do?columnId=2705","<ul class=\"articleList.*?/ul>","<a href.*?a>","<ul class=\"articleList.*?/ul>","<span.*?/span>","UTF-8"});
        //22.西安交通大学
        container.add(new String[]{"http://yz.xjtu.edu.cn/lmy.jsp?urltype=tree.TreeTempUrl&wbtreeid=1009","<div class=\"lilist.*?/div>","<a href.*?a>","<div class=\"lilist.*?/li>","</div>.*?<div class=\"lilishij.*?/div>","UTF-8"});
        //23.天津大学
        container.add(new String[]{"http://yzb.tju.edu.cn/xwzx/tkss_xw/","<td class=\"table_dian.*?/td>","<a href.*?a>","<td width=\"60.*?/td>","\\d{4}-\\d{2}-\\d{2}","GBK"});
        //24.华中科技大学
        container.add(new String[]{"http://gszs.hust.edu.cn/zsxx/ggtz.htm","<li id=\"line_u8_0.*?/li>","<a href.*?a>","<li id=\"line_u8_0.*?/li>","<span.*?/span>","UTF-8"});
        //25.北京理工大学
        container.add(new String[]{"http://grd.bit.edu.cn/zsgz/ssyjs/tzgg_ss/index.htm","</h2.*?<a.*?<ul.*?li>.*?<span.*?/li>","<a href=\"1.*?a>","<h2.*?<ul.*?<li>.*?<span.*?/li>.*?/ul>","<span.*?/span>","UTF-8"});
        //26.北京外国语大学
        container.add(new String[]{"https://graduate.bfsu.edu.cn/zsxx/sszs.htm","<li id=\"line_u8_0.*?li>","<a.*?a>","<li id=\"line_u8_0.*?li>","<span.*?/span>","UTF-8"});
        //27.中山大学
        container.add(new String[]{"http://graduate.sysu.edu.cn/gra02/g02a/g02a03/index.htm","<ul class=\"lists2.*?/ul>","<a href.*?a>","<ul class=\"lists2.*?/ul>","<span class=\".*?/span>","UTF-8"});
        //28.中国政法大学
        container.add(new String[]{"https://yjsy.cupl.edu.cn/site/index_1.aspx?id=4BE8BCF7EC281A97#","<div class=\"my_list_2.*?<li class=\"clearfix.*?li>","<a.*?a>","<li class=\"clearfix.*?li>","<I.*?I>","UTF-8"});
        //29.华东师范大学
        container.add(new String[]{"http://www.yjsy.ecnu.edu.cn/yjszs/list.htm","<td class=\"bottomtdborder.*?/tbody>","<a.*?a>","<td class=\"bottomtdborder.*?/tbody>","<div style=\"white-space:nowrap.*?/div>","UTF-8"});
        //30.哈尔滨工业大学
        container.add(new String[]{"http://yzb.hit.edu.cn/8822/list.htm","<div id=\"wp_news_w16.*?/div>","<a href.*?a>","<div id=\"wp_news_w16.*?/div>","<span class=\"tt2.*?/span>","UTF-8"});
        //31.北京邮电大学
        container.add(new String[]{"https://yzb.bupt.edu.cn/list/list.php?p=2_1_1","<ul class=\"padlr20 ovhi.*?/ul>","<a.*?a>","<ul class=\"padlr20 ovhi.*?/ul>","<font.*?/font>","UTF-8"});
        //32.厦门大学
        container.add(new String[]{"https://zs.xmu.edu.cn/5826/list.htm","<div class=\"col-lg-10 col-md-10 col-sm-9 col-xs-10 list-news-title.*?/div>","<a href.*?a>","<div class=\"col-lg-2 col-md-2 col-sm-3 col-xs-2 news-date.*?/div>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //33.上海外国语大学
        container.add(new String[]{"http://graduate.shisu.edu.cn/3211/list.htm","<div class=\"cont-top.*?/ul>","<a href.*?a>","<ul style=\"min-height:200px;.*?/ul>","<span class=\"pull-right text-muted.*?/span>","UTF-8"});
        //34.西北工业大学
        container.add(new String[]{"http://yzb.nwpu.edu.cn/new/sszs/zsgg.htm","<div class=\"cno-head.*?/li>","<a.*?a>","<div class=\"cno-head.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //35.西南财经大学
        container.add(new String[]{"http://yz.swufe.edu.cn/web/3389.html","<div class=\"content.*?/div>","<a href.*?a>","<div class=\"content.*?/div>","<span.*?/span>","GBK"});
        //36.中南大学
        container.add(new String[]{"http://gra.csu.edu.cn/yjsy/PYGL/wjtz1_2.html","<tr onmouseover=\".*?/tr>","<a.*?a>","<tr onmouseover=\".*?/tr>","<span.*?/span>","UTF-8"});
        //37.大连理工大学
        container.add(new String[]{"http://gs.dlut.edu.cn/yjszs/sss/qgtk.htm","<DIV class=\"list.*?/LI>","<A href.*?A>","<DIV class=\"list.*?/LI>","<SPAN class=\".*?/SPAN>","UTF-8"});
        //38.中国传媒大学
        container.add(new String[]{"http://yz.cuc.edu.cn/listWYFHY/list_2_1.htm","<tr.*?/tr>","<a.*?a>","</td.*?/tr>","\\d{4}-\\d{2}-\\d{2}","GBK"});
        //39.四川大学
        container.add(new String[]{"https://yz.scu.edu.cn/zsxx/newslist/a/gk","<ul class=\"data-list.*?/ul>","<a href.*?a>","<ul class=\"data-list.*?/ul>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //40.电子科技大学
        container.add(new String[]{"https://yz.uestc.edu.cn/shuoshizhaosheng/","<td.*?<li>.*?/li>","<li.*?<strong>.*?a>","<td.*?<ul>.*?/ul>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //41.中南财经政法大学
        container.add(new String[]{"http://yzb.zuel.edu.cn/4639/listm.htm","<li class=\"list_item i1.*?/li>","<a href.*?a>","<ul style=\"min-height:200px;.*?/ul>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //42.华南理工大学
        container.add(new String[]{"http://www2.scut.edu.cn/graduate/14670/list.htm","<li class=\"list-item.*?/li>","<a href.*?a>","<li class=\"list-item.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //43.吉林大学
        container.add(new String[]{"http://zsb.jlu.edu.cn/list/28.html","<span class=\"list_time.*?/div>","<a  href.*?a>","<span class=\"list_time.*?/span>","<span class=\"list_time.*?/span>","UTF-8"});
        //44.南京航空航天大学
        container.add(new String[]{"http://www.graduate.nuaa.edu.cn/2108/list.htm","<div frag=\"面板2.*?/div>","<a href.*?title.*?/a>","<div frag=\"面板2.*?/div>","\\d{4}/\\d{2}/\\d{2}","UTF-8"});
        //45.湖南大学
        container.add(new String[]{"http://gra.hnu.edu.cn/zsxx/sszs.htm","<li id=\"line_u7_0.*?/li>","<a href.*?a>","<li id=\"line_u7_0.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //46.重庆大学
        container.add(new String[]{"http://yz.cqu.edu.cn/ss_news.html","<div class=\"list_cont_1.*?/div>","<a href.*?a>","<div class=\"list_cont_2.*?/div>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //47.北京科技大学
        container.add(new String[]{"http://yzxc.ustb.edu.cn/zsjz/sszs1/index.htm","<table class=\"tablelist_l.*?/table>","<a href.*?a>","<table class=\"tablelist_l.*?/table>","\\d{4}-\\d{2}-\\d{2}","GBK"});
        //48.北京交通大学
        container.add(new String[]{"https://gs.bjtu.edu.cn/cms/zszt/item/?cat=3","<div class=\"mainleft_box.*?<li class=\"main_li.*?<div class=\"main_a.*?/div>","<a href.*?a>","<div class=\"mainleft_box.*?<li class=\"main_li.*?<div class=\"main_a.*?/div>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //49.山东大学
        container.add(new String[]{"https://yz.sdu.edu.cn/header_three_zszn_index.site","<div class=\"mainleft_box.*?<li class=\"main_li.*?<div class=\"main_a.*?/div>","<a href.*?a>","<div class=\"mainleft_box.*?<li class=\"main_li.*?<div class=\"main_a.*?/div>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //50.华东理工大学
        container.add(new String[]{"http://gschool.ecust.edu.cn/7962/list.htm","<li class=\"list_item i1.*?/li>","<a href.*?a>","<li class=\"list_item i1.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //51.西安电子科技大学
        container.add(new String[]{"https://gr.xidian.edu.cn/yjsy/yjszs.htm","<li id=\"lineu14_0.*?/li>","<a href.*?a>","<li id=\"lineu14_0.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //52.天津医科大学
        container.add(new String[]{"http://gs.tmu.edu.cn/3111/list.htm","<div class=\"listbox.*?/div>","<a href.*?a>","<div class=\"listbox.*?/div>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //53.南京理工大学
        container.add(new String[]{"http://gs.njust.edu.cn/zsw/zsxx/list.htm","<li class=\"list_item i2.*?/li>","<a href.*?a>","<li class=\"list_item i2.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //54.中国农业大学
        container.add(new String[]{"http://yz.cau.edu.cn/infoArticleList.do?columnId=10402","<div class=\"articleList.*?/div>","<a href.*?a>","<div class=\"articleList.*?/div>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //55.华中师范大学
        container.add(new String[]{"http://gs.ccnu.edu.cn/zsgz/ssyjs.htm","<LI id=\"line_u10_0.*?/LI>","<A.*?A>","<LI id=\"line_u10_0.*?/LI>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //56.中国海洋大学
        container.add(new String[]{"http://yz.ouc.edu.cn/5926/list.htm","<li class=\"list_item i1.*?/li>","<a href.*?a>","<li class=\"list_item i1.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //57.哈尔滨工程大学
        container.add(new String[]{"http://yzb.hrbeu.edu.cn/3279/list.htm","<li class=\"list_item i1.*?/li>","<a href.*?a>","<li class=\"list_item i1.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //58.中央民族大学
        container.add(new String[]{"http://grs.muc.edu.cn/pglist.asp?c=3000000001","<div style=\'padding-left:22px.*?/div>","<a.*?a>","<div style=\'padding-left:22px.*?/a>","\\d{4}-\\d{2}-\\d{2}","GBK"});
        //59.华北电力大学
        container.add(new String[]{"http://yjsy.ncepu.edu.cn/zsxx/sszsxx/index.htm","<div class=\"listTitle listTitle2.*?/div.*?/li>","<a href.*?title.*?a>","<div class=\"listTitle listTitle2.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //60.北京中医药大学
        container.add(new String[]{"http://yanjiusheng.bucm.edu.cn/zsjy/sszs/index.htm","<div class=\"ul_list.*?/li>","<a href.*?a>","<div class=\"ul_list.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //61.暨南大学
        container.add(new String[]{"https://yz.jnu.edu.cn/jnss/list.htm","<li class=\"list_item i1.*?/li>","<a href.*?a>","<li class=\"list_item i1.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //62.苏州大学
        container.add(new String[]{"http://yjs.suda.edu.cn/sszs1/index.jhtml","<div class=\"content.*?/div>","<a href.*?a>","<div class=\"content.*?/div>","\\d{2}-\\d{2}","UTF-8"});
        //63.武汉理工大学
        container.add(new String[]{"http://gd.whut.edu.cn/channels/17.html","<td valign=\"top.*?/table>","<a href.*?/a>","<table width=\".*?class=\"news_list.*?/table>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //64.东北大学
        container.add(new String[]{"http://www.graduate.neu.edu.cn/dongda/qgtk/index.jhtml","<div class=\"msgUnit_list.*?/ul>","<a href.*?/a>","<div class=\"msgUnit_list.*?/ul>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //65.兰州大学
        container.add(new String[]{"http://yz.lzu.edu.cn/lzupage/B20160906113221.html","<ul class=\"lists.*?/ul>","<a href.*?/a>","<ul class=\"lists.*?/ul>","\\d{4}-\\d{2}-\\d{2}","GBK"});
        //66.中国药科大学
        container.add(new String[]{"http://yjsy.cpu.edu.cn/_t283/6281/list.htm","<div class=\"entry.*?/div>","<a href.*?/a>","<div class=\"entry.*?/div>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //67.东华大学
        container.add(new String[]{"http://yjszs.dhu.edu.cn/7128/list.htm","<li class=\"list_item i1.*?/li>","<a href.*?/a>","<li class=\"list_item i1.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //68.河海大学
        container.add(new String[]{"http://gs.hhu.edu.cn/3518/list.htm","<div id=newslist.*?/div>","<a href.*?/a>","<div id=newslist.*?/div>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //69.北京林业大学
        container.add(new String[]{"http://graduate.bjfu.edu.cn/yjszs/zsdt/index.html","<div class=\"newslist.*?/div>","<a href.*?/a>","<div class=\"newslist.*?/div>","\\d{2}-\\d{2}-\\d{2}","GBK"});
        //70.河北工业大学
        container.add(new String[]{"http://yjs.hebut.edu.cn/zsgz/zsgztzgg/index.htm","<ul style=\"min-height:300px;.*?/ul>","<a href.*?/a>","<ul style=\"min-height:300px;.*?/ul>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //71.北京工业大学
        container.add(new String[]{"http://yanzhao.bjut.edu.cn/sszs/xsx/","<td colspan=\"2.*?/a>","<a.*?/a>","<td colspan=\"2.*?/td>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //72.江南大学
        container.add(new String[]{"http://yz.jiangnan.edu.cn/sszs/tzgg.htm","<div class=\"list_content.*?/div>","<a.*?/a>","<div class=\"list_content.*?/div>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //73.北京化工大学
        container.add(new String[]{"http://graduate.buct.edu.cn/zsgz/zxtz/index.htm","<div class=\"list02.*?/div>","<a.*?/a>","<div class=\"list02.*?/div>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //74.西南交通大学
        container.add(new String[]{"https://gs.swjtu.edu.cn/ws/rs/c/01","<div class=\"title.*?/div>","<a.*?/a>","<div class=\"remark.*?/div>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //75.上海大学
        container.add(new String[]{"http://yjsb.shu.edu.cn/","<div class=\"slide\" style=\"margin-top:5px;.*?<div class=\"innewsli.*?/div>","</span><a.*?/a>","<div class=\"slide\" style=\"margin-top:5px;.*?<div class=\"innewsli.*?/div>","\\d{4}-\\d{2}-\\d{2}","GBK"});
        //76.南京师范大学
        container.add(new String[]{"http://yz.njnu.edu.cn/homepage_show.jsp?wid=2&parentid=","<div class=\"slide\" style=\"margin-top:5px;.*?<div class=\"innewsli.*?/div>","</span><a.*?/a>","<div class=\"slide\" style=\"margin-top:5px;.*?<div class=\"innewsli.*?/div>","\\d{4}-\\d{2}-\\d{2}","GBK"});
        //77.中国地质大学（武汉）
        container.add(new String[]{"http://front.zhinengdayi.com/page/list/PVKZRL/697?curPage=1&pageSize=10","<div class=\"subList_content_msg.*?/div>","<span class=\"title.*?/span>","<div class=\"subList_content_msg.*?/div>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //78.中国地质大学（北京）
        container.add(new String[]{"http://www.cugb.edu.cn/gmoreInfo.action?bigClassId=15","<li class=\"clearfix.*?/li>","<a.*?/a>","<li class=\"clearfix.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //79.西北大学
        container.add(new String[]{"http://yzb.nwu.edu.cn/news_list.aspx?category_id=60","<div class=\"row min_hgt.*?/div>","<a.*?/a>","<div class=\"row min_hgt.*?/div>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //80.东北师范大学
        container.add(new String[]{"http://yjsy.nenu.edu.cn/z_s1/s_s/j_z.htm","<li class=\"cleafix.*?/li>","<a.*?/a>","<li class=\"cleafix.*?/li>","<p.*?/p>.*?</p>","UTF-8"});
        //81.长安大学
        container.add(new String[]{"http://yzb.chd.edu.cn/2769/list.htm","<li class=\"list_item i1.*?/li>","<a.*?/a>","<li class=\"list_item i1.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //82.中国矿业大学（北京）
        container.add(new String[]{"http://yjs.cumtb.edu.cn/zsgz/sszs.htm","<li id=\"line_u6_0.*?/li>","<a.*?/a>","<li id=\"line_u6_0.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //83.华中农业大学
        container.add(new String[]{"http://yjs.hzau.edu.cn/zsgz/sszs.htm","<LI id=\"line_u3_0.*?/LI>","<A.*?/A>","<LI id=\"line_u3_0.*?/LI>","\\d{2}-\\d{2}","UTF-8"});
        //84.合肥工业大学
        container.add(new String[]{"http://yjszs.hfut.edu.cn/more.jsp?cid=10","<LI id=\"line_u3_0.*?/LI>","<A.*?/A>","<LI id=\"line_u3_0.*?/LI>","\\d{2}-\\d{2}","UTF-8"});
        //85.广西大学
        container.add(new String[]{"http://yjsc.gxu.edu.cn/zsxx/sszs.htm","<tr id=\"line124084_0.*?/tr>","<a.*?/a>","<tr id=\"line124084_0.*?/tr>","\\d{4}/\\d{2}/\\d{2}","UTF-8"});
        //86.中国石油大学（华东）
        container.add(new String[]{"http://zs.gs.upc.edu.cn/sszs/list.htm","<div id=\"wp_news_w7.*?/div>","<a.*?/a>","<div id=\"wp_news_w7.*?/div>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //87.陕西师范大学
        container.add(new String[]{"http://yz.snnu.edu.cn/tzgg/ssyjszs.htm","<DIV class=\"lightgreybox.*?/li>","<li.*?/a>","<DIV class=\"lightgreybox.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //88.南京农业大学
        container.add(new String[]{"http://grasch.njau.edu.cn/zsgz/sszs.htm","<TD height=\"28.*?style=\"FONT-SIZE: 14px\".*?/TR>","<A.*?/A>","<TD height=\"28.*?style=\"FONT-SIZE: 14px\".*?/TR>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //89.湖南师范大学
        container.add(new String[]{"http://yjsy.hunnu.edu.cn/index.php/cms/item-list-category-24.shtml","<table width=\"686.*?/table>","<a.*?/a>","<table width=\"686.*?/table>","\\d{4}-\\d{2}-\\d{2}","GBK"});
        //90.福州大学
        container.add(new String[]{"http://yjsy.fzu.edu.cn/html/zsgz/ssyjszs/1.html","<div cmsid=\"29025460.*?/ul>","<a.*?/a>","<div cmsid=\"29025460.*?/ul>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //91.大连海事大学
        container.add(new String[]{"http://grs.dlmu.edu.cn/zs/ssyjs.htm","<div class=\"list_bd.*?/ul>","<a.*?/a>","<div class=\"list_bd.*?/ul>","\\d{2}-\\d{2}-\\d{2}","UTF-8"});
        //92.西北农林科技大学
        container.add(new String[]{"http://yz.nwsuaf.edu.cn/info.do?columnId=1081","<div class=\"articleList.*?/ul>","<a.*?/a>","<div class=\"articleList.*?/ul>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //93.西南大学
        container.add(new String[]{"http://yanzhao.swu.edu.cn/s/yanzhao/news1/","<div class=\"ct-body.*?/ul>","<a.*?/a>","<div class=\"ct-body.*?/ul>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //94.中国矿业大学
        container.add(new String[]{"http://yjsb.cumt.edu.cn/sszs/list.htm","<li class=\"list_item i1.*?/li>","<a.*?/a>","<li class=\"list_item i1.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //95.云南大学
        container.add(new String[]{"http://www.grs.ynu.edu.cn/zsgz/qrzssyjs.htm","<li id=\"line_u1_0.*?/li>","<a.*?/a>","<li id=\"line_u1_0.*?/li>","\\d{2}-\\d{2}","UTF-8"});
        //96.太原理工大学
        container.add(new String[]{"http://yz.tyut.edu.cn/sszs.htm","<DIV align=\"left.*?text-align:left; line-height:35px;.*?/DIV>","<A.*?/A>","<DIV align=\"left.*?text-align:left; line-height:35px;.*?/DIV>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //97.华南师范大学
        container.add(new String[]{"http://yz.scnu.edu.cn/tongzhigonggao/ssgg/","<div class=\"listmod cl.*?/div>","<a.*?/a>","<div class=\"listmod cl.*?/div>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //98.北京体育大学
        container.add(new String[]{"http://zs.bsu.edu.cn/sszs/index.htm","<ul class=\"newsList.*?/ul>","<a.*?/a>","<ul class=\"newsList.*?/ul>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //99.中国石油大学（北京）
        container.add(new String[]{"http://www.cup.edu.cn/graduate/zhaosheng/graduatedrecruit/index.htm","<ul class=\"win_list listS1.*?/ul>","<a.*?/a>","<ul class=\"win_list listS1.*?/ul>","\\d{4}-\\d{2}-\\d{2}","GBK"});
        //100.安徽大学
        container.add(new String[]{"http://graschool.ahu.edu.cn/9539/list.htm","<div id=\"wp_news_w09.*?/a>","<a.*?/a>","<div id=\"wp_news_w09.*?/a>.*?/td>.*?/td>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //101.东北林业大学
        container.add(new String[]{"http://yz.nefu.edu.cn/index/ggb/9.htm","<li id=\"line_u8_0.*?/li>","<a.*?/a>","<li id=\"line_u8_0.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //102.东北农业大学
        container.add(new String[]{"http://graduate.neau.edu.cn/zsgz/xwdt.htm","<tr id=\"line54076_0.*?/tr>","<a.*?/a>","<tr id=\"line54076_0.*?/tr>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //103.辽宁大学
        container.add(new String[]{"http://grs.lnu.edu.cn/zsgz/sszs.htm","<TR id=\"line13579_0.*?/TR>","<A.*?/A>","<TR id=\"line13579_0.*?/TR>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //104.南昌大学
        container.add(new String[]{"http://zjc.ncu.edu.cn/zs/html/c/27/","<li class=\"am-list-item-dated.*?/li>","<a.*?/a>","<li class=\"am-list-item-dated.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //105.延边大学
        container.add(new String[]{"http://grad.ybu.edu.cn/tzgg/zs.htm","<div class=\"lanmu.*?/div>","<A.*?/A>","<div class=\"lanmu-list.*?/div>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //106.内蒙古大学
        container.add(new String[]{"http://gs.imu.edu.cn/zsgz/ssszs/tzgg.htm","<li id=\"line_u8_0.*?/li>","<a.*?/a>","<li id=\"line_u8_0.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //107.四川农业大学
        container.add(new String[]{"http://yan.sicau.edu.cn/index/zs/sszs.htm","<LI id=\"line_u7_0.*?/LI>","<A.*?/A>","<LI id=\"line_u7_0.*?/LI>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //108.海南大学
        container.add(new String[]{"http://www.hainu.edu.cn/stm/zy_yjs/shtml_liebiao.asp@bbsid=3835.shtml","<li class=\"jinghua0.*?/li>","<a.*?/a>","<li class=\"jinghua0.*?/li>","<span.*?/span>","GBK"});
        //109.贵州大学
        container.add(new String[]{"http://gs.gzu.edu.cn/sszs/list.htm","<div class=\"list_cont_title.*?/div>","<a.*?/a>","<li class=\"jinghua0.*?/li>","<span.*?/span>","UTF-8"});
        //110.郑州大学
        container.add(new String[]{"http://gs.zzu.edu.cn/zsgz/sszsjz.htm","<li id=\"line_u8_1.*?/li>","<a.*?/a>","<li id=\"line_u8_1.*?/li>","<span.*?/span>","UTF-8"});
        //111.新疆大学
        container.add(new String[]{"http://gs.xju.edu.cn/zsxx/ssyjs.htm","<a class=\"c42336.*?/a>","<a class.*?/a>","<tr id=\"line42336_0.*?/tr>","\\d{4}/\\d{2}/\\d{2}","UTF-8"});
        //112.宁夏大学
        container.add(new String[]{"https://graduate.nxu.edu.cn/zsxx/zsdt.htm","<li id=\"lineu8_1.*?/li>","<a.*?/a>","<li id=\"lineu8_1.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //113.石河子大学
        container.add(new String[]{"http://yz.shzu.edu.cn/lqcx/list.htm","<li class=\"list_item i1.*?/li>","<a.*?/a>","<li class=\"list_item i1.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //114.青海大学
        container.add(new String[]{"http://yjs.qhu.edu.cn/zsgz/xlsszs/index.htm","<div class=\"articleList articleList2.*?/li>","<a.*?/a>","<div class=\"articleList articleList2.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});
        //115.考研帮
        container.add(new String[]{"http://www.kaoyan.com/hot/","<ul class=\"list areaZslist.*?/ul>","<a.*?/a>","<div class=\"articleList articleList2.*?/li>","\\d{4}-\\d{2}-\\d{2}","UTF-8"});


    }
}
