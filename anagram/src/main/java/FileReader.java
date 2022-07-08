import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FileReader implements Dictionary{
	
	private final Path path;
	
	public FileReader(final Path path) {
		this.path = path;
	}
	
	@Override
	public List<String> getList() throws IOException {
		return Files.readAllLines(path)
		.stream()
		.map(cutWords())
		.flatMap(Collection::stream)
		.collect(Collectors.toList());
	}

	private Function<String, List<String>> cutWords() {
		return line -> Arrays.asList(line.split("\\s+"));
	}
}
