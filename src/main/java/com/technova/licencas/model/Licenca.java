package com.technova.licencas.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data // Gera Getters, Setters, toString, equals e hashCode
public class Licenca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String software;
    private String fornecedor;
    
    private int quantidadeTotal;
    private int quantidadeAlocada;
    
    private BigDecimal custoUnitarioMensal;
    
    private LocalDate dataVencimento;
    
    private String status; // Ex: ATIVA, OCIOSA, VENCIDA

    // Representa a área responsável (ex: TI, Marketing)
    private String areaResponsavel; 
    
    private String usuarioAlocado; // Para alocação RF002
}