package org.openurp.teach.grade.service.internal

import org.openurp.teach.grade.service.CourseGradeSettings
import collection.mutable
import org.openurp.teach.code.GradeType
import org.openurp.teach.grade.domain.CourseGradeSetting
import org.openurp.teach.core.Project
import org.openurp.teach.code.model.GradeTypeBean

class CourseGradeSettingsImpl extends CourseGradeSettings {

  /**
   * 查询课程成绩设置
   *
   * @param project
   * @return
   */
  def getSetting(project: Project): CourseGradeSetting = {
    val courseGradeSetting = new CourseGradeSetting(project)
    //    val endGaElements = new mutable.HashSet[GradeType]
    //    endGaElements += new GradeTypeBean(3, "0003", "平时成绩", "Component Score")
    //    endGaElements += new GradeTypeBean(2, "0002", "期末成绩", "Final Exam Score")
    //    endGaElements += new GradeTypeBean(7, "0007", "总评成绩", "")
    //    courseGradeSetting.endGaElements = endGaElements
    courseGradeSetting
  }
}