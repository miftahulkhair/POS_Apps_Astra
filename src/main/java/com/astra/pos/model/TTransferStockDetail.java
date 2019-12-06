package com.astra.pos.model;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "pos_t_transfer_stock_detail")
public class TTransferStockDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int instock;

    private int transferQty;

    private Long createBy;

    @CreationTimestamp
    private Timestamp createOn;

    private Long modifiedBy;

    @UpdateTimestamp
    private Timestamp modifiedOn;

    @ManyToOne
    @NotNull
    private MstVariant variant;

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

    public int getInstock() {
        return instock;
    }

    public void setInstock(int instock) {
        this.instock = instock;
    }

    public int getTransferQty() {
        return transferQty;
    }

    public void setTransferQty(int transferQty) {
        this.transferQty = transferQty;
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

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Timestamp getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Timestamp modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public MstVariant getVariant() {
        return variant;
    }

    public void setVariant(MstVariant variant) {
        this.variant = variant;
    }

    public TTransferStock getTransfer() {
        return transfer;
    }

    public void setTransfer(TTransferStock transfer) {
        this.transfer = transfer;
    }

    public Long getTransfer_id() {
        return transfer_id;
    }

    public void setTransfer_id(Long transfer_id) {
        this.transfer_id = transfer_id;
    }

    //    public Long getTransfer_id() {
//        return transfer_id;
//    }
//
//    public void setTransfer_id(Long transfer_id) {
//        this.transfer_id = transfer_id;
//    }
}
