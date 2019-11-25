package com.astra.pos.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
@Table(name = "pos_mst_outlet")
public class MstOutlet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    @NotNull
    private String name;

    private String address;

    @Column(length = 16)
    private String phone;

    @Column(length = 50)
    private String email;

    @Column(length = 6)
    private String postalCode;

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

    @ManyToOne
    @NotNull
    private MstRegion region;

    @ManyToOne
    @NotNull
    private MstDistrict district;

    @OneToOne(mappedBy = "outlet", cascade = CascadeType.ALL)
    private AssEmployeeOutlet employeeOutlet;

    @OneToOne(mappedBy = "outlet", cascade = CascadeType.ALL)
    private AssItemInventory itemInventory;


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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
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

    public MstRegion getRegion() {
        return region;
    }

    public void setRegion(MstRegion region) {
        this.region = region;
    }

    public MstDistrict getDistrict() {
        return district;
    }

    public void setDistrict(MstDistrict district) {
        this.district = district;
    }

    public AssEmployeeOutlet getEmployeeOutlet() {
        return employeeOutlet;
    }

    public void setEmployeeOutlet(AssEmployeeOutlet employeeOutlet) {
        this.employeeOutlet = employeeOutlet;
    }

    public AssItemInventory getItemInventory() {
        return itemInventory;
    }

    public void setItemInventory(AssItemInventory itemInventory) {
        this.itemInventory = itemInventory;
    }
}