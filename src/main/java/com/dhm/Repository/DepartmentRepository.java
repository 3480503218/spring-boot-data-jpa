package com.dhm.Repository;

import com.dhm.bean.Dept;
import org.springframework.data.jpa.repository.JpaRepository;

//继承JpaRepository来完成对数据库的操作
public interface DepartmentRepository extends JpaRepository<Dept,Integer> {

}
