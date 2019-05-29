package com.bingo.customer_tracking.entity;

public class Customer {
    private Integer customerId;
    private String customerName;
    private String contactPhone;
    private String contactPerson;
    private Integer importantLevel;
    private String riskLevel;
    private String staffSize;
    private String customerPictures;
    private String dateTime;
    private String note;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public Integer getImportantLevel() {
        return importantLevel;
    }

    public void setImportantLevel(Integer importantLevel) {
        this.importantLevel = importantLevel;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public String getStaffSize() {
        return staffSize;
    }

    public void setStaffSize(String staffSize) {
        this.staffSize = staffSize;
    }

    public String getCustomerPictures() {
        return customerPictures;
    }

    public void setCustomerPictures(String customerPictures) {
        this.customerPictures = customerPictures;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
