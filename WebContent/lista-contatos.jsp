<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<html>
<body>
<c:import url="cabecalho.jsp"/>
<jsp:useBean id="dao" class="br.com.caelum.jdbc.dao.ContatoDao"/>
<table>
	<c:forEach var="contato" items="${dao.lista}">
		<tr>
			<td>${contato.nome}</td>
			<td>
			<c:if test="${not empty contato.email}">
			<a href="mailto:${contato.email}">${contato.email}</a>
			</c:if>
			<c:if test="${empty contato.email}">
			E-mail não informado
			</c:if>
			</td>
			<td>${contato.endereco}</td>
			<td>${contato.dataNascimento.time}</td>
		</tr>
	</c:forEach>
</table>
<c:import url="rodape.jsp"></c:import>
</body>
</html>