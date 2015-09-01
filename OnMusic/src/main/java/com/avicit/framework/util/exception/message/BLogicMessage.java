package com.avicit.framework.util.exception.message;

import java.io.Serializable;

public class BLogicMessage implements Serializable
{
	private static final long serialVersionUID = 2885287921533717080L;
	protected String key = null;

	protected Object[] values = null;

	protected boolean resource = true;

	public BLogicMessage(String key)
	{
		this(key, (Object[])null);
	}

	public BLogicMessage(String key, Object[] values)
	{
		this.key = key;
		this.values = values;
		this.resource = true;
	}

	public BLogicMessage(String key, boolean resource)
	{
		this.key = key;
		this.resource = resource;
	}

	public String getKey()
	{
		return this.key;
	}

	public Object[] getValues()
	{
		return this.values;
	}

	public boolean isResource()
	{
		return this.resource;
	}
}
