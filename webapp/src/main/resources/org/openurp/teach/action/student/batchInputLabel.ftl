[#ftl]
[@b.head/]
[@b.toolbar title="批量指定标签学生"]bar.addBack();[/@]
[@b.form action="!searchStd" theme="list"]
  [@b.textarea label="多个学号" name="codes" rows="10" cols="80" required="true"/]
  [@b.formfoot]
    [@b.submit value="action.submit"/]
    [/@]
[/@]
[@b.foot/]