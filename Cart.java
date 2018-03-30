package models;

import java.sql.Timestamp;

public class Cart{
	private Integer cartId;
	private User user;
	private Timestamp cartTime;
	private Integer itemsAdded;

	public void setCartId(Integer cartId){
		this.cartId = cartId;
	}

	public Integer getCartId(){
		return cartId;
	}

	public void setUser(User user){
		this.user = user;
	}

	public User getUser(){
		return user;
	}

	public void setCartTime(Timestamp cartTime){
		this.cartTime = cartTime;
	}

	public Timestamp getCartTime(){
		return cartTime;
	}

	public void setItemsAdded(Integer itemsAdded){
		this.itemsAdded = itemsAdded;
	}

	public Integer getItemsAdded(){
		return itemsAdded;
	}
}