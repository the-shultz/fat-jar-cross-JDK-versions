package puk.team.fatjar.dep2;

import org.apache.commons.io.FileUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class StringToFileProducer {

    public void deletePathWhatsoever(Path p) {

        try {
            if (Files.exists(p)) {
                if (Files.isDirectory(p)) {
                    FileUtils.deleteDirectory(p.toFile());
                } else {
                    Files.delete(p);
                }
            }
        } catch (IOException e) {
            System.out.println("error when deleting path at: " + p + " Reason: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void createFileWithDirectories(Path fullPath, String fileContent) {
        try {
            FileUtils.writeStringToFile(fullPath.toFile(), fileContent, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readFileContent(Path fullPath) {
        try {
            byte[] bytes = Files.readAllBytes(fullPath);
            return new String(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
