package training;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
	
	private String news;
	private List<Channel> channels = new ArrayList<>();
	
	public void addObserver(Channel channel) {
		this.channels.add(channel);
	}
	
	public void removeObserver(Channel channel) {
		this.channels.remove(channel);
	}
	
	public void setNews(String news) {
		this.news = news;
		for(Channel ch : this.channels) {
			ch.update(this.news);
 		}
	} 

}
