package com.evoke.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PreDefineRegex {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("\\D");
		Matcher m=p.matcher("Sin@ 1876.gmal m");
		while(m.find())
		{
			System.out.println("index value and grp= "+m.start()+"..... "+m.group());
		}

	}

}
  //s=space character
  //S=except space character
 //d= any digit from 0-9
  //D= except digits
  // w= word charcter (a-z,A-Z,0-9)
 // W= except word charcter
  // . = any character. 
