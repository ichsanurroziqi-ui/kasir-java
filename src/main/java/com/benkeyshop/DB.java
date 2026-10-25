package com.benkeyshop;
import java.io.InputStream;import java.sql.*;import java.util.Properties;
/** Penyedia koneksi database. */
public final class DB {private static final Properties P=new Properties();static{try(InputStream in=DB.class.getResourceAsStream("/db.properties")){if(in!=null)P.load(in);}catch(Exception e){throw new ExceptionInInitializerError(e);}}private DB(){}public static Connection connect()throws SQLException{return DriverManager.getConnection(System.getProperty("db.url",P.getProperty("db.url")),System.getProperty("db.user",P.getProperty("db.user","root")),System.getProperty("db.password",P.getProperty("db.password","")));}}
