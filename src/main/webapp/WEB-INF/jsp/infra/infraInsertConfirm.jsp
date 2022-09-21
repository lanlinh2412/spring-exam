<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>confirm</title>
</head>
<body>
	<h1>インフラを追加(確認)</h1>
	<dl>
		<dt>ID</dt>
		<dd>
			<c:out value="${infraForm.id}" />
		</dd>
		<dt>インフラ名</dt>
		<dd>
			<c:out value="${infraForm.name}" />
		</dd>
	</dl>
	<form:form modelAttribute="infraForm" action="input">
		<form:hidden path="id" />
		<form:hidden path="name" />
		<input type="submit" value="戻る">
	</form:form>
</body>
</html>