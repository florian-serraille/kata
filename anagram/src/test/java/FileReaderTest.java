import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;

class FileReaderTest {

	@Test
	@DisplayName("Deve retornar uma lista de palavras")
	void list() throws IOException {
		var lista = Arrays.asList("acrobat", "africa", "alaska", "alcohol", "alex", "alpha");
	    var reader = new FileReader(Path.of("src/test/resources/word_list.txt"));
        Assertions.assertThat(reader.getList())
        .containsExactlyElementsOf(lista);
	}
}