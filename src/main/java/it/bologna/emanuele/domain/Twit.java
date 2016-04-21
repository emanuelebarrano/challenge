package it.bologna.emanuele.domain;

public class Twit {

	int id;
	int userID;
	String text;

	public Twit(int id, int userId, String text) {
		this.id =id;
		this.userID = userId;
		this.text = text;
	}
	
	public int getId() {
		return id;
	}

	public int getUserId() {
		return userID;
	}

	public String getText() {
		return text;
	}

}
