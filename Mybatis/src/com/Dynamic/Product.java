package com.Dynamic;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Product {
    int id;
    String brand;
    String title;
    int price;
    int score;
    int voteCnt;
    String url;
    int pid;
    int brand_id;
}
