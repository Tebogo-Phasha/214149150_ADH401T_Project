package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "TWITTER_TBL")
public class TwitterEntity {

	@Id
	@GeneratedValue( strategy=GenerationType.AUTO)
	private long  id;
	private int tweetID;
	private String tweetMsg;
	private Date timeStamp;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
	public Date getTimpeStamp() {
		return timeStamp;
	}
	public void setTimpeStamp(Date timpeStamp) {
		this.timeStamp = timpeStamp;
	}
	
	
}
