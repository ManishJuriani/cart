package models;

import java.sql.Timestamp;

public class Product{
	private Integer productId;
	private String productTitle;
	private User user;
	private Timestamp launchDate;
	private Integer quantity;
	private Integer mrp;
	private Integer discount;
	private Category category;
	private String description;
	private Float gst;
	private Integer sold;
	private ProductImage productImage;

	public void setProductId(Integer productId){
		this.productId=productId;
	}

	public Integer getProductId(){
		return productId;
	}

	public void setProductTitle(String productTitle){
		this.productTitle=productTitle;
	}

	public String getProductTitle(){
		return productTitle;
	}

	public void setUser(User user){
		this.user=user;
	}

	public User getUser(){
		return user;
	}

	public void setLaunchDate(Timestamp launchDate){
		this.launchDate=launchDate;
	}

	public Timestamp getLaunchDate(){
		return launchDate;
	}

	public void setQuantity(Integer quantity){
		this.quantity=quantity;
	}

	public Integer getQuantity(){
		return quantity;
	}

	public void setMrp(Integer mrp){
		this.mrp=mrp;
	}

	public Integer getMrp(){
		return mrp;
	}

	public void setDiscount(Integer discount){
		this.discount=discount;
	}

	public Integer getDiscount(){
		return discount;
	}

	public void setCategory(Category category){
		this.category=category;
	}

	public Category getCategory(){
		return category;
	}

	public void setDescription(String description){
		this.description=description;
	}

	public String getDescription(){
		return description;
	}

	public void setGst(Float gst){
		this.gst=gst;
	}

	public Float getGst(){
		return gst;
	}

	public void setSold(Integer sold){
		this.sold=sold;
	}

	public Integer getSold(){
		return sold;
	}

	public void setProductImage(ProductImage productImage){
		this.productImage=productImage;
	}

	public ProductImage getProductImage(){
		return productImage;
	}

}