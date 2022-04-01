package com.gurkanguldas.MIS104AProjects.homework5.business.factories;

import java.io.IOException;

import com.gurkanguldas.MIS104AProjects.homework5.business.EncoderFacade;
import com.gurkanguldas.MIS104AProjects.homework5.business.impl.MIS104Decoder;
import com.gurkanguldas.MIS104AProjects.homework5.business.impl.MIS104Encoder;
import com.gurkanguldas.MIS104AProjects.homework5.data.EncodeDictionary;
import com.gurkanguldas.MIS104AProjects.homework5.data.MIS104Dictionary;

/*
 * The factory design pattern is used to facilitate the selection 
 * of encryption algorithms..
 */
public class EncoderFactory
{
	public static int MIS104 = 1;
	
	public static EncoderFacade getEncode(int algorith) throws IOException
	{
		EncoderFacade encoderFacade = new EncoderFacade();
		EncodeDictionary encodeDictionary;
		
		// MIS104 Algorithm
		if(algorith == 1)
		{
			encodeDictionary = new MIS104Dictionary();
			
			encoderFacade.setEncoder(new MIS104Encoder(encodeDictionary));
			encoderFacade.setDecoder(new MIS104Decoder(encodeDictionary));
			
			return encoderFacade;
		}
		// Other Algorithms
		// ...
		
		return null;
	}
}
