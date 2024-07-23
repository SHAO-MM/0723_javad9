package com.iweb.test1;

import com.iweb.dao.StudentDAO;
import com.iweb.dao.impl.StudentDAOImpl;
import com.iweb.pojo.Student;
import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/** JDBC java database connection
 * @author SHAO
 * @date 2024/7/22 下午2:47
 */
public class Test {
    public static void main(String[] args) {
//        // 驱动加载
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        System.out.println("驱动加载成功！");
//
//        // 获取jdbc连接
//        String url ="jdbc:mysql://localhost:3306/nuist?characterEncoding=utf-8";
//        String username = "root";
//        String password = "a12345";
//        Connection connection = null;
//        try {
//             connection
//                    = DriverManager.getConnection(url,username,password);
//        }catch(SQLException e){
//            e.printStackTrace();
//            }
//        System.out.println("获取连接成功！");
//
//        try{
//            Statement s = connection.createStatement();
//            // 准备一个SQL语句
//            String sql = "insert into stu " +
//                    "(NAME,gender,birthday,addr,qqnumber)" +
//                    "VALUES" +
//                    "('刘','女','2006-02-15','江苏宿迁',3124076825)";
//            // 运行sql语句
//            s.execute(sql);
//        } catch(SQLException e){
//            e.printStackTrace();
//            // 驱动加载 连接获取 创建编译语句对象 执行语句
//            // 驱动加载 连接获取 创建编译语句对象 执行语句 获取查询结果集
//        }



//        Student s1 = new Student(0,"无畏","男",new Date()
//                        ,"南京",110);
        StudentDAO studentDAO = new StudentDAOImpl();
//        studentDAO.insert(s1);

        Student s2 = new Student(6,"不留情","女",
                new Date(),"宿迁",119L);
        studentDAO.update(s2);











    }
}

