package model;

import java.util.ArrayList;

public abstract class Cancer
{
	private double Type;
	private ArrayList<String> cause;
	private boolean isCureable;
	
	
	public double getType()
	{
		return Type;
	}
	public void setType(double type)
	{
		Type = type;
	}
	public ArrayList<String> getCause()
	{
		return cause;
	}
	public void setCause(ArrayList<String> cause)
	{
		this.cause = cause;
	}
	public boolean isCureable()
	{
		return isCureable;
	}
	public void setCureable(boolean isCureable)
	{
		this.isCureable = isCureable;
	}
	
}
