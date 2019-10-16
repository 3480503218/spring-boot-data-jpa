package com.dhm.bean;

import javax.persistence.*;

//使用jpa注解配置映射关系
@Entity //告诉jpa这是一个实体类，和数据表映射的类
@Table(name = "dept")  //指定和那个数据库的表映射,如果省略，默认类名小写
public class Dept {
    @Id  //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //主键自增
    private Integer id;

    @Column //这是和数据表对应的一个列，省略默认列名就是属性名
    private String departmentName;

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Dept() {
    }

    public Dept(Integer id, String departmentName) {
        this.id = id;
        this.departmentName = departmentName;
    }
}
