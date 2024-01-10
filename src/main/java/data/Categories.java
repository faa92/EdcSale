package data;

public enum Categories {

    REAL_ESTATE("Недвижимость"),
    TRANSPORT("Транспорт"),
    CHILDS_WORLD("Детский мир"),
    ELECTRONICS("Электроника"),
    ANIMALS("Животные"),
    HOUSE_AND_COTTAGE("Дом и дача"),
    PERSONAL_ITEMS("Личные вещи"),
    SERVICES("Услуги"),
    BUSINESS("Бизнес"),
    JOB("Работа"),
    SPORTS_AND_TRAVEL("Спорт и путешествия"),
    HOBBY_MUSIC_ART("Хобби, музыка, искусство");

    private String displayName;

    Categories(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
