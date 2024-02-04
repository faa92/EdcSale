package data;

public enum Currency {
    RUB("2"),
    BYN("7"),
    UAH("1"),
    KZT("5"),
    MDL("6");
    private String value;

    Currency(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }


}
