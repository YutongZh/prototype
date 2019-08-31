package com.yt.prototype.com.yt.prototype;

import com.yt.prototype.Address;
import com.yt.prototype.shallowclone.Student2;

public class Test2 {
    public static void main(String[] args) {
        Address address = new Address("朝阳");
        Student2 student1 = new Student2(1, "小明", address);
        Student2 student2 = new Student2(student1);

        System.out.println("stu1:::" + student1.getAddress());
        System.out.println("stu2:::" + student2.getAddress());

        address.setAdd("海淀");
        System.out.println("stu1:::" + student1.getAddress().getAdd());
        System.out.println("stu2:::" + student2.getAddress().getAdd());
    }
}
