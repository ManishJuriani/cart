package models;

import java.sql.*;


public class User{

	private Integer userId;
	private String userName;
	private String email;
	private String password;
	private Date dob;
	private String gender;
	private String contact;
	private String address;
	private City city;
	private Status status;
	private UserType userType;
	

	//Constructors
	public User(){
	
	}

	public User(String email,String password){
		this.email=email;
		this.password=password;
	}

	public User(String userName,String email,String password){
		this.userName=userName;
		this.email=email;
		this.password=password;
	}
	

	//Other Methods
	public boolean loginUser(){
		boolean flag = false;

		try{
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cart?user=root&password=1234");
			
			String query = "select user_id,user_name,dob,gender,contact,address,city_id,status_id,user_type_id,password from users where email=?";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1,email);
			
			ResultSet rs = pst.executeQuery();

			if(rs.next()){
				String originalPassword = rs.getString(10);
				if(password.equals(originalPassword)){
					userId = rs.getInt(1);
					userName = rs.getString(2);
					dob = rs.getDate(3);
					gender = rs.getString(4);
					contact = rs.getString(5);
					address = rs.getString(6);
					int cityId = rs.getInt(7);
					if(cityId!=0){
						City city = new City();
					}
					int statusId = rs.getInt(8);
					int userTypeId = rs.getInt(9);

					flag=true;
				}
			}
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return flag;
	}


	public boolean registerUser(){
		boolean flag=false;
			

		try{
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cart?user=root&password=1234");
			
			String query = "insert into users (user_name,email,password) value (?,?,?)";

			PreparedStatement pst = con.prepareStatement(query);

			pst.setString(1,userName);
			pst.setString(2,email);
			pst.setString(3,password);

			int result = pst.executeUpdate();
			if(result==1){
				flag= true;
			}

			con.close();
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}

		return flag;
	}




	//Getter Setters

	public void setUserId(Integer userId){
		this.userId = userId;
	}

	public Integer getUserId(){
		return userId;
	}

	public void setUserName(String userName){
		this.userName = userName;

	}

	public String getUserName(){
		return userName;
	}

	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return email;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
	}
	
	public void setDob(Date dob){
		this.dob=dob;
	}

	public Date getDob(){
		return dob;
	}

	public void setGender(String gender){
		this.gender = gender;
	}
	public String getGender(){
		return gender;
	}

	public void setContact(String contact){
		this.contact = contact;

	}

	public String getContact(){
		return contact;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}

	public void setCity(City city){
		this.city = city;
	}

	public City getCity(){
		return city;
	}

	public void setStatus(Status status){
		this.status = status;
	}

	public Status getStatus(){
		return status;
	}

	public void setUserType(UserType userType){
		this.userType  = userType;
	}

	public UserType getUserType(){
		return userType;
	}


}