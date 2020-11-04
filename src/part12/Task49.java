package part12;

import java.io.*;

public class Task49 implements Itask49{
    public static void main(String[] args){

        String name = null;
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:/numbers.txt")))
        {
             dos.writeUTF("23123123123123123");
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
              try(DataInputStream dos = new DataInputStream(new FileInputStream("D:/numbers.txt")))
        {
          name = dos.readUTF();
            System.out.println(name);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        Task49 task49=new Task49();
        System.out.println(task49.MiddleArithmetick(name));

    }
}

