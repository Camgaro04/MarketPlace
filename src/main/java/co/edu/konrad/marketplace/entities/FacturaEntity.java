/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.marketplace.entities;

import java.io.Serializable;
import java.util.Date;
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
public class FacturaEntity implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idFactura;
    
    @JoinColumn(name = "carrito")
    @ManyToOne
    private CarritoEntity carrito;
    
    @Column(name = "total_factura")
    private int totalFactura;
    
    
    @Column(name = "fecha")
    private Date fecha;
    
    @Column(name = "medio_pago")
    private String medioPago;
    
    public FacturaEntity(){
    
    }

    /**
     * @return the idFactura
     */
    public int getIdFactura() {
        return idFactura;
    }

    /**
     * @param idFactura the idFactura to set
     */
    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    /**
     * @return the carrito
     */
    public CarritoEntity getCarrito() {
        return carrito;
    }

    /**
     * @param carrito the carrito to set
     */
    public void setCarrito(CarritoEntity carrito) {
        this.carrito = carrito;
    }

    /**
     * @return the totalFactura
     */
    public int getTotalFactura() {
        return totalFactura;
    }

    /**
     * @param totalFactura the totalFactura to set
     */
    public void setTotalFactura(int totalFactura) {
        this.totalFactura = totalFactura;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the medioPago
     */
    public String getMedioPago() {
        return medioPago;
    }

    /**
     * @param medioPago the medioPago to set
     */
    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }
    
}
