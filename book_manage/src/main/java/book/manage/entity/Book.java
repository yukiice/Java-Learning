package book.manage.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Book {
    int bid;

    public Book(String title, String desc, int price) {
        this.title = title;
        this.desc = desc;
        this.price = price;
    }

    String title;
    String desc;
    int price;
}
