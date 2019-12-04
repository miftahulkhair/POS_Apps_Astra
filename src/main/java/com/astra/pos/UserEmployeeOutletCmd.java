package com.astra.pos;

import com.astra.pos.model.AssEmployeeOutlet;
import com.astra.pos.model.MstUser;

public class UserEmployeeOutletCmd {
    private MstUser mstUser;
    private AssEmployeeOutlet assEmployeeOutlet;

    public MstUser getMstUser() {
        return mstUser;
    }

    public void setMstUser(MstUser mstUser) {
        this.mstUser = mstUser;
    }

    public AssEmployeeOutlet getAssEmployeeOutlet() {
        return assEmployeeOutlet;
    }

    public void setAssEmployeeOutlet(AssEmployeeOutlet assEmployeeOutlet) {
        this.assEmployeeOutlet = assEmployeeOutlet;
    }
}