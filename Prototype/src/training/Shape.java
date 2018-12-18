package training;

public abstract class Shape implements Cloneable {
	private Integer id;
	protected String type;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public Object clone() {
		Object clone = null;
		
		try {
			clone = super.clone();
		} catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return clone;
	}
	
	public abstract void draw();
}
