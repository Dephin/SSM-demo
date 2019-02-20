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
<script src="/js/jquery-3.3.1.js"></script>

<div id="content">点击显示内容</div>
<input type="text" name="search-input">


<button id="test1" type="button">测试1</button>
<script type="text/javascript">
    $(document).ready(function () {
        $("#test1").click(function () {
            $.ajax({
                type: 'post', // 请求方法
                url: 'ajax/test1', // 接收请求的url
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

<button id="test2" type="button">测试2</button>
<script type="text/javascript">
    $(document).ready(function () {
        $("#test2").click(function () {
            var word = $("input[name='search-input']").val();
            $.ajax({
                type: 'post', // 请求方法
                url: 'ajax/test2', // 接收请求的url
                data: 'word=' + word, // 传给后台的数据，多个参数用&连接
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


<button id="test3" type="button">测试3</button>
<script type="text/javascript">
    $(document).ready(function () {
        $("#test3").click(function () {
            var word = $("input[name='search-input']").val();
            $.ajax({
                type: 'post', // 请求方法
                url: 'ajax/test3', // 接收请求的url
                contentType: "application/json;charset=utf-8",
                data : JSON.stringify({'word':word}),
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
