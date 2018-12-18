package training;

public interface Visitor {
	public abstract void visit(XmlElement xml);
	public abstract void visit(JsonElement json);	
}
