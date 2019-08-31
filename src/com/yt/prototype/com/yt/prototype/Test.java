package com.yt.prototype.com.yt.prototype;

import com.yt.prototype.Address;
import com.yt.prototype.shallowclone.Student;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student();
        student.setNum(1);
        student.setName("小明");
        Address addr = new Address("朝阳区");
        student.setAddress(addr);

        Student cloneStu = (Student)student.clone();
        System.out.println("stu1:::" + student.getAddress().hashCode());
        System.out.println("stu2:::" + cloneStu.getAddress().hashCode());

        addr.setAdd("海淀区");
        System.out.println("stu1:::" + student.getAddress().getAdd());
        System.out.println("stu2:::" + cloneStu.getAddress().getAdd());
    }
}
