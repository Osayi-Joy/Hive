package com.osayijoy.hive.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.osayijoy.hive.enums.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tasks")
@Entity
@Builder
public class Task extends AuditEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID task_id;
    @Column(name = "job_type")
    private String jobType;
    @Size(max = 250)
    private String taskDescription;
    @Column(name = "budget_rate(N)")
    private BigDecimal budgetRate;
//    @OneToOne
//    private Address taskAddress;
    private String taskAddress;
//    @OneToOne
//    private Address deliverAddress;
    private String taskDeliveryAddress;
    @Column(name = "estimated_time")
    private Integer estimatedTime;
    @Column(name = "task_duration(hrs)")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss")
    private LocalDateTime taskDuration;
    @Enumerated(EnumType.STRING)
    private Status status;
    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private User tasker;
    @ManyToOne(cascade = CascadeType.MERGE)
    private User doer;
    private Boolean isEscrowTransferComplete = false;
    @OneToOne
    private TransactionLog transactionLog;
    @OneToOne
    private EscrowWallet escrowWallet;
}
