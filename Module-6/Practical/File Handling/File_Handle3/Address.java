package com.io;

import java.io.Serializable;

public class Address implements Serializable
{
	String country, state, city;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() 
	{
		return new StringBuffer("Country : ").append(country).append(" , state : ").append(state)
				.append(" , City : ").append(city).toString();
	}
}
