package com.scholarwise.scholarwise;

public class TableView_Details {
    String Subject_Code, Subject_Name, Faculty_Name, Grade, Attendence;
    int Room_Number, Credits, Class_Conducted, Class_Attended,  FacultyNumber;

    public void setSubject_Code(String Subject_Code) {
        this.Subject_Code = Subject_Code;
    }

    public void setSubject_Name(String Subject_Name) {
        this.Subject_Name = Subject_Name;
    }

    public void setFaculty_Name(String Faculty_Name) {
        this.Faculty_Name = Faculty_Name;
    }

    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    public void setRoom_Number(int Room_Number) {
        this.Room_Number = Room_Number;
    }

    public void setCredits(int Credits) {
        this.Credits = Credits;
    }

    public void setClass_Conducted(int Class_Conducted) {
        this.Class_Conducted = Class_Conducted;
    }

    public void setClass_Attended(int Class_Attended) {
        this.Class_Attended = Class_Attended;
    }

    

    public void setAttendence(String Attendence) {
        this.Attendence = Attendence;
    }

    public void setFacultyNumber(int FacultyNumber) {
        this.FacultyNumber = FacultyNumber;
    }

    public String getSubject_Code() {
        return Subject_Code;
    }

    public String getSubject_Name() {
        return Subject_Name;
    }

    public String getFaculty_Name() {
        return Faculty_Name;
    }

    public String getGrade() {
        return Grade;
    }

    public int getRoom_Number() {
        return Room_Number;
    }

    public int getCredits() {
        return Credits;
    }

    public int getClass_Conducted() {
        return Class_Conducted;
    }

    public int getClass_Attended() {
        return Class_Attended;
    }

    

    public String getAttendence() {
        return Attendence;
    }

    public int getFacultyNumber() {
        return FacultyNumber;
    }

    public TableView_Details(String Subject_Code, String Subject_Name, String Faculty_Name, String Grade, int FacultyNumber, int Room_Number, int Credits, int Class_Conducted, int Class_Attended, String Attendence) {
        this.Subject_Code = Subject_Code;
        this.Subject_Name = Subject_Name;
        this.Faculty_Name = Faculty_Name;
        this.Grade = Grade;
        this.Room_Number = Room_Number;
        this.Credits = Credits;
        this.Class_Conducted = Class_Conducted;
        
        this.Attendence = Attendence;
        this.Class_Attended = Class_Attended;
        this.FacultyNumber = FacultyNumber;
    }
}
