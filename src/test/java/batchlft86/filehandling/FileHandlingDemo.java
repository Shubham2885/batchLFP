package batchlft86.filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;

enum EFileNames{
	TXT_FILE_NAME("AddressBookText.txt"),
	JSON_FILE_NAME("AddressBookTest.json");
	
	final String fileName;
	
	private EFileNames(String fileName) {
		this.fileName = fileName;
	}
	
	public String getConstant() {
		return fileName;
	}
}

public class FileHandlingDemo {
	
	public static void main(String[] args) {
		File txtFile = new File(EFileNames.TXT_FILE_NAME.getConstant());
		File jsonFile = new File(EFileNames.JSON_FILE_NAME.getConstant());
		try {
			if(txtFile.createNewFile()) {
				System.out.println("new file is created");
			}else {
				System.out.println("file is exist");
			}
			
//			writeTxtData(txtFile, getListOfContacts().toString());
//			writeJsonData(jsonFile, getListOfContacts());
			
			readTxtData(txtFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static List<Contact> getListOfContacts() {
		List<Contact> contacts = new ArrayList<Contact>();
		contacts.add(new Contact("SHubham", "239742347"));
		contacts.add(new Contact("Rahul", "5856742347"));
		contacts.add(new Contact("Nitish", "569742347"));
		contacts.add(new Contact("Mayur", "3549742347"));
		
		return contacts;
	}
	
	public static void writeTxtData(File file, String data) {
		try {
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(data);
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeJsonData(File file, List<Contact> contacts) {
		try {
			
			Gson gson = new Gson();
			String jsonString = gson.toJson(contacts);
			System.out.println("JsonString :: "+jsonString);
			
			FileWriter fileWriter = new FileWriter(file);
			
			fileWriter.write(jsonString);
			System.out.println("Json Data written");
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void readTxtData(File file) {
		try {
			FileReader fileReader = new FileReader(file);
			
			Scanner scanner = new Scanner(fileReader);
			
			System.out.println("Reading operation ::");
			System.out.println(scanner.nextLine());
			
			fileReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
