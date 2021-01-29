package com.JokeGenerator;

public class JokeResponseBody {
	
	boolean error;
	String category;
	String type;
	String joke;
	String setup;
	String delivery;
	
	public boolean isError() {
		return error;
	}
	public void setError(boolean error) {
		this.error = error;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getJoke() {
		return joke;
	}
	public void setJoke(String joke) {
		this.joke = joke;
	}
	public String getSetup() {
		return setup;
	}
	public void setSetup(String setup) {
		this.setup = setup;
	}
	public String getDelivery() {
		return delivery;
	}
	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}
	

}
