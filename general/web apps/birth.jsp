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
                    <a class="nav-link" href="job.jsp">Job Application</a>
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
        <h1 class="mb-4 text-center">Birth Certificate Form</h1>
        <form action="birth" method="post">
            <div class="mb-3">
                <label for="bid" class="form-label"><strong>Birth ID</strong></label>
                <input type="text" class="form-control" id="bid" name="bid" required>
            </div>

            <div class="mb-3">
                <label for="name" class="form-label"><strong>Hospital Name</strong></label>
                <input type="text" class="form-control" id="name" name="name" required>
            </div>

            <div class="mb-3">
                <label for="fname" class="form-label"><strong>Father Name</strong></label>
                <input type="text" class="form-control" id="fname" name="fname" required>
            </div>

            <div class="mb-3">
                <label for="mname" class="form-label"><strong>Mother Name</strong></label>
                <input type="text" class="form-control" id="mname" name="mname" required>
            </div>

            <div class="mb-3">
                <label for="dates" class="form-label"><strong>Date</strong></label>
                <input type="date" class="form-control" id="dates" name="dates" required>
            </div>

            <div class="mb-3">
                <label for="times" class="form-label"><strong>Time</strong></label>
                <input type="time" class="form-control" id="times" name="times" required>
            </div>



            <div class="mb-1">
                <label for="dname" class="form-label"><strong>Doctor Name</strong></label>
                <input type="text" class="form-control" id="dname" name="dname" required>
            </div>

            <div class="mb-3">
                <label for="nname" class="form-label"><strong>Nurse Name</strong></label>
                <input type="text" class="form-control" id="nname" name="nname" required>
            </div>

            <label><strong>Hospital Type</strong></label>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="experience" value="0-3" id="radio1">
                <label class="form-check-label" for="radio1">
                    Government
                </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="experience" value="4-8" id="radio2" >
                <label class="form-check-label" for="radio2">
                    Community
                </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="experience" value="9-10" id="radio3">
                <label class="form-check-label" for="radio3">
                    Nursing Home
                </label>
            </div>


            <div class="d-flex justify-content-center">
                <button type="submit" class="btn btn-primary">Register</button>
            </div>

        </form>
    </div>
</div>

</body>
</html>
