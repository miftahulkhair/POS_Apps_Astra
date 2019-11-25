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
    @NotNull
    private MstOutlet outlet;

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
}
