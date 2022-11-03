package Enums;

public enum Place {
    GROUND ("на земле"),
    FOREST ("лес"),
    HOUSE ("дом"),
    UNKNOWN ("непонятно куда"),
    SKY ("небо"),
    BUSH ("куст");
    private String title;

    Place(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
