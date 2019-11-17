package strategyCalculator;

public class Context {

	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public int ExecuteStategy(int a, int b) {
		return strategy.DoOpertion(a, b);
	}
}
