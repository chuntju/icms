<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2018/4/27
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>选择房间</title>

    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/common.css">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>

<div class="page">

    <h3>请选择您要购买空调的房间号</h3>
    <hr/>

    <div class="row">
        <label class="col-sm-2 control-label" for="state">请选择楼号</label>
        <div class="col-sm-10">
            <select name="dealer_id" id="dealer_id" class="selectpicker show-tick form-control"  data-width="98%" data-first-option="false" title='请选择经销商(必选)' required data-live-search="true">
                <#foreach dealer in dealerList>
                <option value="abc">请选择楼号</option>
                <option value="abc">天彩大厦A座</option>
                <option value="abc">天彩大厦B座</option>
            </#foreach>
            </select>
        </div>
    </div>

    <%--楼层选择--%>
    <div class="row">
        <label class="col-sm-2 control-label" for="state">请选择楼层</label>
        <div class="col-sm-10">
            <select name="dealer_id" id="dealer_id" class="selectpicker show-tick form-control"  data-width="98%" data-first-option="false" title='请选择经销商(必选)' required data-live-search="true">
                <#foreach dealer in dealerList>
                <option value="abc">请选择楼层</option>
                <option value="abc">1</option>
                <option value="abc">2</option>
                <option value="abc">15</option>
            </#foreach>
            </select>
        </div>
    </div>

    <%--房间选择--%>
    <div class="row">
        <label class="col-sm-2 control-label" for="state">请选择房间</label>
        <div class="col-sm-10">
            <select name="dealer_id" id="dealer_id" class="selectpicker show-tick form-control"  data-width="98%" data-first-option="false" title='请选择经销商(必选)' required data-live-search="true">
                <#foreach dealer in dealerList>
                <option value="abc">请选择房间</option>
                <option value="abc">21501</option>
                <option value="abc">21502</option>
            </#foreach>
            </select>
        </div>
    </div>

    <br/>
    <hr/>
    <%--按钮--%>
    <button type="button" id="timeSelect" class="btn btn-primary btn-lg btn-block">选择时间</button>
    <button type="button" id="center" class="btn btn-primary btn-lg btn-block">个人中心</button>
</div>
</div>
</body>
</html>
