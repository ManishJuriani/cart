package models;

public class CartItem{
	private Integer cartItemId;
	private Cart cart;
	private Product product;
	private Integer quantity;
	private OrderStatus orderStatus;

	public void setCartItemId(Integer cartItemId){
		this.cartItemId=cartItemId;
	}

	public Integer getCartItemId(){
		return cartItemId;
	}

	public void setCart(Cart cart){
		this.cart=cart;
	}

	public Cart getCart(){
		return cart;
	}

	public void setProduct(Product product){
		this.product=product;
	}

	public Product getProduct(){
		return product;
	}
	
	public void setQuantity(Integer quantity){
		this.quantity=quantity;
	}

	public Integer getQuantity(){
		return quantity;
	}

	public void setOrderStatus(OrderStatus orderStatus){
		this.orderStatus=orderStatus;
	}

	public OrderStatus getOrderStatus(){
		return orderStatus;
	}
}