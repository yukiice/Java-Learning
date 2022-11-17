package com.Complicated;

import lombok.Data;

import java.util.List;

@Data
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
    List<Brand> brandList;
}
