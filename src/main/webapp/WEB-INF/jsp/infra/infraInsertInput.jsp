<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Input</title>
</head>
<h1>インフラを追加</h1>
<form:form modelAttribute="infraForm" action="confirm">
	<dl>
		<dt>ID</dt>
		<dd>
			<form:errors path="id" element="p"/>
			<form:input path="id" />
		</dd>
		<dt>インフラ名</dt>
		<dd>
			<form:errors path="name" element="p"/>
			<form:input path="name" />
		</dd>
		<dt>登録日</dt>
		<dd>
			<form:errors path="date" element="p"/>
			<form:input path="date" />
		</dd>
	</dl>
	<input type="submit" value="追加">
</form:form>
</body>
</html>