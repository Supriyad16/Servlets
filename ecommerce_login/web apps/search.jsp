<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Login page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>
<body>
<h1>Sign-In Here</h1>
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

<div class="row justify-content-center">
    <div class="col-md-8 col-lg-6">
        <h1 class="mb-4 text-center">Serach  </h1>

        <span style="color:red">${message}</span>
        <form action="login" method="get">
<!--            <div class="mb-3">-->
<!--                <label for="id" class="form-label" ><strong>Id</strong></label>-->
<!--                <input type="number" class="form-control" id="id" name="id" value="${dto.id}">-->
<!--            </div>-->

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

            <button type="submit" class="btn btn-primary">Search </button>

        </form>
    </div>
</div>
</body>
</html>
