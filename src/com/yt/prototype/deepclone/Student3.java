package com.yt.prototype.deepclone;

import com.yt.prototype.AddressWithDeep;

import java.io.Serializable;

/**
 * 深克隆
 */
public class Student3 implements Serializable {

    //必须写序列化id
    private static final long serialVersionUID = -3964001917677172605L;

    private Integer num;
    private String name;
    private AddressWithDeep address;

    public Student3(Integer num, String name, AddressWithDeep address) {
        this.num = num;
        this.name = name;
        this.address = address;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressWithDeep getAddress() {
        return address;
    }

    public void setAddress(AddressWithDeep address) {
        this.address = address;
    }
}
