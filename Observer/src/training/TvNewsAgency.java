package training;

import java.util.Observable;
import java.util.Scanner;

public class TvNewsAgency extends Observable {
	private String news;
	
	public void setNews(String news) {
		this.news = news;
		setChanged();
		notifyObservers(news);
	}
		
}
