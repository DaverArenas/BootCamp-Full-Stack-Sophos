package bankaccountapp;

public interface IRate {
	
	// Write a methods that returns the base rate
	default double getBaseRate() {
		return 2.5;
	}

}
