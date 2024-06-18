package com.attendanceandfacultymanage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.attendanceandfacultymanage.entity.ClassRoom;
//import com.attendanceandfacultymanage.entity.ClassSchedule;
import com.attendanceandfacultymanage.entity.ClassSchedule2;
import com.attendanceandfacultymanage.entity.Course;
import com.attendanceandfacultymanage.entity.Department;
import com.attendanceandfacultymanage.entity.Faculty;
import com.attendanceandfacultymanage.entity.Subject;
import com.attendanceandfacultymanage.service.AttendanceService;

@RestController
public class AttendanceController {
	@Autowired
	AttendanceService service = new AttendanceService();

	@PostMapping("/addclassroom")
	public ClassRoom addClassRoom(@RequestBody ClassRoom room) {

		return service.addClassRoom(room);

	}

	@GetMapping("/getallclassroom")
	public List<ClassRoom> getAllClassRoom() {

		return service.getAllClassRoom();

	}

	@GetMapping("/getclassroombyid/{id}")
	public ClassRoom getClassRoomById(@PathVariable int id) {

		return service.getClassRoomById(id);

	}

	@DeleteMapping("/deleteclassroom/{id}")
	public ClassRoom deleteClassRoomById(@PathVariable int id) {

		return service.deleteClassRoomById(id);

	}

	@PutMapping("/updateclassroom")
	public ClassRoom updateClassRoom(@RequestBody ClassRoom room) {

		return service.updateClassRoom(room);
	}

	@PostMapping("/addclassschedule")
	public ClassSchedule2 addClassSchedule(@RequestBody ClassSchedule2 schedule) {

		return service.addClassSchedule(schedule);

	}

	@GetMapping("/getallclassschedule")
	public List<ClassSchedule2> getAllClassSchedule() {

		return service.getAllClassSchedule();

	}

	@PostMapping("/addcourse")
	public Course addCourse(@RequestBody Course course) {

		return service.addCourse(course);

	}

	@GetMapping("/getclasschedulebyid/{id}")
	public Course getClassScheduleById(@PathVariable int id) {

		return service.getClassScheduleById(id);

	}

	@GetMapping("/getallcourses")
	public List<Course> getAllCourse() {

		return service.getAllCourse();

	}

	@PutMapping("/updatecourse")
	public Course updateCourse(@RequestBody Course course) {

		return service.updateCourse(course);

	}

	@DeleteMapping("/deletecourse/{id}")
	public Course deleteCourse(@PathVariable int id) {

		return service.deleteCourse(id);

	}

	@PostMapping("/addDepartment")
	public Department addDept(@RequestBody Department dept) {

		return service.addDept(dept);

	}

	@GetMapping("/getdepartment")
	public List<Department> getAllDepartments() {

		return service.getAllDepartments();
	}

	@GetMapping("/getdeptbyid/{id}")
	public Department getDeptById(@PathVariable int id) {

		return service.getDeptById(id);
	}

	@DeleteMapping("/deletedept/{id}")
	public Department deleteDept(@PathVariable int id) {

		return service.deleteDept(id);

	}

	@PutMapping("/updatedept")
	public Department updateDept(@RequestBody Department dept) {

		return service.updateDept(dept);

	}

	@PostMapping("/addfaculty")
	public Faculty addfaculty(@RequestBody Faculty f) {

		return service.addfaculty(f);

	}

	@GetMapping("/getfaculty")
	public List<Faculty> getAllfaculty() {

		return service.getAllfaculty();
	}

	@GetMapping("/getfacultybyid/{id}")
	public Faculty getfacultyById(@PathVariable int id) {

		return service.getfacultyById(id);
	}

	@DeleteMapping("/deletefaculty/{id}")
	public Faculty deletefaculty(@PathVariable int id) {

		return service.deletefaculty(id);

	}

	@PutMapping("/updatefaculty")
	public Faculty updateFaculty(@RequestBody Faculty f) {

		return service.updateFaculty(f);

	}

	@PostMapping("/addsubjects")
	public Subject addSubject(@RequestBody Subject s) {

		return service.addSubject(s);
	}

	@GetMapping("/getallsubjects")
	public List <Subject> getAllSubject() {

		return service.getAllSubject();

	}
	@GetMapping("/getsubjectbyid/{id}")
	public Subject getSubjectById(@PathVariable int id) {

		return service.getSubjectById(id);
	}
	@DeleteMapping("/deletefaculty/{id}")
	public Subject deleteSubject(@PathVariable int id) {

		return service.deleteSubject(id);

	}

	@PutMapping("/updatefaculty")
	public Subject updateSubject(@RequestBody Subject f) {

		return service.updateSubject(f);

	}

}

