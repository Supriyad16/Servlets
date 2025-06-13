<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Marriage Registration Form</title>
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

            </ul>
        </div>
    </div>
</nav>



<div class="row justify-content-center">
    <div class="col-md-8 col-lg-6">
        <h1 class="mb-4 text-center">Marriage Registration Form</h1>
        <form action="marriage" method="post">

            <div class="mb-3">
                <label for="groomName" class="form-label"><strong>Groom Name</strong></label>
                <input type="text" class="form-control" id="groomName" name="groomName" required>
            </div>

            <div class="mb-3">
                <label for="brideName" class="form-label"><strong>Bride Name</strong></label>
                <input type="text" class="form-control" id="brideName" name="brideName" required>
            </div>

            <div class="mb-3">
                <label for="location" class="form-label"><strong>Location</strong></label>
                <input type="text" class="form-control" id="location" name="location" required>
            </div>

            <div class="mb-3">
                <label for="address" class="form-label"><strong>Address</strong></label>
                <textarea class="form-control" id="address" name="address" rows="3" required></textarea>
            </div>

            <div class="mb-3">
                <label for="religion" class="form-label"><strong>Religion</strong></label>
                <input type="text" class="form-control" id="religion" name="religion" required>
            </div>

            <div class="mb-3">
                <label for="date" class="form-label"><strong>Date of Marriage</strong></label>
                <input type="date" class="form-control" id="date" name="date" required>
            </div>

            <div class="mb-3">
                <label for="witness1" class="form-label"><strong>Witness 1</strong></label>
                <input type="text" class="form-control" id="witness1" name="witness1" required>
            </div>

            <div class="mb-3">
                <label for="witness2" class="form-label"><strong>Witness 2</strong></label>
                <input type="text" class="form-control" id="witness2" name="witness2" required>
            </div>

            <div class="mb-3">
                <label for="officer" class="form-label"><strong>Officer Name</strong></label>
                <input type="text" class="form-control" id="officer" name="officer" required>
            </div>

            <div class="d-flex justify-content-center">
                <button type="submit" class="btn btn-primary">Register</button>
            </div>

        </form>
    </div>
</div>

</body>
</html>
