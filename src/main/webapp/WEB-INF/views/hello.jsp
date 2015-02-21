<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Pruebas</title>

<script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
<script type="text/javascript" src="js/jquery.jeditable.mini.js"></script>

 <style>
	body {
		display: block;
	}
</style>

</head>

<body>
	<h3>Message : ${message}</h3>
	<h3>Username : ${username}</h3>

	<br/>

	<h2>Cuentas</h2>
	<div id="obtenerCuentas">
		<p>
			Obtener Posición Global:
			<c:url value="/cuentas/posicionglobal" var="action" />
			<form:form method="GET" action="${action }">
				<p>Versión Api:&nbsp;<input type="text" id="version" name="version" value="v1.0.0"></p>
				<p>
					<input type="submit" value="Submit" />
				</p>
			</form:form>
		</p>

		<p>
			Cuentas Vista:
			<c:url value="/cuentas/cuentasvista" var="action" />
			<form:form method="GET" action="${action }">
				<p>Versión Api:&nbsp;<input type="text" id="version" name="version" value="v1.0.0"></p>
				<p>
					<input type="submit" value="Submit" />
				</p>
			</form:form>
		</p>

		<p>
			Tarjetas:
			<c:url value="/cuentas/tarjetas" var="action" />
			<form:form method="GET" action="${action }">
				<p>Versión Api:&nbsp;<input type="text" id="version" name="version" value="v1.0.0"></p>
				<p>
					<input type="submit" value="Submit" />
				</p>
			</form:form>
		</p>
	</div>

	<br/>

	<a href="<c:url value="/logout" />"> Logout</a>

</body>
</html>