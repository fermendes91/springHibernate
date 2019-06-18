<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>

	<head>
		<title>Customer Confirmation</title>
	</head>

	<body>
		<h1>The customer is confirmed: ${customer.firstName} ${customer.lastName} </h1>
		<br>
		<h2>Free Passes: ${customer.freePasses}</h2>
		<br>
		<h2>Postal Code: ${customer.postalCode}</h2>
		<br><br>
		<h1>Course Code: ${customer.courseCode}</h1>
	</body>
</html>