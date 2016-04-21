package it.bologna.emanuele.dao;

import java.util.List;

import it.bologna.emanuele.domain.Twit;

public interface TwitDAO {
     
    public List<Twit> getAllById(int id);
    
}