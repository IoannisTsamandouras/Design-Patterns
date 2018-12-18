package training;

public class ElementVisitor implements Visitor {

	@Override
	public void visit(XmlElement xml) {
		System.out.println("processing element with uuid " + xml.uuid);				
	}

	@Override
	public void visit(JsonElement json) {
		System.out.println("processing element with uuid " + json.uuid);		
	}

}
