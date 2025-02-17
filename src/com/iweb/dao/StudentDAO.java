package com.iweb.dao;

import com.iweb.pojo.Student;

import java.util.List;

/**
 * @author SHAO
 * @date 2024/7/22 下午3:34
 */
public interface StudentDAO {
    /** 插入一个学生信息
     * @param student  要插入的学生信息 其中主键无需提供
     */
    void insert(Student student);

    /** 根据主键删除学生信息
     * @param id  要删除的学生信息的id
     */
    void delete(Integer id);

    /** 根据学生的id 修改学生的所有信息
     * @param student  提供要修改的学生id和需要被修改的字段值
     */
    void update(Student student);

    /** 统计表记录总数
     * @return 记录总数 如果为0 说明没有数据
     */
    Integer count();// select count(*) from student;

    /** 根据id查找对应的学生信息
     * @param id 要获取的学生id
     * @return  id对应的学生记录  如果对应的学生记录不存在 则返回null
     */
    Student findById(Integer id);

    /** 获取所有学生信息
     * @return 所有学生对应的集合
     */
    List<Student> findAll();

    /** 根据名称模糊查询学生
     * @param name 模糊查询关键字
     * @return 模糊查询的学生结果
     */
    List<Student> findByNameLike(String name);

    /** 根据学生名称进行模糊分页的查询
     * @param name 模糊查询关键字
     * @param start limit起始参数
     * @param limit 要分页截取的行数
     * @return 分页模糊查询的学生数据结果  若找不到 返回为null
     */
    List<Student> findByNameLikeWithLimit(String name,int start,int limit);


    /** 分页查询学生
     * @param start  limit起始查询
     * @param limit  要分页截取的行数
     * @return 分页查询的学生数据 如果没有数据 返回为null
     */
    List<Student> findWithLimit(int start,int limit);

}
