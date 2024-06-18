package com.attendanceandfacultymanage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.attendanceandfacultymanage.dao.AttendanceDao;
import com.attendanceandfacultymanage.entity.ClassRoom;
//import com.attendanceandfacultymanage.entity.ClassSchedule;
import com.attendanceandfacultymanage.entity.ClassSchedule2;
import com.attendanceandfacultymanage.entity.Course;
import com.attendanceandfacultymanage.entity.Department;
import com.attendanceandfacultymanage.entity.Faculty;
import com.attendanceandfacultymanage.entity.Subject;

@Service
public class AttendanceService {
	@Autowired
	AttendanceDao dao = new AttendanceDao();

	public ClassRoom addClassRoom(ClassRoom room) {

		return dao.addClassRoom(room);

	}

	public List<ClassRoom> getAllClassRoom() {

		return dao.getAllClassRoom();

	}

	public ClassRoom getClassRoomById(int id) {

		return dao.getClassRoomById(id);

	}

	public ClassRoom updateClassRoom(ClassRoom room) {

		return dao.updateClassRoom(room);
	}

	public ClassRoom deleteClassRoomById(int id) {

		return dao.deleteClassRoomById(id);
	}

	public ClassSchedule2 addClassSchedule(ClassSchedule2 schedule) {

		return dao.addClassSchedule(schedule);

	}

	public List<ClassSchedule2> getAllClassSchedule() {

		return dao.getAllClassSchedule();

	}

	public Course addCourse(Course course) {

		return dao.addCourse(course);

	}

	public Course getClassScheduleById(int id) {

		return dao.getClassScheduleById(id);
	}

	public List<Course> getAllCourse() {

		return dao.getAllCourse();

	}

	public Course updateCourse(Course course) {

		return dao.updateCourse(course);
	}

	public Course deleteCourse(int id) {

		return dao.deleteCourse(id);
	}

	public Department addDept(@RequestBody Department dept) {

		return dao.addDept(dept);

	}

	public List<Department> getAllDepartments() {

		return dao.getAllDepartments();
	}

	public Department getDeptById(int id) {

		return dao.getDeptById(id);
	}

	public Department deleteDept(int id) {

		return dao.deleteDept(id);

	}

	public Department updateDept(Department dept) {

		return dao.updateDept(dept);

	}

	public Faculty addfaculty(Faculty f) {

		return dao.addfaculty(f);

	}

	public List<Faculty> getAllfaculty() {

		return dao.getAllfaculty();
	}

	public Faculty getfacultyById(int id) {

		return dao.getfacultyById(id);
	}

	public Faculty deletefaculty(int id) {

		return dao.deletefaculty(id);

	}

	public Faculty updateFaculty(Faculty dept) {

		return dao.updateFaculty(dept);

	}

	public Subject addSubject(Subject s) {

		return dao.addSubject(s);
	}

	public List <Subject> getAllSubject() {

		return dao.getAllSubject();

	}
	public Subject getSubjectById(int id) {

		return dao.getSubjectById(id);
	}
	public Subject deleteSubject(int id) {

		return dao.deleteSubject(id);

	}
	public Subject updateSubject(Subject f) {

		return dao.updateSubject(f);

	}
	
}
