package com.astra.pos.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
@Table(name = "pos_t_purchase_order_detail")
public class TPrcsOrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @OneToOne(targetEntity = TPrcsRequest.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "po_id", referencedColumnName = "id", nullable = false)
    private TPrcsRequest poId;

    @NotNull
    @ManyToOne(targetEntity = AssItemInventory.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "inventory_id", referencedColumnName = "id", nullable = false)
    private AssItemInventory assItemInventory;

    @NotNull
    private int request_qty;

    private double unit_cost;

    private double sub_total;

    private Long createBy;

    @CreationTimestamp
    private Timestamp createOn;

    private Long modifiedBy;

    @UpdateTimestamp
    private Timestamp modifiedOn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TPrcsRequest getPoId() {
        return poId;
    }

    public void setPoId(TPrcsRequest poId) {
        this.poId = poId;
    }

    public AssItemInventory getAssItemInventory() {
        return assItemInventory;
    }

    public void setAssItemInventory(AssItemInventory assItemInventory) {
        this.assItemInventory = assItemInventory;
    }

    public int getRequest_qty() {
        return request_qty;
    }

    public void setRequest_qty(int request_qty) {
        this.request_qty = request_qty;
    }

    public double getUnit_cost() {
        return unit_cost;
    }

    public void setUnit_cost(double unit_cost) {
        this.unit_cost = unit_cost;
    }

    public double getSub_total() {
        return sub_total;
    }

    public void setSub_total(double sub_total) {
        this.sub_total = sub_total;
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
}
