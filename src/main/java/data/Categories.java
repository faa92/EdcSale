package data;

import java.util.ArrayList;
import java.util.List;

public enum Categories {

    REAL_ESTATE("Недвижимость"),
    CHILDS_WORLD("Детский мир"),
    ANIMALS("Животные"),
    PERSONAL_ITEMS("Личные вещи"),
    BUSINESS("Бизнес"),
    SPORTS_AND_TRAVEL("Спорт и путешествия"),
    TRANSPORT("Транспорт"),
    ELECTRONICS("Электроника"),
    HOUSE_AND_COTTAGE("Дом и дача"),
    SERVICES("Услуги"),
    JOB("Работа"),
    HOBBY_MUSIC_ART("Хобби, музыка, искусство");

    private String displayName;

    Categories(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }

    public static List<String> getExpectedValues() {
        List<String> values = new ArrayList<>();
        for (Categories categories : Categories.values()) {
            values.add(categories.displayName);
        }
        return values;
    }

}
