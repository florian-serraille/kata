package kata;

public class FizzBuzz {
	
	public static final String FIZZ = "Fizz";
	public static final String BUZZ = "Buzz";
	
	public String of(final int i) {
		
		if (isFizz(i) && isBuzz(i)) {
			return FIZZ + BUZZ;
		}
		
		if (isFizz(i)) {
			return FIZZ;
		}
		
		if (isBuzz(i)) {
			return BUZZ;
		}
		
		return String.valueOf(i);
	}
	
	private static boolean isFizz(final int i) {
		return i % 3 == 0;
	}
	
	private static boolean isBuzz(final int i) {
		return i % 5 == 0;
	}
}
