<%@ page contentType="text/html; charset = UTF-8"%>
<html>
<head>
<title>Employee Data</title>
</head>
<body>
<% 
String jData=(String)request.getAttribute("idlist");
out.println(jData);    
%>
</body>
</html>