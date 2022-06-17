package kata;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzbuzzPrinter {
	
	private static final String NEW_LINE = "\n";
	private static final int START_ITERATION = 1;
	private static final int END_ITERATION = 100;
	
	private final FizzBuzz fizzbuzz;
	
	public FizzbuzzPrinter(final FizzBuzz fizzbuzz) {
		this.fizzbuzz = fizzbuzz;
	}
	
	public String print() {
		return IntStream.rangeClosed(START_ITERATION, END_ITERATION)
		                .mapToObj(fizzbuzz::of)
		                .collect(Collectors.joining(NEW_LINE));
	}
	
}