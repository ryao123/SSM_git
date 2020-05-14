<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>供应商列表</title>
</head>
<body>
	<div class="container">
		<table border="1">
			<tr>
				<th>供应商编码</th>
				<th>供应商名称</th>
				<th>供应商联系人</th>
				<th>地址</th>
				<th>联系电话</th>
				<th>传真</th>
			</tr>
			<c:forEach items="${list }" var="pro">
				<tr>
					<td>${pro.proCode }</td>
					<td>${pro.proName }</td>
					<td>${pro.proContact }</td>
					<td>${pro.proAddress }</td>
					<td>${pro.proPhone }</td>
					<td>${pro.proFax }</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>