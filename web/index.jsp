<%--
  Created by IntelliJ IDEA.
  User: chalbert
  Date: 3/26/18
  Time: 5:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
  <head>
    <title>Dynamic Content</title>
    <link rel="stylesheet" type="text/css" href="/css/main.css"/>
  </head>
  <body>
  <div class="page">
    <div class="content">
      <h1>Doing some math...</h1>
      <p>
        1 + 1 = <span class="output"><%= 1 + 1 %></span>
      </p>

      <h1>Versions</h1>
      <table>
        <thead><tr>
          <th>Package</th>
          <th>Version</th>
        </tr></thead>
        <tbody>
          <tr><td>Servlet</td><td>${servletVersion}</td></tr>
        </tbody>
      </table>
    </div>
  </div>
  </body>
</html>
