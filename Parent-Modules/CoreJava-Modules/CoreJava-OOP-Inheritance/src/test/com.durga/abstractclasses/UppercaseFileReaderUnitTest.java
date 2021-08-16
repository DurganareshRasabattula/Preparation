package abstractclasses;

import abstractclasses_filereaders.BaseFileReader;
import abstractclasses_filereaders.UppercaseFileReader;
import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author durga on 8/11/2021
 */
public class UppercaseFileReaderUnitTest {
    @Test
    public void givenUppercaseFileReaderInstance_whenCalledreadFile_thenCorrect() throws Exception {
        Path path = Paths.get(getClass().getClassLoader().getResource("files/test.txt").toURI());
        BaseFileReader uppercaseFileReader = new UppercaseFileReader(path);

        assertThat(uppercaseFileReader.readFile()).isInstanceOf(List.class);
    }
}
