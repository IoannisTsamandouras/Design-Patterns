package training;

import java.util.ArrayList;
import java.util.List;

public class TextFileExecutor {
	
	private final List<TextFileOperation> textFileOperations = new ArrayList<>();
	
	public String executeOperation(TextFileOperation textFileOperation) {
		textFileOperations.add(textFileOperation);
		return textFileOperation.execute();
	}

}
