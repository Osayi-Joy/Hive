package com.osayijoy.hive.dto.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TransactionResponse<T> {
    private String status;
    private String message;
    private T data;
}


