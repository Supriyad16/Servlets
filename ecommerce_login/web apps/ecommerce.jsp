<!doctype html>
<html lang="en" xmlns="http://www.w3.org/1999/html" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Login page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>
<body>
<h1>Sign-Up Here</h1>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>

<nav class="navbar navbar-expand-lg bg-body-tertiary" data-bs-theme="dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Navbar</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavDropdown">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#"></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="index.jsp">Home</a>
                </li>
            </ul>
        </div>
    </div>
</nav>


   <div>
<h1>Create an Account</h1>
    </div>
        <div>

            <span style="color:Green">${message}</span>

            <span style="color:red">${errorMessage}</span>
            <form action="login" method="post">

    <div class="mb-3">
        <label for="email" class="form-label" ><strong>Email</strong></label>
        <input type="email" class="form-control" id="email" name="email" value="${dto.email}">
    </div>

    <div class="mb-3">
        <label for="userid" class="form-label"  ><strong>User Id</strong></label>
        <input type="text" class="form-control" id="userid" name="userid" value="${dto.userid}">
    </div>

     <div class="mb-3">
        <label for="password" class="form-label" ><strong>
            Password
        </strong></label>
        <input type="password" class="form-control" id="password" name="password" value="${dto.password}">
    </div>

                <div class="mb-3">
        <label for="cpassword" class="form-label" ><strong>
            Confirm Password
        </strong></label>
        <input type="password" class="form-control" id="cpassword" name="cpassword" value="${dto.cpassword}">
    </div>

                 <button type="submit" class="btn btn-primary">Sign-Up</button>
            </form>
        </div>
</body>
</html>