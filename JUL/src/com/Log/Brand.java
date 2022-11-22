package com.Log;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Brand {
    int id;
    String name;
    String website;
    int phoneRank;
}
