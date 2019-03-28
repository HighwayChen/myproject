<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en" xmlns:white-space="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8">
    <title>测试</title>
  <script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js"></script>
</head>
<script>

</script>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<body>
    <div align="center">
        <h2 align="center" >研究生院信息更新监控系统</h2>
    </div>

    <div>
        <table class="table table-condensed" align="center" border="1px" id="${list1.id}">
            <tr align="center">
                <td align="center">编号</td>
                <td align="center">学校</td>
                <td align="center">内容</td>
                <td align="center">日期</td>
                <td align="center" width="30">更新</td>
            </tr>
            <c:forEach items="${list}" var="list1">
            <tr align="center">

                    <td align="center">
                        <input name="id" type="hidden" value="${list1.id}" id="i_${list1.id}"/>${list1.id}
                        </td>
                    <td align="center" name="schoolName" >
                        <input name = "schoolName" type="hidden" value="${list1.schoolName}"><a href="${list1.URL}">
                        ${list1.schoolName}
                        </td>
                    <td align="center" name="con"  id="c_${list1.id}"><div>${list1.contents}</div></td>
                    <td align="center" name="date" id="d_${list1.id}">${list1.date}</td>
                    <td align="center" width="100"><button  class="btn" onclick="update('${list1.id}','${list1.schoolName}')">更新</button></td>

            </tr>
            </c:forEach>
        </table>
        <div align="center">

            <ul class="pagination" align="center">

                <c:forEach items="${numbers}" var="p">
                          <li value="${p.pageNum}" ><a href="/update/pages?pageNum=${p.pageNum}" id = "${p.pageNum}">${p.pageNum}</a></li>
                </c:forEach>

            </ul>
        </div>
    </div>

</body>
</html>