package com.astra.pos.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "pos_employee_outlet")
public class AssEmployeeOutlet
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @NotNull
    private MstEmployee employee;

    @ManyToOne
    @JoinColumn(name = "outlet_id", referencedColumnName = "id", insertable = false, updatable = false)
    private MstOutlet outlet;

    @Column(name = "outlet_id")
    private Long outlet_id;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MstEmployee getEmployee() {
        return employee;
    }

    public void setEmployee(MstEmployee employee) {
        this.employee = employee;
    }

    public MstOutlet getOutlet() {
        return outlet;
    }

    public void setOutlet(MstOutlet outlet) {
        this.outlet = outlet;
    }

    public Long getOutlet_id() {
        return outlet_id;
    }

    public void setOutlet_id(Long outlet_id) {
        this.outlet_id = outlet_id;
    }
}
