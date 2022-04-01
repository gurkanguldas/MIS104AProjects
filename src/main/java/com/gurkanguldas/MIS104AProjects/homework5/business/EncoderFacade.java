package com.gurkanguldas.MIS104AProjects.homework5.business;

/*
 * The facade design pattern is used to hide the parts of the 
 * system from the client and make it easier to use.This class is 
 * also a POJO.
 */
public class EncoderFacade 
{
	private IContentEncoder encoder;
	private IContentDecoder decoder;
	
	public EncoderFacade()
	{
		// TODO Auto-generated method stub
	}
	
	public IContentEncoder getEncoder() 
	{
		return encoder;
	}
	
	public void setEncoder(IContentEncoder encoder) 
	{
		this.encoder = encoder;
	}
	
	public IContentDecoder getDecoder() 
	{
		return decoder;
	}
	
	public void setDecoder(IContentDecoder decoder) 
	{
		this.decoder = decoder;
	}

	@Override
	public String toString() 
	{
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
}
