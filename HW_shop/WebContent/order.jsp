<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>华为订单</title>
</head>
<body>
	<c:forEach items="${list}" var="a"> 
			<table>
			<tr>
				<td>商品</td>
				<td>价格</td>
				<td>数量</td>
				<td>付款</td>
				<td>状态</td>
			</tr>
			<tr>
				<td>${a.u_flow}</td>
				<td>${a.order_time}</td>
				<td>${a.order_status}</td>
			</tr>
		</table>	
	</c:forEach>
		
		
</body>
</html>