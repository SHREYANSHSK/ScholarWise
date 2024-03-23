package com.scholarwise.scholarwise;

public class TableView_Details {
    String Subject_Code, Subject_Name, Faculty_Name, Grade, Credits, Class_Conducted, Class_Attended,  FacultyNumber,Room_Number,Attendance;

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

    public void setRoom_Number(String Room_Number) {
        this.Room_Number = Room_Number;
    }

    public void setCredits(String Credits) {
        this.Credits = Credits;
    }

    public void setClass_Conducted(String Class_Conducted) {
        this.Class_Conducted = Class_Conducted;
    }

    public void setClass_Attended(String Class_Attended) {
        this.Class_Attended = Class_Attended;
    }


    public void setAttendance(String Attendance) {
        this.Attendance = Attendance;
    }

    public void setFacultyNumber(String FacultyNumber) {
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

    public String getRoom_Number() {
        return Room_Number;
    }

    public String getCredits() {
        return Credits;
    }

    public String getClass_Conducted() {
        return Class_Conducted;
    }

    public String getClass_Attended() {
        return Class_Attended;
    }



    public String getAttendance() {
        return Attendance;
    }

    public String getFacultyNumber() {
        return FacultyNumber;
    }

    public TableView_Details(String Subject_Code, String Subject_Name, String Faculty_Name, String Grade, String FacultyNumber, String Room_Number, String Credits, String Class_Conducted, String Class_Attended,String Attendance) {
        this.Subject_Code = Subject_Code;
        this.Subject_Name = Subject_Name;
        this.Faculty_Name = Faculty_Name;
        this.Grade = Grade;
        this.Room_Number = Room_Number;
        this.Credits = Credits;
        this.Class_Conducted = Class_Conducted;
        this.Attendance = Attendance;
        this.Class_Attended = Class_Attended;
        this.FacultyNumber = FacultyNumber;
    }
}
