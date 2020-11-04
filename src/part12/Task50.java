package part12;



public class Task50 implements Itask50 {
    public static void main(String[] args) {
        Task50 task50 = new Task50();
        task50.CreatePacage("D:", "Sacuta0", "Sacuta1", "Sacuta2");
        for (int i = 1; i < 6; i++) {
            task50.CreateNewFIle("D://Sacuta0//Sacuta1//Sacuta2", "TEST" + i + ".txt");
        }
        for (int i = 1; i < 6; i++) {
            task50.RandomNumberInFile("D://Sacuta0//Sacuta1//Sacuta2//TEST" + i + ".txt", "2312314415\n");
        }
        task50.CreateNewFIle("D://Sacuta0//Sacuta1//Sacuta2", "AllTEST.txt");
        for (int i = 1; i < 6; i++) {
            task50.AllFilesInOneFiles("D://Sacuta0//Sacuta1//Sacuta2//TEST" + i + ".txt", "D://Sacuta0//Sacuta1//Sacuta2//AllTEST.txt");
        }
        task50.CreateNewFIle("D://Sacuta0//Sacuta1//Sacuta2", "AllFiles.txt");
        task50.AllFilesInDirectory("D://Sacuta0//Sacuta1//Sacuta2//", "AllFiles.txt");
    }
}
