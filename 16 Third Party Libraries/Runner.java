
import twitter4j.GeoLocation;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setOAuthConsumerKey("xMHpFFhCUgiffiUTf1RlZQ");
		cb.setOAuthConsumerSecret("LnrvRmG6VuxZpB0mVq4IzAd0Zj0QBnjwOwTk5oQVUs8");			
		cb.setOAuthAccessToken("1057306374-mukHk9K2JWnCJdxVduijZG6azHZ9qpJZi7CxIY3");
		cb.setOAuthAccessTokenSecret("dM7pot5bGf30EqDJjQtCi4pAXkRbIitpyVnFNpISQL4");
		
		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter twitter = tf.getInstance();
		
		Query query = new Query("#dat101");
		query.setLang("no");
		query.setSince("2015-01-28");
		query.setUntil("2016-03-05");
		GeoLocation geo = new GeoLocation(58.34,8.59);
		
		try {
			twitter.updateStatus("I #dat101 lærer vi automatisk kvitring #uia");
		} catch (TwitterException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			QueryResult resultat = twitter.search(query);
			for(Status s:resultat.getTweets()){
				System.out.println(s.getUser().getName() + ": " + s.getText());
			}
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FinnUiA g = new FinnUiA ();
		
	}

}
