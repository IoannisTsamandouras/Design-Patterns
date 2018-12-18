package training;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class RadioNewsAgency {
	
	private String news;	
	private PropertyChangeSupport pcs;
	
	public RadioNewsAgency() {
		pcs = new PropertyChangeSupport(this);
	}
	
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		pcs.addPropertyChangeListener(listener);
	}
	
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		pcs.removePropertyChangeListener(listener);
	}
	
	public void setNews(String newValue) {
		pcs.firePropertyChange("news", this.news, newValue);
		this.news = newValue;
	}
}
