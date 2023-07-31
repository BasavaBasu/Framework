package com.trello.qsp.genericutility;

import java.time.LocalDateTime;

public class JavaUtility 
{
	public String timeStamp()
	{
		return LocalDateTime.now().toString().replace(':', '-');	
	}

}
