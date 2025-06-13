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
        <h1 class="mb-4 text-center">Passport Application Form</h1>
        <form action="passport" method="post">
            <div class="mb-3">
                <label for="name" class="form-label"><strong>Applicant Name</strong></label>
                <input type="text" class="form-control" id="name" name="name" required>
            </div>

            <div class="mb-3">
                <label for="adhar" class="form-label"><strong>Aadhar No</strong></label>
                <input type="text" class="form-control" id="adhar" name="adhar" required>
            </div>

            <div class="mb-3">
                <label for="address" class="form-label"><strong>Address</strong></label>
                <input type="text" class="form-control" id="address" name="address" required>
            </div>

            <div class="mb-3">
                <label for="pno" class="form-label"><strong>Pan Number</strong></label>
                <input type="text" class="form-control" id="pno" name="pno" required>
            </div>

            <div class="mb-3">
                <label for="country" class="form-label"><strong>Country</strong></label>
                <input type="text" class="form-control" id="country" name="country" required>
            </div>

            <div class="mb-3">
                <label for="state" class="form-label"><strong>State</strong></label>
                <input type="text" class="form-control" id="state" name="state" required>
            </div>


            <div class="mb-1">
                <label for="city" class="form-label"><strong>City</strong></label>
                <input type="text" class="form-control" id="city" name="city" required>
            </div>

            <div class="mb-3">
                <label for="pcode" class="form-label"><strong>PinCode</strong></label>
                <input type="text" class="form-control" id="pcode" name="pcode" required>
            </div>

            <label><strong>Passport Type</strong></label>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="experience" value="0-3" id="radio1">
                <label class="form-check-label" for="radio1">
                    Ordinary
                </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="experience" value="4-8" id="radio2" >
                <label class="form-check-label" for="radio2">
                    Official
                </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="experience" value="9-10" id="radio3">
                <label class="form-check-label" for="radio3">
                    Diplomatic
                </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="experience" value="9-10" id="radio3">
                <label class="form-check-label" for="radio3">
                    Emigration Check Required
                </label>
            </div>

            <div class="mb-3">
                <label for="pay" class="form-label"><strong>Payment Reference Id</strong></label>
                <input type="text" class="form-control" id="pay" name="pay" required>
            </div>


            <div class="d-flex justify-content-center">
                <button type="submit" class="btn btn-primary">Apply</button>
            </div>

        </form>
    </div>
</div>

</body>
</html>
