package com.weekstone.learn.designpattern.prototype;

import lombok.Data;

import java.io.*;

@Data
public class DeepPrototype implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;

    private String field1;
    private Address address;

    public DeepPrototype(String field1, Address address) {
        this.field1 = field1;
        this.address = address;
    }

    public void show() {
        System.out.println("ConcretePrototype: " + field1 + ", " + address.getAddress());
    }


    /**
     * 深拷贝：所有类型都拷贝。
     * @return ConcretePrototype
     */
    @Override
    public DeepPrototype clone() throws CloneNotSupportedException {
        // 序列化
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        

        // 反序列化
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        try {
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (DeepPrototype) ois.readObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
    }
}
