package com.fileuploaddownload.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;



@ConfigurationProperties(prefix = "file")
public class FileStorageProperties {
	
	private String serverDir;

	public String getServerDir() {
		return serverDir;
	}

	public void setServerDir(String serverDir) {
		this.serverDir = serverDir;
	}

	public FileStorageProperties() {

	}
}
