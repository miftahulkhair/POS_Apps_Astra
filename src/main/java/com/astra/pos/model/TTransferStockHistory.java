package com.astra.pos.model;


import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
@Table(name = "pos_t_transfer_stock_history")
public class TTransferStockHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20)
    @NotNull
    private String status;

    private Long createBy;

    @CreationTimestamp
    private Timestamp createOn;

    @ManyToOne (fetch = FetchType.EAGER, targetEntity = TTransferStock.class)
    @JoinColumn(name = "transfer_id", referencedColumnName = "id", insertable = false, updatable = false)
    private TTransferStock transfer;

    @NotNull
    private Long transfer_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Timestamp getCreateOn() {
        return createOn;
    }

    public void setCreateOn(Timestamp createOn) {
        this.createOn = createOn;
    }

    public TTransferStock getTransfer() {
        return transfer;
    }

    public void setTransfer(TTransferStock transfer) {
        this.transfer = transfer;
    }
}
