package com.benkeyshop;

import java.math.BigDecimal;

/** Model/entity produk dengan enkapsulasi atribut. */
public class Product {
    private long id;
    private String sku, name, category;
    private BigDecimal price;
    private int stock;

    public Product(long id, String sku, String name, String category, BigDecimal price, int stock) {
        this.id=id; this.sku=sku; this.name=name; this.category=category; this.price=price; this.stock=stock;
    }
    public long getId(){return id;} public void setId(long id){this.id=id;}
    public String getSku(){return sku;} public void setSku(String v){sku=v;}
    public String getName(){return name;} public void setName(String v){name=v;}
    public String getCategory(){return category;} public void setCategory(String v){category=v;}
    public BigDecimal getPrice(){return price;} public void setPrice(BigDecimal v){price=v;}
    public int getStock(){return stock;} public void setStock(int v){stock=v;}
}
