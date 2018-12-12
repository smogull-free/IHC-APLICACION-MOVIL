package com.apppspot.ihc01.ihc_proyecto;

public class ModeloProducto {
    private String modelo;
    private String stock;
    private String precio;
    private int imagen;

    public ModeloProducto(String modelo, String stock, String precio,int imagen) {
        this.modelo = modelo;
        this.stock = stock;
        this.precio = precio;
        this.imagen=imagen;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
