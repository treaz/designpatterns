package com.horia.proxy.protection;

public interface PersonBean {

	public abstract String getName();

	public abstract void setName(String name);

	public abstract String getGender();
	
	public int getHotOrNotRating();

	public abstract void setGender(String gender);

	public abstract String getInterests();

	public abstract void setInterests(String interests);

	public void setHotOrNotRating(int rating);

}