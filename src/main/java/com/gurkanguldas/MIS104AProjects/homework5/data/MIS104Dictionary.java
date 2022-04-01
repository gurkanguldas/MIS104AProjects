package com.gurkanguldas.MIS104AProjects.homework5.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Word table for the MIS104 algorithm.
public class MIS104Dictionary extends EncodeDictionary
{
	private BufferedReader reader;
	
	public MIS104Dictionary() throws IOException
	{
		super();
		reader = new BufferedReader(new FileReader("EncodeDictionary.csv"));
		
		String line;
		
		while((line = reader.readLine()) != null)
		{
			String lineSplit[] = line.split("\t",0);
			put(lineSplit[0].charAt(0), lineSplit[1].charAt(0));
		}
	}
}
