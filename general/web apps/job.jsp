<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Applications</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container-fluid p-4" style="background-color: #f8f9fa;">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>

<nav class="navbar" style="background-color: #e3f2fd;" data-bs-theme="light">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Varieties of Application</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#"><b>Home</b></a>
                </li>


                <li class="nav-item">
                    <a class="nav-link" href="birth.jsp">Birth Certificate</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="passport.jsp">Passport Application</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="death.jsp">Death Certificate</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="driving.jsp">Driving License Application</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="marriage.jsp">Marriage Certificate</a>
                </li>

            </ul>
        </div>
    </div>
</nav>

<div class="row justify-content-center">
    <div class="col-md-8 col-lg-6">
        <h1 class="mb-4 text-center">Job Application Form</h1>
        <form action="job" method="post">
            <div class="mb-3">
                <label for="name" class="form-label"><strong>Name</strong></label>
                <input type="text" class="form-control" id="name" name="name" required>
            </div>

            <div class="mb-3">
                <label for="email" class="form-label"><strong>Email</strong></label>
                <input type="email" class="form-control" id="email" name="email" required>
            </div>

            <label><strong>Education</strong></label><br>
            <div class="form-check">

                <input class="form-check-input" type="radio" name="radioDefault" id="radioDefault1" value="B.E">
                <label class="form-check-label" for="radioDefault1">B.E</label>

                </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="radioDefault" id="radioDefault2" >
                <label class="form-check-label" for="radioDefault2">
                    MCA
                </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="radioDefault" id="radioDefault3">
                <label class="form-check-label" for="radioDefault3">
                    MBA
                </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="radioDefault" id="radioDefault4" >
                <label class="form-check-label" for="radioDefault4">
                    M.Tech
                </label>
            </div>


            <div class="mb-1">
                <label for="skills" class="form-label"><strong>Skills</strong></label>
                <input type="text" class="form-control" id="skills" name="skills" required>
            </div>

            <div class="mb-3">
                <label for="salary" class="form-label"><strong>Expected Salary</strong></label>
                <input type="text" class="form-control" id="salary" name="salary" required>
            </div>

            <label><strong>Experience (in years)</strong></label>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="experience" value="0-3" id="radio1">
                <label class="form-check-label" for="radio1">
                    0-3
                </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="experience" value="4-8" id="radio2" >
                <label class="form-check-label" for="radio2">
                    4-8
                </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="experience" value="9-10" id="radio3">
                <label class="form-check-label" for="radio3">
                    9-10
                </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="experience" value="11-15" id="radio4">
                <label class="form-check-label" for="radio4">
                    11-15
                </label>
            </div>


            <div class="d-flex justify-content-center">
                <button type="submit" class="btn btn-primary">Apply</button>
            </div>

        </form>
    </div>
</div>

</body>
</html>
