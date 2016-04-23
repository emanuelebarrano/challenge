package it.bologna.emanuele.dao;

public interface FollowerDAO {

	public int follow(int userId, int followingId);

	public int unfollow(int userId, int followingId);

}
