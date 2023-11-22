package pl.rengreen.taskmanager.vo;

public class EmailVo {

	private String username;
	private String subject;
	private String body;

	public EmailVo() {
		super();
	}

	public EmailVo(String username, String subject, String body) {
		super();
		this.username = username;
		this.subject = subject;
		this.body = body;
	}

	public String getusername() {
		return username;
	}

	public void setuserId(String username) {
		this.username = username;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
