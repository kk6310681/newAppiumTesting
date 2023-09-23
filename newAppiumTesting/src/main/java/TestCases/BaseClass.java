package TestCases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

//import io.appium.java_client.MobileElement;
//import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

//import utilities.ReadExcelData;

public class BaseClass {
	
	private static URL url;
	public static AndroidDriver driver;
	
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap =  new DesiredCapabilities();
		//cap.setCapability("deviceName", "realme 8i");
		cap.setCapability("deviceName", "Redmi 9");
		//cap.setCapability("udid", "456HRKEEU8IZPRKB");
		cap.setCapability("udid", "MNEQEUQGV87TOBYX");
		cap.setCapability("platformName", "ANDROID");
		cap.setCapability("platformVersion", "10");
		//cap.setCapability("appPackage", "com.makemytrip");
		cap.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		cap.setCapability("appium:automationName", "uiautomator2");
		cap.setCapability("appActivity", "com.amazon.mShop.splashscreen.StartupActivity");
		cap.setCapability("appWaitForLaunch", false);
		cap.setCapability(MobileCapabilityType.FULL_RESET, false);
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		System.out.println("First URL is: "+url);
		url = new URL("http://127.0.0.1:4723/wd/hub");
		System.out.println("Second URL is: "+url);
		driver = new AndroidDriver(url, cap);
		System.out.println("System Connection Established");
	}

}
