package it.bologna.emanuele.dao;

public interface FollowerDAO {

	public void follow(int userId, int followingId);

	public void unfollow(int userId, int followingId);

}
