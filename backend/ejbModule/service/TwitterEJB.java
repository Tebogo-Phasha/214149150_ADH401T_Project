package service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.TwitterEntity;


@Stateless
@LocalBean
public class TwitterEJB {

	@PersistenceContext
	private EntityManager em;
    public TwitterEJB() {
        //TODO Auto-generated constructor stub
   }
    
    public void addTweet(TwitterEntity twitterEntity) {
    	
    	em.persist(twitterEntity);
    }
    

	
}
