package strategyCalculator;

public class OperationDiv implements Strategy {

	@Override
	public int DoOpertion(int a, int b) {

		if (b == 0) throw new IllegalArgumentException("El divisor es 0");
		return a / b;
	}
}
