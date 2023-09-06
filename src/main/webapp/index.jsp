<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<jsp:useBean id="index" type="java.util.ArrayList<java.lang.String>" scope = "request"  />
<!DOCTYPE html>
<html>

<head>
<%@include file="WEB-INF/bootsrapimports.html"%>
  <title>Divergences en physique quantique</title>
</head>
<body>
<br/>
<main>
  <h1>Les divergences théoriques entre les théories quantiques de Louis De Broglie et celles de l'école de Copenhague</h1>

  <p>
    Ce site propose une comparaison exhaustive des paradigmes de la physique quantique.
  </p>
    <ul>
      <% for (String p : index) { %>
      <li><%=p%></li>

      <%}%>
    </ul>

</main>
</body>
</html>