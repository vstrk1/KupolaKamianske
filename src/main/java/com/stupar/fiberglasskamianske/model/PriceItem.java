package com.stupar.fiberglasskamianske.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class PriceItem {
    public String productNumber;
    public String productName;
    public Double price;

    public PriceItem(String productNumber, String productName, Double price) {
        this.productNumber = productNumber;
        this.productName = productName;
        this.price = price;
    }
}

