<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%String Msg2 = (String)request.getAttribute("Msg2"); %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>数当て占い</title>
        <style>
            .box29 {
                position:relative;
                top: 50px;
                margin: 2em 0;
                background: #dcefff;
                width: 500px;
                text-align: center;
                margin: auto;
            }
            .box29 .box-title {
                font-size: 1.2em;
                background: #5fb3f5;
                padding: 4px;
                text-align: center;
                color: #FFF;
                font-weight: bold;
                letter-spacing: 0.05em;
            }
            .box29 h3 {
                padding: 15px 20px;
                margin: 0;
            }
            #btn{
                display: inline-block;
                text-decoration: none;
                background: #87befd;
                color: #FFF;
                width: 50px;
                height: 50px;
                line-height: 50px;
                border-radius: 50%;
                text-align: center;
                vertical-align: middle;
                overflow: hidden;
                transition: .4s;
            }
        </style>
    </head>
    <body bgcolor="#6495ed">
        <form action="softwere" method="post">
            <div class="box29">
                <div class="box-title"><h1>数あて占い</h1></div>

                <h3>０～９９までの数を入力してください！</h3>
                <input type="text" name="one">
                <input type="submit" value="判定" name="judge" id="btn" /><br><br>
                <% if (Msg2 != null) { %>
                <h3><%=Msg2 %> </h3><br>
                <% } %>
            </div>
        </form>
    </body>
</html>