<%@ page contentType="text/html; charset = UTF-8"%>
<html>
<head>
<title>Employee Data</title>
</head>
<body>
<% 
String jData=(String)request.getAttribute("list");
out.println(jData);    
%>
</body>
</html>