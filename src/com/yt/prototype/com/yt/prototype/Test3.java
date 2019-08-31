package com.yt.prototype.com.yt.prototype;

import com.yt.prototype.AddressWithDeep;
import com.yt.prototype.deepclone.Student3;

import java.io.*;

/**
 * 深克隆
 */
public class Test3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student3 student3 = new Student3(18,"小明",new AddressWithDeep("朝阳"));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(student3);
        oos.flush();

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        Student3 stuResult = (Student3) ois.readObject();

        System.out.println(student3.getAddress().hashCode());
        System.out.println(stuResult.getAddress().hashCode());
    }
}
