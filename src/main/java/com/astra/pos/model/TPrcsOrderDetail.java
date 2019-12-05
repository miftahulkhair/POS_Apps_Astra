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

    @OneToOne(targetEntity = TPrcsOrder.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "po_id", referencedColumnName = "id", insertable = false, updatable = false)
    private TPrcsOrder poId;

    @ManyToOne(targetEntity = AssItemInventory.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "inventory_id", referencedColumnName = "id", insertable = false, updatable = false)
    private AssItemInventory inventory;

    @Column(nullable = false)
    private Long  po_id;

//    @Column(nullable = false)
//    private Long  inventory_id;

    @NotNull
    private int request_qty;

    private Double unit_cost;

    private Double sub_total;

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

    public TPrcsOrder getPoId() {
        return poId;
    }

    public void setPoId(TPrcsOrder poId) {
        this.poId = poId;
    }

    public AssItemInventory getInventory() {
        return inventory;
    }

    public void setInventory(AssItemInventory inventory) {
        this.inventory = inventory;
    }

    public Long getPo_id() {
        return po_id;
    }

    public void setPo_id(Long po_id) {
        this.po_id = po_id;
    }

//    public Long getInventory_id() {
//        return inventory_id;
//    }
//
//    public void setInventory_id(Long inventory_id) {
//        this.inventory_id = inventory_id;
//    }

    public int getRequest_qty() {
        return request_qty;
    }

    public void setRequest_qty(int request_qty) {
        this.request_qty = request_qty;
    }

    public Double getUnit_cost() {
        return unit_cost;
    }

    public void setUnit_cost(Double unit_cost) {
        this.unit_cost = unit_cost;
    }

    public Double getSub_total() {
        return sub_total;
    }

    public void setSub_total(Double sub_total) {
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
