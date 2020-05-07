<%@ page contentType="text/html;charset=UTF-8"
         language="java"
         import="java.lang.String,total.DB,total.*" %>
<html>
<head>
    <title>Mechedular</title>
</head>
<body>
<%
    DB.loadConnect();
    String id = (String) request.getParameter("id");
    String pwd = (String) request.getParameter("pwd");

    if (id.equals("") || pwd.equals("")) {
            out.print("<script>alert('아이디와 비밀번호를 모두 입력하시오.')</script>");
            out.print("<script>window.top.location='login.html'</script>");
    }
    else {
        if (DB.findhospital(id, pwd) == null) {
            System.out.printf("아이디 : " + id + ", 비밀번호 : " + pwd + "\n");
            out.print("<script>alert('아이디 또는 비밀번호가 틀렸습니다...')</script>");
            out.print("<script>window.top.location='login.html'</script>");
        } else {
            Hospital hospital = DB.findhospital(id, pwd);
            session.setAttribute("hospital", hospital);
            out.print("<script>window.top.location='index.jsp'</script>");
        }
    }
%>
</body>
</html>
