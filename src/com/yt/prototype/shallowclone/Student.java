package com.yt.prototype.shallowclone;

import com.yt.prototype.Address;

/**
 * 通过实现Cloneable实现浅拷贝
 */
public class Student implements Cloneable{
    private Integer num;
    private String name;
    private Address address;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
