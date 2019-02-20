<%--
  Created by IntelliJ IDEA.
  User: dephin
  Date: 2019/2/16
  Time: 7:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script
  src="https://code.jquery.com/jquery-3.3.1.js"
  integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
  crossorigin="anonymous"></script>

</head>
<body>

<div id="callout" class="button callout_button"><a href="#">弹出对话框</a></div>
<div id="mask" class="mask"></div>
<div class="dialog" id="dialog">
    <div class="dialog_head" id="move_part">可拖拽部分</div>
    <div class="dialog_content"></div>
    <div class="button close_button" id="close"><a href="#">点我关闭对话框</a>
    </div>
</div>

</body>
</html>
