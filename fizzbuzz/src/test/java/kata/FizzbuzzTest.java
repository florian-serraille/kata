package kata;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class FizzbuzzTest {
	
	@ParameterizedTest
	@DisplayName("Deve retornar o numero")
	@ValueSource(ints = { 1, 2, 4, 8 })
	void numero(int i) {
		var fizBuzz = new FizzBuzz();
		Assertions.assertThat(fizBuzz.of(i))
		          .isEqualTo(String.valueOf(i));
	}
	
	@ParameterizedTest
	@DisplayName("Números divisíveis por 3 deve aparecer como 'Fizz' ao invés do número")
	@ValueSource(ints = { 3, 6, 9 })
	void fizz(int i) {
		var fizBuzz = new FizzBuzz();
		Assertions.assertThat(fizBuzz.of(i))
		          .isEqualTo("Fizz");
	}
	
	@ParameterizedTest
	@DisplayName("Números divisíveis por 5 deve aparecer como 'Buzz' ao invés do número")
	@ValueSource(ints = { 5, 10 })
	void buzz(int i) {
		var fizBuzz = new FizzBuzz();
		Assertions.assertThat(fizBuzz.of(i))
		          .isEqualTo("Buzz");
	}
	
	@ParameterizedTest
	@DisplayName("Números divisíveis por 3 e 5 deve aparecer como 'FizzBuzz' ao invés do número")
	@ValueSource(ints = { 15, 30 })
	void fizzbuzz(int i) {
		var fizBuzz = new FizzBuzz();
		Assertions.assertThat(fizBuzz.of(i))
		          .isEqualTo("FizzBuzz");
	}
	
}