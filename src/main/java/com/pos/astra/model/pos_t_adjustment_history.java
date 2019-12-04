package com.pos.astra.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "pos_t_adjustment_history")
public class pos_t_adjustment_history {
    @Id
    private int id;

    @Column(name = "adjustment_id", nullable = false)
    private int adjustmentId;

    @Column(name = "status", length = 20, nullable = false)
    private String status;

    @Column(name = "created_by")
    private int createdBy;

    @Column(name = "created_on")
    private Date createdOn;
}
