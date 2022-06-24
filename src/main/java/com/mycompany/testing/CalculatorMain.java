package com.mycompany.testing;

import com.mycompany.controller.CalculatorController;

public class CalculatorMain {

	public static void main(String[] args) {
		
		CalculatorController controller = new CalculatorController();
        Double result = controller.add(45.6, 78.9);
        
        System.out.println("Result of addition:"+result);
	}

}
