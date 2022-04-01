package com.gurkanguldas.MIS104AProjects;

import java.io.IOException;

import com.gurkanguldas.MIS104AProjects.homework5.business.EncoderFacade;
import com.gurkanguldas.MIS104AProjects.homework5.business.factories.EncoderFactory;

/**
 *                     MIS104 Encryption Algorithm
 * 
 * The purpose of the project is to encrypt and decrypt data. The algorithm
 * encrypts the message using the message and key received from the user. 
 * Likewise, it ensures that the encrypted message is decrypted with the 
 * required password. While developing the project, OOP fundamentals were 
 * taken into account and SOLID principles were applied. Various design 
 * patterns are used to facilitate use and development.
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        EncoderFacade encoder = EncoderFactory.getEncode(EncoderFactory.MIS104);
        
        /******************************** Input Samples *****************************/
        String secretMessage = encoder.getEncoder().encrypt("This is MIS104 final exam program.", "12345");
        String decodeMessage = encoder.getDecoder().decrypt(secretMessage, "12345");
        
        System.out.println("Input     : This is MIS104 final exam program. \n"+
        				   "Output    : "+secretMessage+"\n"+
        				   "Validation: "+decodeMessage+"\n");
        
        secretMessage = encoder.getEncoder().encrypt("In this project, I used object-oriented Java programming language.", "12345");
        decodeMessage = encoder.getDecoder().decrypt(secretMessage, "12345");
        
        System.out.println("Input     : In this project, I used object-oriented Java programming language.\n"+
        				   "Output    : "+secretMessage+"\n"+
        				   "Validation: "+decodeMessage+"\n");
        /****************************************************************************/
        
        /******************************* Output Samples *****************************/
        decodeMessage = encoder.getDecoder().decrypt("I can use this program for secure communication with my friends.", "12345");
        secretMessage = encoder.getEncoder().encrypt(decodeMessage, "12345");
        
        System.out.println("Input     : "+decodeMessage+"\n"+
				   		   "Output    : I can use this program for secure communication with my friends.\n"+
				   		   "Validation: "+secretMessage+"\n");
        
        decodeMessage = encoder.getDecoder().decrypt("Key must be secret to protect data from unauthorized access.", "12345");
        secretMessage = encoder.getEncoder().encrypt(decodeMessage, "12345");
        
        System.out.println("Input     : "+decodeMessage+"\n"+
				   		   "Output    : Key must be secret to protect data from unauthorized access.\n"+
				   		   "Validation: "+secretMessage+"\n");
        /****************************************************************************/
       
        
    }
}
