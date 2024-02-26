package models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BlockShortAdModel {
    String title;
    String description;
    Integer price;
    String city;
    String subtitle;

    public BlockShortAdModel(String title, String description, Integer price, String city, String subtitle) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.city = city;
        this.subtitle = subtitle;
    }
}