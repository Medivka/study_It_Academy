package part12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public interface Itask50 {
    default void AllFilesInDirectory(String URLDirectory, String ENDFiles) {

        File myFolder = new File(URLDirectory);
        String[] files = myFolder.list();
        try (FileWriter filewriter = new FileWriter(URLDirectory + ENDFiles)) {
            for (String file : files) {
                filewriter.write(file+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    default void AllFilesInOneFiles(String URLfirstFiles, String URLEndFiles) {
        List<Path> inputs = Arrays.asList(Paths.get(URLfirstFiles));
        Path output = Paths.get(URLEndFiles);
        for (Path path : inputs) {
            List<String> lines = null;
            try {
                lines = Files.readAllLines(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                Files.write(output, lines, StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    default void CreatePacage(String Url, String FirstNamePackage, String InFirstPackage, String InSecondPackage) {
        Path path = Paths.get(Url + "\\" + FirstNamePackage + "\\" + InFirstPackage + "\\" + InSecondPackage);

        if (!Files.exists(path)) {
            try {
                Files.createDirectories(path);
            } catch (IOException e) {

                e.printStackTrace();
            }
        }

    }

    default void RandomNumberInFile(String Package, String Numbers) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(Package);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fileWriter.write(Numbers);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    default void CreateNewFIle(String Package, String NameFile) {
        File file = new File(Package, NameFile);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
