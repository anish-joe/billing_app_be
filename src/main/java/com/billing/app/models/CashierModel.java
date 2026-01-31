package com.billing.app.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cashier_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CashierModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cashier_id")
    private Integer cashierId;
    @Column(name = "cashier_name")
    private String cashierName;
    @Column(name = "cashier_email")
    private String cashierEmail;
    @Column(name = "cashier_password")
    private String cashierPassword;
}
