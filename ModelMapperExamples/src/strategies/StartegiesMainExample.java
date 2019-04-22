package strategies;

import strategies.loose.LooseStrategyExample;
import strategies.standard.StandardStrategyExample;
import strategies.strict.StrictStrategyExample;

public class StartegiesMainExample {

	public static void main(String[] args) {
		
		IExample looseStartegy = new LooseStrategyExample();
		IExample standardStartegy = new StandardStrategyExample();
		IExample strictStartegy = new StrictStrategyExample();
		
		System.out.println("################## Loose Startegy ##################");
		looseStartegy.executeExample();
		System.out.println("");
		System.out.println("");
		
		System.out.println("################## Standard Startegy ##################");
		standardStartegy.executeExample();
		System.out.println("");
		System.out.println("");
		
		System.out.println("################## Strict Startegy ##################");
		strictStartegy.executeExample();
		System.out.println("");
		System.out.println("");
	}

}
