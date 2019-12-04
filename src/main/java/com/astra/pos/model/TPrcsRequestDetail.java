package com.astra.pos.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
@Table(name = "pos_t_purchase_request_detail")
public class TPrcsRequestDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @OneToOne(targetEntity = TPrcsRequest.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "pr_id", referencedColumnName = "id", nullable = false)
    private TPrcsRequest prId;

    @NotNull
    @ManyToOne(targetEntity = AssItemInventory.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "inventory_id", referencedColumnName = "id", nullable = false)
    private AssItemInventory assItemInventory;

    @NotNull
    private int request_qty;

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

    public TPrcsRequest getPrId() {
        return prId;
    }

    public void setPrId(TPrcsRequest prId) {
        this.prId = prId;
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
