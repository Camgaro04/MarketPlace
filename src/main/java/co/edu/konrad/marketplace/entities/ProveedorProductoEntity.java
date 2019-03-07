/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.marketplace.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author cgarcia
 */
@Entity
public class ProveedorProductoEntity implements Serializable{
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idProv;
    
    
    @JoinColumn(name = "proveedor")
    @ManyToOne
    private ProveedorEntity proveedor;
    
    @JoinColumn(name = "producto")
    @ManyToOne
    private ProductoEntity producto;
    
    
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
    public ProveedorEntity getProveedor() {
        return proveedor;
    }

    /**
     * @param proveedor the proveedor to set
     */
    public void setProveedor(ProveedorEntity proveedor) {
        this.proveedor = proveedor;
    }

    /**
     * @return the producto
     */
    public ProductoEntity getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(ProductoEntity producto) {
        this.producto = producto;
    }
    
    
}
