package controller;


import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.TwitterObj;
import service.TwitterEJB;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

@ManagedBean(name = "twitterController")
@SessionScoped

public class TwitterController {

	@EJB
	private TwitterEJB twitterService;
	
	
	@ManagedProperty(value = "#{twitterObj}")
	private TwitterObj twitter;

	
	
	public void addTweet() {
		twitterService.addTweet(twitter.getEntity());
		
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
		.setOAuthConsumerKey("H7XYmsSYn043XIXXQSxeUylu9 ")
		.setOAuthConsumerSecret("7HKrN0Np3psDlUWbOXI7Nh8MHcZqc5vroRJmNTw0fjGDSpnQpH ")
		.setOAuthAccessToken("1187015441153167360-N2ZCYlp9iigysLgZrU7AmTdISDx9ut ")
		.setOAuthAccessTokenSecret("Dfdv9mw0lulaLz1eUoUFppNfNuML7W4MRd4uemSelGXz0");
		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter twit = (Twitter) tf.getInstance();
		
		try {
			twit.updateStatus(twitterObj.getTweetMsg());
		} catch (TwitterException e) {
			
			e.printStackTrace();
		}
		
		
	}
	


	public TwitterObj getTwitterController() {
		return twitter;
	}


	public void setTwitterController(TwitterObj twitter) {
		this.twitter = twitter;
	}
	
	   
    @GET
    @Path("/twitter")
    @Produces(MediaType.APPLICATION_XML)
    public TwitterObj getAllTweets()
    {
    TwitterObj list = new TwitterObj();
    list.getTweetMsg();

    return list;
    }
}
