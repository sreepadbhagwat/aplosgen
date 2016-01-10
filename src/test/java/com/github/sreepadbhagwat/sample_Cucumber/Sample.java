package com.github.sreepadbhagwat.sample_Cucumber;


public enum Sample {
	IOS("IOS"),
	ANDROID("Android"),
	WEB("Web");
	
	private String platform;
	private Sample(String platform){
		this.platform=platform;
	}
	
	public String getValue(){
		return this.platform;
	}

}
