package data;

public enum ExpectedValues {
    LOGOUT_BUTTON("Выход");
    private final String value;

    ExpectedValues(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
