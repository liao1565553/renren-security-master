package io.renren.personel.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chenyuliao
 * @email 949395746@qq.com
 * @date 2017-04-11 13:30:01
 */
public class TeacherEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer teacherId;
	//姓名
	private String name;
	//教龄
	private Float teachAge;
	//
	private Date lastUpdate;
	//出生日期
	private Date born;
	//性别
	private String sex;
	//主教科目
	private Integer subjectId;
	//
	private Integer positionId;

	/**
	 * 设置：
	 */
	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}
	/**
	 * 获取：
	 */
	public Integer getTeacherId() {
		return teacherId;
	}
	/**
	 * 设置：姓名
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：姓名
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：教龄
	 */
	public void setTeachAge(Float teachAge) {
		this.teachAge = teachAge;
	}
	/**
	 * 获取：教龄
	 */
	public Float getTeachAge() {
		return teachAge;
	}
	/**
	 * 设置：
	 */
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	/**
	 * 获取：
	 */
	public Date getLastUpdate() {
		return lastUpdate;
	}
	/**
	 * 设置：出生日期
	 */
	public void setBorn(Date born) {
		this.born = born;
	}
	/**
	 * 获取：出生日期
	 */
	public Date getBorn() {
		return born;
	}
	/**
	 * 设置：性别
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * 获取：性别
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * 设置：主教科目
	 */
	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}
	/**
	 * 获取：主教科目
	 */
	public Integer getSubjectId() {
		return subjectId;
	}
	/**
	 * 设置：
	 */
	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}
	/**
	 * 获取：
	 */
	public Integer getPositionId() {
		return positionId;
	}
}
