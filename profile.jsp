<%@ page import="models.User"%>

<html>

	<head>
		<link rel="stylesheet" href="css/login.css" />
		<script src="js/login.js"></script>
		<title>Login</title>
	</head>

	<body>
		<div id="container">
			<div id="header">
				
				<img src="images/cart.jpg" id="logo_image" width="80" height="80"  /><a href="#" id="website_name"> Cart </a>
				    <span class="btn_grp">
					    <button type="button" class="button" id="button_register" disabled>Register
							<span class="tooltiptext">This is the Register Page</span>					
						</button>
					    <button type="button" class="button" id="button_login">Login</button>
					    <button type="button" class="button" id="button_logout">Logout</button>
					</span>
					<div style="color:white;font-size:30">Profile Page..Welcome <%= ((User)session.getAttribute("user")).getUserName() %></div>
					
			</div>

		</div>
	</body>

