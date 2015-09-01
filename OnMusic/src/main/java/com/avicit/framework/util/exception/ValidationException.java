package com.avicit.framework.util.exception;

import com.avicit.framework.util.exception.message.BLogicMessages;

public class ValidationException extends BLogicException
{
	private static final long serialVersionUID = -8843559335258660652L;

	public ValidationException(BLogicMessages bLogicMessages)
	{
		super(bLogicMessages);
	}
}