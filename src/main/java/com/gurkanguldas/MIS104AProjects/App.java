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
        
        String secretMessage = encoder.getEncoder().encrypt("This i", "10235");
        String decodeMessage = encoder.getDecoder().decrypt("NhVjN9", "10235");
        
        System.out.println(secretMessage);
        System.out.println(decodeMessage);
       
        
    }
}
