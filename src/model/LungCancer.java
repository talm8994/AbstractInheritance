package model;

import javax.swing.JOptionPane;

public class LungCancer extends CancerController implements Death
{
	 public LungCancer()
	 {
		 this.setType(9.9);
	 }

	@Override
	public String story()
	{
		return "breaking bab";
	}

	@Override
	public double chanceOfDeath()
	{
		return 98.9;
	}

	@Override
	public void memes()
	{
		String meme = " Walter White";
	}

	@Override
	public void spamTime(int spams)
	{
		for(int times = 0; times < spams; times++)
		{
			JOptionPane.showMessageDialog(null, "spam");
		}
		
	}

	@Override
	public void punch(int times)
	{
		for(int index = 0; index < times; index++)
		{
			JOptionPane.showMessageDialog(null, "punch");
		}
		
	}
}
