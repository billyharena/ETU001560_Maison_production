<%@ page import="java.util.List" %>
<%@ page import="models.Personnage" %><%--
  Created by IntelliJ IDEA.
  User: billy
  Date: 07/03/2023
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    List<Personnage> lpers =(List<Personnage>) request.getAttribute("listePerso");
%>
<html>
<head>
    <title>Page d'insertion personnage</title>
</head>
<body>
<select name="idDistrict" >
    <%
        for (Personnage pers : lpers
        ) { %>
    <option value="<%= pers.getId() %>"><%= pers.getPersonnage() %></option>
    <%   } %>
</select>
</body>
</html>
