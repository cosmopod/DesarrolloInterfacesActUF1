package strategyCalculator;

public class Context {

	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public float ExecuteStategy(float a, float b) {
		return strategy.DoOpertion(a, b);
	}
}
