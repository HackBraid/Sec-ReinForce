<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title>Insert title here</title>  
</head>  
<body>  
  
<!--  src="<%=request.getContextPath() %>/check/captcha.jsp"> -->  
<!-- src="<%=request.getContextPath() %>/validateColorServlet"> -->  
    <form action="<%=request.getContextPath() %>/checkCodeServlet" method="post">  
        姓名：<input type="text" name="name" /> <br>  
        验证码：<input type="text" name="CHECK_CODE_PARAM_NAME" />   
        <img alt="" src="<%=request.getContextPath() %>/validateColorServlet"><br>  
        <input type="submit" value="Submit"> <br>  
    </form>  
</body>  
</html>  