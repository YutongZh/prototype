package com.yt.prototype.shallowclone;

import com.yt.prototype.Address;

/**
 * 通过构造方法浅拷贝
 */
public class Student2 {
    private Integer num;
    private String name;
    private Address address;

    public Student2(Integer num, String name, Address address) {
        this.num = num;
        this.name = name;
        this.address = address;
    }

    public Student2(Student2 stu) {
        this.num = stu.num;
        this.name = stu.name;
        this.address = stu.address;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
