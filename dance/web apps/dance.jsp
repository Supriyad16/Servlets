<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
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
                    <a class="nav-link" href="index.jsp">Home2</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="row justify-content-center">
    <div class="col-md-8 col-lg-6">
        <h1 class="mb-4 text-center">Dance Application Form</h1>

        <div class="text-danger">${message}</div>

        <form action="dance" method="post">
    <div class="mb-3">
        <label for="name" class="form-label" value="${dto.name}"><strong>Name</strong></label>
        <input type="text" class="form-control" id="name" name="name">
    </div>

    <div class="mb-3">
        <label for="age" class="form-label" value="${dto.age}"><strong>Age</strong></label>
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

    <label class="form-label"><strong>Dance Style</strong></label>
    <div class="form-check">
        <input class="form-check-input" type="radio" name="style" value="Bharatanatyam" required>
        <label class="form-check-label">Bharatanatyam</label>
    </div>
    <div class="form-check">
        <input class="form-check-input" type="radio" name="style" value="Hip Hop">
        <label class="form-check-label">Hip Hop</label>
    </div>
    <div class="form-check">
        <input class="form-check-input" type="radio" name="style" value="Salsa">
        <label class="form-check-label">Salsa</label>
    </div>
    <div class="form-check">
        <input class="form-check-input" type="radio" name="style" value="Free Style">
        <label class="form-check-label">Free Style</label>
    </div>
    <div class="form-check mb-3">
        <input class="form-check-input" type="radio" name="style" value="Kathak">
        <label class="form-check-label">Kathak</label>
    </div>

    <label class="form-label"><strong>Previous Dance Experience</strong></label>
    <div class="form-check">
        <input class="form-check-input" type="radio" name="experience" value="Stage Performance" required>
        <label class="form-check-label">Stage Performance</label>
    </div>
    <div class="form-check">
        <input class="form-check-input" type="radio" name="experience" value="Dance Classes Attended">
        <label class="form-check-label">Dance Classes Attended</label>
    </div>
    <div class="form-check">
        <input class="form-check-input" type="radio" name="experience" value="Self-trained">
        <label class="form-check-label">Self-trained</label>
    </div>
    <div class="form-check mb-3">
        <input class="form-check-input" type="radio" name="experience" value="None">
        <label class="form-check-label">None</label>
    </div>

    <label><strong>Availability on Weekends</strong></label>
    <div class="form-check">
        <input class="form-check-input" type="radio" name="radioDefault" id="Default1" >
        <label class="form-check-label" for="default1">
            Yes
        </label>
    </div>
    <div class="form-check">
        <input class="form-check-input" type="radio" name="radioDefault" id="Default2" >
        <label class="form-check-label" for="default2">
            No
        </label>
    </div>

    <div class="mb-3">
        <label for="phone" class="form-label" value="${dto.phone}"><strong>Phone Number</strong></label>
        <input type="number" class="form-control" id="phone" name="phone">
    </div>

    <div class="mb-3">
        <label for="address" class="form-label" value="${dto.address}"><strong>Address</strong></label>
        <input type="text" class="form-control" id="address" name="address">
    </div>

    <button type="submit" class="btn btn-primary">Submit</button>

</form>
</div>
</div>
</body>
</html>
