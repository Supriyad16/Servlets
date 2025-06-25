<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Loan</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>
<body>

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

<form action="loan" method="post">


    <div class="mb-3">
        <label for="name" class="form-label" ><strong>Name</strong></label>
        <input type="text" class="form-control" id="name" name="name">
    </div>

    <div class="mb-3">
        <label for="age" class="form-label" ><strong>Age</strong></label>
        <input type="number" class="form-control" id="age" name="age">
    </div>


    <label><strong>Gender</strong></label>
    <div class="form-check">
        <input class="form-check-input" type="radio" name="gender" value="Male">
        <label class="form-check-label">Male</label>
    </div>
    <div class="form-check">
        <input class="form-check-input" type="radio" name="gender" value="Female">
        <label class="form-check-label">Female</label>
    </div>
    <div class="form-check">
        <input class="form-check-input" type="radio" name="gender" value="Others">
        <label class="form-check-label">Others</label>
    </div>

    <div class="mb-3">
        <label for="phone" class="form-label" ><strong>Phone Number</strong></label>
        <input type="number" class="form-control" id="phone" name="phone">
    </div>

    <div class="mb-3">
        <label for="address" class="form-label" ><strong>Address</strong></label>
        <input type="text" class="form-control" id="address" name="address">
    </div>

    <label class="form-label"><strong>Loan Type</strong></label>
    <div class="form-check">
        <input class="form-check-input" type="radio" name="loan_type" value="Personal" >
        <label class="form-check-label">Personal</label>
    </div>
    <div class="form-check">
        <input class="form-check-input" type="radio" name="loan_type" value="Home ">
        <label class="form-check-label">Home </label>
    </div>
    <div class="form-check">
        <input class="form-check-input" type="radio" name="loan_type" value="Car ">
        <label class="form-check-label">Car </label>
    </div>
    <div class="form-check">
        <input class="form-check-input" type="radio" name="loan_type" value="Education ">
        <label class="form-check-label">Education </label>
    </div>
    <div class="form-check mb-3">
        <input class="form-check-input" type="radio" name="loan_type" value="Business">
        <label class="form-check-label">Business</label>
    </div>

    <div class="mb-3">
        <label for="amount" class="form-label" ><strong>Loan Amount Required</strong></label>
        <input type="number" class="form-control" id="amount" name="amount">
    </div>

    <div class="mb-3">
        <label for="tenure" class="form-label" ><strong>Loan Tenure</strong></label>
        <input type="number" class="form-control" id="tenure" name="tenure">
    </div>

            <button type="submit" class="btn btn-primary">Apply </button>
</form>

</body>
</html>
