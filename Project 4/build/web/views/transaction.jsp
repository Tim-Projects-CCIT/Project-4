<%@page import="Controller.TransactionController"%>
<%@page import="java.sql.ResultSet"%>
<%--<%@ taglib prefix="c" uri="http://java.sun/com/jstl/core" %>--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page='layouts/head.jsp'>
            <jsp:param name="title" value="Homepage" />
        </jsp:include>
    </head>
    <body class="d-flex flex-column h-100">
        <jsp:include page='layouts/navbar.jsp'></jsp:include>
        <%
            TransactionController tc = new TransactionController();
   
            ResultSet rs = tc.get();
            
        %>
        <main class="flex-shrink-0">
            <div class="container">
                <div class="row pt-5">
                    <div class="col-12">
                        <table class="table table-striped table-hover">
                            <thead>
                                <tr>
                                <th>ID</th>
                                <th>ID Admin</th>
                                <th>ID Product</th>
                                <th>Tipe Transaksi</th>
                                <th>Total Items</th>
                                <th>Transaction Date</th>
                            </tr>
                        </thead>
                        <tbody>
                            <% while(rs.next()) { %>
                            <tr>
                                <td><%= rs.getString("id") %></td>
                                <td><%= rs.getString(2) %></td>
                                <td><%= rs.getString(3) %></td>
                                <td><%= rs.getString("type") %></td>
                                <td><%= rs.getString("total_items") %></td>
                                <td><%= rs.getString("transaction_date") %></td>
                                <td>
                                    <form action="deletetr?id=<%= rs.getString("id") %>" method="POST"
                                          onsubmit="return confirm('Are you sure want to delete the data?')">
                                            
                                            <input type="hidden" name="id" value="<%= rs.getString("id")%>" />
                                            <button type="submit" class="btn btn-sm btn-danger">Delete</button>
                                    </form>
                                </td>
                            </tr>
                                <% }%>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </main>
        <jsp:include page='layouts/scripts.jsp'></jsp:include>
    </body>
</html>