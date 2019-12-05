package com.astra.pos.model;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "pos_t_transfer_stock")
public class TTransferStock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false)
    private Long fromOutlet;

    @Column(nullable = false)
    private Long toOutlet;

    @ManyToOne (fetch = FetchType.EAGER, targetEntity = MstOutlet.class)
    @JoinColumn(name = "fromOutlet", referencedColumnName = "id", insertable = false, updatable = false)
    private MstOutlet fromOutletObject;

    @ManyToOne (fetch = FetchType.EAGER, targetEntity = MstOutlet.class)
    @JoinColumn(name = "toOutlet", referencedColumnName = "id", insertable = false, updatable = false)
    private MstOutlet toOutletObject;


    private String notes;

    @Column(length = 20)
    @NotNull
    private String status;

    private Long createBy;

    @CreationTimestamp
    private Timestamp createOn;

    private Long modifiedBy;

    @UpdateTimestamp
    private Timestamp modifiedOn;

    @OneToMany(mappedBy = "transfer")
    private List<TTransferStockDetail> transferDetail;

    @OneToMany(mappedBy = "transfer")
    private List<TTransferStockHistory> history;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFromOutlet() {
        return fromOutlet;
    }

    public void setFromOutlet(Long fromOutlet) {
        this.fromOutlet = fromOutlet;
    }

    public Long getToOutlet() {
        return toOutlet;
    }

    public void setToOutlet(Long toOutlet) {
        this.toOutlet = toOutlet;
    }

    public MstOutlet getFromOutletObject() {
        return fromOutletObject;
    }

    public void setFromOutletObject(MstOutlet fromOutletObject) {
        this.fromOutletObject = fromOutletObject;
    }

    public MstOutlet getToOutletObject() {
        return toOutletObject;
    }

    public void setToOutletObject(MstOutlet toOutletObject) {
        this.toOutletObject = toOutletObject;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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

    public List<TTransferStockDetail> getTransferDetail() {
        return transferDetail;
    }

    public void setTransferDetail(List<TTransferStockDetail> transferDetail) {
        this.transferDetail = transferDetail;
    }



    //    public TTransferStockDetail getTransferDetail() {
//        return transferDetail;
//    }
//
//    public void setTransferDetail(TTransferStockDetail transferDetail) {
//        this.transferDetail = transferDetail;
//    }
}
