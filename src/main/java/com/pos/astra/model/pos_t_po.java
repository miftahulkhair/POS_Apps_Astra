package com.pos.astra.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pos_t_po")
public class pos_t_po {
    @Id
    private int id;

    @ManyToOne(targetEntity = pos_t_pr.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "pr_id", referencedColumnName = "id")
//    @Column(name = "pr_id", nullable = false)
    private pos_t_pr Pos_t_pr;

    @ManyToOne(targetEntity = MstOutlet.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "outlet_id", referencedColumnName = "id")
    private int MstOutlet mstOutlet;

    @ManyToOne(targetEntity = MstSupplier.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "supplier_id", referencedColumnName = "id")
//    @Column(name = "supplier_id", nullable = false)
    private int MstSupplier mstSupplier;

    @Column(name = "po_no", length = 20, nullable = false)
    private String poNo;

    @Column(name = "notes", length = 255)
    private String notes;

    @Column(name = "grand_total", nullable = false)
    private double grandTotal;

    @Column(name = "status", length = 20,nullable = false)
    private String status;

   @Column(name = "created_by")
    private int createdBy;

   @Column(name = "created_on")
    private Date createdOn;

   @Column(name = "modified_by")
    private int modifiedBy;

   @Column(name = "modified_on")
    private Date modifiedOn;
}

