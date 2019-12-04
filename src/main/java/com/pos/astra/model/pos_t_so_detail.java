package com.pos.astra.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "pos_t_so_detail")
public class pos_t_so_detail {
    @Id
    private int id;

    @Column(name = "so_id", nullable = false)
    private int soId;

    @Column(name = "variant_id", nullable = false)
    private int variantId;

    @Column(name = "qty", nullable = false)
    private int qty;

    @Column(name = "unit_price", nullable = false)
    private double unitPrice;

    @Column(name = "sub_total")
    private double subTotal;

    @Column(name = "created_by")
    private int createdBy;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "modified_by")
    private int modifiedBy;

    @Column(name = "modified_on")
    private Date modifiedOn;
}
