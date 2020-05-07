<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.lang.String,total.DB,total.*" %>
<html>
<head>
    <title>Find Password</title>
</head>
<body>
<%
    DB.loadConnect();
    String id = (String) request.getParameter("id");
    Hospital hospital = DB.findhospitalPwd(id);

    if (DB.findhospitalPwd(id) == null) {
        out.print("<script>alert('존재하지 않는 아이디입니다.')</script>");
        out.print("<script>window.top.location='login.html'</script>");
    } else{
        out.print("<script>alert('비밀번호는 " + hospital.getHpwd() + "입니다.')</script>");
        out.print("<script>window.top.location='login.html'</script>");
    }
%>