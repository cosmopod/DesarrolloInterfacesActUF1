package application;

import strategyCalculator.Context;
import strategyCalculator.OperationDiv;
import strategyCalculator.OperationMult;
import strategyCalculator.OperationSubt;
import strategyCalculator.OperationSum;

/**
 * @author paco
 *
 */
public class CalculatorPresenter {

	private Context context;

	public enum OperationType {
		Sum, Subs, Mult, Div,
	}

	public float Operation(float a, float b, OperationType operationType) {

		switch (operationType) {
		case Div:
			context = new Context(new OperationDiv());
			break;
		case Mult:
			context = new Context(new OperationMult());
			break;
		case Subs:
			context = new Context(new OperationSubt());
			break;
		case Sum:
			context = new Context(new OperationSum());
			break;
		}
		return context.ExecuteStategy(a, b);
	}
}
