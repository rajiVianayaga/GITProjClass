package org.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Compare {

	public static void main(String[] args) 
	{
		//WebDriverManager.chromedriver().setup();
		   //WebDriver driver = new ChromeDriver();
		   // .driver.get("https://www.google.com/?gws_rd=ssl");
		int[] a1 = new int[] {2,5,1,8,9};
		int[] a2=new int[] {2,1,5,3,9};
		if(a1==a2)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
	}
}
}
