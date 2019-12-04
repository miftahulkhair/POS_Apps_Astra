package com.astra.pos.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.List;

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


//    @ManyToOne
//    @NotNull
//    private MstProvince province;
//
//    @ManyToOne
//    @NotNull
//    private MstRegion region;
//
//    @ManyToOne
//    @NotNull
//    private MstDistrict district;

    @Column(nullable = false)
    private Long  province_id;

    @Column(nullable = false)
    private Long  region_id;

    @Column(nullable = false)
    private Long  district_id;

    @ManyToOne (fetch = FetchType.EAGER, targetEntity = MstProvince.class)
    @JoinColumn(name = "province_id", referencedColumnName = "id", insertable = false, updatable = false)
    private MstProvince province;

    @ManyToOne (fetch = FetchType.EAGER, targetEntity = MstRegion.class)
    @JoinColumn(name = "region_id", referencedColumnName = "id", insertable = false, updatable = false)
    private MstRegion region;

    @ManyToOne (fetch = FetchType.EAGER, targetEntity = MstDistrict.class)
    @JoinColumn(name = "district_id", referencedColumnName = "id", insertable = false, updatable = false)
    private MstDistrict district;


    @OneToMany(mappedBy = "outlet")
    private List<AssEmployeeOutlet> employeeOutlet;

//    @OneToOne(mappedBy = "outlet", cascade = CascadeType.ALL)
//    private AssItemInventory itemInventory;


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

    public Long getProvince_id() {
        return province_id;
    }

    public void setProvince_id(Long province_id) {
        this.province_id = province_id;
    }

    public Long getRegion_id() {
        return region_id;
    }

    public void setRegion_id(Long region_id) {
        this.region_id = region_id;
    }

    public Long getDistrict_id() {
        return district_id;
    }

    public void setDistrict_id(Long district_id) {
        this.district_id = district_id;
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

    public List<AssEmployeeOutlet> getEmployeeOutlet() {
        return employeeOutlet;
    }

    public void setEmployeeOutlet(List<AssEmployeeOutlet> employeeOutlet) {
        this.employeeOutlet = employeeOutlet;
    }

}