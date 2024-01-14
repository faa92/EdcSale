package data;

import java.util.HashMap;
import java.util.Map;

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

    public static Map<String, String> getAllCategories() {
        return new HashMap<>() {{
            put(REAL_ESTATE.toString(), REAL_ESTATE.displayName);
            put(CHILDS_WORLD.toString(), CHILDS_WORLD.displayName);
            put(ANIMALS.toString(), ANIMALS.displayName);
            put(PERSONAL_ITEMS.toString(), PERSONAL_ITEMS.displayName);
            put(BUSINESS.toString(), BUSINESS.displayName);
            put(SPORTS_AND_TRAVEL.toString(), SPORTS_AND_TRAVEL.displayName);
            put(TRANSPORT.toString(), TRANSPORT.displayName);
            put(ELECTRONICS.toString(), ELECTRONICS.displayName);
            put(HOUSE_AND_COTTAGE.toString(), HOUSE_AND_COTTAGE.displayName);
            put(SERVICES.toString(), SERVICES.displayName);
            put(JOB.toString(), JOB.displayName);
            put(HOBBY_MUSIC_ART.toString(), HOBBY_MUSIC_ART.displayName);
        }};
    }
}
