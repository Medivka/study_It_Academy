package part18;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

class   MyError implements ImyErrormassage{
    String errorMassage ="ERROR ERROR ERROR ERROR";
String file="D:/Task69.txt";

    @Override
    public void writemassage(LocalDateTime dateTime, String massage, String Path) {
        File file  =new File(Path);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileWriter fileWriter=null;
        try {
            fileWriter=new FileWriter(Path,false);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fileWriter.write(String.valueOf(dateTime)+" "+ massage);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
};
interface  ImyErrormassage{
    void writemassage(LocalDateTime dateTime,String massage, String path );
}
public class Task69 {
    public static void main(String[] args) {
        LocalDateTime localDateTime=LocalDateTime.now();
        MyError myError=new MyError();
        myError.writemassage(localDateTime, myError.errorMassage, myError.file);


    }
}
