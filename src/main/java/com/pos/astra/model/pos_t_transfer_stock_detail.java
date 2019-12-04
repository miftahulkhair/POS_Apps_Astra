package com.pos.astra.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "pos_t_transfer_stock_detail")
public class pos_t_transfer_stock_detail {
    @Id
    private int id;

    @Column(name = "transfer_id", nullable = false)
    private int transferId;

    @Column(name = "instock")
    private int instock;

    @Column(name = "variant_id", nullable = false)
    private int variantId;

    @Column(name = "transfer_qty", nullable = false)
    private int transferQty;

    @Column(name = "created_by")
    private int createdBy;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "modified_by")
    private int modifiedBy;

    @Column(name = "modified_on")
    private Date modifiiedOn;
}
