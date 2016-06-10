package com.newstore.domain;

public class Address {

	private int addressId;
	private String addressLine1;
	private String city;
	private String state;
	private int zipcode;
	
	public Address(int addressId, String addressLine1, String city, String state, int zipcode) {
		super();
		this.addressId = addressId;
		this.addressLine1 = addressLine1;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return String.format("Address [addressId=%s, addressLine1=%s, city=%s, state=%s, zipcode=%s]", addressId,
				addressLine1, city, state, zipcode);
	}
	
	
}
