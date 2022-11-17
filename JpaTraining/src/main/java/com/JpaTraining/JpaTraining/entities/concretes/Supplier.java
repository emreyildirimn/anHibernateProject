package com.JpaTraining.JpaTraining.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "suppliers")

public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supplier_id")
    private Integer supplierId;
    @Column(name = "company_name")
    private String supplierName;

    @OneToMany(mappedBy = "supplier")
//	@JsonIgnore
    private List<Product> products;

}
