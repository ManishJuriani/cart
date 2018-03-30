package models;

public class OrderStatus{
	private Integer orderStatusId;
	private String orderStatus;

	public void setOrderStatusId(Integer orderStatusId){
		this.orderStatusId=orderStatusId;
	}

	public Integer getOrderStatusId(){
		return orderStatusId;
	}

	public void setOrderStatus(String orderStatus){
		this.orderStatus=orderStatus;
	}

	public String getOrderStatus(){
		return orderStatus;
	}
}