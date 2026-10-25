package com.benkeyshop;

import java.math.BigDecimal;

/** Snapshot rincian barang saat transaksi, tidak bergantung pada data produk terkini. */
public class SaleLine {
    private final Long productId;
    private final String skuSnapshot, nameSnapshot;
    private final BigDecimal unitPrice;
    private final int quantity;
    public SaleLine(Long productId,String sku,String name,BigDecimal unitPrice,int quantity){
        this.productId=productId;this.skuSnapshot=sku;this.nameSnapshot=name;this.unitPrice=unitPrice;this.quantity=quantity;
    }
    public Long getProductId(){return productId;} public String getSkuSnapshot(){return skuSnapshot;}
    public String getNameSnapshot(){return nameSnapshot;} public BigDecimal getUnitPrice(){return unitPrice;}
    public int getQuantity(){return quantity;} public BigDecimal getLineTotal(){return unitPrice.multiply(BigDecimal.valueOf(quantity));}
}
