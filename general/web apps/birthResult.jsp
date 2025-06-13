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

<nav class="navbar mb-4" style="background-color: #e3f2fd;" data-bs-theme="light">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp"><b>Home</b></a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
    </div>
</nav>

<h1>This is your Details</h1>

<li class="list-group-item"><strong><h2>Birth ID: ${dto.bid}</h2></strong></li>
<li class="list-group-item"><strong><h2>Hospital Name: ${dto.name}</h2></strong></li>
<li class="list-group-item"><strong><h2>Father Name: ${dto.fname}</h2></strong></li>
<li class="list-group-item"><strong><h2>Mother Name: ${dto.mname}</h2></strong></li>
<li class="list-group-item"><strong><h2>Date: ${dto.dates}</h2></strong></li>
<li class="list-group-item"><strong><h2>Time: ${dto.times}</h2></strong></li>
<li class="list-group-item"><strong><h2>Doctor Name: ${dto.dname}</h2></strong></li>
<li class="list-group-item"><strong><h2>Nurse Name: ${dto.nname}</h2></strong></li>
<li class="list-group-item"><strong><h2>Hospital Type: ${hospitalType}</h2></strong></li>

</body>
</html>
