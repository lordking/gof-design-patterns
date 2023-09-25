package com.weekstone.learn.designpattern.prototype.standard;

import lombok.Data;

import java.io.*;

@Data
public class ConcretePrototype implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;

    private String field1;
    private Address address;

    public ConcretePrototype(String field1, Address address) {
        this.field1 = field1;
        this.address = address;
    }

    public void show() {
        System.out.println("ConcretePrototype: " + field1 + ", " + address.getAddress());
    }

    /**
     * 浅拷贝：只拷贝基本类型，引用类型只拷贝引用
     * @return ConcretePrototype
     */
    @Override
    public ConcretePrototype clone() throws CloneNotSupportedException {
        return  (ConcretePrototype) super.clone();
    }


    /**
     * 深拷贝：所有类型都拷贝。
     * 注意，如果需要深拷贝，那么所有引用类型都需要实现Serializable接口
     * @return ConcretePrototype
     */
    public ConcretePrototype deepClone() throws IOException, ClassNotFoundException {
        // 序列化
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        // 反序列化
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (ConcretePrototype) ois.readObject();
    }
}
