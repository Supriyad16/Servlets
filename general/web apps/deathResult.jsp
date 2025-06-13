<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Death Certificate Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container-fluid p-4" style="background-color: #f8f9fa;">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>

<nav class="navbar mb-4" style="background-color: #e3f2fd;" data-bs-theme="light">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp"><b>Home</b></a>
    </div>
</nav>

<h1 class="mb-4">Death Certificate Details</h1>

<li class="list-group-item"><strong><h2>Name: ${dto.name}</h2></strong></li>
<li class="list-group-item"><strong><h2>Cause of Death: ${dto.cause}</h2></strong></li>
<li class="list-group-item"><strong><h2>Date: ${dto.date}</h2></strong></li>
<li class="list-group-item"><strong><h2>Time: ${dto.time}</h2></strong></li>
<li class="list-group-item"><strong><h2>Age: ${dto.age}</h2></strong></li>
<li class="list-group-item"><strong><h2>Hospital Name: ${dto.hospitalName}</h2></strong></li>
<li class="list-group-item"><strong><h2>Manner of Death: ${dto.manner}</h2></strong></li>
<li class="list-group-item"><strong><h2>Marks: ${dto.marks}</h2></strong></li>
<li class="list-group-item"><strong><h2>Gender: ${dto.gender}</h2></strong></li>

</body>
</html>
