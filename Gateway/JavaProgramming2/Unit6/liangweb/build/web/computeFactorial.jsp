<%-- 
    Document   : computeFactorial
    Created on : Jul 31, 2022, 3:27:31 AM
    Author     : MST
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Factorial</title>
    </head>
    <body>
        <%
            String s = "<table border=\"1\">" +
                "<tr>" +
                "<td>Number</td>" +
                "<td>Factorial</td>" +
                "</tr>";
            for(int i = 0; i <= 10; i++) {
                s += "<tr>";
                s += "<td>" + i + "</td>";
                s += "<td>" + compute(i) + "</td>";
                s += "</tr>";
            }
            s += "</table>";
        %>
        
        <%!    
            private long compute(int n) {
                if(n == 0) {
                    return 1;
                }
                else {
                   return n * compute(n - 1);
                }
            }
        %>
        
        <h2>Display these silly little numbers again</h2>
        <%= s %>
    </body>
</html>
