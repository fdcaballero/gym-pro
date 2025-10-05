package com.ghost.gympro.infraestructura.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "facturas")
@Entity
public class FacturaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "referencia", unique = true, nullable = false)
    private String referencia;

    @Column(name = "descripcion")
    private String descripcion;


    @OneToMany(mappedBy = "factura", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FacturaConceptoEntity> conceptos;

    @Column(name = "total", precision = 10, scale = 2)
    private BigDecimal total;


}
