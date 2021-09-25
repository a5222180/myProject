package com.cwj.model;


public class Schedule {

  private long id;
  private String content;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp lastModifyTime;
  private java.sql.Timestamp requiredCompletionTime;
  private String actualCompletionTime;
  private long urgency;
  private String status;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getLastModifyTime() {
    return lastModifyTime;
  }

  public void setLastModifyTime(java.sql.Timestamp lastModifyTime) {
    this.lastModifyTime = lastModifyTime;
  }


  public java.sql.Timestamp getRequiredCompletionTime() {
    return requiredCompletionTime;
  }

  public void setRequiredCompletionTime(java.sql.Timestamp requiredCompletionTime) {
    this.requiredCompletionTime = requiredCompletionTime;
  }


  public String getActualCompletionTime() {
    return actualCompletionTime;
  }

  public void setActualCompletionTime(String actualCompletionTime) {
    this.actualCompletionTime = actualCompletionTime;
  }


  public long getUrgency() {
    return urgency;
  }

  public void setUrgency(long urgency) {
    this.urgency = urgency;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

}
