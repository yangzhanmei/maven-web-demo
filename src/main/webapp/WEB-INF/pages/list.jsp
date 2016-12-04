<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="demo.models.Book"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>

<div>
    Welcome,<%= session.getAttribute("username")%>
    <a href="#">Logout</a>
</div>

<div>
    <h4>List All Books</h4>
    <table border='1'>

        <tr>
            <td>id</td>
            <td>title</td>
            <td>description</td>
        </tr>

        <% List<Book> books = (List<Book>)request.getAttribute("books");
        %>
        <%for(Book book:books){%>
        <tr>
            <td>1</td>
            <td><%= book.getTitle()%></td>
            <td><%= book.getDescription()%></td>
        </tr>
        <%}%>
    </table>
</div>

<div>
<h4>Create New book</h4>
<form action="/create-book" method="post">
<div>
Title:<input type="text" name="title"/>
</div>
<div>
Description:<textArea name="description"></textArea>
</div>
<div>
    <input type="submit" value="create"/>
</div>
</form>
</div>