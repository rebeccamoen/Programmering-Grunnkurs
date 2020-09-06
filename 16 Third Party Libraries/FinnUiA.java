import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import twitter4j.GeoLocation;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class FinnUiA extends JFrame {
	public FinnUiA(){
		JTextArea tekst = new JTextArea();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.add(tekst);
		this.setVisible(true);
		
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setOAuthConsumerKey("xMHpFFhCUgiffiUTf1RlZQ");
		cb.setOAuthConsumerSecret("LnrvRmG6VuxZpB0mVq4IzAd0Zj0QBnjwOwTk5oQVUs8");			
		cb.setOAuthAccessToken("1057306374-mukHk9K2JWnCJdxVduijZG6azHZ9qpJZi7CxIY3");
		cb.setOAuthAccessTokenSecret("dM7pot5bGf30EqDJjQtCi4pAXkRbIitpyVnFNpISQL4");
		
		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter twitter = tf.getInstance();
		
		Query query = new Query();
		GeoLocation geo = new GeoLocation(58.3405000, 8.5934300);
		query.setGeoCode(geo, 100.0, Query.KILOMETERS);
		try {
			QueryResult result = twitter.search(query);
			for(Status tweet:result.getTweets()){
				tekst.setText(tekst.getText() + tweet.getUser().getName()+ ": " + tweet.getText() + "\n" + "\n");
			}
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
