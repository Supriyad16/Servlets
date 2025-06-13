<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Weather Reporting App</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container-fluid p-4" style="background-color: #f8f9fa;">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>

<nav class="navbar mb-4" style="background-color: #e3f2fd;" data-bs-theme="light">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">Home</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
    </div>
</nav>


<div class="row justify-content-center">
    <div class="col-md-8 col-lg-6">
        <h1 class="mb-4 text-center">Weather Reporting Form</h1>
        <form action="bengaluru" method="post">
            <div class="mb-3">
                <label for="location" class="form-label">Location Name</label>
                <input type="text" class="form-control" id="location" name="location" required>
            </div>

            <div class="mb-3">
                <label for="capture" class="form-label">Captured By</label>
                <input type="text" class="form-control" id="capture" name="capture" required>
            </div>

            <div class="mb-3">
                <label for="temperature" class="form-label">Temperature</label>
                <input type="text" class="form-control" id="temperature" name="temperature" required>
            </div>

            <div class="mb-3">
                <label for="record" class="form-label">Recorded By</label>
                <input type="text" class="form-control" id="record" name="record" required>
            </div>

            <div class="d-grid">
                <button type="submit" class="btn btn-primary">Show</button>
            </div>
        </form>
    </div>
</div>

</body>
</html>
