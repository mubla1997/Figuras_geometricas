<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<html>
<head>
<title>Create User</title>
<style> <%@include file="/WEB-INF/css/register.css"%> </style>
</head>
<body>

<c:if test="${not empty 'message'}">
<div> ${message}</div>
</c:if>
       <div id="register">
            <div class="container">
                <div id="register-row" class="row justify-content-center align-items-center">
                    <div id="register-column" class="col-md-6">
                        <div id="register-box" class="col-md-12">
                            <form id="register-form" class="form" action="" method="post">
                                <h3 class="text-center text-info">Register</h3>
                                <div class="form-group">
                                    <label for="username" class="text-info">Username</label>
                                    <input type="text" class="form-control" id="username" name="username" placeholder="Enter username">
                                </div>
                                <div class="form-group">
                                    <label for="password" class="text-info">Password</label>
                                    <input type="text" class="form-control" id="password" name="password" placeholder="Enter password">
                                </div>
                                <div class="form-group">
                                    <label for="passwordR" class="text-info">Password</label>
                                    <input type="text" class="form-control" id="passwordR" name="repPass" placeholder="Repit password">
                                </div>
                                <input type="submit" name="submit" class="btn btn-info btn-md" value="Register">

                                <a href="/login" > Go back </a>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
</body>
</html>