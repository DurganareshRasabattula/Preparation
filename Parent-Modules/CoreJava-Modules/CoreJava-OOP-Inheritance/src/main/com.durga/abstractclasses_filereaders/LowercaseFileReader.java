package abstractclasses_filereaders;

import java.nio.file.Path;

/**
 * @author durga on 8/11/2021
 */
public class LowercaseFileReader extends BaseFileReader{
    public LowercaseFileReader(Path filePath) {
        super(filePath);
    }

    @Override
    public String mapFileLine(String line) {
        return line.toLowerCase();
    }
}
