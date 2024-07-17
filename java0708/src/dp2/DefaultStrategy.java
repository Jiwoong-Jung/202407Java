package dp2;

public class DefaultStrategy implements PayCalculationStrategy {

	@Override
	public int getPay(int workHours, int overtimeHours) {
		return 10*workHours+15*overtimeHours;
	}

}
