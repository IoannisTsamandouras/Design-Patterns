package training;

public class OpenTextFile implements TextFileOperation {

	private final TextFile textFile;
	
	public OpenTextFile(TextFile textFile) {
		this.textFile = textFile;	
	}
	
	@Override
	public String execute() {
		return textFile.open();
	}	

}
