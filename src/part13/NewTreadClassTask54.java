package part13;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

class NewTreadClassTask54 implements Runnable,Itask52 {

    @Override
    public void run() {
        for (int i=0;i<5;i++){
        Thread thread = new Thread();
        thread.start();
            System.out.println(thread.getName());
        CreateNewFIle("D:/Sacuta0/","Task54.txt");
        CollectionInFile("D:/Sacuta0/Task54.txt",CreateCollection(10));

    }}
    @Override
    public ArrayList CreateCollection(Integer QuantityNumbers) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < QuantityNumbers; i++) {
            arrayList.add((int) (Math.random() * 10));
        }
        return arrayList;
    }

    @Override
    public Integer MiddleArithmetick(ArrayList list) {
        return null;
    }

    @Override
    public Integer MaxElement(ArrayList list) {
        return null;
    }

    public void CreateNewFIle(String Package, String NameFile) {
        File file = new File(Package, NameFile);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }}


    void CollectionInFile(String File,ArrayList list){
            FileWriter fileWriter = null;
            try {
                fileWriter = new FileWriter(File);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileWriter.write(String.valueOf(list));
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
