package data;

public enum Currency {
    RUB("2"),
    BYN("7"),
    UAH("1"),
    KZT("5"),
    MDL("6");
    private String currencyValue;

    Currency(String currencyValue) {
        this.currencyValue = currencyValue;
    }

//    @Override
//    public String toString() {
//        return name();
//    }

    public String getCurrencyValue() {
        return currencyValue;
    }

}
