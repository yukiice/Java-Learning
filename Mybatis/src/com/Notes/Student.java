package com.Notes;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class Student {
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

