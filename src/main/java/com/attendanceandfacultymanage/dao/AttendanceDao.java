package com.attendanceandfacultymanage.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.attendanceandfacultymanage.entity.ClassRoom;
//import com.attendanceandfacultymanage.entity.ClassSchedule;
import com.attendanceandfacultymanage.entity.ClassSchedule2;
import com.attendanceandfacultymanage.entity.Course;
import com.attendanceandfacultymanage.entity.Department;
import com.attendanceandfacultymanage.entity.Faculty;
import com.attendanceandfacultymanage.entity.Subject;

@Repository
public class AttendanceDao {
	@Autowired
	SessionFactory sf;
//	ClassRoom room;

	public ClassRoom addClassRoom(ClassRoom room) {

		Session session = sf.openSession();
		session.get(ClassRoom.class, room.getId());
		session.save(room);
		session.beginTransaction().commit();
		return room;

	}

	public List<ClassRoom> getAllClassRoom() {
		Session session = sf.openSession();
		List<ClassRoom> room = session.createQuery("from ClassRoom", ClassRoom.class).list();

		return room;

	}

	public ClassRoom getClassRoomById(int id) {

		Session session = sf.openSession();
		ClassRoom room = session.get(ClassRoom.class, id);
		session.save(room);
		session.beginTransaction().commit();

		return room;

	}

	public ClassRoom deleteClassRoomById(int id) {

		Session session = sf.openSession();
		ClassRoom room = session.get(ClassRoom.class, id);
		session.delete(room);
		session.beginTransaction().commit();
		return room;

	}

	public ClassRoom updateClassRoom(ClassRoom room) {
		Session session = sf.openSession();
		session.update(room);
		session.beginTransaction().commit();
		return room;
	}

	public ClassSchedule2 addClassSchedule(ClassSchedule2 schedule) {

		Session session = sf.openSession();
		session.get(ClassSchedule2.class, schedule.getId());
		session.save(schedule);
		session.beginTransaction().commit();
		return schedule;

	}

	public List<ClassSchedule2> getAllClassSchedule() {
		Session session = sf.openSession();
		List<ClassSchedule2> list = session.createQuery("from ClassSchedule2", ClassSchedule2.class).list();
		return list;

	}

	public Course addCourse(Course course) {
		Session session = sf.openSession();
		session.get(Course.class, course.getId());
		session.save(course);
		session.beginTransaction().commit();
		return course;

	}

	public Course getClassScheduleById(int id) {

		Session session = sf.openSession();
		Course s = session.get(Course.class, id);
		session.save(s);
		session.beginTransaction().commit();
		return s;
	}

	public List<Course> getAllCourse() {
		Session session = sf.openSession();
		List<Course> list = session.createQuery("from Course", Course.class).list();

		return list;

	}

	public Course updateCourse(Course course) {
		Session session = sf.openSession();
		session.update(course);
		session.beginTransaction().commit();

		return course;

	}

	public Course deleteCourse(int id) {

		Session session = sf.openSession();
		Course c = session.get(Course.class, id);
		session.delete(c);
		session.beginTransaction().commit();
		return c;

	}

	public Department addDept(@RequestBody Department dept) {
		Session session = sf.openSession();
		session.get(Department.class, dept.getId());
		session.save(dept);
		session.beginTransaction().commit();

		return dept;

	}

	public List<Department> getAllDepartments() {

		Session session = sf.openSession();
		List<Department> d = session.createQuery("from Department ", Department.class).list();

		return d;
	}

	public Department getDeptById(int id) {
		Session session = sf.openSession();
		Department dept = session.get(Department.class, id);
		session.save(dept);
		session.beginTransaction().commit();

		return dept;
	}

	public Department deleteDept(int id) {
		Session session = sf.openSession();
		Department dept = session.get(Department.class, id);
		session.delete(dept);
		session.beginTransaction().commit();
		return dept;

	}

	public Department updateDept(Department dept) {
		Session session = sf.openSession();
//		Department dept1=session.get(Department.class,dept);
		session.update(dept);
		session.beginTransaction().commit();
		return dept;

	}

	public Faculty addfaculty(@RequestBody Faculty f) {
		Session session = sf.openSession();
		session.get(Faculty.class, f.getId());
		session.save(f);
		session.beginTransaction().commit();

		return f;

	}

	public List<Faculty> getAllfaculty() {

		Session session = sf.openSession();
		List<Faculty> d = session.createQuery("from  Faculty", Faculty.class).list();

		return d;
	}

	public Faculty getfacultyById(int id) {
		Session session = sf.openSession();
		Faculty dept = session.get(Faculty.class, id);
		session.save(dept);
		session.beginTransaction().commit();

		return dept;
	}

	public Faculty deletefaculty(int id) {
		Session session = sf.openSession();
		Faculty dept = session.get(Faculty.class, id);
		session.delete(dept);
		session.beginTransaction().commit();
		return dept;

	}

	public Faculty updateFaculty(Faculty dept) {
		Session session = sf.openSession();
//		Department dept1=session.get(Department.class,dept);
		session.update(dept);
		session.beginTransaction().commit();
		return dept;

	}

	public Subject addSubject(Subject s) {

		Session session = sf.openSession();
		session.get(Subject.class, s.getId());
		session.save(s);
		session.beginTransaction().commit();
		return s;

	}

	public List<Subject> getAllSubject() {
		Session session = sf.openSession();
		List<Subject> list = session.createQuery("from Subject ", Subject.class).list();
		return list;

	}

	public Subject getSubjectById(int id) {
		Session session = sf.openSession();
		Subject s = session.get(Subject.class, id);
		session.save(s);
		session.beginTransaction().commit();
		return s;
	}

	public Subject deleteSubject(int id) {
		Session session = sf.openSession();
		Subject dept = session.get(Subject.class, id);
		session.delete(dept);
		session.beginTransaction().commit();
		return dept;
	}
	public Subject updateSubject(Subject dept) {
		Session session = sf.openSession();
//		Department dept1=session.get(Department.class,dept);
		session.update(dept);
		session.beginTransaction().commit();
		return dept;

	}

	

}
