package models;

public class City{
	private Integer cityId;
	private String city;
	private State state;

	public void setCityId(Integer cityId){
		this.cityId  = cityId;
	}

	public Integer getCityId(){
		return cityId;
	}

	public void setCity(String city){
		this.city = city;
	}
	public String getCity(){
		return city;

	}

	public void setState(State state){
		this.state  = state;
	}

	public State getstate(){
		return state;
	}

}