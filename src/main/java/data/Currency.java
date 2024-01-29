package data;

public enum Currency {
    RUB,
    BYN,
    UAH,
    KZT,
    MDL;

    String currencyValue;

    @Override
    public String toString() {
        return currencyValue;
    }
}
