package training;

public class TextFileApplication {
	
	public static void main(String[] args) {
		TextFileOperation open = new OpenTextFile(new TextFile("file.txt"));
		TextFileOperation save = new SaveTextFile(new TextFile("file1.txt"));
		TextFileExecutor exe = new TextFileExecutor();
		System.out.println(exe.executeOperation(open));
		System.out.println(exe.executeOperation(save));
	}

}
