package part6.Interface;


public class Bankomat implements IATMwork {
    Integer Hundred = 100;
    Integer Fifty = 50;
    Integer Twenty = 20;
    Integer PullCash=5080;


    @Override
    public int AllCash() {
        return Hundred * 100 + Fifty * 50 + Twenty * 20;

    }

    @Override
    public int PullCash() {
                return PullCash;

    }

    @Override
    public int Differense() {
        return AllCash() - PullCash();

    }

    @Override
    public void Nominal() {
        boolean b;
        int SotniNominal = 0, PoltosNominal = 0, TwentyNominal = 0;
        if ((AllCash() == PullCash() || AllCash() > PullCash()) && (0 == PullCash() % 10)) {
            b = true;
        } else b = false;
        if (b == true) {
            SotniNominal = PullCash() / 100;
            if (SotniNominal > Hundred) SotniNominal = Hundred;
            PoltosNominal = (PullCash() - SotniNominal * 100) / 50;
            if (PoltosNominal > Fifty) PoltosNominal = Fifty;
            TwentyNominal = (PullCash() - (SotniNominal * 100 + PoltosNominal * 50)) / 20;
            int Ost = PullCash() - SotniNominal * 100 - PoltosNominal * 50 - TwentyNominal * 20;
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
            System.out.println("100$:  " + (Hundred - SotniNominal));
            System.out.println("50$:   " + (Fifty - PoltosNominal));
            System.out.println("20$:   " + (Twenty - TwentyNominal));
        }
        if (b == false) {
            System.out.println(b);
            System.out.println("Please Enter correct Summa ");
        }
    }


    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat();
        System.out.println(bankomat.PullCash());
        bankomat.Nominal();
//        Bankomat bankomat = new Bankomat();
//        Integer Hundred = 100;
//        Integer Fifty = 100;
//        Integer Twenty = 100;
//        int allcash = bankomat.AllCash(Hundred, Fifty, Twenty);
//        int pullcash = bankomat.PullCash(3080);
//        bankomat.Difference(allcash, pullcash);
//        bankomat.nominal(allcash,pullcash,Hundred,Fifty,Twenty);
//
    }
}

