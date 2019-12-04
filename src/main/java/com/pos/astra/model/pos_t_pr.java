package com.pos.astra.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "pos_t_pr")
public class pos_t_pr {
    @Id
    private int id;

    @Column(name = "outlet_id", nullable = false)
    private int outletId;

    @Column(name = "ready_time")
    private Date readyTime;

    @Column(name = "pr_no", length = 20, nullable = false)
    private String prNo;

    @Column(name = "notes", length = 255)
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
