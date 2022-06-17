package kata;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.stream.IntStream;

class FizzbuzzPrinterTest {
	
	public static final int EXPECTED_INTERATIONS = 100;

	@Test
	@DisplayName("Deve retornar uma lista de 100 números")
	void list() {

		var printer = new FizzbuzzPrinter(new FizzBuzz());
		var fizzbuzz = printer.print();
		var linhas = fizzbuzz.split("\n");

		Assertions.assertThat(linhas)
		          .hasSize(EXPECTED_INTERATIONS);
	}

	@Test
	@DisplayName("Deve chamar FizzBuzz apenas uma vez para cada iteração")
	void  interact() {

		var mock = Mockito.mock(FizzBuzz.class);

		var printer = new FizzbuzzPrinter(mock);
		printer.print();
		
		IntStream.rangeClosed(1, EXPECTED_INTERATIONS)
				         .forEach(i -> Mockito.verify(mock)
				                              .of(i));
	}
}