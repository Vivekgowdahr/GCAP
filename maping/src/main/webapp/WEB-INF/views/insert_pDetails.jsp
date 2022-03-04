<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>General Cardiac Audit Programmer</title>
</head>
<body>
	<h1>General Cardiac Audit Programmer</h1>
	<form action="./insert_patient_Details" method="post">
		patient_First_Name :- <input type="text" name="patient_First_Name"
			placeholder="patient_First_Name"><br>
		<br> patient_Middle_Name :- <input type="text"
			name="patient_Middle_Name" placeholder="patient_Middle_Name"><br>
		<br> patient_Last_Name :- <input type="text"
			name="patient_Last_Name" placeholder="patient_Last_Name"><br>
		<br> patient_Mobile_Number :- <input type="number"
			name="patient_Mobile_Number" placeholder="patient_Mobile_Number"><br>
		<br> patient_Mail :- <input type="email" name="patient_Mail"
			placeholder="patient_Mail"><br>
		<br> patient_Date_Of_Birth :- <input type="date"
			name="patient_Date_Of_Birth" placeholder="patient_Date_Of_Birth"><br>
		<br> patient_Age :- <input type="number" name="patient_Age"
			placeholder="patient_Age"><br>
		<br> patient_Gender :- <select name="patient_Gender">
			<option value="select">select</option>
			<option value="Male">Male</option>
			<option value="Female">Female</option>
			<option value="Others">Others</option>
		</select><br>
		<br> patient_Adress :- <input type="text" name="patient_Adress"
			placeholder="patient_Adress"><br>
		<br> <input type="submit" value="Click to Add patient">
	</form>
</body>
</html>