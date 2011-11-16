package org.mconf.android.bbbandroid;

public class Server {

	public final static int SERVER_UNKNOWN= 0000;
	public final static int SERVER_UP= 1111;
	public final static int SERVER_DOWN= 2222;
	public final static int SERVER_TESTING= 3333;
	
	private String url;
	private String password;
	private String Id;
	private int status;
	private String version;
	
	Server(String ID, String Url, String password)
	{
		this.setId(ID);
		this.setUrl(Url);
		this.setPassword(password);
		this.status=SERVER_UNKNOWN;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setId(String id) {
		Id = id;
	}
	public String getId() {
		return Id;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getStatus() {
		return status;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getVersion() {
		return version;
	}
	
	
}
