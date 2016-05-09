package com.razorthink.powermock.beans;

import java.io.Serializable;

public class NewUserBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7838724855074455554L;

	private String firstName;

	private String lastName;

	private String email;

	private String phone;

	private String password;

	public NewUserBean()
	{
		super();
	}

	public NewUserBean( String firstName, String lastName, String email, String phone, String password )
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName( String firstName )
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName( String lastName )
	{
		this.lastName = lastName;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail( String email )
	{
		this.email = email;
	}

	public String getPhone()
	{
		return phone;
	}

	public void setPhone( String phone )
	{
		this.phone = phone;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword( String password )
	{
		this.password = password;
	}
}
