<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>


<html>
	<title>Student Confirmation</title>
	<body>
		<h1>
			The student is: ${student.firstName} ${student.lastName}.
		</h1>
		<br>
		Country: ${student.country}
		<br>
		Favorite Language: ${student.favoriteLanguage}
		<br>
		Operating Systems:
		<ul>
			<c:forEach var="temp" items="${student.operatingSystems}">
				<li>${temp}</li>
			</c:forEach>
		</ul>
	</body>
</html>