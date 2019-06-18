  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
	<title>Student Registration Form</title>
	<body>
		<form:form action="processForm" modelAttribute="student">
			First Name: <form:input path="firstName" />
			<br>
			Last Name: <form:input path="lastName" />
			
			<br>
			Country:
			
			<form:select path="country">
				<form:options items="${student.countryOptions}" />
				<!-- <form:option value="Brazil" label="Brazil"/>
				<form:option value="France" label="France"/>
				<form:option value="Germany" label="Germany"/>
				<form:option value="India" label="India"/>
				<form:option value="New Zeland" label="New Zeland "/>		
				-->		
			</form:select> 
			
			<br>
			Favorite Language:
			Java <form:radiobutton path="favoriteLanguage" value="Java"/>
			PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
			C# <form:radiobutton path="favoriteLanguage" value="C#"/>
			Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/>
			
			<br>
			Operating Systems:
			Linux <form:checkbox path="operatingSystems" value="Linux"/>
			Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
			MS Windows <form:checkbox path="operatingSystems" value="MS Windows"/>
			
			
		
			<br>
			<input type="submit" value="submit">
			
		</form:form>
	</body>
</html>