<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h6><a href="/springMvcAndMyBatis/user/create">添加用户</a></h6>
	<table border="1">
		<tbody>
			<tr>
				<th>姓名</th>
				<th>密码</th>
				<th>操作</th>
			</tr>
			<c:if test="${!empty list }">
				<c:forEach items="${list }" var="user">
					<tr>
						<td>${user.name }</td>
						<td>${user.password }</td>
						<td>
							<a href="/springMvcAndMyBatis/user/preUpdate?id=${user.id }">编辑</a>
							<a href="/springMvcAndMyBatis/user/delete?id=${user.id }">删除</a>
						</td>
					</tr>				
				</c:forEach>
			</c:if>
		</tbody>
	</table>
</body>
</html>