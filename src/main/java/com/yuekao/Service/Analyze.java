package com.yuekao.Service;

import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Analyze {
    //获取内容
    public static String contents;
    //获取时间
    public static String date;
    //获取上海外国语内容
    public static String sisuContents;
    //获取上海外国语更新时间
    public static String sisuDate;

    /**
     *
     * @param url 目标url
     * @param regex1　内容第一次范围正则
     * @param regex2　目标正则
     * @param regex3　日期第一次范围正则
     * @param regex4　目标日期正则
     * @param charsetName　指定编码
     */
    public void regexMain(String url,String regex1,String regex2,String regex3,String regex4,String charsetName) {
        try {
            //页面信息
            String allPages = Crawler.Connect(url, charsetName);
            //去除页面里的注释
            String allPage = allPages.replaceAll("<!--.*?-->", "");
            //内容
            contents = getFirstContent(allPage, regex1, regex2);
            //日期
            date = getDate(allPage, regex3, regex4);
            sisuContents = getSecondContent(allPage);
            sisuDate = date(allPage);
        }

        catch (NullPointerException e){

            contents="<font color=\"red\">连接超时获取不了</font>";

            date="";
            sisuDate="";
            sisuContents="";
        }

        if(contents!=null&&date.equals("")&&contents.equals("")){
            contents="<font color=\"blue\">信息获取失败，请到原网页手动查询</font>";
        }


    }

    /**
     *
     * @param Target 整个页面信息
     * @param regex1　为方便匹配到目标缩小范围
     * @param regex2　目标正则表达　
     * @return
     */
    private String getFirstContent (String Target,String regex1,String regex2){
        //StringBuilder Info=new StringBuilder();
        //第一次搜索的内容

        String Tmp = new String();
        String Tmp1 = new String();
        //获取内容
        String content = new String();

        String mainContent1 = new String();

        //第一次搜索内容的正则表达式

        Pattern tmpPattern= Pattern.compile(regex1);
        Matcher matcher1 = tmpPattern.matcher(Target);

        if(matcher1.find()) {
            //获取第一次搜索的内容
            Tmp = matcher1.group(0);

        }


        Pattern titlePattern= Pattern.compile(regex2);
        Matcher matcher2 = titlePattern.matcher(Tmp);
        if(matcher2.find()) {
            //获取目标内容
            content = matcher2.group(0);
        }
        mainContent1 = content.replaceAll("<.*?>","");

        //System.out.println(mainContent1);

        return mainContent1;
    }

    /**
     * 获取更新时间
     * @param Target
     * @param regex1
     * @param regex2
     * @return
     */

    private String getDate(String Target,String regex1,String regex2){
        String Tmp = new String();
        String date = new String();
        Pattern tmpPattern= Pattern.compile(regex1);
        Matcher matcher1 = tmpPattern.matcher(Target);

        if(matcher1.find()) {
            Tmp = matcher1.group(0);
        }
        //String regexTitle = "<div style=\"white.*?</div>";//<div style="white-space:nowrap">2018-10-11</div>
        Pattern titlePattern= Pattern.compile(regex2);
        Matcher matcher2 = titlePattern.matcher(Tmp);
        if(matcher2.find()) {
            date = matcher2.group(0);
        }

        return date;
    }
    /**
     * 下面两个方法是对上海外国语大学进行操作
     */
    //获取信息
    private String getSecondContent(String Target){
        String Tmp = new String();
        String Tmp1 = new String();
        String Tmp2 = new String();
        String secondContent = new String();
        String a = Target.replaceAll("<!--.*?-->","");
        String regexTmp = "<div id=\"wp_news_w5.*?/div>";
        Pattern tmpPattern= Pattern.compile(regexTmp);
        Matcher matcher1 = tmpPattern.matcher(a);
        if(matcher1.find()) {
            Tmp = matcher1.group(0);

        }
        // return Tmp;
        String b = a.replace(Tmp,"");
        String regexTmp1 = "<div id=newslist.*?/div>";
        Pattern tmpPattern1= Pattern.compile(regexTmp1);
        Matcher matcher2 = tmpPattern1.matcher(b);
        if(matcher2.find()) {
            Tmp1 = matcher2.group(0);

        }
        String regexTmp2 = "<a.*?/a>";
        Pattern tmpPattern2= Pattern.compile(regexTmp2);
        Matcher matcher3 = tmpPattern2.matcher(Tmp1);
        if(matcher3.find()) {
            Tmp2 = matcher3.group(0);

        }
        String tmp = Tmp2.replaceAll("<.*?>","");
        return tmp;
    }
    //获取时间
    private String date(String Target){
        String Tmp = new String();
        String Tmp1 = new String();
        String Tmp2 = new String();
        String secondContent = new String();
        String a = Target.replaceAll("<!--.*?-->","");
        String regexTmp = "<div id=\"wp_news_w5.*?/div>";
        Pattern tmpPattern= Pattern.compile(regexTmp);
        Matcher matcher1 = tmpPattern.matcher(a);
        if(matcher1.find()) {
            Tmp = matcher1.group(0);
            //System.out.println(Tmp);
        }
        // return Tmp;
        String b = a.replace(Tmp,"");
        //System.out.println(b);
        String regexTmp1 = "<div id=newslist.*?/div>";
        Pattern tmpPattern1= Pattern.compile(regexTmp1);
        Matcher matcher2 = tmpPattern1.matcher(b);
        if(matcher2.find()) {
            Tmp1 = matcher2.group(0);
            //System.out.println(Tmp1);
        }
        String regexTmp2 = "<div style.*?/div>";
        Pattern tmpPattern2= Pattern.compile(regexTmp2);
        Matcher matcher3 = tmpPattern2.matcher(Tmp1);
        if(matcher3.find()) {
            Tmp2 = matcher3.group(0);

        }
        return Tmp2;
    }

}
