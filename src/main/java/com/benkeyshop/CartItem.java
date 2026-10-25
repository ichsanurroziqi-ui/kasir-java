package com.benkeyshop;

import java.math.BigDecimal;

/** Objek item keranjang, dengan perhitungan subtotal per item. */
public class CartItem {
    private final Product product;
    private int quantity;
    public CartItem(Product product, int quantity){this.product=product;this.quantity=quantity;}
    public Product getProduct(){return product;}
    public int getQuantity(){return quantity;}
    public void setQuantity(int quantity){if(quantity<1)throw new IllegalArgumentException("Jumlah minimal 1");this.quantity=quantity;}
    public BigDecimal getSubtotal(){return product.getPrice().multiply(BigDecimal.valueOf(quantity));}
}
