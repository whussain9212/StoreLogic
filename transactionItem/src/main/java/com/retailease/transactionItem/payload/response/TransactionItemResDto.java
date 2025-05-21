package com.retailease.transactionItem.payload.response;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransactionItemResDto {
    private Long transactionItemId;
    private Long productId;
    private Long quantity;
    private Long subtotal;
}
