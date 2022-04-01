package com.gurkanguldas.MIS104AProjects.homework5.business.impl;

import com.gurkanguldas.MIS104AProjects.homework5.business.IContentDecoder;
import com.gurkanguldas.MIS104AProjects.homework5.data.EncodeDictionary;

public class MIS104Decoder implements IContentDecoder
{
	private EncodeDictionary dictionary;
	private String decryptedMessage="";
	private boolean isClear = true;
	
	public MIS104Decoder(EncodeDictionary eDictionary) 
	{
		dictionary = eDictionary;
	}
	
	//Recursive Method
	@Override
	public String decrypt(String secretMessage, String password) 
	{
		// The loop's iteration value is determined by the first 
		// digit of the password.
		String pass = password.substring(0,1);
		
		// The decryptedMessage must be cleared when the algorithm 
		// is run multiple times.
		decryptedMessage = isClear ? "" : decryptedMessage;
		
		//Condition of recursive.
		if(secretMessage.length() > 0)
		{
			isClear = false;
			
			// Decrypted character.
			char decryptedChar = secretMessage.charAt(0);
			
			// The loop's iteration value.
			int iterate = Integer.valueOf(pass);
			
			// Decryption algorithm.
			for(int i = 0; i < iterate; i++)
				decryptedChar = dictionary.getKey(decryptedChar);
			
			// Decrypted character add.
			decryptedMessage += decryptedChar;
			
			// The decrypted character of the secret message is deleted and 
			// the initial value of the password is moved to the end.
			return decrypt(secretMessage.substring(1), password.substring(1) + pass);
		}
		
		isClear = true;
		
		return decryptedMessage;
	}
}