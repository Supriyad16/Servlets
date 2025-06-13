<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Marriage Registration Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container-fluid p-4" style="background-color: #f8f9fa;">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>

<nav class="navbar mb-4" style="background-color: #e3f2fd;">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp"><b>Home</b></a>
    </div>
</nav>

<h2>Marriage Registration Details</h2>
<ul class="list-group">
    <li class="list-group-item"><strong>Groom Name:</strong> ${dto.groomName}</li>
    <li class="list-group-item"><strong>Bride Name:</strong> ${dto.brideName}</li>
    <li class="list-group-item"><strong>Location:</strong> ${dto.location}</li>
    <li class="list-group-item"><strong>Address:</strong> ${dto.address}</li>
    <li class="list-group-item"><strong>Religion:</strong> ${dto.religion}</li>
    <li class="list-group-item"><strong>Date of Marriage:</strong> ${dto.date}</li>
    <li class="list-group-item"><strong>Witness 1:</strong> ${dto.witness1}</li>
    <li class="list-group-item"><strong>Witness 2:</strong> ${dto.witness2}</li>
    <li class="list-group-item"><strong>Officer Name:</strong> ${dto.officer}</li>
</ul>

</body>
</html>
