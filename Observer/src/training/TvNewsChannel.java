package training;

import java.util.Observable;
import java.util.Observer;

/*
 * Implementation with the Java core Observer interface 
 */

public class TvNewsChannel implements Observer {
	
	private String news;

	@Override
	public void update(Observable obs, Object obj) {
		this.setNews((String)obj);		
	}

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
	}	

}
