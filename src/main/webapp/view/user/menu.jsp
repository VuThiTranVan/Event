<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${not empty pageContext.request.userPrincipal.name}">
	<div class="navbar-header collapse navbar-collapse menu-admin" >
		<a href="${pageContext.request.contextPath}/upload"><button type="button" class="btn">Upload Image</button></a>
		<a href="${pageContext.request.contextPath}/manageImage"><button type="button" class="btn">Manage Image</button></a>
		<a href="#">
			<button id="btnMyGroup" type="button" class="btn">My group</button></a>
		<a href="${pageContext.request.contextPath}/user/registerGroup">
			<button id="btnRegisterGroup" type="button" class="btn">Register Group</button></a>
		<button type="button" class="btn">Persional</button>
	</div>
</c:if>
