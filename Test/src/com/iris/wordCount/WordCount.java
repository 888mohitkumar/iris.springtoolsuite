package com.iris.wordCount;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordCount {

	public static void main(String[] args) throws IOException {
		
		
	    int countWord = 0; 
	    int sentenceCount = 0; 
	    int characterCount = 0; 
	    int paragraphCount = 1; 
	    int whitespaceCount = 0;
	    int ramcount =0;
    
		String line ;
		File file = new File("D://abc.txt");
		FileInputStream  fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		//line = br.readLine();
		while((line = br.readLine())!=null)
		{
			if(line.equals(""))
			{
				paragraphCount++;
				continue;
			}
			characterCount = characterCount + line.length();
			String[] split = line.split(" ");
			for(String str : split)
			{
				if(str.equals("ram"))
				{
					ramcount++;
				}
			}
			countWord = countWord + split.length;
			whitespaceCount += countWord-1;
			String[] split2 = line.split("[!?.:]+");
			sentenceCount += split2.length;
		}
		
	    System.out.println("Total word count = " + countWord); 
        System.out.println("Total number of sentences = " + sentenceCount); 
        System.out.println("Total number of characters = " + characterCount); 
        System.out.println("Number of paragraphs = " + paragraphCount); 
        System.out.println("Total number of whitespaces = " + whitespaceCount); 	
        System.out.println("Total number of ramcount = " + ramcount); 
	}

}
