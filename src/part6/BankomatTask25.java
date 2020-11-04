package part6;

import java.util.Scanner;

class BankomatTask25 {

    private static int money20 = 0;
    private static int money50 = 0;
    private static int money100 = 0;

    private static int allMoney = 15000;
    private static int summa = 0;


    public static void addATM() {
        System.out.println("Money in ATM:  " + allMoney);
        Scanner str = new Scanner(System.in);
        System.out.print("add 20: ");
        Integer addmoney20 = str.nextInt();
        System.out.print("add 50: ");
        Integer addmoney50 = str.nextInt();
        System.out.print("add 100:");
        Integer addmoney100 = str.nextInt();
        System.out.println("");
        money20 = money20 + addmoney20;
        money50 = money50 + addmoney50;
        money100 = money100 + addmoney100;
        int allcash = addmoney20 * 20 + addmoney50 * 50 + addmoney100 * 100;
        allMoney = allMoney + allcash;
        System.out.println(" You add cash::" + allcash);
        System.out.println("All money in ATM:=  " + allMoney);

    }

    public static void getMoney() {
        boolean b;
        System.out.println("enter the amount");
        Scanner str = new Scanner(System.in);
        summa = str.nextInt();

        if (summa % 10 == 0) {
            int oneHundred = summa / 100;
            int ostatok1 = summa - oneHundred * 100;
            int fifty = ostatok1 / 50;
            int ostatok2 = ostatok1 - fifty * 50;
            int twenty = ostatok2 / 20;
            int ostatok3 = ostatok2 - twenty * 20;
            if (ostatok3 == 10) {
                fifty--;
                twenty = twenty + 3;

                if (fifty == -1) {
                    fifty = 1;
                    oneHundred--;
                }
            }

                if (summa < allMoney) {
                    allMoney = allMoney - summa;

                    System.out.println("100: " + oneHundred + "  50: " + fifty + "  20: " + twenty);
                    b = true;
                } else b = false;

            System.out.println(b);
            System.out.println("remainder : " + allMoney);
        }
        else System.out.println("Enter correct amount!!! /10 ");
    }


    public static void main(String[] args) {
        addATM();
        getMoney();

    }


}
