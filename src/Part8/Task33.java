package Part8;

class CardManufacturer implements ITask33 {
    @Override
    public void Visa() {
        System.out.println("Visa");
    }

    @Override
    public void Mastercard() {
        System.out.println("Mastercard");
    }

    @Override
    public void MTB() {
        System.out.println("MTB");
    }

    @Override
    public void VTB() {
        System.out.println("VTB");
    }
    @Override
    public void OverDraft() {
        System.out.println("Overdraft");
    }
    @Override
    public void JobCard() {
        System.out.println("Jobcard");
    }
}

class BankCard extends CardManufacturer {
}

class CardType extends BankCard {
}

public class Task33 {

    public static void main(String[] args) {
        CardType cardType = new CardType();
        cardType.ManufacturerCard(1);
        cardType.MTB();
        cardType.OverDraft();
    }
}
