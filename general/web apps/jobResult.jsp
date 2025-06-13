<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Job Application Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container-fluid p-4" style="background-color: #f8f9fa;">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>

<nav class="navbar mb-4" style="background-color: #e3f2fd;">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp"><b>Home</b></a>
    </div>
</nav>

<h2>Submitted Job Application Details</h2>
<ul class="list-group">
    <li class="list-group-item"><strong>Name:</strong> ${dto.name}</li>
    <li class="list-group-item"><strong>Email:</strong> ${dto.email}</li>
    <li class="list-group-item"><strong>Education:</strong> ${dto.education}</li>
    <li class="list-group-item"><strong>Skills:</strong> ${dto.skills}</li>
    <li class="list-group-item"><strong>Expected Salary:</strong> ${dto.salary}</li>
    <li class="list-group-item"><strong>Experience:</strong> ${dto.experience}</li>
</ul>

</body>
</html>
