package com.pos.astra.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pos_t_adjustment")
public class pos_t_adjustment {
    @Id
    private int id;

    @ManyToOne(targetEntity = MstOutlet.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "outlet_id", referencedColumnName = "id")
//    @Column(name = "outlet_id")
    private int outletId;

    @Column(name = "notes", length = 255, nullable = true)
    private String notes;

    @Column(name = "status", length = 20, nullable = false)
    private String status;

    @Column(name = "created_by", nullable = true)
    private int createdBy;

    @Column(name = "created_on", nullable = true)
    private Date createdOn;

    @Column(name = "modified_by", nullable = true)
    private int modifiedBy;

    @Column(name = "modified_on", nullable = true)
    private Date modifiedOn;
}
