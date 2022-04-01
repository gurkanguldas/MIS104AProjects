package com.gurkanguldas.MIS104AProjects.homework5.business.impl;

import com.gurkanguldas.MIS104AProjects.homework5.business.IContentEncoder;
import com.gurkanguldas.MIS104AProjects.homework5.data.EncodeDictionary;

public class MIS104Encoder implements IContentEncoder{

	private EncodeDictionary dictionary;
	private String encryptedMessage="";
	private boolean isClear = true;
	
	public MIS104Encoder(EncodeDictionary mis104Dictionary) 
	{
		dictionary = mis104Dictionary;
	}

	//Recursive Method
	@Override
	public String encrypt(String secretMessage, String password) 
	{
		// The loop's iteration value is determined by the first 
		// digit of the password.
		String pass = password.substring(0,1);
		
		// The decryptedMessage must be cleared when the algorithm 
		// is run multiple times.
		encryptedMessage = isClear ? "" : encryptedMessage;

		//Condition of recursive.
		if(secretMessage.length() > 0)
		{
			isClear = false;
			
			// Encrypted character.
			char encryptedChar = secretMessage.charAt(0);
			
			// The loop's iteration value.
			int iterate = Integer.valueOf(pass);
			
			// Encryption algorithm.
			for(int i = 0; i < iterate; i++)
				encryptedChar = dictionary.getValue(encryptedChar);
			
			// Encrypted character add.
			encryptedMessage += encryptedChar;
			
			// The encrypted character of the secret message is deleted and 
			// the initial value of the password is moved to the end.	
			return encrypt(secretMessage.substring(1), password.substring(1) + pass);
		}
		
		isClear = true;
		
		return encryptedMessage;
	}
}