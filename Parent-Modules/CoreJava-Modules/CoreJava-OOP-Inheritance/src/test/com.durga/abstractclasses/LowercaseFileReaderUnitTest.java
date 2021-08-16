package abstractclasses;

import abstractclasses_filereaders.BaseFileReader;
import abstractclasses_filereaders.LowercaseFileReader;
import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author durga on 8/11/2021
 */
public class LowercaseFileReaderUnitTest {
    @Test
    public void givenLowercaseFileReaderInstance_whenCalledreadFile_thenCorrect() throws Exception {
        Path path = Paths.get(getClass().getClassLoader().getResource("files/test.txt").toURI());
        BaseFileReader lowercaseFileReader = new LowercaseFileReader(path);

        assertThat(lowercaseFileReader.readFile()).isInstanceOf(List.class);
    }
}
