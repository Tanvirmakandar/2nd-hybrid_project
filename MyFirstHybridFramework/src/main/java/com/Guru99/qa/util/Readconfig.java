package com.Guru99.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
	public static Properties prop;
	public Readconfig() {
	File scr=new File("./Configuration/config.properties");
	try {
	FileInputStream fis=new FileInputStream(scr);
	 prop=new Properties();
	 prop.load(fis);
	}
	catch(Exception e)
	{
	e.printStackTrace();

    }
 }
public String  getURL() {
	String url=prop.getProperty("baseUrl");
			return url;
}}
