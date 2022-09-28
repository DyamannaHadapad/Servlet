<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form action="Atal" method="post">
	<h1 style="color:red";>DATA OF PRIME MINISTER</h1>
	<h4>
		Name : <input type="text" id="name" name="name"
			placeholder="Enter Name"> <br><br>  Country : <select
			name="country">
			<option value="select">--select country--</option>

			<option value="INDIA">INDIA</option>
			<option value="AUS">AUS</option>
			<option value="ENGLAND">ENGLAND</option>
			<option value="DUBAI">DUBAI</option>

		</select> <br> <br> 
		Marriage Status :
	    YES :<input type="radio" id="name" name="status" value="YES"> 
		NO :<input type="radio" id="name" name="status" value="No">
<br><br> 
		Party : <select name="party">
			<option value="select">--select party--</option>

			<option value="BJP">BJP</option>
			<option value="CONG">CONG</option>
			<option value="JDS">JDS</option>
			<option value="NDP">NDP</option>


		</select> <br> <br> Age : <input type="text" id="age" name="age" placeholder="Enter Age"> <br><br> 
		Gender : Male<input type="radio" name="Gender" value="Male">
		Female<input type="radio" name="Gender" value="Female"> Other<input
			type="radio" name="Gender" value="Other"> <br><br>  Period as
		: <input type="text" id="name" name="period" placeholder="Enter">
		<br> <br> Times Represented : <select name="time">
		<option value="select">--select time represented--</option>
		    <option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="5">5</option>
		
		</select>
		<br>
		<br>
		
		<input type="submit" value="SAVE"> 
		</h4>
	</form>

</body>
</html>