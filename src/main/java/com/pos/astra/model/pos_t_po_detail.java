package com.pos.astra.model;

import org.graalvm.compiler.api.replacements.ClassSubstitution;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "pos_t_po_detail")
public class pos_t_po_detail {
    @Id
    private int id;

    @Column(name = "po_id")
    private int poId;

    @Column(name = "variant_id", nullable = false)
    private int variantId;

    @Column(name = "request_qty", nullable = false)
    private int requestQty;

    @Column(name = "unit_cost")
    private double unitCost;

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
