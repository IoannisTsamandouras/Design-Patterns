package training;

public class SaveTextFile implements TextFileOperation {
	
	private final TextFile textFile;
	
	public SaveTextFile(TextFile textFile) {
		this.textFile = textFile;		
	}

	@Override
	public String execute() {
		return textFile.save();
	}

}
