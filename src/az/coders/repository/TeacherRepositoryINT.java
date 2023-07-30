package az.coders.repository;

import az.coders.model.Teacher;

import java.sql.SQLException;

public interface TeacherRepositoryINT {
     Teacher getTeacherByID(int id) throws SQLException;
     Teacher addTeacher() throws SQLException;
}
