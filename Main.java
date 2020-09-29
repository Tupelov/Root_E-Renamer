import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		Runtime rt = Runtime.getRuntime();
		File file = new File("./list.txt");
		Scanner scan = new Scanner(file);
		//System.out.println(scan.nextLine());
		ArrayList<String> list = new ArrayList<String>();
		while(scan.hasNextLine()) {
			list.add(scan.nextLine());
		}
		
		for(int i = 0;i<100;i++) {
			//System.out.println(list.get(i));
		}
		
		File directory = new File("./ROOT_E");
		
		System.out.println(directory.isDirectory());
		
		File[] filesInside = directory.listFiles();
		
		File dir = new File("./output");
		dir.mkdir();
		//change to arraylist size when done testing
		for(int i=0;i< filesInside.length;i++) {
			File temp = filesInside[i];
			String name = temp.getName();
			//name = name.substring(name.length()-4);
			//System.out.println(name);
			File rename = new File("./output",list.get(i)+".wav");
			temp.renameTo(rename);
		}
		
		Process p1= rt.exec("cmd /c start cmd.exe /K \"");
		System.out.println("Done!");
	}
}
