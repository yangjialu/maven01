package com.json;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
//        String json = "{name: '张三', age: 56}";
        // json字符串转为java对象
//        Student student = JSONObject.parseObject(json, Student.class);
//        System.out.println(student);
        //java对象转为json字符串
//        Student s = new Student();
//        s.setName("李四");
//        s.setAge(12);
//        String s1 = JSONObject.toJSONString(s);
//        System.out.println(s1);
        //json字符串数组转为list集合
        String json = "[{name: '张三', age: 56}, {name: '李四', age: 22}]";
        // ctl+alt+v
        List<Student> students = JSONObject.parseArray(json, Student.class);
        System.out.println(students);

    }
}
