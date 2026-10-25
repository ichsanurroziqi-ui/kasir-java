package com.benkeyshop;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.print.*;
import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/** Tanggung jawab format dan pencetakan struk dipisahkan dari form kasir. */
public class ReceiptPrinter {
    private final NumberFormat money=NumberFormat.getCurrencyInstance(new Locale("id","ID"));
    public String format(Sale sale){
        StringBuilder b=new StringBuilder("             BENKEYSHOP\n          STRUK PEMBELIAN\n------------------------------------------\n");
        b.append("No      : ").append(sale.getReceiptNo()).append('\n').append("Pembeli : ").append(sale.getBuyerName()).append('\n');
        b.append("Tanggal : ").append(sale.getSoldAt().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"))).append('\n');
        for(SaleLine l:sale.getLines())b.append(l.getNameSnapshot()).append('\n').append("  ").append(l.getQuantity()).append(" x ").append(fmt(l.getUnitPrice())).append(" = ").append(fmt(l.getLineTotal())).append('\n');
        b.append("------------------------------------------\nSubtotal : ").append(fmt(sale.getSubtotal())).append('\n').append("Diskon   : ").append(fmt(sale.getDiscount())).append('\n');
        b.append("TOTAL    : ").append(fmt(sale.getTotal())).append('\n').append("Bayar    : ").append(fmt(sale.getPaid())).append('\n').append("Kembali  : ").append(fmt(sale.getChangeAmount())).append('\n');
        b.append("------------------------------------------\n   Terima kasih telah berbelanja!\n");return b.toString();
    }
    public void print(String text)throws PrinterException{
        PrinterJob job=PrinterJob.getPrinterJob();job.setJobName("Struk BenkeyShop");
        job.setPrintable((graphics,page,pageIndex)->{if(pageIndex>0)return Printable.NO_SUCH_PAGE;Graphics2D g=(Graphics2D)graphics;g.translate(page.getImageableX(),page.getImageableY());g.setFont(new Font(Font.MONOSPACED,Font.PLAIN,9));int y=14;for(String line:text.split("\n")){g.drawString(line,4,y);y+=12;}return Printable.PAGE_EXISTS;});
        if(job.printDialog())job.print();
    }
    private String fmt(java.math.BigDecimal n){return money.format(n).replace(",00","");}
}
