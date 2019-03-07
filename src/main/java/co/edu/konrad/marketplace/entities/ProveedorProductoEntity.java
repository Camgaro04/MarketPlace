/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.marketplace.entities;

import java.io.Serializable;

/**
 *
 * @author cgarcia
 */
public class ProveedorProductoEntity implements Serializable{
    
    private int idProv;
    private int proveedor;
    private int producto;
    
    
    public ProveedorProductoEntity(){
    }

    /**
     * @return the idProv
     */
    public int getIdProv() {
        return idProv;
    }

    /**
     * @param idProv the idProv to set
     */
    public void setIdProv(int idProv) {
        this.idProv = idProv;
    }

    /**
     * @return the proveedor
     */
    public int getProveedor() {
        return proveedor;
    }

    /**
     * @param proveedor the proveedor to set
     */
    public void setProveedor(int proveedor) {
        this.proveedor = proveedor;
    }

    /**
     * @return the producto
     */
    public int getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(int producto) {
        this.producto = producto;
    }
    
    
}
