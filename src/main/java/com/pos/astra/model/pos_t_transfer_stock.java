package com.pos.astra.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "pos_t_transfer_stock")
public class pos_t_transfer_stock {
    @Id
    private int id;

    @Column(name = "from_outlet", nullable = false)
    private int fromOutlet;

    @Column(name = "to_outlet", nullable = false)
    private int toOutlet;

    @Column(name = "notes", length = 2555)
    private String notes;

    @Column(name = "status", length = 20, nullable = false)
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
