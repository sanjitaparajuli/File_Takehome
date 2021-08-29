package filesExtension;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderHomeworkProject {
	
	public static void main(String[] args) {
		
File file = new File("C:\\File Ext.txt");
Scanner scan = null;
	try {
		scan = new Scanner(file);
	
	} 
	catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	while (scan.hasNext()) {
		String line = scan.nextLine();
		if(null != line && line.length() > 0) {
		String[] x = line.split("-");
		String key = x[0];
		System.out.println(key);
		if (null != x[1] && x[1].contains(",")) {
			String[] y = x[1].split(",");
			for (int i = 0; i < y.length; i++) {
				System.out.println(y[i].trim());
			}
				
		} else {
					System.out.println(x[1].trim());
				}
			}
		}
	}
}	
