<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="true" %>
<head>
    <title></title>
    <meta charset=utf-8>
    <meta name=description content="">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/meterial.css">
</head>


<html>
<body>
    <div class="landing" id="landing">
       <div class="start-form">
            <div class="landing-form">
                <div class="group">      
                  <input type="text" name="member" required>
                  <span class="highlight"></span>
                  <span class="bar"></span>
                  <label>참여자 수</label>
                    <div  id="button" class="button raised green">
                      <div  class="center" fit>START</div>
                      <paper-ripple fit></paper-ripple>
                    </div>
                </div>
            </div>
       </div>
    </div>
    <div id="ladder" class="ladder">
        <div class="dim"></div>
         <canvas class="ladder_canvas" id="ladder_canvas"></canvas>
    </div>

<script type="text/javascript" src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/ladder.js"></script>
</body>
</html>
