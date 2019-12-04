package com.pos.astra.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "pos_t_adjustment_detail")
public class pos_t_adjustment_detail {
    @Id
    private int id;

    @Column(name = "adjustment_id", nullable = false)
    private int adjustmentId;

    @Column(name = "variant_id", nullable = false)
    private int variantId;

    @Column(name = "in_stock", nullable = false)
    private int inStock;

    @Column(name = "actual_stock", nullable = false)
    private int actualStock;

    @Column(name = "created_by", nullable = true)
    private int createdBy;

    @Column(name = "created_on", nullable = true)
    private Date createdOn;

    @Column(name = "modified_by", nullable = true)
    private int modifiedBy;

    @Column(name = "modified_on", nullable = true)
    private Date modifiedOn;
}
