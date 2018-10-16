import com.drew.imaging.*;
import com.drew.metadata.*;
import java.io.*;

public class ReadImageMetadata {
    public static void main(String[] args) throws IOException, ImageProcessingException {
        String path = " ";
        InputStream imageFile = new FileInputStream(path);
        Metadata metadata = ImageMetadataReader.readMetadata(imageFile);

        for (Directory directory : metadata.getDirectories()) {
            System.out.println("  directory=" + directory);
            for (Tag tag : directory.getTags()) {
                System.out.println("    tag=" + tag);
            }
        }
    }
}