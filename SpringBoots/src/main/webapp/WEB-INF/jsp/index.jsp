<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE HTML>
<html ng-app>
<head>
  <title>Getting Started: Serving Web Content</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  <script type="text/javascript" src="webjars/jquery/2.0.3/jquery.min.js"></script>
  <script type="text/javascript" src="webjars/angularjs/1.3.8/angular.min.js"></script>
  <script type="text/javascript" src="webjars/angularjs/1.3.8/angular-resource.min.js"></script>
</head>
<body>
<input type="text" ng-model="yourName">
<p>안녕하세요, {{yourName}} !!!</p>
<p> ${message}</p>
</body>
</html>