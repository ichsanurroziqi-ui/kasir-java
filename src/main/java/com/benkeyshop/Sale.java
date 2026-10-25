package com.benkeyshop;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/** Entity transaksi penjualan. */
public class Sale {
    private final String receiptNo,buyerName;
    private final LocalDateTime soldAt;
    private final BigDecimal subtotal,discount,total,paid,changeAmount;
    private final List<SaleLine> lines;
    public Sale(String receiptNo,String buyerName,LocalDateTime soldAt,BigDecimal subtotal,BigDecimal discount,BigDecimal total,BigDecimal paid,BigDecimal changeAmount,List<SaleLine> lines){
        this.receiptNo=receiptNo;this.buyerName=buyerName;this.soldAt=soldAt;this.subtotal=subtotal;this.discount=discount;this.total=total;this.paid=paid;this.changeAmount=changeAmount;this.lines=List.copyOf(lines);
    }
    public String getReceiptNo(){return receiptNo;} public String getBuyerName(){return buyerName;} public LocalDateTime getSoldAt(){return soldAt;}
    public BigDecimal getSubtotal(){return subtotal;} public BigDecimal getDiscount(){return discount;} public BigDecimal getTotal(){return total;}
    public BigDecimal getPaid(){return paid;} public BigDecimal getChangeAmount(){return changeAmount;} public List<SaleLine> getLines(){return lines;}
}
