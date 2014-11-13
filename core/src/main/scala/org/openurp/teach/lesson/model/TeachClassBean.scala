package org.openurp.teach.lesson.model

import org.beangle.data.model.bean.NamedBean
import org.openurp.base.Department
import org.openurp.teach.exam.ExamTake
import org.openurp.teach.lesson.{CourseLimitGroup, CourseTake, Lesson, TeachClass}

class TeachClassBean extends TeachClass with NamedBean {

  /** 教学班全名 */
  var fullname: String = _

  @scala.beans.BeanProperty
  /** 教学任务 */
  var lesson: Lesson = _

  /** 入学年份 */
  var grade: String = _

  /** 学生所在部门 */
  var depart: Department = _

  /** 学生人数 */
  var stdCount: Int = _

  /** 最大人数 */
  var limitCount: Int = _

  /**
   * 是否锁定人数上限
   */
  var limitLocked: Boolean = false

  /**
   * 保留人数<br>
   * 一个任务的真实的人数上限 = limitCount - reservedCount
   */
  var reservedCount: Int = _

  /** 上课名单 */
  var courseTakes: collection.mutable.Set[CourseTake] = _

  /**
   * 考试名单
   */
  var examTakes: collection.mutable.Set[ExamTake] = _

  /**
   * 限制条件组
   */
  var limitGroups: collection.mutable.Seq[CourseLimitGroup] = _

  /**
   * 计算某一考试类型的考生人数
   *
   * @param examType
   * @return
   */
  //  fix me
  //  public int calcExamCount(ExamBatch examBatch) {

  /**
   * 向教学班中添加一个学生修读信息<br>
   * 并且增加学生人数
   *
   * @param courseTake
   */
  //  fix me
  //  public void addCourseTake(CourseTake courseTake) {

  /**
   * 计算教学班中的实际人数.
   */
  //  fix me
  //  public void calcStdCount() {

  /**
   * 复制一个教学班，但并不复制他所在的教学任务引用<br>
   * 和教学班中的实际学生修读信息和实际学生数.
   *
   * @see java.lang.Object#clone()
   */
  //  fix me 
  //  public TeachClass clone() {

  /**
   * 返回正常参加上课的上课名单CourseTake
   *
   * @return
   */
  //  fix me 
  //  public Set<CourseTake> getNormalCourseTakes() {

  /**
   * 获取或者创建forClass=true的限制组<br>
   * 如果已经有，那么返回第一个forClass=true的限制组
   *
   * @return
   */
  //   fix me
  //  public CourseLimitGroup getOrCreateDefaultLimitGroup() {
}