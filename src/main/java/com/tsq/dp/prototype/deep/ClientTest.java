package com.tsq.dp.prototype.deep;

import java.util.Arrays;

public class ClientTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("原型模式之深拷贝=======");
        Student student = new Student("小李", 11);
        Student student2 = new Student("小王", 12);
        Teacher teacher = new Teacher("张三", 33);
        teacher.setStudentList(Arrays.asList(student, student2));

        Teacher teacher2 = (Teacher) teacher.clone();

        System.out.println(teacher);
        System.out.println(teacher2);

        System.out.println(teacher.getStudentList());
        System.out.println(teacher2.getStudentList());
    }
}
