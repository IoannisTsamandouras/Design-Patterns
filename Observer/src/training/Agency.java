package training;

import java.util.ArrayList;
import java.util.List;

public class Agency {
	
	private String news;
	List<Channel> channels = new ArrayList<Channel>();
	
	public void addObserver(Channel channel) {
		this.channels.add(channel);
	}
	
	public void removeObserver(Channel channel) {
		this.channels.remove(channel);
	}
	
	public void setNews(String news) {
		this.news = news;
		for(Channel ch : channels) {
			ch.update(this.news);			
		}		
	}
}
