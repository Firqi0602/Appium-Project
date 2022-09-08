package com.juaracoding.appium.twenty;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.juaracoding.appium.twenty.pages.CalculatorTwenty;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TestCalculatorTwenty {
	
	private static AndroidDriver<MobileElement> driver;
	private CalculatorTwenty calculatorTwenty;

	@BeforeClass
	public void setUp() throws MalformedURLException {
		calculatorTwenty = new CalculatorTwenty(driver);			
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		delay(3);
		capabilities.setCapability("deviceName", "M2004J19C");
		capabilities.setCapability("appium:uuid", "9b99cace0404");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appium:platformVersion", "10");
		capabilities.setCapability("appium:appPackage", "com.miui.calculator");
		capabilities.setCapability("appium:appActivity", "com.miui.calculator.cal.CalculatorActivity");

		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}

	@Test
	public void testAdd() {
		delay(3);
		calculatorTwenty.calcAdd();
		System.out.println("Hasil " + calculatorTwenty.getTxtResult());
		assertEquals(calculatorTwenty.getTxtResult(), "= 3");
	}



	static void delay(int detik) {
		try {
			Thread.sleep(1000 * detik);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	}

