package com.example.dao;

import com.example.model.StudentModel;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper
{
    @Select("select npm, name, gpa from student where npm = #{npm}")
    StudentModel selectStudent(@Param("npm") String npm);

    @Select("select npm, name, gpa from student")
    List<StudentModel> selectAllStudents();

    @Insert("INSERT INTO student (npm, name, gpa) VALUES (#{npm}, #{name}, #{gpa})")
    void addStudent(StudentModel student);

    @Delete("DELETE FROM STUDENT WHERE npm = #{npm}")
    void deleteStudent(@Param("npm") String npm);

    @Update("UPDATE STUDENT " +
            "SET name = #{name}, gpa = #{gpa} " +
            "WHERE npm = #{npm};")
    void updateStudent(StudentModel student);
}
