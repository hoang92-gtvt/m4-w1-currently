<%--
  Created by IntelliJ IDEA.
  User: YEN
  Date: 6/10/2021
  Time: 3:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


    <h1>Chuyển đổi tiền tệ</h1>
    <form  method="post">
    <div>
        <span>Số lượng</span><input type="text" name="countSt" />

    </div>
    <div>

        <span>Tỉ giá</span><input type="text" name="rateSt" />
    </div>
    <button type="submit">Change</button>

    <h2>Result: ${result}</h2>

    </form>

    <p>${mess}</p>
</body>
</html>
