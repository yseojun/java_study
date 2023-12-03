package Exception;

public class Practice{
	public static void main(String[] args) {
		int numerator = 100, denominator = 0, result = 0;

		try
		{
			result = divide(numerator, denominator);
		}
		catch (ArithmeticException e)
		{
			System.err.println("[Error] " + e.getMessage());
			e.printStackTrace();
			return ; // 의도한대로 종료
		}
		System.out.println("[Result] " + result);
	}
	
	static int divide(int numerator, int denominator) {
		
		if (denominator == 0)
			throw new ArithmeticException("Divide by zero");
		return numerator / denominator;
	}
}
