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
			</div>
			
			<div id="main">
				<table id="main_box" >
					<form id="reg_form" action="login.do">
						<tr class="fld_box">					
							<td class="fld_name">Email</td>
							<td class="colon">:</td>
							<td class="fld_input"><input type="email" name="email" required placeholder="Email" /></td>
						</tr>

						<tr></tr>
						<tr></tr>

						<tr class="fld_box">							
							<td class="fld_name">Password</td>
							<td class="colon">:</td>
							<td class="fld_input"><input type="password" name="password" required placeholder="Password" /></td>
						</tr>

						
						<tr></tr>
						<tr></tr>

						<tr class="fld_box" >
							<td></td>
							<td id="sbm_box" align="center"><input id="sbm_btn" type="submit" value="Login" /></td>
							<td></td>
						</tr>
					</form>
				</table>
			</div>


			<div id="footer"></div>
		</div>
	</body>

</html>