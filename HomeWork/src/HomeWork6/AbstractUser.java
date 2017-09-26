package HomeWork6;

import java.util.Date;

public abstract class AbstractUser implements User {
	 String name;
	 Date regesterDate;
	
	
	
	public AbstractUser(String name, Date regesterDate) {
		super();
		this.name = name;
		this.regesterDate = regesterDate;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Date getRegesterDate() {
		return regesterDate;
	}



	public void setRegesterDate(Date regesterDate) {
		this.regesterDate = regesterDate;
	}

	

}
