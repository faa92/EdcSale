package data;

public enum FiltersSearchPanel {
    WITH_PHOTO("С фото"),
    WITHOUT_INTERMEDIARIES("Без посредников"),
    BUSINESS_ADS_ONLY("Только бизнес объявления");
    private String displayName;

    FiltersSearchPanel(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
