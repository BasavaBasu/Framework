package com.trello.qsp.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class FileUtility
{
	
	public String readCommonData(String key) throws IOException 
	{
		 FileInputStream fis = new FileInputStream("./src/test/resources/trelloData.properties");
		 Properties pobj = new Properties();
		 pobj.load(fis);
		 return pobj.getProperty(key);
	}

}
