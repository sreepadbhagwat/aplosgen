package com.github.sreepadbhagwat.sample_Cucumber;

import cucumber.api.java.After;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;


import java.net.MalformedURLException;


import com.github.sreepadbhagwat.aplos.platform.AplosDriverPlatform;

import com.github.sreepadbhagwat.aplos.api.AplosAppium;
import com.github.sreepadbhagwat.sample_Cucumber.TEST;





public class FirstTest {
	
	
	// public IOSDriver driver = null;

	 private String sessionId;
	   // Button button1 = TEST.ios.button("Name", "UIKitCa1talog");


	@Before
	public void beforeScenario() throws MalformedURLException {
	  System.out.println("Before");
	  
	  
	 
	  //System.out.println("b1");
	  //Caps caps = new Caps();
	
	  //System.out.println(caps.readCAPS("PLATFORM_VERSION"));
	  
	}

	@After
	public void afterScenario() {
		  System.out.println("After");
		//  driver.quit();
		 // TEST.ios.quitDriver();
	}
	
	


@Given("^I login$")
public void I_login() throws Throwable {
	

	AplosAppium Test = AplosDriverPlatform.loadPlatform("IOS");
	AplosAppium Test1 = AplosDriverPlatform.loadPlatform("IOS");
	//AplosAppium Test1 = AplosDriverPlatform.loadPlatform("IOS");




	//double start = java.util.Calendar.getInstance().getTimeInMillis();
Test.startDriver();
	//Test.button().click();
Test.button().click("Name", "UIKitCatalog");
double start = java.util.Calendar.getInstance().getTimeInMillis();

	Test.button().click("name", "Text Fields");



	//Test.button().click("Name", "Text Fields");

		
		//System.out.println(text.getText("Name", "Text Fields"));
  

 // tf.setText("XPath", "//*[@value='Placeholder text'][2]", "sreepad");

   
	
  


/*
    
	
	
	DesiredCapabilities desiredcapabilities = new DesiredCapabilities();
	desiredcapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
    desiredcapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone Simulator");
    desiredcapabilities.setCapability(MobileCapabilityType.APP, "/Users/sreepadbhagwat/sample_app/UIKitCatalog.app");
    desiredcapabilities.setCapability("appiumVersion", "1.4.13");
	

    IOSElement element = new IOSElement();
    IOSDriver<IOSElement> driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), desiredcapabilities);
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
  driver.findElementByName("UIKitCatalog").click();
  
    
    
	
	
	  
	  System.out.println(driver.findElementByName("Activity Indicators").getText());
	  driver.findElementByName("Sliders").click();
	  driver.findElementByXPath("//UIASlider[1]").sendKeys("0.05");
	 // driver.findElementByName("Text Fields").click();
	  Thread.sleep(3000);
	

driver.quit();
	 
	*/	
		 double end = java.util.Calendar.getInstance().getTimeInMillis();
		   System.out.println("it took this long to complete this stuff: " + (end - start)/1000 + "ms");

   Test.quitDriver();
		   // obj.quitDriver();
}

}