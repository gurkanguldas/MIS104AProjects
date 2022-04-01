package com.gurkanguldas.MIS104AProjects.homework5.business;

// An interface for decryption algorithms.
public interface IContentDecoder 
{
	String decrypt(String secretMessage, String password);
}
