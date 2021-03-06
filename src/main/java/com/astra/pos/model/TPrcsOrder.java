package com.astra.pos.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
@Table(name = "pos_t_po")
public class TPrcsOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(targetEntity = TPrcsRequest.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "pr_id", referencedColumnName = "id", insertable = false, updatable = false)
    private TPrcsRequest prId;

    @ManyToOne(targetEntity = MstOutlet.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "outlet_id", referencedColumnName = "id", insertable = false, updatable = false)
    private MstOutlet outletId;

    @ManyToOne(targetEntity = MstSupplier.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "supplier_id", referencedColumnName = "id", insertable = false, updatable = false)
    private MstSupplier supplierId;

    @Column(nullable = false)
    private Long  supplier_id;

    @Column(nullable = false)
    private Long  outlet_id;

    @Column(nullable = false)
    private Long  pr_id;

    @NotNull
    private String poNo;

    private String notes;

    @NotNull
    private Double grandTotal;

    @NotNull
    private String status;

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

    public MstOutlet getOutletId() {
        return outletId;
    }

    public void setOutletId(MstOutlet outletId) {
        this.outletId = outletId;
    }

    public MstSupplier getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(MstSupplier supplierId) {
        this.supplierId = supplierId;
    }

    public String getPoNo() {
        return poNo;
    }

    public void setPoNo(String prNo) {
        this.poNo = prNo;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(Double grandTotal) {
        this.grandTotal = grandTotal;
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

    public Long getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(Long supplier_id) {
        this.supplier_id = supplier_id;
    }

    public Long getOutlet_id() {
        return outlet_id;
    }

    public void setOutlet_id(Long outlet_id) {
        this.outlet_id = outlet_id;
    }

    public Long getPr_id() {
        return pr_id;
    }

    public void setPr_id(Long pr_id) {
        this.pr_id = pr_id;
    }
}