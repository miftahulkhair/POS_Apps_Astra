package com.astra.pos.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "pos_mst_region")
public class MstRegion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    @NotNull
    private String name;

    private Long createBy;

    @CreationTimestamp
    private Timestamp createOn;

    private Long modifiedBy;

    @UpdateTimestamp
    private Timestamp modifiedOn;

    @NotNull
    private boolean active;

    @ManyToOne
    @NotNull
    private MstProvince province;

    @OneToMany(mappedBy = "region", cascade = CascadeType.ALL)
    private List<MstDistrict> district;

    @OneToMany(mappedBy = "region")
    private List<MstCustomer> customer;

    @OneToMany(mappedBy = "region")
    private List<MstOutlet> outlet;

    @OneToMany(mappedBy = "region")
    private List<MstSupplier> supplier;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public MstProvince getProvince() {
        return province;
    }

    public void setProvince(MstProvince province) {
        this.province = province;
    }

    public List<MstDistrict> getDistrict() {
        return district;
    }

    public void setDistrict(List<MstDistrict> district) {
        this.district = district;
    }

    public List<MstCustomer> getCustomer() {
        return customer;
    }

    public void setCustomer(List<MstCustomer> customer) {
        this.customer = customer;
    }

    public List<MstOutlet> getOutlet() {
        return outlet;
    }

    public void setOutlet(List<MstOutlet> outlet) {
        this.outlet = outlet;
    }

    public List<MstSupplier> getSupplier() {
        return supplier;
    }

    public void setSupplier(List<MstSupplier> supplier) {
        this.supplier = supplier;
    }
}