package com.github.sreepadbhagwat.sample_Cucumber;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;

import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;

import io.appium.java_client.remote.MobileCapabilityType;

public class Cap{
	
	ObjectMapper mapper = new ObjectMapper();;
			
    Map<String,Object> capsDataMap = new HashMap<String,Object>();;
    		

	public void addCAPS(String key, String value){
		capsDataMap.put(key,value);
	}

	public void readCAPS(String key, String value){
		capsDataMap.get(key);
	}
	
	public void createAppiumJSON(){
		
		try {
			capsDataMap.put("PLATFORM_VERSION","9.0");
			capsDataMap.put("PLATFORM_VERSION","iPhone Simulator");
			capsDataMap.put("APP","/Users/sreepadbhagwat/sample_app/UIKitCatalog.app");
			capsDataMap.put("appiumVersion","1.4.13");
			
			mapper.writeValue(new File("caps.json"), capsDataMap);
		
	} catch (JsonGenerationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (JsonMappingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
	
}
	

}
