package it.bologna.emanuele.domain;

public class Twit {

	int id;
	String userID;
	String text;

	public Twit(String userId, String text) {
		this.userID = userId;
		this.text = text;
	}
	
	public int getId() {
		return id;
	}

	public String getUserId() {
		return userID;
	}

	public String getText() {
		return text;
	}

}
