package com.gurkanguldas.MIS104AProjects.homework5.data;

import java.io.IOException;
import java.util.ArrayList;

/*
 * It is intended to use a common class for the word table to be used in 
 * encryption and decryption algorithms. Since it would be costly to get 
 * the key from the value in the map, a special dictionary structure was 
 * created.
 */
public class EncodeDictionary
{
	
	private ArrayList<Character> key;
	private ArrayList<Character> value;

	public EncodeDictionary() throws IOException
	{
		key = new ArrayList<>();
		value = new ArrayList<>();
	}
	
	public void put(Character K, Character V)
	{
		key.add(K);
		value.add(V);
	}
	
	public Character getValue(Character K)
	{
		return value.get(key.indexOf(K));
	}
	
	public Character getKey(Character V)
	{
		return key.get(value.indexOf(V));
	}
	
	public ArrayList<Character> getKeyArray()
	{
		return key;
	}
	
	public ArrayList<Character> getValueArray()
	{
		return value;
	}
	
	public int size()
	{
		return key.size();
	}
}
