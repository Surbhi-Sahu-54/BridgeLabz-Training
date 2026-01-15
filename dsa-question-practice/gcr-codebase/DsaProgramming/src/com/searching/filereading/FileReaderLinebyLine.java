package com.searching.filereading;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderLinebyLine {
	public static void main(String [] args) {
		String filePath="src/com/Searching/FileReading/sample.txt";
		
		try(BufferedReader br=new BufferedReader(new FileReader(filePath))){
			String Line;
			while((Line=br.readLine())!=null) {
				System.out.println(Line);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
