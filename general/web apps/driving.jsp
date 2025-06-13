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
                    <a class="nav-link" href="birth.jsp">Birth Certificate</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="passport.jsp">Passport Application</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="death.jsp">Death Certificate</a>
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
        <h1 class="mb-4 text-center">Vehicle Application Form</h1>
        <form action="driving" method="post">

            <div class="mb-3">
                <label for="name" class="form-label"><strong>Name</strong></label>
                <input type="text" class="form-control" id="name" name="name" required>
            </div>

            <div class="mb-3">
                <label for="address" class="form-label"><strong>Address</strong></label>
                <textarea class="form-control" id="address" name="address" rows="3" required></textarea>
            </div>

            <div class="mb-3">
                <label for="mobile" class="form-label"><strong>Mobile</strong></label>
                <input type="tel" class="form-control" id="mobile" name="mobile" pattern="[0-9]{10}" required>
            </div>

            <div class="mb-3">
                <label for="appliedDate" class="form-label"><strong>Applied Date</strong></label>
                <input type="date" class="form-control" id="appliedDate" name="appliedDate" required>
            </div>

            <div class="mb-3">
                <label class="form-label"><strong>Vehicle Type</strong></label>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="vehicleType" value="Two Wheeler" id="vehicle1" required>
                    <label class="form-check-label" for="vehicle1">
                        Light Motor Vehicle (LMV)
                    </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="vehicleType" value="Four Wheeler" id="vehicle2">
                    <label class="form-check-label" for="vehicle2">
                        Motorcycle with Gear (MCWG)
                    </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="vehicleType" value="Heavy Vehicle" id="vehicle3">
                    <label class="form-check-label" for="vehicle3">
                        Motorcycle without Gear (MCWOG)
                    </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="vehicleType" value="Heavy Vehicle" id="vehicle3">
                    <label class="form-check-label" for="vehicle3">
                        Heavy Motor Vehicle (HMV)
                    </label>
                </div>

            </div>

            <div class="d-flex justify-content-center">
                <button type="submit" class="btn btn-primary">Register</button>
            </div>

        </form>
    </div>
</div>

</body>
</html>
