package Part8;

public interface ITask33 {
    public default void ManufacturerCard(int Type) {
        if (Type == 1) Visa();
        else
            Mastercard();
    }

    void Visa();

    void Mastercard();

    public default void BankCard() {
        MTB();
        VTB();
    }

    void MTB();

    void VTB();

    public default void Typecard() {
        OverDraft();
        JobCard();
    }

    void OverDraft();

    void JobCard();
}

