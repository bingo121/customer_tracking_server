package com.bingo.customer_tracking.entity;

public class VisitRecord {
    private Integer visitRecordId;
    private String visitRecordTitle;
    private String visitStaff;
    private String accompaniedStaff;
    private String dateTime;
    private String visitMethod;
    private String visitContent;
    private String visitPicture;
    private String visitVideo;
    private String note;

    private Customer customer;

    public Integer getVisitRecordId() {
        return visitRecordId;
    }

    public void setVisitRecordId(Integer visitRecordId) {
        this.visitRecordId = visitRecordId;
    }

    public String getVisitRecordTitle() {
        return visitRecordTitle;
    }

    public void setVisitRecordTitle(String visitRecordTitle) {
        this.visitRecordTitle = visitRecordTitle;
    }

    public String getVisitStaff() {
        return visitStaff;
    }

    public void setVisitStaff(String visitStaff) {
        this.visitStaff = visitStaff;
    }

    public String getAccompaniedStaff() {
        return accompaniedStaff;
    }

    public void setAccompaniedStaff(String accompaniedStaff) {
        this.accompaniedStaff = accompaniedStaff;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getVisitMethod() {
        return visitMethod;
    }

    public void setVisitMethod(String visitMethod) {
        this.visitMethod = visitMethod;
    }

    public String getVisitContent() {
        return visitContent;
    }

    public void setVisitContent(String visitContent) {
        this.visitContent = visitContent;
    }

    public String getVisitPicture() {
        return visitPicture;
    }

    public void setVisitPicture(String visitPicture) {
        this.visitPicture = visitPicture;
    }

    public String getVisitVideo() {
        return visitVideo;
    }

    public void setVisitVideo(String visitVideo) {
        this.visitVideo = visitVideo;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
