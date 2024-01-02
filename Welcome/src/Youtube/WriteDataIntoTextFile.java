package Youtube;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw= new FileWriter("C:\\Users\\dell\\test123.txt");
        BufferedWriter bf=new BufferedWriter(fw);
        fw.write("New jump into file writing script");
        fw.write("New jump into file writing script1");
        fw.write("New write");
        
        System.out.println("Finished!!!.....");
        fw.close();
        
	}

}
