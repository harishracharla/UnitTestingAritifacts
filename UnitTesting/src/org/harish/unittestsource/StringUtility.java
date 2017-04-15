package org.harish.unittestsource;

public class StringUtility {
	
	public boolean checkUsername(String userName)
	{
		synchronized (this) {
		try {
			Thread.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(userName.equals("harish"))
			return true;
		else 
			return false;
	}
		
	}

}
