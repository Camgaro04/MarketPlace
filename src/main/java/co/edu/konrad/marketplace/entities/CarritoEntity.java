/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.marketplace.entities;

import java.io.Serializable;
import javax.persistence.Column;
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
public class CarritoEntity implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCarrito;
    
    
    @JoinColumn(name = "cliente")
    @ManyToOne
    private ClienteEntity cliente;
    
    @JoinColumn(name = "producto")
    @ManyToOne
    private ProductoEntity producto;
    
    @Column(name = "cantidad")
    private int cantidad;
    
    @Column(name = "valor_total")
    private double valorTotal;

    
    public CarritoEntity(){
    
    }
    
    /**
     * @return the idCarrito
     */
    public int getIdCarrito() {
        return idCarrito;
    }

    /**
     * @param idCarrito the idCarrito to set
     */
    public void setIdCarrito(int idCarrito) {
        this.idCarrito = idCarrito;
    }

    /**
     * @return the cliente
     */
    public ClienteEntity getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(ClienteEntity cliente) {
        this.cliente = cliente;
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

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the valorTotal
     */
    public double getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
}
