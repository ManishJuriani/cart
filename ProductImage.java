package models;

public class ProductImage{
	private Integer productImageId;
	private Product product;
	private String imagePath;
	private Status status;

	public void setproductImageId(Integer productImageId){
		this.productImageId = productImageId;
	}

	public Integer getProductImageId(){
		return productImageId;
	}

	public void setProduct(Product product){
		this.product = product;
	}

	public Product getProduct(){
		return product;
	}

	public void setImagePath(String imagePath){
		this.imagePath = imagePath;
	}

	public String getImagePath(){
		return imagePath;
	}

	public void setStatus(Status status){
		this.status=status;
	}

	public Status getStatus(){
		return status;
	}
}