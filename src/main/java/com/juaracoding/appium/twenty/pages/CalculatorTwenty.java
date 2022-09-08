package com.juaracoding.appium.twenty.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CalculatorTwenty {
	
private AndroidDriver<MobileElement> driver;

	//	private AndroidDriver<MobileElement> driver;
	public CalculatorTwenty(AndroidDriver<MobileElement> driver) {
//		this.setDriver(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Locator Angka
	@AndroidFindBy(id = "com.miui.calculator:id/btn_1_s")
	public MobileElement btnSatu;

	@AndroidFindBy(id = "com.miui.calculator:id/btn_2_s")
	public MobileElement btnDua;

	@AndroidFindBy(id = "com.miui.calculator:id/btn_3_s")
	public MobileElement btnTiga;

	@AndroidFindBy(id = "com.miui.calculator:id/btn_4_s")
	public MobileElement btnEmpat;

	// Locator Operator

	@AndroidFindBy(id = "com.miui.calculator:id/btn_plus_s")
	public MobileElement btnTambah;

	@AndroidFindBy(id = "com.miui.calculator:id/btn_minus_s")
	public MobileElement btnKurang;

	@AndroidFindBy(id = "com.miui.calculator:id/btn_mul_s")
	public MobileElement btnKali;

	@AndroidFindBy(id = "com.miui.calculator:id/btn_div_s")
	public MobileElement btnBagi;

	@AndroidFindBy(id = "com.miui.calculator:id/btn_equal_s")
	public MobileElement btnSamaDengan;

	@AndroidFindBy(id = "com.miui.calculator:id/result")
	public MobileElement hasil;

	// Method
	public void calcAdd() {
		btnSatu.click();
		btnTambah.click();
		btnDua.click();
		btnSamaDengan.click();
	}

	public void calcKurang() {
		btnTiga.click();
		btnKurang.click();
		btnDua.click();
		btnSamaDengan.click();
	}

	public void calcKali() {
		btnEmpat.click();
		btnKali.click();
		btnDua.click();
		btnSamaDengan.click();
	}

	public void calcBagi() {
		btnEmpat.click();
		btnBagi.click();
		btnDua.click();
		btnSamaDengan.click();
	}

	public String getTxtResult() {
		return hasil.getText();
	}

	public AndroidDriver<MobileElement> getDriver() {
		return driver;
	}

	public void setDriver(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}
}
