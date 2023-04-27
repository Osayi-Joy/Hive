package com.osayijoy.hive.entity;


import com.osayijoy.hive.constant.TransactionStatus;
import com.osayijoy.hive.constant.TransactionType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;


@Entity
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@AllArgsConstructor
@Table(name = "transactions")
public class TransactionLog extends AuditEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String transactionId;

    @Column(name = "amount")
    private BigDecimal amount;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "transaction_type", length = 20)
    private TransactionType transactionType;


    @Column(name = "transaction_date")
    private String transactionDate;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "transaction_status", length = 50)
    private TransactionStatus transactionStatus;

    @ManyToOne(cascade = CascadeType.MERGE)
    private User user;


}
