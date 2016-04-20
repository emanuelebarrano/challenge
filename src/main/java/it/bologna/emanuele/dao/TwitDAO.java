package it.bologna.emanuele.dao;

import java.util.List;

import it.bologna.emanuele.domain.Twit;

public interface TwitDAO {
     
    public void save(Twit employee);
    //Read
    public Twit getById(int id);
    //Update
    public void update(Twit employee);
    //Delete
    public void deleteById(int id);
    //Get All
    public List<Twit> getAll();
}