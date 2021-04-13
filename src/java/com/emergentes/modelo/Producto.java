package com.emergentes.modelo;

/**
 *
 * @author YURIKIRA105
 */
public class Producto {
    private int id;
    private String producto;
    private String precio;
    private String cantidad;
    
    public Producto()
    {
        id  = 0;
        producto = "";
        precio = "";
        cantidad = "";        
    } 
    public Producto(int id, String producto, String precio, String cantidad ){
        this.id = id;
        this.producto = producto;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getProducto(){
        return producto;
    }
    public void setProducto(String producto){
        this.producto = producto;
    }
    public String getPrecio(){
        return precio;
    }
    public void setPrecio(String precio){
        this.precio = precio;
    }
    public String getCantidad(){
        return cantidad;
    }
    public void setCantidad(String cantidad){
        this.cantidad = cantidad;
    }
}
