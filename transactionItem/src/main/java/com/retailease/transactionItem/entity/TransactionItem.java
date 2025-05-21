package com.retailease.transactionItem.entity;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "transaction_items")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransactionItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_item_id")
    private Long transactionItemId;
    @Column(name = "product_id" )
    private Long productId;
    @Column(name = "quantity")
    private Long quantity;
    @Column(name = "subtotal")
    private Long subtotal;
}
