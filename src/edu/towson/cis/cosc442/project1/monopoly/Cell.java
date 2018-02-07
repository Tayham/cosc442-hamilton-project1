package edu.towson.cis.cosc442.project1.monopoly;

public abstract class Cell {
	protected boolean available = true;
	private String name;
	protected Player theOwner;

	public String getName() {
		return name;
	}

	public Player getTheOwner() {
		return theOwner;
	}
	
	public int getPrice() {
		return 0;
	}

	public abstract void playAction();

	void setName(String name) {
		this.name = name;
	}

	public void setTheOwner(Player theOwner) {
		this.theOwner = theOwner;
	}
    
    public String toString() {
        return name;
    }

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
}
