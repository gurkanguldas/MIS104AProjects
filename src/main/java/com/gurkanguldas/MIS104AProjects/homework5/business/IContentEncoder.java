package com.gurkanguldas.MIS104AProjects.homework5.business;

// An interface for encryption algorithms.
public interface IContentEncoder 
{
	String encrypt(String secretMessage, String password);
}
