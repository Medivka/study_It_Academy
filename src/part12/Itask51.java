package part12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public interface Itask51 {

    default void CreateNewFIle(String Package, String NameFile) {
        File file = new File(Package, NameFile);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    default  void AllPersonInFile(String File,String person){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(File, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fileWriter.write(person);
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
}
