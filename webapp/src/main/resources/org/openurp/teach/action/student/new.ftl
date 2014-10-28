[#ftl]
[@b.head/]
[@b.toolbar title="新建专业方向"]bar.addBack();[/@]
[@b.tabs]
  [@b.form action="!save" theme="list"]
    [@b.textfield name="student.code" label="代码" value="${student.code!}" required="true" maxlength="20"/]
    [@b.textfield name="student.name" label="名称" value="${student.name!}" required="true" maxlength="20"/]
    [@b.textfield name="student.engName" label="英文名" value="${student.engName!}" maxlength="100"/]
    [@b.startend label="生效失效日期" 
      name="student.beginOn,student.endOn" required="false,false" 
      start=student.beginOn end=student.endOn format="date"/]
    [@b.textfield name="student.remark" label="备注" value="${student.remark!}" maxlength="30"/]
    [@b.select name="student.major.id" label="专业" value="${(student.major.id)!}" required="true" 
               style="width:200px;" items=majors option="id,name" empty="..."/]
    [@b.formfoot]
      [@b.reset/]&nbsp;&nbsp;[@b.submit value="action.submit"/]
    [/@]
  [/@]
[/@]
[@b.foot/]