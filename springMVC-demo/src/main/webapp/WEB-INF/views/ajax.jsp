<%--
  Created by IntelliJ IDEA.
  User: dephin
  Date: 2019/2/15
  Time: 6:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="content">点击显示内容</div>
<button id="show" type="button">测试</button>

<script
  src="https://code.jquery.com/jquery-3.3.1.js"
  integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
  crossorigin="anonymous"></script>

<script type="text/javascript">
    $(document).ready(function () {
        $("#show").click(function () {
            $.ajax({
                type: 'post', // 请求方法
                url: 'test_ajax', // 接收请求的url
                data: 'data=2', // 传给后台的数据，多个参数用&连接
                dataType: 'html', // 服务器返回的数据类型 可选XML ,Json jsonp script html text等
                success: function (msg) {
                    // 这里是ajax提交成功后，程序返回的数据处理函数。msg是返回的数据，数据类型在dataType参数里定义！
                    document.getElementById("content").innerHTML = msg;
                },
                error: function () {
                    alert('对不起失败了');
                }
            })
        });
    });
</script>



</body>
</html>
