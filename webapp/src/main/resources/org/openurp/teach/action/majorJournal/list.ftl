[#ftl]
[@b.head/]
[@b.grid items=majorJournals var="majorJournal"]
  [@b.gridbar]
    bar.addItem("${b.text("action.new")}",action.add());
    bar.addItem("${b.text("action.modify")}",action.edit());
    bar.addItem("${b.text("action.delete")}",action.remove("确认删除?"));
  [/@]
  [@b.row]
    [@b.boxcol /]
  [#--
    [@b.col width="15%" property="code" title="代码"]${majorJournal.code}[/@]
    [@b.col width="20%" property="name" title="名称"][@b.a href="!info?id=${majorJournal.id}"]${majorJournal.name}[/@][/@]
    [@b.col width="15%" property="enName" title="英文名"]${majorJournal.enName!}[/@]
    [@b.col width="15%" property="code" title="专业"]${majorJournal.major.name}[/@]
   --]
    [@b.col width="15%" property="code" title="学科门类"]${majorJournal.category.name}[/@]
    [@b.col width="15%" property="code" title="培养层次"]${majorJournal.education.name}[/@]
    [@b.col width="15%" property="code" title="部门"]${majorJournal.depart.name}[/@]
    [@b.col width="15%" property="code" title="修读年限"]${majorJournal.duration}[/@]
    [@b.col width="15%" property="code" title="教育部代码"]${majorJournal.disciplineCode}[/@]
    [@b.col width="5%" property="beginOn" title="生效时间"]${majorJournal.beginOn!}[/@]
    [@b.col width="5%" property="endOn" title="失效时间"]${majorJournal.endOn!}[/@]
  [/@]
[/@]
[@b.foot/]
