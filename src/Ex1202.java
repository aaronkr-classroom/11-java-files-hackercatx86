import java.io.File;

public class Ex1202 {

	public static void main(String[] args) {
		
		File fileObj = new File("src\\Ex1201.java");
		
		if (fileObj.exists()) {
			System.out.println("File name: " + fileObj.getName());
			System.out.println("File path: " + fileObj.getAbsolutePath());
			System.out.println("Write file: " + fileObj.canWrite());
			System.out.println("Read file: " + fileObj.canRead());
			System.out.println("File Length: " + fileObj.length());
		}
		else {
			System.out.println("File doesn't exist");
		}

	}

}