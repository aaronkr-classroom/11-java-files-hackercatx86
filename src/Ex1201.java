import java.io.File;
import java.io.IOException;

public class Ex1201 {

	public static void main(String[] args) {
		
		File fileObj = new File("example01.txt");
		
		try {
			boolean success = fileObj.createNewFile();
			
			if (success) {
				System.out.println("Success to create new file!");
			}
			else {
				System.out.println("Fail to create new file!");
			}
			
		}
		catch(IOException e) {
			System.out.println(e);
		}

	}

}