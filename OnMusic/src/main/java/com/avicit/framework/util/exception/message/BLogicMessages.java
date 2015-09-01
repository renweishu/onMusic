package com.avicit.framework.util.exception.message;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class BLogicMessages
implements Serializable
{
	private static final long serialVersionUID = -7410826431026041043L;
	protected ArrayList<BLogicMessage> list = new ArrayList();

	protected ArrayList<String> groupList = new ArrayList();

	public BLogicMessages()
	{
	}

	public BLogicMessages(BLogicMessages messages)
	{
		add(messages);
	}

	public void add(String group, BLogicMessage message)
	{
		this.list.add(message);
		this.groupList.add(group);
	}

	public void add(BLogicMessages messages)
	{
		if (messages == null) {
			return;
		}

		Iterator itr = messages.get();
		Iterator groupItr = messages.getGroup();
		while (itr.hasNext()) {
			BLogicMessage message = (BLogicMessage)itr.next();
			String group = (String)groupItr.next();

			add(group, message);
		}
	}

	public void clear()
	{
		this.list.clear();
		this.groupList.clear();
	}

	public boolean isEmpty()
	{
		return this.list.isEmpty();
	}

	public Iterator<BLogicMessage> get()
	{
		return ((ArrayList)this.list.clone()).iterator();
	}

	public Iterator<String> getGroup()
	{
		return ((ArrayList)this.groupList.clone()).iterator();
	}
}
