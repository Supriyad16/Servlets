
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Login Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>

<nav class="navbar navbar-expand-lg bg-dark navbar-dark mb-4">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">E-Commerce</a>
        <div class="collapse navbar-collapse" id="navbarNavDropdown">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="index.jsp">Home</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="container">
    <h1 class="text-center mb-4">User Information</h1>

    <c:if test="${not empty dto}">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="card p-4 shadow rounded">
                    <p><strong>Email:</strong> ${dto.email}</p>
                    <p><strong>User ID:</strong> ${dto.userid}</p>
                    <p><strong>Password:</strong> ${dto.password}</p>
                    <p><strong>Created At:</strong> ${dto.createdAt}</p>
                </div>
            </div>
        </div>
    </c:if>

    <c:if test="${not empty failMessage}">
        <p class="text-danger text-center">${failMessage}</p>
    </c:if>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
