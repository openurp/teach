package org.openurp.teach.action

import org.beangle.webmvc.entity.action.RestfulAction
import org.openurp.teach.DirectionJournal
import org.openurp.base.Department
import org.beangle.data.jpa.dao.OqlBuilder
import org.openurp.base.code.Education
import org.beangle.data.model.Entity
import org.openurp.teach.Direction

class DirectionJournalAction extends RestfulAction[DirectionJournal]  {
  override def editSetting(entity: DirectionJournal) = {
    
    val directions = findItems(classOf[Direction])
    put("directions", directions)

    val educations = findItems(classOf[Education])
    put("educations", educations)
    
    
    val departs = findItems(classOf[Department])
    put("departs", departs)

 

    super.editSetting(entity)
  }

  private def findItems[T <: Entity[_]](clazz: Class[T]): Seq[T] = {
    val query = OqlBuilder.from(clazz)
    query.orderBy("name")
    val items = entityDao.search(query)
    items
  }
  
 

}





