<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div>
    <div>
        <%if(session.getAttribute("message") != null){%>
            <h4><%= session.getAttribute("message")%></h4>
        <%}
          else{%>
            <h4>Please login</h4>
        <%}%>
    </div>
    <div>
        <h4>My Book System</h4>
        <form action="/login" method="post">
            <div>
                Username<input type="text" name="username"/>
            </div>
             <div>
                Password<input type="password" name="password"/>
             </div>
             <input type="submit" value="login"/>
        </form>
    </div>
</div>

