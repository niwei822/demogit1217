package readwritefile;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Entry {

	public static void main(String[] args) throws Exception  {
		//1. First you will goto location 2. you will open the file 3. Read line by line
		System.out.println(System.getProperty("user.dir")+"/Nov2020.txt");
		String sPath = System.getProperty("user.dir")+"/Nov2020.txt"; 
		readFile(sPath);
		//String sFilePathToWrite = "/Users/new/eclipse-workspace/readwritefile/src/readwritefile/abc.txt";
		//writeFile(sFilePathToWrite);
		//loadingProperitiesFile();
	}
	
	/*public static void loadingProperitiesFile() throws Exception {
		FileInputStream oFIS = new FileInputStream(System.getProperty("user.dir")+"/environment.properties");
		//Load the file as property. Set to this key values to your run time properties. Then you can get that properties
		Properties oPR = new Properties();
		oPR.load(oFIS);
		System.getProperties().putAll(oPR);
		System.out.println(System.getProperty("username"));
		System.out.println(System.getProperty("FileWritingPath"));
		System.out.println(System.getProperty("password"));
		System.out.println(System.getProperty("xyz"));
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("os.name"));
	}*/
	
	/*public static void writeFile(String sPath) throws Exception {
		//1. First you will go to location 2. you will open it 3. write it
		BufferedWriter oBW = null;
		try {
		FileWriter oFW = new FileWriter(sPath, true);
		 oBW = new BufferedWriter(oFW);
		oBW.newLine();oBW.newLine();
		oBW.write("Hello team,");
		oBW.newLine();oBW.newLine();
		oBW.write("\t How are you doing all?");
		oBW.newLine();oBW.newLine();
		oBW.write("Thanks and Regards");
		oBW.newLine();
		oBW.write("Srinidhi.B");
		//oBW.close();
		}catch(Exception a) {
			System.out.println("Exception  : "+a);
			
		}finally {
			oBW.close();
		}
		
	}*/
	public static void readFile(String sPath) throws Exception {
		String sLine;
		FileReader oFR = new FileReader(sPath);
		BufferedReader oBR = new BufferedReader(oFR);
		
		while((sLine = oBR.readLine()) != null){
			System.out.println(sLine);
		}

	}
}
