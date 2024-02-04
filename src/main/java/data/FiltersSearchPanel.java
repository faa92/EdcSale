package data;

public enum FiltersSearchPanel {
    WITH_PHOTO("С фото"),
    WITHOUT_INTERMEDIARIES("Без посредников"),
    BUSINESS_ADS_ONLY("Только бизнес объявления");
    private String value;

    FiltersSearchPanel(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
