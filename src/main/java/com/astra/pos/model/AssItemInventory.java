package com.astra.pos.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "pos_item_inventory")
public class AssItemInventory
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Integer beginning;

    private Integer purchaseQty;

    private Integer salesOrderQty;

    private Integer transferStockQty;

    private Integer adjustmentQty;

    @NotNull
    private int endingQty;

    @NotNull
    private int alertAtQty;

    private Long createBy;

    @CreationTimestamp
    private Timestamp createOn;

    private Long modifiedBy;

    @UpdateTimestamp
    private Timestamp modifiedOn;

    @OneToOne
    private MstVariant variant;

    @OneToOne
    @NotNull
    private MstOutlet outlet;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getBeginning() {
        return beginning;
    }

    public void setBeginning(Integer beginning) {
        this.beginning = beginning;
    }

    public Integer getPurchaseQty() {
        return purchaseQty;
    }

    public void setPurchaseQty(Integer purchaseQty) {
        this.purchaseQty = purchaseQty;
    }

    public Integer getSalesOrderQty() {
        return salesOrderQty;
    }

    public void setSalesOrderQty(Integer salesOrderQty) {
        this.salesOrderQty = salesOrderQty;
    }

    public Integer getTransferStockQty() {
        return transferStockQty;
    }

    public void setTransferStockQty(Integer transferStockQty) {
        this.transferStockQty = transferStockQty;
    }

    public Integer getAdjustmentQty() {
        return adjustmentQty;
    }

    public void setAdjustmentQty(Integer adjustmentQty) {
        this.adjustmentQty = adjustmentQty;
    }

    public int getEndingQty() {
        return endingQty;
    }

    public void setEndingQty(int endingQty) {
        this.endingQty = endingQty;
    }

    public int getAlertAtQty() {
        return alertAtQty;
    }

    public void setAlertAtQty(int alertAtQty) {
        this.alertAtQty = alertAtQty;
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

    public MstOutlet getOutlet() {
        return outlet;
    }

    public void setOutlet(MstOutlet outlet) {
        this.outlet = outlet;
    }
}
