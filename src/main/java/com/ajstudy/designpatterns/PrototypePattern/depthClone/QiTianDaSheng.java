package com.ajstudy.designpatterns.PrototypePattern.depthClone;

import java.io.*;
import java.util.Date;

/**
 * @ClassName: QiTianDaSheng
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-11-04  13:16
 */
public class QiTianDaSheng extends Monkey implements Cloneable, Serializable {
    private static final long serialVersionUID = 3810373309215828782L;
    public JinGuBang jinGuBang;

    public QiTianDaSheng() {
        this.birthday = new Date();
        this.jinGuBang = new JinGuBang();
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }
    /*
    深克隆
     */
    private Object deepClone() {

        ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream;
        try {
            //输出对象
            objectOutputStream = new ObjectOutputStream(byteOutputStream);
            objectOutputStream.writeObject(this);

            ByteArrayInputStream byteInputStream = new ByteArrayInputStream(byteOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteInputStream);
            QiTianDaSheng qiTianDaSheng = (QiTianDaSheng) objectInputStream.readObject();
            qiTianDaSheng.birthday = new Date();
            return qiTianDaSheng;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //浅克隆
    public QiTianDaSheng shallowClone(QiTianDaSheng target){
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        qiTianDaSheng.height = target.height;
        qiTianDaSheng.weight = target.height;
        qiTianDaSheng.jinGuBang = target.jinGuBang;
        qiTianDaSheng.birthday = new Date();
        return qiTianDaSheng;
    }
}
