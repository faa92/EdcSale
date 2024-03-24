package data;

public enum Config {
    HOME_URL("homeUrl"),
    PATH_CONFIG("src/main/resources/config.properties"),
    PATH_USER_DATA("src/main/resources/userData.csv"),
    USER("userData.csv");

    private final String value;

    Config(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
