<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 	<%@ page isELIgnored="false" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>COVID-19 Tracker</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<div id="wrappper">
<div id="header">
<div class=row>
<div class=col-sm-2>
<i class="fa fa-home" aria-hidden="true" style="font-size: 30px;color: white;"></i>
</div>
<div class=col-sm-2></div>
<div class=col-sm-7>
<h2>COVID-19 Tracker - India</h2>
</div>
<div class=col-sm-1>
<i class="fa fa-rss" aria-hidden="true" style="font-size: 30px;color: white;"></i>
</div>
</div>
</div>
</div>
<center>
	<div class="card" style="width: 20rem;">
	  <div class="card-body">
	  
	    <p class="card-text">
		    <c:forEach items="${covidData}" var="countryList" varStatus="status">
				<c:if test="${countryList.stateCode=='TT'}">
					<b>
						<p style="color: red;font-family: cursive;">Total Cases :${countryList.confirmed}</p>
						<p style="color: green;font-family: cursive;">Recovered :${countryList.recovered}</p>
						<p style="color: black;font-family: cursive;">Deaths :${countryList.deaths}</p>
						<p style="color: blue;font-family: cursive">Active :${countryList.active}</p>
					</b>
				</c:if>
			</c:forEach>
	    </p>
	    <a href="https://covid19.who.int/" class="card-link">@WHO</a>
	    <a href="https://www.worldometers.info/coronavirus/country/india/" class="card-link">@Worldometer</a>
	  </div>
	</div>
</center>
<br>
<table class="table table-striped table-responsive table-bordered">
	<thead>
		<tr>
			<th>Sr. No.</th>
			<th>State</th>
			<th>Total Cases</th>
			<th>Recovered</th>
			<th>Deaths</th>
			<th>Active Cases</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${covidData}" var="countryList" varStatus="status">
			<c:if test="${countryList.stateCode!='TT'}">
				<tr>
					<td align="center">${status.count-1}</td>
					<td align="left">${countryList.state}</td>
					<td align="right">${countryList.confirmed}</td>
					<td align="right">${countryList.recovered}</td>
					<td align="right">${countryList.deaths}</td>
					<td align="right">${countryList.active}</td>
				</tr>
			</c:if>
		</c:forEach>
	</tbody>
</table>

<br>
</body>
</html>