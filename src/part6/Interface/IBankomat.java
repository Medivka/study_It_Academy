package part6.Interface;

public interface IBankomat {
    default void AllCash() {

    }

    //    default int AllCash(int Hundred,int Fifty,int Twenty){
//        return sum(Hundred,Fifty,Twenty);
//    }
    private int sum(int Hundred,int Fifty, int Twenty){
        return Hundred*100+ Fifty*50+Twenty*20;
    }
    default int Ostatok(int allcash,int pullcash){
        return ostatok(allcash,pullcash);
    }
    private int ostatok(int allcash,int pullcash){
        return allcash-pullcash;
    }
default int PullCash(int pullcash){
        return pullcash;
}
    default int Difference(int All,int Pull){
        return difference(All,Pull); }

    private int difference(int All,int pull){
        return All-pull;

    }
    default void nominal(int AllCash, int pullmoney, int Hundred, int Fifty, int Twenty) {
        boolean b;
        int SotniNominal = 0, PoltosNominal = 0, TwentyNominal = 0;
        if ((AllCash == pullmoney || AllCash > pullmoney) && (0 == pullmoney % 10)) {
            b = true;
        } else b = false;
        if (b == true) {
            SotniNominal = pullmoney / 100;
            if (SotniNominal > Hundred) SotniNominal = Hundred;
            PoltosNominal = (pullmoney - SotniNominal * 100) / 50;
            if (PoltosNominal > Fifty) PoltosNominal = Fifty;
            TwentyNominal = (pullmoney - (SotniNominal * 100 + PoltosNominal * 50)) / 20;
            int Ost = pullmoney - SotniNominal * 100 - PoltosNominal * 50 - TwentyNominal * 20;
            if (Ost == 10) {
                PoltosNominal--;
                TwentyNominal = TwentyNominal + 3;

                if (PoltosNominal == -1) {
                    PoltosNominal = 1;
                    SotniNominal--;
                }
            }
            if (PoltosNominal < 0 || SotniNominal < 0 || Twenty < 0)
                b = false;
        }
        if (b == true) {
            System.out.println(b);
            System.out.println("100$: " + SotniNominal);
            System.out.println("50$:  " + PoltosNominal);
            System.out.println("20$:  " + TwentyNominal);
            System.out.println("remainder bill in ATM:");
            System.out.println("100$:  " + (Hundred-SotniNominal));
            System.out.println("50$:   " + (Fifty- PoltosNominal));
            System.out.println("20$:   " + (Twenty- TwentyNominal));
        }
        if (b == false) {
            System.out.println(b);
            System.out.println("Please Enter correct Summa ");
        }
    }


}

