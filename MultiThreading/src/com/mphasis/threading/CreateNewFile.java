package com.mphasis.threading;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CreateNewFile {
	static void createFileUsingFileClass() throws IOException
	{
		File file=new File("D:\\mphasis Data\\phase1\\testfile.txt");
		
		//create the file
		if(file.createNewFile())
			System.out.println("File is created");
		else
			System.out.println("File already Exist");
		//write data to file
		
		FileWriter writer=new FileWriter(file);
		writer.write("welcome to File Handling");
		writer.close();
		
	}
	//create file using FileOutputStream class
	static void createFileUsingOutputStream() throws IOException
	
		{
			FileOutputStream out=new FileOutputStream("D:\\mphasis Data\\phase1\\testfile1.txt");
					String data="Welcome to the world of JAVA File handling";
					out.write(data.getBytes());
					out.close();
		}
	//create file using NIO

	
	public static void main(String[] args) {
		
	
		
		try{
			//createfilesusingclass();
			//createfileusingoutputstream();		
			createFileUsingFileClass();
	}
	catch(IOException e)
	{
		System.out.println(e);
		
		
	}
	}
}
