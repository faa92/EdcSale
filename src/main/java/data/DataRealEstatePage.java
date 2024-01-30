package data;

public enum DataRealEstatePage {
    HEADER("Недвижимость в Беларуси"),
    PRICE_FROM("1000"),
    PRICE_TO("2000");
    private String value;

    DataRealEstatePage(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
