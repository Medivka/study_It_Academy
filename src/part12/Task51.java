package part12;

import Part9.Season;

import java.io.*;

public class Task51 implements Itask51 {
    public static void main(String[] args) {
        String[] Name = {"Anna", "Boris", "Patrick", "Victor", "Elena", "Tom", "Maria", "Vera", "Katerina", "Rita"};
        String[] Surname = {"Reshetko", "Miloko", "Grunlo", "Hylo", "Lipotado", "Tinkoff", "Rukashenko", "Timoshenko", "Ovechkinof", "Klimovec"};
        Task51 task51 = new Task51();
        task51.CreateNewFIle("D:/Sacuta0/", "Task51.txt");

        for (int i = 0; i < 11; i++) {
            String surname = Surname[(int) (Math.random() * 10)];
            String name = Name[(int) (Math.random() * 10)];
            Person person = new Person(name, surname, (20 + (int) (Math.random() * 20)));
            task51.AllPersonInFile("D:/Sacuta0/Task51.txt", (person.toString())+"\n");
            System.out.println(person.toString());
        }
    }
}
