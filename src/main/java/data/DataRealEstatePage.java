package data;

public enum DataRealEstatePage {
    HEADER("Недвижимость в Беларуси");
    private String value;

    DataRealEstatePage(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
