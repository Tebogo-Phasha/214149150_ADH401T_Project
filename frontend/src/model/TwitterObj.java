package model;
import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name = "twitterObj")
@SessionScoped

public class TwitterObj implements Serializable {

	private static final long serialVersionUID = 1L;
	private String tweetMsg;
	private int tweetID;
	private Date timeStamp;

	
	
	public String getTweetMsg() {
		return tweetMsg;
	}
	public void setTweetMsg(String tweetMsg) {
		this.tweetMsg = tweetMsg;
	}

	
	public int getTweetID() {
		return tweetID;
	}
	public void setTweetID(int tweetID) {
		this.tweetID = tweetID;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public TwitterEntity getEntity() {
		TwitterEntity twitterEntity = new TwitterEntity();
		twitterEntity.setTweetMsg(tweetMsg);
		twitterEntity.setTweetID(tweetID);
		twitterEntity.setTimpeStamp(timeStamp);
		return twitterEntity;
		
	} 
	
}
