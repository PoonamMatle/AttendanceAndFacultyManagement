package com.attendanceandfacultymanage.entity;

import java.time.DayOfWeek;
import java.time.LocalTime;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "class_schedule3")
public class ClassSchedule2 {
	@Id
	private int id;
	private int classRoomId;
	@Enumerated(EnumType.STRING)
    private DayOfWeek dayOfWeek;

    private LocalTime startTime;
    private LocalTime endTime;
	public ClassSchedule2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ClassSchedule2(int id, int classRoomId, DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
		super();
		this.id = id;
		this.classRoomId = classRoomId;
		this.dayOfWeek = dayOfWeek;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int in) {
		this.id = id;
	}
	public int getClassRoomId() {
		return classRoomId;
	}
	public void setClassRoomId(int classRoomId) {
		this.classRoomId = classRoomId;
	}
	public DayOfWeek getDayOfWeek() {
		return dayOfWeek;
	}
	public void setDayOfWeek(DayOfWeek dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	public LocalTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
	@Override
	public String toString() {
		return "ClassSchedule [in=" + id + ", classRoomId=" + classRoomId + ", dayOfWeek=" + dayOfWeek + ", startTime="
				+ startTime + ", endTime=" + endTime + "]";
	}
    

}
