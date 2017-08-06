package testandriod;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mobiletest {

	static WebDriver driver;
	public static void launchurl()
	{
		/*driver =new FirefoxDriver();
		driver.get("https://www.gmail.com");
	*/
		
		HashMap<String,String> map = new HashMap<String,String>();
		
		String name="srinivas12345";
		int str=name.length();
		
		java.util.List<String> a=Arrays.asList(name);
		
		for(int i=0;i<str-1;i++)
		{
		a.get(i);
		System.out.println("i vali is" +i );
		}
		/*for (int i: a)
		{
			map.put(a.get(i).toString(),1);
			
		}
		
		
		
		System.out.println("hai");*/
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mobiletest m= new mobiletest();
		
		launchurl();
	}

}
