package application;

import strategyCalculator.Context;
import strategyCalculator.OperationMult;
import strategyCalculator.OperationSubt;
import strategyCalculator.OperationSum;

public class ApplicationDemo {

	public static void main(String[] args) {

		int a = 10;
		int b = 7;
		
		Context calculatorContext = new Context(new OperationSum());
		int result = calculatorContext.ExecuteStategy(a, b);
		System.out.println(result);
		calculatorContext = new Context(new OperationMult());
		result = calculatorContext.ExecuteStategy(a, b);
		System.out.println(result);
		calculatorContext = new Context(new OperationSubt());
		result = calculatorContext.ExecuteStategy(a, b);
		System.out.println(result);

	}

}
