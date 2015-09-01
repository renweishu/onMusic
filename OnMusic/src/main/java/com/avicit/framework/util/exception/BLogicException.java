package com.avicit.framework.util.exception;

import com.avicit.framework.util.exception.message.BLogicMessages;

public abstract class BLogicException extends RuntimeException
{
	private static final long serialVersionUID = -8930961033142346339L;
	private BLogicMessages bLogicMessages;

	protected BLogicException(BLogicMessages bLogicMessages)
	{
		this.bLogicMessages = bLogicMessages;
	}

	public BLogicMessages getBLogicMessages()
	{
		return this.bLogicMessages;
	}
}
