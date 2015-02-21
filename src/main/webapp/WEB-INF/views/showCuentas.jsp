<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<title>Home - show Cuentas Autorizadas (posicion global)</title>
<link href="/ExampleApplication/css/blueprint/screen.css"
	type="text/css" rel="stylesheet" media="screen, projection" />
<link href="/ExampleApplication/css/blueprint/print.css"
	type="text/css" rel="stylesheet" media="print" />
<link type="text/css" href="/ExampleApplication/css/main.css"
	rel="stylesheet">
<link type="text/css" href="/ExampleApplication/css/general.css"
	rel="stylesheet">

<style>
	body {
		display: block;
	}
</style>

</head>
<body>
	<h1>Resultados</h1>

	<p>
		<a href="<c:url value="/welcome" />">atrás</a>
	</p>

	<h2>Cabecera</h2>
	<table class="small">
		<thead>
			<tr>
				<th>CodigoServicio</th>
				<th>FechaOperacion</th>
				<th>Error</th>
				<th>Descripcion error</th>
				<th>Warn</th>
				<th>Informacion Adicional</th>
			</tr>
		</thead>
		<tbody>
			<tr> 
				<td><c:out value="${cuentas.head.codigoServicio}"></c:out></td>
				<td><c:out value="${cuentas.head.fechaOperacion}"></c:out></td>
				<td><c:out value="${cuentas.head.errorCode}"></c:out></td>
				<td><c:out value="${cuentas.head.descripcionError}"></c:out></td>
				<td><c:out value="${cuentas.head.warnCode}"></c:out></td>
				<td><c:out value="${cuentas.head.informacionAdicional}"></c:out></td>
			</tr>
		</tbody>
	</table>

	<br />

	<h2>Listado de Cuentas (${fn:length(cuentas.data)} registros)</h2>
	<table class="small">
		<thead>
			<tr>
				<th>NumProducto</th>
				<th>NumProductoCodif</th>
				<th>Producto</th>
				<th>Usuario</th>
				<th>Propietario</th>
				<th>Descripcion</th>
				<th>Balance</th>
				<th>Moneda</th>
				<th>IBAN</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${cuentas.data}" var="cuenta" varStatus="status">
			<%-- 	<tr>
					<td>${cuenta.numeroProducto}</td>
					<td>${cuenta.numeroProductoCodificado}</td>
					<td>${cuenta.producto}</td>
					<td>${cuenta.usuario}</td>
					<td>${cuenta.propietario}</td>
					<td>${cuenta.descripcion}</td>
					<td>${cuenta.balance}</td>
					<td>${cuenta.currency}</td>
					<td>${cuenta.iban}</td>
				</tr>  --%>
				<tr>
					<td>${cuenta.fechaOperacion}</td>
					<td>${cuenta.importe}</td>
					<td>${cuenta.saldo}</td>
					<td>${cuenta.codigoConcepto}</td>
					<td>${cuenta.concepto}</td>
				</tr> 
			</c:forEach>
		</tbody>
	</table>
	<br />

	<p>
		<a href="<c:url value="/welcome" />">atras </a>
	</p>
</body>
</html>