package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class BlockShortAdModel {
    String title;
    String description;
    Integer price;
    String city;
    String subtitle;
}