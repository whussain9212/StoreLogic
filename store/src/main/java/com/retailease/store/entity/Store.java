package com.retailease.store.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "stores")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "store_id")
    private Long storeId;
    @Column(name = "store_name")
    private String storeName;
    @Column(name = "owner_id")
    private Long ownerId;
}
