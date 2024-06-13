package com.example.major.global;

import com.example.major.model.Product;

import java.util.ArrayList;
import java.util.List;

public class GlobalData {

    public static List<Product> cart;

    static {
        cart = new ArrayList<>();
    }

}
