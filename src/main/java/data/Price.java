package data;

public enum Price {
    PRICE_FROM("1000"),
    PRICE_TO("2000");
    final String value;

    Price(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
