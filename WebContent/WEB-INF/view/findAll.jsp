<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<td>序号</td>
<td>区域</td>
<td>检测时间</td>
<td>PM10数据</td>
<td>PM2.5数据</td>
<td>检测站</td>
<td>最后确认时间</td>
</tr>

<c:foreach items="${list }" var="air">
<tr>
<td>${air.id }</td>
<td>${air.district.name}</td>
<td>${air.monitorTime }</td>
<td>${air.pm10 }</td>
<td>${air.pm2 }</td>
<td>${air.monitoringSation }</td>
<td>${air.lastMdifyTme }</td>
</tr>
</c:foreach>


</table>

</body>
</html>