package com.benkeyshop;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/** Class layanan untuk aturan bisnis keranjang, terpisah dari tampilan. */
public class CartService {
    private final Map<Long,CartItem> items = new LinkedHashMap<>();
    public void add(Product product) {
        CartItem item=items.get(product.getId()); int next=item==null?1:item.getQuantity()+1;
        if(next>product.getStock()) throw new IllegalArgumentException("Stok tidak mencukupi");
        if(item==null) items.put(product.getId(),new CartItem(product,1)); else item.setQuantity(next);
    }
    public void changeQuantity(long productId,int delta) {
        CartItem item=items.get(productId); if(item==null)return;
        int next=item.getQuantity()+delta;
        if(next<=0){items.remove(productId);return;}
        if(next>item.getProduct().getStock())throw new IllegalArgumentException("Melebihi stok");
        item.setQuantity(next);
    }
    public void remove(long productId){items.remove(productId);}
    public void clear(){items.clear();}
    public boolean isEmpty(){return items.isEmpty();}
    public Collection<CartItem> getItems(){return java.util.List.copyOf(items.values());}
    public Map<Long,CartItem> snapshot(){return new LinkedHashMap<>(items);}
    public BigDecimal getSubtotal(){return items.values().stream().map(CartItem::getSubtotal).reduce(BigDecimal.ZERO,BigDecimal::add);}
}
