package models;

import java.math.BigDecimal;

public class BlockShortAdModel {
    String title;
    String description;
    BigDecimal price;
    String city;
    String subtitle;

    public BlockShortAdModel(String title, String description, BigDecimal price, String city, String subtitle) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.city = city;
        this.subtitle = subtitle;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getCity() {
        return city;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }
}
