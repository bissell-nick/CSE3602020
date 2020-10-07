package cse360assignment02;

public class AddingMachine {
  private int total;
  private String history;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    history = "0";
  }
  
  public int getTotal () {//returns current total
    return total;
  }
  
  public void add (int value) { //adds parameter to total
	  total = total + value;
	 history = history.concat(" + " + value);
  }

  public void subtract (int value) { //subtracts paramater from total
	  total = total - value;
	  history = history.concat(" - " + value);
  }

  public String toString () {//returns history of transactions
    return history;
  }

  public void clear() {//clears the adding machine
	  total = 0;
	  history = "0";
  }
}

