package io.renren.course.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import io.renren.course.entity.CourseRecordEntity;
import io.renren.dao.BaseDao;

/**
 * 
 * 
 * @author chenyuliao
 * @email 949395746@qq.com
 * @date 2017-05-09 18:43:47
 */
public interface CourseRecordDao extends BaseDao<CourseRecordEntity> {
	/**通过学生查找课程
	 * 
	 * @param studentId
	 * @return
	 */
	List<Integer> queryCourses(@Param("studentId") String studentId,@Param("status") String status);
	
	/**通过课程查找学生
	 * 
	 * @param courseId
	 * @return
	 */
	List<Integer> queryStudents(@Param("courseId") Integer courseId);
	
	int selectIdbyStuCid(@Param("courseId") Integer courseId,@Param("studentId") Integer studentId);
	
}
