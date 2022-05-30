package com.ruanko.entity;

import javax.persistence.*;

@Entity
@Table(name = "driver")
public class Driver {
    /**
     * 编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int did;
    /**
     * 真实姓名
     */
    private String realname;
    /**
     * 密码
     */
//    private String dpassw;
    /**
     * 电话
     */
    private String phone;
    /**
     * 汽车型号
     */
    private String cartype;

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getPhone() {
            return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype;
    }
}

