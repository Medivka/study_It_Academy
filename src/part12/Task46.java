package part12;

import java.io.File;
import java.io.FileFilter;


public class Task46 {
    public static void main(String[] args) {
        File[] paths = new File("D:\\Sacuta0\\").listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        });
               for (File path: paths){
                   System.out.println(path.getAbsolutePath());
               }System.out.println("\n");
               File[] paths2 = new File("D:\\Sacuta0\\").listFiles(new FileFilter() {
                   @Override
                   public boolean accept(File name) {
                       return name.isFile();
                   }
               });

               for (File path: paths2){
                   System.out.println(path.getAbsolutePath());
               }

    }
}
