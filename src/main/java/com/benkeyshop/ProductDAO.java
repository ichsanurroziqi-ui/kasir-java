package com.benkeyshop;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/** Data Access Object: query produk tidak dicampur dengan komponen UI. */
public class ProductDAO {
    public List<Product> search(String keyword) throws SQLException {
        List<Product> result=new ArrayList<>();
        String sql="SELECT id,sku,name,category,price,stock FROM products WHERE sku LIKE ? OR name LIKE ? OR category LIKE ? ORDER BY name";
        try(Connection c=DB.connect();PreparedStatement ps=c.prepareStatement(sql)){
            String q="%"+(keyword==null?"":keyword.trim())+"%";
            for(int i=1;i<=3;i++)ps.setString(i,q);
            try(ResultSet r=ps.executeQuery()){while(r.next())result.add(map(r));}
        } return result;
    }
    public Product findById(long id)throws SQLException{
        try(Connection c=DB.connect();PreparedStatement ps=c.prepareStatement("SELECT id,sku,name,category,price,stock FROM products WHERE id=?")){
            ps.setLong(1,id);try(ResultSet r=ps.executeQuery()){return r.next()?map(r):null;}
        }
    }
    public void save(Product p)throws SQLException{
        boolean insert=p.getId()<=0;
        String sql=insert?"INSERT INTO products(sku,name,category,price,stock) VALUES(?,?,?,?,?)":"UPDATE products SET sku=?,name=?,category=?,price=?,stock=? WHERE id=?";
        try(Connection c=DB.connect();PreparedStatement ps=c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)){
            ps.setString(1,p.getSku());ps.setString(2,p.getName());ps.setString(3,p.getCategory());ps.setBigDecimal(4,p.getPrice());ps.setInt(5,p.getStock());
            if(!insert)ps.setLong(6,p.getId());ps.executeUpdate();
            if(insert)try(ResultSet k=ps.getGeneratedKeys()){if(k.next())p.setId(k.getLong(1));}
        }
    }
    public void delete(long id)throws SQLException{try(Connection c=DB.connect();PreparedStatement ps=c.prepareStatement("DELETE FROM products WHERE id=?")){ps.setLong(1,id);ps.executeUpdate();}}
    private Product map(ResultSet r)throws SQLException{return new Product(r.getLong("id"),r.getString("sku"),r.getString("name"),r.getString("category"),r.getBigDecimal("price"),r.getInt("stock"));}
}
