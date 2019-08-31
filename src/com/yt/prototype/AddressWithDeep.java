package com.yt.prototype;

import java.io.Serializable;

public class AddressWithDeep implements Serializable {
    private static final long serialVersionUID = -1525119792475100651L;
    private String add;

    public AddressWithDeep(String add) {
        this.add = add;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }
}
