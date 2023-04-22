package com.platzi.market.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "productos")
@Getter
@Setter
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProducto;

    private String nombre;

    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Column(name = "codigo_barras")
    private String codigoBarras;

    @Column(name = "precio_venta")
    private Double precioVenta;

    @Column(name = "cantidad_stock")
    private Integer cantidadStock;

    private Boolean estado;

    @ManyToOne //Así declaramos las relaciones, muchos a uno aquí y en categoria uno a muchos (One to many)
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false) // Colocamos el nombre del id, insertable y updatable es para cambiar automaticamente y agregar automaticamente valores x tanto es falso
    private Categoria categoria;
}
