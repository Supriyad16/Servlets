<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Passport Application Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container-fluid p-4" style="background-color: #f8f9fa;">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>

<nav class="navbar mb-4" style="background-color: #e3f2fd;">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp"><b>Home</b></a>
    </div>
</nav>

<h2>Passport Application Details</h2>
<ul class="list-group">
    <li class="list-group-item"><strong>Name:</strong> ${dto.name}</li>
    <li class="list-group-item"><strong>Aadhar No:</strong> ${dto.adhar}</li>
    <li class="list-group-item"><strong>Address:</strong> ${dto.address}</li>
    <li class="list-group-item"><strong>PAN Number:</strong> ${dto.pno}</li>
    <li class="list-group-item"><strong>Country:</strong> ${dto.country}</li>
    <li class="list-group-item"><strong>State:</strong> ${dto.state}</li>
    <li class="list-group-item"><strong>City:</strong> ${dto.city}</li>
    <li class="list-group-item"><strong>PinCode:</strong> ${dto.pcode}</li>
    <li class="list-group-item"><strong>Passport Type:</strong> ${dto.passportType}</li>
    <li class="list-group-item"><strong>Payment Reference Id:</strong> ${dto.pay}</li>
</ul>

</body>
</html>
