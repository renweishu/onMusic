package com.avicit.framework.util.exception;

import com.avicit.framework.util.exception.message.BLogicMessages;

public class ApplicationException extends BLogicException
{
	private static final long serialVersionUID = -6965884477263570390L;
	private String forwardName;

	public ApplicationException(BLogicMessages logicMessages)
	{
		this(logicMessages, null);
	}

	public ApplicationException(BLogicMessages logicMessages, String forwardName)
	{
		super(logicMessages);
		this.forwardName = forwardName;
	}

	public String getForwardName()
	{
		return this.forwardName;
	}

	public void setForwardName(String forwardName)
	{
		this.forwardName = forwardName;
	}
}
