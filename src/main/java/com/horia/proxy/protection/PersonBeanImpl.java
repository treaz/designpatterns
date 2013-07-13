package com.horia.proxy.protection;

public class PersonBeanImpl implements PersonBean {

	private int rating;
	private String Name;
	private String gender;
	private String interests;
	private int ratingCount = 0;

	/**
	 * @author Horia Constantin
	 * @see com.horia.proxy.protection.PersonBean#getName()
	 */
	@Override
	public String getName() {
		return Name;
	}

	/**
	 * @author Horia Constantin
	 * @see com.horia.proxy.protection.PersonBean#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		Name = name;
	}

	/**
	 * @author Horia Constantin
	 * @see com.horia.proxy.protection.PersonBean#getGender()
	 */
	@Override
	public String getGender() {
		return gender;
	}

	/**
	 * @author Horia Constantin
	 * @see com.horia.proxy.protection.PersonBean#setGender(java.lang.String)
	 */
	@Override
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @author Horia Constantin
	 * @see com.horia.proxy.protection.PersonBean#getInterests()
	 */
	@Override
	public String getInterests() {
		return interests;
	}

	/**
	 * @author Horia Constantin
	 * @see com.horia.proxy.protection.PersonBean#setInterests(java.lang.String)
	 */
	@Override
	public void setInterests(String interests) {
		this.interests = interests;
	}

	@Override
	public int getHotOrNotRating() {
		if (ratingCount == 0)
			return 0;
		return rating / ratingCount;
	}

	@Override
	public void setHotOrNotRating(int rating ) {
		this.rating+=rating;
		ratingCount++;

	}

}
