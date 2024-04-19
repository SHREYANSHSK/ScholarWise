package com.scholarwise.scholarwise;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;


public  class StudentView extends TeacherView {

    @FXML
    private AnchorPane CourseDetails;
    @FXML
    private AnchorPane MarksAnalyse;
    @FXML
    private AnchorPane Marks;


    @FXML
    private GridPane CT_DATES_UPDATES;
    @FXML
    private GridPane Marks_Grid;
    @FXML
    private GridPane Marks_Analyse_grid;


    @FXML
    private Button Course_Button;

    @FXML
    private Button Marks_Button;
    @FXML
    private Button Marks_Analyse_button;
    
    @FXML
    private Button logout_btn;

    @FXML
    private AnchorPane ProfileDetails;

    @FXML
    private Button Profile_Button;

    @FXML
    private AnchorPane TimeTable;

    @FXML
    private Button TimeTable_Button;


    @FXML
    private ListView<String> Marks_CourseName_listview;

    @FXML
    private ListView<String> Marks_DATES_listview;

    @FXML
    private TextField TimeTable_DayOrder;

    @FXML
    private Button TimeTable_EnterButton;

    @FXML
    private TextField TimeTable_Hour;

    @FXML
    private Button TimeTable_RemoveButton;

    @FXML
    private TextField TimeTable_SubName;
    
    @FXML
    private Label cc1;

    @FXML
    private Label cc2;

    @FXML
    private Label cc3;

    @FXML
    private Label cc4;

    @FXML
    private Label cc5;

    @FXML
    private Label cc6;

    @FXML
    private Label cc7;

    @FXML
    private Label cc8;

    @FXML
    private Label cn1;

    @FXML
    private Label cn2;

    @FXML
    private Label cn3;

    @FXML
    private Label cn4;

    @FXML
    private Label cn5;

    @FXML
    private Label cn6;

    @FXML
    private Label cn7;

    @FXML
    private Label cn8;

    @FXML
    private Label ct1;

    @FXML
    private Label ct2;

    @FXML
    private Label ct3;

    @FXML
    private Label ct4;

    @FXML
    private Label ct5;

    @FXML
    private Label ct6;

    @FXML
    private Label ct7;

    @FXML
    private Label ct8;

    @FXML
    private Label cta1;

    @FXML
    private Label cta2;

    @FXML
    private Label cta3;

    @FXML
    private Label cta4;

    @FXML
    private Label cta5;

    @FXML
    private Label cta6;

    @FXML
    private Label cta7;

    @FXML
    private Label cta8;

    @FXML
    private Label ctb1;

    @FXML
    private Label ctb2;

    @FXML
    private Label ctb3;

    @FXML
    private Label ctb4;

    @FXML
    private Label ctb5;

    @FXML
    private Label ctb6;

    @FXML
    private Label ctb7;

    @FXML
    private Label ctb8;

    @FXML
    private Label ctc1;

    @FXML
    private Label ctc2;

    @FXML
    private Label ctc3;

    @FXML
    private Label ctc4;

    @FXML
    private Label ctc5;

    @FXML
    private Label ctc6;

    @FXML
    private Label ctc7;
    
    @FXML
    private Label ctc8;

    @FXML
    private Label sgpa;

    @FXML
    private Label d1h1;

    @FXML
    private Label d1h10;

    @FXML
    private Label d1h2;

    @FXML
    private Label d1h3;

    @FXML
    private Label d1h4;

    @FXML
    private Label d1h5;

    @FXML
    private Label d1h6;

    @FXML
    private Label d1h7;

    @FXML
    private Label d1h8;

    @FXML
    private Label d1h9;

    @FXML
    private Label d2h1;

    @FXML
    private Label d2h10;

    @FXML
    private Label d2h2;

    @FXML
    private Label d2h3;

    @FXML
    private Label d2h4;

    @FXML
    private Label d2h5;

    @FXML
    private Label d2h6;

    @FXML
    private Label d2h7;

    @FXML
    private Label d2h8;

    @FXML
    private Label d2h9;

    @FXML
    private Label d3h1;

    @FXML
    private Label d3h10;

    @FXML
    private Label d3h2;

    @FXML
    private Label d3h3;

    @FXML
    private Label d3h4;

    @FXML
    private Label d3h5;

    @FXML
    private Label d3h6;

    @FXML
    private Label d3h7;

    @FXML
    private Label d3h8;

    @FXML
    private Label d3h9;

    @FXML
    private Label d4h1;

    @FXML
    private Label d4h10;

    @FXML
    private Label d4h2;

    @FXML
    private Label d4h3;

    @FXML
    private Label d4h4;

    @FXML
    private Label d4h5;

    @FXML
    private Label d4h6;

    @FXML
    private Label d4h7;

    @FXML
    private Label d4h8;

    @FXML
    private Label d4h9;

    @FXML
    private Label d5h1;

    @FXML
    private Label d5h10;

    @FXML
    private Label d5h2;

    @FXML
    private Label d5h3;

    @FXML
    private Label d5h4;

    @FXML
    private Label d5h5;
    @FXML
    private Label d5h6;

    @FXML
    private Label d5h7;

    @FXML
    private Label d5h8;

    @FXML
    private Label d5h9;
    
    @FXML
    private Label a1;

    @FXML
    private Label a2;

    @FXML
    private Label a3;

    @FXML
    private Label a4;

    @FXML
    private Label a5;

    @FXML
    private Label a6;

    @FXML
    private Label a7;

    @FXML
    private Label a8;

    @FXML
    private Label b1;

    @FXML
    private Label b2;

    @FXML
    private Label b3;

    @FXML
    private Label b4;

    @FXML
    private Label b5;

    @FXML
    private Label b6;

    @FXML
    private Label b7;

    @FXML
    private Label b8;
    
    @FXML
    private Label c1;

    @FXML
    private Label c2;

    @FXML
    private Label c3;

    @FXML
    private Label c4;

    @FXML
    private Label c5;

    @FXML
    private Label c6;

    @FXML
    private Label c7;

    @FXML
    private Label c8;
    
    @FXML
    private Label d1;
    @FXML
    private Label d2;
    @FXML
    private Label d3;
    @FXML
    private Label d4;
    @FXML
    private Label d5;
    @FXML
    private Label d6;
    @FXML
    private Label d7;
    @FXML
    private Label d8;

    
    @FXML
    private Label e1;

    @FXML
    private Label e2;

    @FXML
    private Label e3;

    @FXML
    private Label e4;

    @FXML
    private Label e5;

    @FXML
    private Label e6;

    @FXML
    private Label e7;

    @FXML
    private Label e8;

    @FXML
    private Label f1;

    @FXML
    private Label f2;

    @FXML
    private Label f3;

    @FXML
    private Label f4;

    @FXML
    private Label f5;

    @FXML
    private Label f6;

    @FXML
    private Label f7;

    @FXML
    private Label f8;

    @FXML
    private Label h1;

    @FXML
    private Label h2;

    @FXML
    private Label h3;

    @FXML
    private Label h4;

    @FXML
    private Label h5;

    @FXML
    private Label h6;

    @FXML
    private Label h7;

    @FXML
    private Label h8;

    @FXML
    private Label i1;

    @FXML
    private Label i2;

    @FXML
    private Label i3;

    @FXML
    private Label i4;

    @FXML
    private Label i5;

    @FXML
    private Label i6;

    @FXML
    private Label i7;

    @FXML
    private Label i8;

    @FXML
    private Label j1;

    @FXML
    private Label j2;

    @FXML
    private Label j3;

    @FXML
    private Label j4;

    @FXML
    private Label j5;

    @FXML
    private Label j6;

    @FXML
    private Label j7;

    @FXML
    private Label j8;

    @FXML
    private Label k1;

    @FXML
    private Label k2;

    @FXML
    private Label k3;

    @FXML
    private Label k4;

    @FXML
    private Label k5;

    @FXML
    private Label k6;

    @FXML
    private Label k7;

    @FXML
    private Label k8;

    @FXML
    private Label l1;

    @FXML
    private Label l2;

    @FXML
    private Label l3;

    @FXML
    private Label l4;

    @FXML
    private Label l5;

    @FXML
    private Label l6;

    @FXML
    private Label l7;

    @FXML
    private Label l8;


    @FXML
    private Label m1;

    @FXML
    private Label m2;

    @FXML
    private Label m3;

    @FXML
    private Label m4;

    @FXML
    private Label m5;

    @FXML
    private Label m6;

    @FXML
    private Label m7;

    @FXML
    private Label m8;

    @FXML
    private Label n1;

    @FXML
    private Label n2;

    @FXML
    private Label n3;

    @FXML
    private Label n4;

    @FXML
    private Label n5;

    @FXML
    private Label n6;

    @FXML
    private Label n7;

    @FXML
    private Label n8;

    @FXML
    private Label o1;

    @FXML
    private Label o2;

    @FXML
    private Label o3;

    @FXML
    private Label o4;

    @FXML
    private Label o5;

    @FXML
    private Label o6;

    @FXML
    private Label o7;

    @FXML
    private Label o8;

    @FXML
    private Label r1;

    @FXML
    private Label r2;

    @FXML
    private Label r3;

    @FXML
    private Label r4;

    @FXML
    private Label r5;

    @FXML
    private Label r6;

    @FXML
    private Label r7;

    @FXML
    private Label r8;

    @FXML
    private Label s1;

    @FXML
    private Label s2;

    @FXML
    private Label s3;

    @FXML
    private Label s4;

    @FXML
    private Label s5;

    @FXML
    private Label s6;

    @FXML
    private Label s7;

    @FXML
    private Label s8;

    @FXML
    private GridPane Course_attendance;



    @FXML
    private Label SrmMail;
   
    @FXML
    private Label user_name;

    @FXML
    private TextField Profile_BirthDate;

    @FXML
    private TextField Profile_Branch;


    @FXML
    private TextField Profile_City;

    @FXML
    private TextField Profile_Department;

    @FXML
    private TextField Profile_EmailId;

    @FXML
    private TextField Profile_FaEmail;

    @FXML
    private TextField Profile_FaPhno;

    @FXML
    private TextField Profile_FacultyAdvisor;

    @FXML
    private TextField Profile_Name;

    @FXML
    private TextField Profile_PersonalId;

    @FXML
    private TextField Profile_PhNo;

    @FXML
    private TextField Profile_RegId;

    @FXML
    private TextField Profile_Section;

    @FXML
    private TextField Profile_Semester;

    @FXML
    private TextField Profile_State;
   @FXML
	protected ComboBox<Integer> CourseDetails_SemesterButton;

    @FXML
    protected TableView<TableView_Details> CourseDetails_TableView;
    @FXML
    protected TableColumn<TableView_Details, String> TableView_Attendance;

    @FXML
    protected TableColumn<TableView_Details, String> TableView_ClassAttended;

    @FXML
    protected TableColumn<TableView_Details, String> TableView_ClassConducted;

   @FXML
   protected TableColumn<TableView_Details, String> TableView_Credits;

    @FXML
    protected TableColumn<TableView_Details, String> TableView_FacultyName;

    @FXML
    protected TableColumn<TableView_Details, String> TableView_FacultyNumber;

    @FXML
    protected TableColumn<TableView_Details, String> TableView_Grade;

    @FXML
    protected TableColumn<TableView_Details, String> TableView_RoomNo;

    @FXML
	protected TableColumn<TableView_Details, String> TableView_SubjectCode;

    @FXML
    protected TableColumn<TableView_Details, String> TableView_SubjectName;
    Integer[] CourseDetails_SemesterButton_list = {1,2,3,4,5,6,7,8};
   

   
    ObservableList<TableView_Details> listM;
    int index=-1;
    static String SemesterButton_value;
    
   
    
    
    static Connection con;
    static Connection con2;
    static PreparedStatement pst;
    static PreparedStatement pst2;

    static ResultSet rs;
    static ResultSet rs2;
   static String net_id;
   static String Password;
   static String Designation;
   static String NAME;
   static String REG_ID ;
   static String DEPARTMENT;
    static String COURSE,SEMESTER, SECTION, FACULTY_ADVISOR, FA_PHNO, FA_EMAIL, DOB, CITY, STATE, PHNO, PERSONAL_MAIL_ID, Net_id, Desingnation;
    String Subject_Code ,Subject_Name ,Faculty_Name,Grade,Room_Number,Credits,Class_Conducted,Class_Attended,Semester,Class_Held,FacultyNumber;

   static double roundOff;
    static List classConductedList=new ArrayList<>();



    public void initialize() {




	   
	   user_name.setText(NAME.toUpperCase());
	   CourseDetails.setVisible(false);
	   ProfileDetails.setVisible(true);
	   TimeTable.setVisible(false);
	   Marks.setVisible(false);
	   MarksAnalyse.setVisible(false);

	   
	   //ProfileView components
	   Profile_Name.setText(NAME.toUpperCase());
	   Profile_Department.setText(DEPARTMENT.toUpperCase());
	   Profile_RegId.setText(REG_ID.toUpperCase());
	   Profile_City.setText(CITY.toUpperCase());
	   Profile_BirthDate.setText(DOB.toUpperCase());       
       Profile_EmailId.setText(Net_id.toUpperCase());
       Profile_FaEmail.setText(FA_EMAIL.toUpperCase());
       Profile_FaPhno.setText(FA_PHNO.toUpperCase());
       Profile_FacultyAdvisor.setText(FACULTY_ADVISOR.toUpperCase());
       Profile_PersonalId.setText(PERSONAL_MAIL_ID.toUpperCase());
       Profile_PhNo.setText(PHNO.toUpperCase());
       Profile_Section.setText(SECTION.toUpperCase());
       Profile_Semester.setText(SEMESTER.toUpperCase());
       Profile_State.setText(STATE.toUpperCase());
       Profile_Branch.setText(COURSE.toUpperCase());

	   
	   
	   //CourseDetails components
       CourseDetails_SemesterButton.getItems().addAll(CourseDetails_SemesterButton_list);
        System.out.println(Subject_Code);
       TableView_SubjectCode.setCellValueFactory(new PropertyValueFactory<>("Subject_Code"));
		TableView_SubjectName.setCellValueFactory(new PropertyValueFactory<>("Subject_Name"));
		TableView_FacultyName.setCellValueFactory(new PropertyValueFactory<>("Faculty_Name"));
		TableView_RoomNo.setCellValueFactory(new PropertyValueFactory<TableView_Details, String>("Room_Number"));
        TableView_FacultyNumber.setCellValueFactory(new PropertyValueFactory<>("FacultyNumber"));
		TableView_Credits.setCellValueFactory(new PropertyValueFactory<>("Credits"));
		TableView_ClassConducted.setCellValueFactory(new PropertyValueFactory<>("Class_Conducted"));
		TableView_ClassAttended.setCellValueFactory(new PropertyValueFactory<>("Class_Attended"));
		TableView_Attendance.setCellValueFactory(new PropertyValueFactory<>("Attendance"));
		TableView_Grade.setCellValueFactory(new PropertyValueFactory<>("Grade"));

   	SemesterButton_value=SEMESTER;
	    try {
			listM=getDataUsers();	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    CourseDetails_TableView.setItems(listM);


	    
	
	  
   }
















    public static ObservableList<TableView_Details> getDataUsers()  throws SQLException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        con = DriverManager.getConnection("jdbc:mysql://localhost/ScholarWise_temp", "root", "0000");
        pst = con.prepareStatement("SELECT * FROM attendance where semester=? and Net_Id=?;");
        ObservableList<TableView_Details> list = FXCollections.observableArrayList();

        pst.setString(1,SemesterButton_value);
        pst.setString(2,Net_id);
        rs = pst.executeQuery();
        while (rs.next()) {
           String roomNo = String.valueOf(rs.getInt("Room_Number"));
            String attendance= String.valueOf(rs.getFloat("Attendance"));
            list.add(new TableView_Details(
                    rs.getString("Subject_Code"),
                    rs.getString("Subject_Name"),
                    rs.getString("Faculty_Name"),
                    rs.getString("Grade"),
                    roomNo,
                    rs.getString("Faculty_Number"),
                    rs.getString("Credits"),
//                    Integer.parseInt(rs.getString("Class_Ratio")),
                    rs.getString("Class_Attended"),
                    rs.getString("Class_Conducted"),
//                    Integer.parseInt(String.valueOf((Integer.parseInt(rs.getString("Class_Attended"))/Integer.parseInt(rs.getString("Class_Conducted")))*100))
                    attendance




            ) );
            System.out.println(rs.getString("Attendance"));

            classConductedList.add(Integer.parseInt(rs.getString("Class_Conducted")));
            for (TableView_Details element : list) {
                System.out.println(element);
            }

        }


        // Close resources in a finally block to ensure they are always closed
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

 
 
    @FXML
    void CourseView(ActionEvent event) {
    	CourseDetails.setVisible(true);
    	ProfileDetails.setVisible(false);
    	TimeTable.setVisible(false);
    	Marks.setVisible(false);
    	MarksAnalyse.setVisible(false);




        CourseDetails_SemesterButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                TableView_SubjectCode.setCellValueFactory(new PropertyValueFactory<TableView_Details,String>("Subject_Code"));
                TableView_SubjectName.setCellValueFactory(new PropertyValueFactory<TableView_Details,String>("Subject_Name"));
                TableView_FacultyName.setCellValueFactory(new PropertyValueFactory<TableView_Details,String>("Faculty_Name"));
                TableView_FacultyNumber.setCellValueFactory(new PropertyValueFactory<TableView_Details,String>("FacultyNumber"));
                TableView_RoomNo.setCellValueFactory(new PropertyValueFactory<TableView_Details,String>("Room_Number"));
                TableView_Credits.setCellValueFactory(new PropertyValueFactory<TableView_Details,String>("Credits"));
                TableView_ClassConducted.setCellValueFactory(new PropertyValueFactory<TableView_Details,String>("Class_Conducted"));
                TableView_ClassAttended.setCellValueFactory(new PropertyValueFactory<TableView_Details,String>("Class_Attended"));
                TableView_Attendance.setCellValueFactory(new PropertyValueFactory<TableView_Details,String>("Attendance"));
                TableView_Grade.setCellValueFactory(new PropertyValueFactory<TableView_Details,String>("Grade"));

                SemesterButton_value=Integer.toString(CourseDetails_SemesterButton.getValue());
                try {
                    listM=getDataUsers();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                CourseDetails_TableView.setItems(listM);
                try {
                    SGPA_calculator();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }



            }
        });
	    
	    
	  
	    
    }

   
   
   
    
    @FXML
    void Marks_Analyse(ActionEvent event) {

    
    	CourseDetails.setVisible(false);
    	ProfileDetails.setVisible(false);
    	TimeTable.setVisible(false);
    	Marks.setVisible(false);
    	MarksAnalyse.setVisible(true);
   	

    }
    @FXML
    void Marks_Analyse_back(ActionEvent event) {

    
    	CourseDetails.setVisible(false);
    	ProfileDetails.setVisible(false);
    	TimeTable.setVisible(false);
    	Marks.setVisible(true);
    	MarksAnalyse.setVisible(false);
   	

    }

    @FXML
    void MarksView(ActionEvent event) throws SQLException {
    	CourseDetails.setVisible(false);
    	ProfileDetails.setVisible(false);
    	TimeTable.setVisible(false);
    	Marks.setVisible(true);
    	MarksAnalyse.setVisible(false);

    	
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        con = DriverManager.getConnection("jdbc:mysql://localhost/ScholarWise_temp", "root", "0000");
        con2 = DriverManager.getConnection("jdbc:mysql://localhost/ScholarWise_temp", "root", "0000");

		 List<String> Course_Name_data = new ArrayList<>();
		 List<String> Course_Code_data = new ArrayList<>();
		 List<String> Faculty_data = new ArrayList<>();
		 List<String> Faculty_PhNo_data = new ArrayList<>();
		 List<String> CT_1_THEORY_data = new ArrayList<>();
		 List<String> CT_1_P_data = new ArrayList<>();
		 List<String> CT_1_I_data = new ArrayList<>();
		 List<String> CT_2_THEORY_data = new ArrayList<>();
		 List<String> CT_2_P_data = new ArrayList<>();
		 List<String> CT_2_I_data = new ArrayList<>();
		 List<String> CT_3_THEORY_data = new ArrayList<>();
		 List<String> CT_3_P_data = new ArrayList<>();
		 List<String> CT_3_I_data = new ArrayList<>();
        ObservableList<String> Information_SUBJECT_NAME = FXCollections.observableArrayList();
        ObservableList<String> Information_DATES = FXCollections.observableArrayList();

        


       
pst=con.prepareStatement("select* from Marks where semester=? and Net_id=?");
pst2=con2.prepareStatement("select SUBJECT_NAME,DATES from information");

pst.setString(1,SEMESTER);
pst.setString(2,Net_id);
rs=pst.executeQuery();
rs2=pst2.executeQuery();
while(rs.next()) {
	String Course_Name = rs.getString("Subject_Name");
	String Course_Code=rs.getString("Subject_Code");
	String Faculty=rs.getString("Faculty");
	String Faculty_PhNo=rs.getString("Faculty_PhNo");
	String CT_1_THEORY=rs.getString("CT_1_THEORY");
	String CT_1_P=rs.getString("CT_1_P");
	String CT_1_I=rs.getString("CT_1_I");
	String CT_2_THEORY=rs.getString("CT_2_THEORY");
	String CT_2_P=rs.getString("CT_2_P");
	String CT_2_I=rs.getString("CT_2_I");
	String CT_3_THEORY=rs.getString("CT_3_THEORY");
	String CT_3_P=rs.getString("CT_3_P");
	String CT_3_I=rs.getString("CT_3_I");
	//adding items to array
	Course_Name_data.add(Course_Name);
	Course_Code_data.add(Course_Code);
	Faculty_data.add(Faculty);
	Faculty_PhNo_data.add(Faculty_PhNo);
	  CT_1_THEORY_data.add(CT_1_THEORY);
	  CT_1_P_data.add(CT_1_P);
	  CT_1_I_data.add(CT_1_I);
	  CT_2_THEORY_data.add(CT_2_THEORY);
	  CT_2_P_data.add(CT_2_P);
	  CT_2_I_data.add(CT_2_I);
	  CT_3_THEORY_data.add(CT_3_THEORY);
	  CT_3_P_data.add(CT_3_P);
	  CT_3_I_data .add(CT_3_I);

            }
        String[] CT1 = new String[CT_1_THEORY_data.size()];
        String[] CT2 = new String[CT_2_THEORY_data.size()];
        String[] CT3 = new String[CT_3_THEORY_data.size()];
        String[] Overall = new String[CT_3_THEORY_data.size()];
        String[] CT1_Total = new String[CT_1_THEORY_data.size()];
        String[] CT2_Total = new String[CT_2_THEORY_data.size()];
        String[] CT3_Total = new String[CT_3_THEORY_data.size()];
        String[] Overall_Total = new String[CT_3_THEORY_data.size()];


while (rs2.next()){
    String SUBJECT_NAME=rs2.getString("SUBJECT_NAME");
    String DATES=rs2.getString("DATES");

    Information_SUBJECT_NAME.add(SUBJECT_NAME);
    Information_DATES.add(DATES);
}

        //System.out.println(Float.parseFloat((CT_3_I_data.get(2).substring(0,CT_3_I_data.get(2).indexOf("/"))))
        // +Float.parseFloat((CT_3_THEORY_data.get(2).substring(0,CT_3_THEORY_data.get(2).indexOf("/"))))+Float.parseFloat((CT_3_P_data.get(2).substring(0,CT_3_P_data.get(2).indexOf("/")))))

try {
for(int i=0;i<CT_1_THEORY_data.size();i++) {

    CT1[i]= Float.toString((Float.parseFloat((CT_1_THEORY_data.get(i).substring(0,CT_1_THEORY_data.get(i).indexOf("/"))))+Float.parseFloat((CT_1_I_data.get(i).substring(0,CT_1_I_data.get(i).indexOf("/"))))+Float.parseFloat((CT_1_P_data.get(i).substring(0,CT_1_P_data.get(i).indexOf("/"))))));
	CT2[i]= Float.toString((Float.parseFloat((CT_2_THEORY_data.get(i).substring(0,CT_2_THEORY_data.get(i).indexOf("/"))))+Float.parseFloat((CT_2_I_data.get(i).substring(0,CT_2_I_data.get(i).indexOf("/"))))+Float.parseFloat((CT_2_P_data.get(i).substring(0,CT_2_P_data.get(i).indexOf("/"))))));
	CT3[i]= Float.toString((Float.parseFloat((CT_3_THEORY_data.get(i).substring(0,CT_3_THEORY_data.get(i).indexOf("/"))))+Float.parseFloat((CT_3_I_data.get(i).substring(0,CT_3_I_data.get(i).indexOf("/"))))+Float.parseFloat((CT_3_P_data.get(i).substring(0,CT_3_P_data.get(i).indexOf("/"))))));
	Overall[i]=Float.toString(Float.parseFloat(CT1[i])+Float.parseFloat(CT2[i])+Float.parseFloat(CT3[i]));

    CT1_Total[i] = Float.toString((Float.parseFloat((CT_1_THEORY_data.get(i).substring(CT_1_THEORY_data.get(i).indexOf("/")+1)))+Float.parseFloat((CT_1_I_data.get(i).substring(CT_1_I_data.get(i).indexOf("/")+1)))+Float.parseFloat((CT_1_P_data.get(i).substring(CT_1_P_data.get(i).indexOf("/")+1)))));
    CT2_Total[i] = Float.toString((Float.parseFloat((CT_2_THEORY_data.get(i).substring(CT_2_THEORY_data.get(i).indexOf("/")+1)))+Float.parseFloat((CT_2_I_data.get(i).substring(CT_2_I_data.get(i).indexOf("/")+1)))+Float.parseFloat((CT_2_P_data.get(i).substring(CT_2_P_data.get(i).indexOf("/")+1)))));
    CT3_Total[i] = Float.toString((Float.parseFloat((CT_3_THEORY_data.get(i).substring(CT_3_THEORY_data.get(i).indexOf("/")+1)))+Float.parseFloat((CT_3_I_data.get(i).substring(CT_3_I_data.get(i).indexOf("/")+1)))+Float.parseFloat((CT_3_P_data.get(i).substring(CT_3_P_data.get(i).indexOf("/")+1)))));
    Overall_Total[i]= Float.toString(Float.parseFloat(CT1_Total[i])+Float.parseFloat(CT2_Total[i])+Float.parseFloat(CT3_Total[i]));
}
}catch(ArrayIndexOutOfBoundsException e) {
	e.printStackTrace();
}
//CT_DATES PART


       Marks_CourseName_listview.setItems(Information_SUBJECT_NAME);
       Marks_DATES_listview.setItems(Information_DATES);
        Marks_CourseName_listview.setMouseTransparent( true );
        Marks_DATES_listview.setMouseTransparent( true );
        Marks_CourseName_listview.setStyle("-fx-control-inner-background: #373737;-fx-border-color: #373737;-fx-text-fill: #121212;");
        Marks_DATES_listview.setStyle("-fx-control-inner-background: #373737;-fx-border-color: #373737;-fx-text-fill: #000000;");




//MARKS_PART

            for (int row = 1; row < Course_Name_data.size(); row++) {
                Label label = new Label();
                label.setText(Course_Name_data.get(row));
                label.setTextFill(Paint.valueOf("white"));
                label.setPadding(new Insets(0,0,0,10));
                label.setWrapText(true);
                Marks_Grid.add(label,0,row);

            }

            for (int row = 1; row < Course_Code_data.size(); row++) {
                Label label = new Label();
                label.setText(Course_Code_data.get(row));
                label.setTextFill(Paint.valueOf("white"));
                label.setPadding(new Insets(0,0,0,10));
                label.setWrapText(true);
                Marks_Grid.add(label,1,row);

            }
            for (int row = 1; row < Faculty_data.size(); row++) {
                Label label = new Label();
                label.setText(Faculty_data.get(row)+ "\n" +"(" + Faculty_PhNo_data.get(row) +")");
                label.setTextFill(Paint.valueOf("white"));
                label.setPadding(new Insets(0,0,0,10));
                label.setWrapText(true);
                Marks_Grid.add(label,2,row);

            }
            for (int row = 1; row < CT1.length; row++) {
                Label label = new Label();
                label.setText(CT1[row] + "/" + CT1_Total[row]);
                label.setTextFill(Paint.valueOf("white"));
                label.setPadding(new Insets(0,0,0,10));
                label.setWrapText(true);
                Marks_Grid.add(label,3,row);

            }
        for (int row = 1; row < CT2.length; row++) {
            Label label = new Label();
            label.setText(CT2[row] + "/" + CT2_Total[row]);
            label.setTextFill(Paint.valueOf("white"));
            label.setPadding(new Insets(0,0,0,10));
            label.setWrapText(true);
            Marks_Grid.add(label,4,row);

        }
        for (int row = 1; row < CT3.length; row++) {
            Label label = new Label();
            label.setText(CT3[row] + "/" + CT3_Total[row]);
            label.setTextFill(Paint.valueOf("white"));
            label.setPadding(new Insets(0,0,0,10));
            label.setWrapText(true);
            Marks_Grid.add(label,5,row);
        }
        for (int row = 1; row < Overall.length; row++) {
            Label label = new Label();
            label.setText(Overall[row] + "/" + Overall_Total[row]);
            label.setTextFill(Paint.valueOf("white"));
            label.setPadding(new Insets(0,0,0,10));
            label.setWrapText(true);
            Marks_Grid.add(label,6,row);
        }


        //Marks Analyse part
        for (int row = 1; row < Course_Name_data.size(); row++) {
                Label label = new Label();
                label.setText(Course_Name_data.get(row));
                label.setTextFill(Paint.valueOf("white"));
                label.setPadding(new Insets(0,0,0,10));
            label.setWrapText(true);
            Marks_Analyse_grid.add(label,0,row);

            }

            for (int row = 1; row < Course_Code_data.size(); row++) {
                Label label = new Label();
                label.setText(Course_Code_data.get(row));
                label.setTextFill(Paint.valueOf("white"));
                label.setPadding(new Insets(0,0,0,10));
                label.setWrapText(true);
                Marks_Analyse_grid.add(label,1,row);

            }
            for (int row = 1; row < Faculty_data.size(); row++) {
                Label label = new Label();
                label.setText(Faculty_data.get(row));
                label.setTextFill(Paint.valueOf("white"));
                label.setPadding(new Insets(0,0,0,10));
                label.setWrapText(true);
                Marks_Analyse_grid.add(label,2,row);

            }
            for (int row = 1; row < CT_1_THEORY_data.size(); row++) {
                Label label = new Label();
                label.setText(CT_1_THEORY_data.get(row));
                label.setTextFill(Paint.valueOf("white"));
                label.setPadding(new Insets(0,0,0,10));
                label.setWrapText(true);
                Marks_Analyse_grid.add(label,3,row);

            }
        for (int row = 1; row < CT_1_P_data.size(); row++) {
            Label label = new Label();
            label.setText(CT_1_P_data.get(row));
            label.setTextFill(Paint.valueOf("white"));
            label.setPadding(new Insets(0,0,0,10));
            label.setWrapText(true);
            Marks_Analyse_grid.add(label,4,row);

        }
        for (int row = 1; row < CT_1_I_data.size(); row++) {
            Label label = new Label();
            label.setText(CT_1_I_data.get(row));
            label.setTextFill(Paint.valueOf("white"));
            label.setPadding(new Insets(0,0,0,10));
            label.setWrapText(true);
            Marks_Analyse_grid.add(label,5,row);
        }

     for (int row = 1; row < CT_2_THEORY_data.size(); row++) {
                Label label = new Label();
                label.setText(CT_2_THEORY_data.get(row));
                label.setTextFill(Paint.valueOf("white"));
                label.setPadding(new Insets(0,0,0,10));
         label.setWrapText(true);
                Marks_Analyse_grid.add(label,6,row);

            }
        for (int row = 1; row < CT_2_P_data.size(); row++) {
            Label label = new Label();
            label.setText(CT_2_P_data.get(row));
            label.setTextFill(Paint.valueOf("white"));
            label.setPadding(new Insets(0,0,0,10));
            label.setWrapText(true);
            Marks_Analyse_grid.add(label,7,row);

        }
        for (int row = 1; row < CT_2_I_data.size(); row++) {
            Label label = new Label();
            label.setText(CT_2_I_data.get(row));
            label.setTextFill(Paint.valueOf("white"));
            label.setPadding(new Insets(0,0,0,10));
            label.setWrapText(true);
            Marks_Analyse_grid.add(label,8,row);
        }

     for (int row = 1; row < CT_3_THEORY_data.size(); row++) {
                Label label = new Label();
                label.setText(CT_3_THEORY_data.get(row));
                label.setTextFill(Paint.valueOf("white"));
                label.setPadding(new Insets(0,0,0,10));
         label.setWrapText(true);
                Marks_Analyse_grid.add(label,9,row);

            }
        for (int row = 1; row < CT_3_P_data.size(); row++) {
            Label label = new Label();
            label.setText(CT_3_P_data.get(row));
            label.setTextFill(Paint.valueOf("white"));
            label.setPadding(new Insets(0,0,0,10));
            label.setWrapText(true);
            Marks_Analyse_grid.add(label,10,row);

        }
        for (int row = 1; row < CT_3_I_data.size(); row++) {
            Label label = new Label();
            label.setText(CT_3_I_data.get(row));
            label.setTextFill(Paint.valueOf("white"));
            label.setPadding(new Insets(0,0,0,10));
            label.setWrapText(true);
            Marks_Analyse_grid.add(label,11,row);
        }
        for (int row = 1; row < Overall.length; row++) {
            Label label = new Label();
            label.setText(Overall[row] + "/" + Overall_Total[row]);
            label.setTextFill(Paint.valueOf("white"));
            label.setPadding(new Insets(0,0,0,10));
            label.setWrapText(true);
            Marks_Analyse_grid.add(label,12,row);
        }


//    cn1.setText(Course_Name_data.get(0));
//    cn2.setText(Course_Name_data.get(1));
//    cn3.setText(Course_Name_data.get(2));
//    cn4.setText(Course_Name_data.get(3));
//    cn5.setText(Course_Name_data.get(4));
//   //cn6.setText(Course_Name_data.get(5));
////cn7.setText(Course_Name_data.get(6));
////n8.setText(Course_Name_data.get(7));
//
//
//
//
//a1.setText(Course_Name_data.get(0));
//a2.setText(Course_Name_data.get(1));
//a3.setText(Course_Name_data.get(2));
//a4.setText(Course_Name_data.get(3));
//a5.setText(Course_Name_data.get(4));
////a6.setText(Course_Name_data.get(5));
////a7.setText(Course_Name_data.get(6));
////a8.setText(Course_Name_data.get(7));
//
//
//cc1.setText(Course_Code_data.get(0));
//cc2.setText(Course_Code_data.get(1));
//cc3.setText(Course_Code_data.get(2));
//cc4.setText(Course_Code_data.get(3));
//cc5.setText(Course_Code_data.get(4));
////cc6.setText(Course_Code_data.get(5));
////cc7.setText(Course_Code_data.get(6));
////cc8.setText(Course_Code_data.get(7));
//
//b1.setText(Course_Code_data.get(0));
//b2.setText(Course_Code_data.get(1));
//b3.setText(Course_Code_data.get(2));
//b4.setText(Course_Code_data.get(3));
//b5.setText(Course_Code_data.get(4));
////b6.setText(Course_Code_data.get(5));
////b7.setText(Course_Code_data.get(6));
////b8.setText(Course_Code_data.get(7));
//
//
//ct1.setText(Faculty_data.get(0));
//ct2.setText(Faculty_data.get(1));
//ct3.setText(Faculty_data.get(2));
//ct4.setText(Faculty_data.get(3));
//ct5.setText(Faculty_data.get(4));
////ct6.setText(Faculty_data.get(5));
////ct7.setText(Faculty_data.get(6));
////ct8.setText(Faculty_data.get(7));
//
//c1.setText(Faculty_data.get(0));
//c2.setText(Faculty_data.get(1));
//c3.setText(Faculty_data.get(2));
//c4.setText(Faculty_data.get(3));
//c5.setText(Faculty_data.get(4));
////c6.setText(Faculty_data.get(5));
////c7.setText(Faculty_data.get(6));
////c8.setText(Faculty_data.get(7));
//
//
//d1.setText(CT_1_THEORY_data.get(0));
//d2.setText(CT_1_THEORY_data.get(1));
//d3.setText(CT_1_THEORY_data.get(2));
//d4.setText(CT_1_THEORY_data.get(3));
//d5.setText(CT_1_THEORY_data.get(4));
////d6.setText(CT_1_THEORY_data.get(5));
////d7.setText(CT_1_THEORY_data.get(6));
////d8.setText(CT_1_THEORY_data.get(7));

//
//e1.setText(CT_1_P_data.get(0));
//e2.setText(CT_1_P_data.get(1));
//e3.setText(CT_1_P_data.get(2));
//e4.setText(CT_1_P_data.get(3));
//e5.setText(CT_1_P_data.get(4));
////e6.setText(CT_1_P_data.get(5));
////e7.setText(CT_1_P_data.get(6));
////e8.setText(CT_1_P_data.get(7));
//
//
//f1.setText(CT_1_I_data.get(0));
//f2.setText(CT_1_I_data.get(1));
//f3.setText(CT_1_I_data.get(2));
//f4.setText(CT_1_I_data.get(3));
//f5.setText(CT_1_I_data.get(4));
////f6.setText(CT_1_I_data.get(5));
////f7.setText(CT_1_I_data.get(6));
////f8.setText(CT_1_I_data.get(7));
//
//h1.setText(CT_2_THEORY_data.get(0));
//h2.setText(CT_2_THEORY_data.get(1));
//h3.setText(CT_2_THEORY_data.get(2));
//h4.setText(CT_2_THEORY_data.get(3));
//h5.setText(CT_2_THEORY_data.get(4));
////h6.setText(CT_2_THEORY_data.get(5));
////h7.setText(CT_2_THEORY_data.get(6));
////h8.setText(CT_2_THEORY_data.get(7));
//
//i1.setText(CT_2_P_data.get(0));
//i2.setText(CT_2_P_data.get(1));
//i3.setText(CT_2_P_data.get(2));
//i4.setText(CT_2_P_data.get(3));
//i5.setText(CT_2_P_data.get(4));
////i6.setText(CT_2_P_data.get(5));
////i7.setText(CT_2_P_data.get(6));
////i8.setText(CT_2_P_data.get(7));
//
//j1.setText(CT_2_I_data.get(0));
//j2.setText(CT_2_I_data.get(1));
//j3.setText(CT_2_I_data.get(2));
//j4.setText(CT_2_I_data.get(3));
//j5.setText(CT_2_I_data.get(4));
////j6.setText(CT_2_I_data.get(5));
////j7.setText(CT_2_I_data.get(6));
////j8.setText(CT_2_I_data.get(7));
//
//k1.setText(CT_3_THEORY_data.get(0));
//k2.setText(CT_3_THEORY_data.get(1));
//k3.setText(CT_3_THEORY_data.get(2));
//k4.setText(CT_3_THEORY_data.get(3));
//k5.setText(CT_3_THEORY_data.get(4));
////k6.setText(CT_3_THEORY_data.get(5));
////k7.setText(CT_3_THEORY_data.get(6));
////k8.setText(CT_3_THEORY_data.get(7));
//
//l1.setText(CT_3_P_data.get(0));
//l2.setText(CT_3_P_data.get(1));
//l3.setText(CT_3_P_data.get(2));
//l4.setText(CT_3_P_data.get(3));
//l5.setText(CT_3_P_data.get(4));
////l6.setText(CT_3_P_data.get(5));
////l7.setText(CT_3_P_data.get(6));
////l8.setText(CT_3_P_data.get(7));
//
//
//m1.setText(CT_3_I_data.get(0));
//m2.setText(CT_3_I_data.get(1));
//m3.setText(CT_3_I_data.get(2));
//m4.setText(CT_3_I_data.get(3));
//m5.setText(CT_3_I_data.get(4));
////m6.setText(CT_3_I_data.get(5));
////m7.setText(CT_3_I_data.get(6));
////m8.setText(CT_3_I_data.get(7));
//
//
//
//
//cta1.setText(CT1[0]);
//cta2.setText(CT1[1]);
//cta3.setText(CT1[2]);
//cta4.setText(CT1[3]);
//cta5.setText(CT1[4]);
////cta6.setText(CT1[5]);
////cta7.setText(CT1[6]);
////cta8.setText(CT1[7]);
//
//
//ctb1.setText(CT2[0]);
//ctb2.setText(CT2[1]);
//ctb3.setText(CT2[2]);
//ctb4.setText(CT2[3]);
//ctb5.setText(CT2[4]);
////ctb6.setText(CT2[5]);
////ctb7.setText(CT2[6]);
////ctb8.setText(CT2[7]);
//
//ctc1.setText(CT3[0]);
//ctc2.setText(CT3[1]);
//ctc3.setText(CT3[2]);
//ctc4.setText(CT3[3]);
//ctc5.setText(CT3[4]);
////ctc6.setText(CT3[5]);
////ctc7.setText(CT3[6]);
////ctc8.setText(CT3[7]);
//
//o1.setText(Overall[0]);
//o2.setText(Overall[1]);
//o3.setText(Overall[2]);
//o4.setText(Overall[3]);
//o5.setText(Overall[4]);
////o6.setText(Overall[5]);
////o7.setText(Overall[6]);
////o8.setText(Overall[7]);
//
//n1.setText(Overall[0]);
//n2.setText(Overall[1]);
//n3.setText(Overall[2]);
//n4.setText(Overall[3]);
//n5.setText(Overall[4]);
////n6.setText(Overall[5]);
////n7.setText(Overall[6]);
////n8.setText(Overall[7]);
//
//    // Close resources in a finally block to ensure they are always closed
    try {
        if (rs != null) rs.close();
        if (pst != null) pst.close();
        if (con != null) con.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
   
    	
	
    }






    @FXML
    void ProfileView(ActionEvent event) {
    	CourseDetails.setVisible(false);
    	ProfileDetails.setVisible(true);
    	TimeTable.setVisible(false);
    	Marks.setVisible(false);
    	MarksAnalyse.setVisible(false);




    }

    @FXML
    void TimeTableView(ActionEvent event) {
    	CourseDetails.setVisible(false);
    	ProfileDetails.setVisible(false);
    	TimeTable.setVisible(true);
    	Marks.setVisible(false);
    	MarksAnalyse.setVisible(false);
    	
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/ScholarWise_temp", "root", "0000");
			pst = con.prepareStatement("SELECT * FROM timetable where net_id=?;");
			pst.setString(1, Net_id);
			rs=pst.executeQuery();
			while(rs.next()) {
				
				d1h1.setText(rs.getString("d1h1"));d1h2.setText(rs.getString("d1h2"));d1h3.setText(rs.getString("d1h3"));d1h4.setText(rs.getString("d1h4"));d1h5.setText(rs.getString("d1h5"));d1h6.setText(rs.getString("d1h6"));d1h7.setText(rs.getString("d1h7"));d1h8.setText(rs.getString("d1h8"));d1h9.setText(rs.getString("d1h9"));d1h10.setText(rs.getString("d1h10"));
    			d2h1.setText(rs.getString("d2h1"));d2h2.setText(rs.getString("d2h2"));d2h3.setText(rs.getString("d2h3"));d2h4.setText(rs.getString("d2h4"));d2h5.setText(rs.getString("d2h5"));d2h6.setText(rs.getString("d2h6"));d2h7.setText(rs.getString("d2h7"));d2h8.setText(rs.getString("d2h8"));d2h9.setText(rs.getString("d2h9"));d2h10.setText(rs.getString("d2h10"));
    			d3h1.setText(rs.getString("d3h1"));d3h2.setText(rs.getString("d3h2"));d3h3.setText(rs.getString("d3h3"));d3h4.setText(rs.getString("d3h4"));d3h5.setText(rs.getString("d3h5"));d3h6.setText(rs.getString("d3h6"));d3h7.setText(rs.getString("d3h7"));d3h8.setText(rs.getString("d3h8"));d3h9.setText(rs.getString("d3h9"));d3h10.setText(rs.getString("d3h10"));
    			d4h1.setText(rs.getString("d4h1"));d4h2.setText(rs.getString("d4h2"));d4h3.setText(rs.getString("d4h3"));d4h4.setText(rs.getString("d4h4"));d4h5.setText(rs.getString("d4h5"));d4h6.setText(rs.getString("d4h6"));d4h7.setText(rs.getString("d4h7"));d4h8.setText(rs.getString("d4h8"));d4h9.setText(rs.getString("d4h9"));d4h10.setText(rs.getString("d4h10"));
    			d5h1.setText(rs.getString("d5h1"));d5h2.setText(rs.getString("d5h2"));d5h3.setText(rs.getString("d5h3"));d5h4.setText(rs.getString("d5h4"));d5h5.setText(rs.getString("d5h5"));d5h6.setText(rs.getString("d5h6"));d5h7.setText(rs.getString("d5h7"));d5h8.setText(rs.getString("d5h8"));d5h9.setText(rs.getString("d5h9"));d5h10.setText(rs.getString("d5h10"));
	    		
	    	}
			  if (rs != null) rs.close();
	 	      if (pst != null) pst.close();
	 	      if (con != null) con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	
        
    	
    	
    }
    public void credential(String netId, String password, String designation) {
        if (designation.equals("Teacher")) {

            credential1(netId, password, designation);
        } else {

            net_id = netId;
            Password = password;
            Designation = designation;


            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/ScholarWise_temp", "root", "0000");
                pst = con.prepareStatement("SELECT * FROM studentdb where Net_id  IN(SELECT password FROM login where " +
                        "net_id=?)");

                pst.setString(1, net_id);


                rs = pst.executeQuery();

                if (rs.next()) {
                    NAME = rs.getString("NAME");
                    REG_ID = rs.getString("REG_ID");
                    DEPARTMENT = rs.getString("DEPARTMENT");
                    SECTION = rs.getString("SECTION");
                    DEPARTMENT = rs.getString("DEPARTMENT");
                    COURSE = rs.getString("COURSE");
                    SECTION = rs.getString("SECTION");
                    FACULTY_ADVISOR = rs.getString("FACULTY_ADVISOR");
                    FA_PHNO = rs.getString("FA_PHNO");
                    FA_EMAIL = rs.getString("FA_EMAIL");
                    DOB = rs.getString("DOB");
                    CITY = rs.getString("CITY");
                    STATE = rs.getString("STATE");
                    PHNO = rs.getString("PHNO");
                    PERSONAL_MAIL_ID = rs.getString("PERSONAL_MAIL_ID");
                    Net_id = rs.getString("Net_id");
                    Desingnation = rs.getString("Desingnation");
                    SEMESTER = rs.getString("SEMESTER");

                } else {
                    // Handle the case where no matching record is found
                    System.out.println("No matching record found.");
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                // Close resources in a finally block to ensure they are always closed
                try {
                    if (rs != null) rs.close();
                    if (pst != null) pst.close();
                    if (con != null) con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
   
    


    
	
    void SGPA_calculator() throws SQLException {
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        con = DriverManager.getConnection("jdbc:mysql://localhost/ScholarWise_temp", "root", "0000");
		
		 List<String> grade_data = new ArrayList<>();
		 List<String> credit_data = new ArrayList<>();

        float data1=0;
        float data2=0;
        float SGPA=0;
        int Grade_point=0;
pst=con.prepareStatement("select Credits,Grade from attendance where semester=? and Net_id=?");
pst.setString(1,SemesterButton_value);
pst.setString(2,Net_id);
rs=pst.executeQuery();

while(rs.next()) {
	String Grade_value = rs.getString("Grade");
	String Credit_values=rs.getString("Credits");
	grade_data.add(Grade_value);
	credit_data.add(Credit_values);
	
}

for(int i=0;i<grade_data.size();i++) {
	if(grade_data.get(i).equals("O")) {
		Grade_point=10;
	}
	else if(grade_data.get(i).equals("A+")) {
		Grade_point=9;
	}
	else if(grade_data.get(i).equals("A")) {
		Grade_point=8;
	}

	else if(grade_data.get(i).equals("B+")) {
		Grade_point=7;
	}

	else if(grade_data.get(i).equals("B")) {
		Grade_point=6;
	}
	else if(grade_data.get(i).equals("C")) {
		Grade_point=5;
	}
	else if(grade_data.get(i).equals("F")) {
		Grade_point=0;
	}

	else if(grade_data.get(i).equals("AB")) {
		Grade_point=0;
	}
	else if(grade_data.get(i).equals("I")){
		Grade_point=0;
	}

	data1+=Grade_point*Integer.parseInt(credit_data.get(i));
	data2+=Integer.parseInt(credit_data.get(i));

}

SGPA=data1/data2;

 roundOff = Math.round(SGPA * 100.00) / 100.00;



    // Close resources in a finally block to ensure they are always closed
    try {
        if (rs != null) rs.close();
        if (pst != null) pst.close();
        if (con != null) con.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    if(roundOff==0.0) {
    	sgpa.setText("-");
    }
    else {
        System.out.println(grade_data);
        System.out.println(credit_data);
      sgpa.setText(Double.toString(roundOff));
    }
    }


    @FXML
    void TimeTable_EnterButtonAct(ActionEvent event) {
    	String SubName=TimeTable_SubName.getText();
    	int DayOrder=Integer.parseInt(TimeTable_DayOrder.getText());
    	int Hour=Integer.parseInt(TimeTable_Hour.getText());
    	
    	try {
			TimeTable_dataRetrieval();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    	if(DayOrder==1) {
    		switch(Hour) {
    		case 1:
    			d1h1.setText(SubName);
    			break;
    		case 2:
    			d1h2.setText(SubName);
    			break;
    		case 3:
    			d1h3.setText(SubName);
    			break;
    		case 4:
    			d1h4.setText(SubName);
    			break;
    		case 5:
    			d1h5.setText(SubName);
    			break;
    		case 6:
    			d1h6.setText(SubName);
    			break;
    		case 7:
    			d1h7.setText(SubName);
    			break;
    		case 8:
    			d1h8.setText(SubName);
    			break;
    		case 9:
    			d1h9.setText(SubName);
    			break;
    		case 10:
    			d1h10.setText(SubName);
    			break;
    		default:
    			d1h1.setText("");
    			d1h2.setText("");
    			d1h3.setText("");
    			d1h4.setText("");
    			d1h5.setText("");
    			d1h6.setText("");
    			d1h7.setText("");
    			d1h8.setText("");
    			d1h9.setText("");
    			d1h10.setText("");
    		}
    	}
    	else if(DayOrder==2) {
    		switch(Hour) {
    		case 1:
    			d2h1.setText(SubName);
    			break;
    		case 2:
    			d2h2.setText(SubName);
    			break;
    		case 3:
    			d2h3.setText(SubName);
    			break;
    		case 4:
    			d2h4.setText(SubName);
    			break;
    		case 5:
    			d2h5.setText(SubName);
    			break;
    		case 6:
    			d2h6.setText(SubName);
    			break;
    		case 7:
    			d2h7.setText(SubName);
    			break;
    		case 8:
    			d2h8.setText(SubName);
    			break;
    		case 9:
    			d2h9.setText(SubName);
    			break;
    		case 10:
    			d2h10.setText(SubName);
    			break;
    		default:
    			d2h1.setText("");
    			d2h2.setText("");
    			d2h3.setText("");
    			d2h4.setText("");
    			d2h5.setText("");
    			d2h6.setText("");
    			d2h7.setText("");
    			d2h8.setText("");
    			d2h9.setText("");
    			d2h10.setText("");
    		}
    	}
    	else if(DayOrder==3) {
    		switch(Hour) {
    		case 1:
    			d3h1.setText(SubName);
    			break;
    		case 2:
    			d3h2.setText(SubName);
    			break;
    		case 3:
    			d3h3.setText(SubName);
    			break;
    		case 4:
    			d3h4.setText(SubName);
    			break;
    		case 5:
    			d3h5.setText(SubName);
    			break;
    		case 6:
    			d3h6.setText(SubName);
    			break;
    		case 7:
    			d3h7.setText(SubName);
    			break;
    		case 8:
    			d3h8.setText(SubName);
    			break;
    		case 9:
    			d3h9.setText(SubName);
    			break;
    		case 10:
    			d3h10.setText(SubName);
    			break;
    		default:
    			d3h1.setText("");
    			d3h2.setText("");
    			d3h3.setText("");
    			d3h4.setText("");
    			d3h5.setText("");
    			d3h6.setText("");
    			d3h7.setText("");
    			d3h8.setText("");
    			d3h9.setText("");
    			d3h10.setText("");
    		}
    	}
    	else if(DayOrder==4) {
    		switch(Hour) {
    		case 1:
    			d4h1.setText(SubName);
    			break;
    		case 2:
    			d4h2.setText(SubName);
    			break;
    		case 3:
    			d4h3.setText(SubName);
    			break;
    		case 4:
    			d4h4.setText(SubName);
    			break;
    		case 5:
    			d4h5.setText(SubName);
    			break;
    		case 6:
    			d4h6.setText(SubName);
    			break;
    		case 7:
    			d4h7.setText(SubName);
    			break;
    		case 8:
    			d4h8.setText(SubName);
    			break;
    		case 9:
    			d4h9.setText(SubName);
    			break;
    		case 10:
    			d4h10.setText(SubName);
    			break;
    		default:
    			d4h1.setText("");
    			d4h2.setText("");
    			d4h3.setText("");
    			d4h4.setText("");
    			d4h5.setText("");
    			d4h6.setText("");
    			d4h7.setText("");
    			d4h8.setText("");
    			d4h9.setText("");
    			d4h10.setText("");
    		}
    	}
    	else if(DayOrder==5) {
    		switch(Hour) {
    		case 1:
    			d5h1.setText(SubName);
    			break;
    		case 2:
    			d5h2.setText(SubName);
    			break;
    		case 3:
    			d5h3.setText(SubName);
    			break;
    		case 4:
    			d5h4.setText(SubName);
    			break;
    		case 5:
    			d5h5.setText(SubName);
    			break;
    		case 6:
    			d5h6.setText(SubName);
    			break;
    		case 7:
    			d5h7.setText(SubName);
    			break;
    		case 8:
    			d5h8.setText(SubName);
    			break;
    		case 9:
    			d5h9.setText(SubName);
    			break;
    		case 10:
    			d5h10.setText(SubName);
    			break;
    		default:
    			d5h1.setText("");
    			d5h2.setText("");
    			d5h3.setText("");
    			d5h4.setText("");
    			d5h5.setText("");
    			d5h6.setText("");
    			d5h7.setText("");
    			d5h8.setText("");
    			d5h9.setText("");
    			d5h10.setText("");
    		}
    	}
    }

    @FXML
   void TimeTable_RemoveButtonAct(ActionEvent event) {
    	int DayOrder=Integer.parseInt(TimeTable_DayOrder.getText());
    	int Hour=Integer.parseInt(TimeTable_Hour.getText());
    	try {
    		TimeTable_dataDeletion();
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	if(DayOrder==1) {
    		switch(Hour) {
    		case 1:
    			d1h1.setText(null);
    			break;
    		case 2:
    			d1h2.setText(null);
    			break;
    		case 3:
    			d1h3.setText(null);
    			break;
    		case 4:
    			d1h4.setText(null);
    			break;
    		case 5:
    			d1h5.setText(null);
    			break;
    		case 6:
    			d1h6.setText(null);
    			break;
    		case 7:
    			d1h7.setText(null);
    			break;
    		case 8:
    			d1h8.setText(null);
    			break;
    		case 9:
    			d1h9.setText(null);
    			break;
    		case 10:
    			d1h10.setText(null);
    			break;
    		default:
    			d1h1.setText("");
    			d1h2.setText("");
    			d1h3.setText("");
    			d1h4.setText("");
    			d1h5.setText("");
    			d1h6.setText("");
    			d1h7.setText("");
    			d1h8.setText("");
    			d1h9.setText("");
    			d1h10.setText("");
    		}
    	}
    	else if(DayOrder==2) {
    		switch(Hour) {
    		case 1:
    			d2h1.setText(null);
    			break;
    		case 2:
    			d2h2.setText(null);
    			break;
    		case 3:
    			d2h3.setText(null);
    			break;
    		case 4:
    			d2h4.setText(null);
    			break;
    		case 5:
    			d2h5.setText(null);
    			break;
    		case 6:
    			d2h6.setText(null);
    			break;
    		case 7:
    			d2h7.setText(null);
    			break;
    		case 8:
    			d2h8.setText(null);
    			break;
    		case 9:
    			d2h9.setText(null);
    			break;
    		case 10:
    			d2h10.setText(null);
    			break;
    		default:
    			d2h1.setText("");
    			d2h2.setText("");
    			d2h3.setText("");
    			d2h4.setText("");
    			d2h5.setText("");
    			d2h6.setText("");
    			d2h7.setText("");
    			d2h8.setText("");
    			d2h9.setText("");
    			d2h10.setText("");
    		}
    	}
    	else if(DayOrder==3) {
    		switch(Hour) {
    		case 1:
    			d3h1.setText(null);
    			break;
    		case 2:
    			d3h2.setText(null);
    			break;
    		case 3:
    			d3h3.setText(null);
    			break;
    		case 4:
    			d3h4.setText(null);
    			break;
    		case 5:
    			d3h5.setText(null);
    			break;
    		case 6:
    			d3h6.setText(null);
    			break;
    		case 7:
    			d3h7.setText(null);
    			break;
    		case 8:
    			d3h8.setText(null);
    			break;
    		case 9:
    			d3h9.setText(null);
    			break;
    		case 10:
    			d3h10.setText(null);
    			break;
    		default:
    			d3h1.setText("");
    			d3h2.setText("");
    			d3h3.setText("");
    			d3h4.setText("");
    			d3h5.setText("");
    			d3h6.setText("");
    			d3h7.setText("");
    			d3h8.setText("");
    			d3h9.setText("");
    			d3h10.setText("");
    		}
    	}
    	else if(DayOrder==4) {
    		switch(Hour) {
    		case 1:
    			d4h1.setText(null);
    			break;
    		case 2:
    			d4h2.setText(null);
    			break;
    		case 3:
    			d4h3.setText(null);
    			break;
    		case 4:
    			d4h4.setText(null);
    			break;
    		case 5:
    			d4h5.setText(null);
    			break;
    		case 6:
    			d4h6.setText(null);
    			break;
    		case 7:
    			d4h7.setText(null);
    			break;
    		case 8:
    			d4h8.setText(null);
    			break;
    		case 9:
    			d4h9.setText(null);
    			break;
    		case 10:
    			d4h10.setText(null);
    			break;
    		default:
    			d4h1.setText("");
    			d4h2.setText("");
    			d4h3.setText("");
    			d4h4.setText("");
    			d4h5.setText("");
    			d4h6.setText("");
    			d4h7.setText("");
    			d4h8.setText("");
    			d4h9.setText("");
    			d4h10.setText("");
    		}
    	}
    	else if(DayOrder==5) {
    		switch(Hour) {
    		case 1:
    			d5h1.setText(null);
    			break;
    		case 2:
    			d5h2.setText(null);
    			break;
    		case 3:
    			d5h3.setText(null);
    			break;
    		case 4:
    			d5h4.setText(null);
    			break;
    		case 5:
    			d5h5.setText(null);
    			break;
    		case 6:
    			d5h6.setText(null);
    			break;
    		case 7:
    			d5h7.setText(null);
    			break;
    		case 8:
    			d5h8.setText(null);
    			break;
    		case 9:
    			d5h9.setText(null);
    			break;
    		case 10:
    			d5h10.setText(null);
    			break;
    		default:
    			d5h1.setText("");
    			d5h2.setText("");
    			d5h3.setText("");
    			d5h4.setText("");
    			d5h5.setText("");
    			d5h6.setText("");
    			d5h7.setText("");
    			d5h8.setText("");
    			d5h9.setText("");
    			d5h10.setText("");
    		}
    	}

    }
    private void TimeTable_dataRetrieval() throws SQLException {
        ArrayList<String> netIdList= new ArrayList<>(){};

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        con=DriverManager.getConnection("jdbc:mysql://localhost/ScholarWise_temp", "root", "0000");
        pst=con.prepareStatement("select* from timetable;");

        rs=pst.executeQuery();
        while (rs.next()){netIdList.add(rs.getString("net_id"));}


        if(!(netIdList.contains(Net_id)) ) {


            pst=con.prepareStatement("INSERT INTO timetable (net_id) VALUES (?);");
            pst.setString(1 , Net_id);
            pst.executeUpdate();
            String columnName = "d" + TimeTable_DayOrder.getText() + "h" + TimeTable_Hour.getText();
            pst=con.prepareStatement("update timetable set " + columnName+ "=? where net_id=?;");
            pst.setString(1, TimeTable_SubName.getText());
            pst.setString(2, Net_id);
            pst.executeUpdate();

        }

        else if(netIdList.contains(Net_id)){


            String columnName = "d" + TimeTable_DayOrder.getText() + "h" + TimeTable_Hour.getText();
            pst=con.prepareStatement("update timetable set " + columnName+ "=? where net_id=?;");
            pst.setString(1, TimeTable_SubName.getText());
            pst.setString(2, Net_id);
            pst.executeUpdate();

        }

        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    
    
    
    void TimeTable_dataDeletion() throws SQLException, ClassNotFoundException {
 
    			Class.forName("com.mysql.cj.jdbc.Driver");
    			con=DriverManager.getConnection("jdbc:mysql://localhost/ScholarWise_temp", "root", "0000");
        
   	 
    	    		String columnName = "d" + TimeTable_DayOrder.getText() + "h" + TimeTable_Hour.getText();
    	    		
    	    		pst=con.prepareStatement("update timetable set " + columnName+ "=null where net_id=?;");
    	    		

    	    		
    	    		pst.setString(1, Net_id);
    	    		pst.executeUpdate();
 
    	    
    	    try {
    	        if (rs != null) rs.close();
    	        if (pst != null) pst.close();
    	        if (con != null) con.close();
    	    } catch (SQLException e) {
    	        e.printStackTrace();
    	    }
    
    	
    }


    @FXML
    void logoutBtn(ActionEvent event) throws IOException {
    	Stage primaryStage;
    	primaryStage=(Stage)logout_btn.getScene().getWindow();
    	primaryStage.close();
    	
    	
    	
    	Stage mainstage=new Stage();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/com/scholarwise/scholarwise/LoginMain.fxml"));


        Parent root = loader.load();

		Scene scene =new Scene(root);
		scene.getStylesheets().add(getClass().getResource("/com/scholarwise/scholarwise/style.css").toExternalForm());
		mainstage.setScene(scene);
		
		Image icon= new Image(String.valueOf(getClass().getResource("/com/scholarwise/scholarwise/images/logo_icon.png")));
		mainstage.getIcons().add(icon);
		mainstage.setTitle("ScholarWise");
		mainstage.setScene(scene);
		mainstage.setResizable(true);
		mainstage.setX(1);
		mainstage.setY(1);
//		mainstage.setFullScreen(true);
//		mainstage.setFullScreenExitHint("Press ESC to escape");
//		mainstage.setFullScreenExitKeyCombination(KeyCombination.valueOf("esc"));
		mainstage.show();

    }

















	public void d1h1_clicked(MouseEvent event) {
    	if(d1h1.getText()!=null) {
    		TimeTable_SubName.setText(d1h1.getText());
    	}
      
  	  TimeTable_DayOrder.setText("1");
  	  TimeTable_Hour.setText("1");
  }
    public void d1h2_clicked(MouseEvent event) {
    	if(d1h2.getText()!=null) {
    		TimeTable_SubName.setText(d1h2.getText());
    	}
    	
    	TimeTable_DayOrder.setText("1");
    	TimeTable_Hour.setText("2");
    }
    public void d1h3_clicked(MouseEvent event) {
    	if(d1h3.getText()!=null) {
    		TimeTable_SubName.setText(d1h3.getText());
    	}
    	
    	TimeTable_DayOrder.setText("1");
    	TimeTable_Hour.setText("3");
    }
    public void d1h4_clicked(MouseEvent event) {
    	if(d1h4.getText()!=null) {
    		TimeTable_SubName.setText(d1h4.getText());
    	}
    	
    	TimeTable_DayOrder.setText("1");
    	TimeTable_Hour.setText("4");
    }
    public void d1h5_clicked(MouseEvent event) {
    	if(d1h5.getText()!=null) {
    		TimeTable_SubName.setText(d1h5.getText());
    	}
    	
    	TimeTable_DayOrder.setText("1");
    	TimeTable_Hour.setText("5");
    }
    public void d1h6_clicked(MouseEvent event) {
    	if(d1h6.getText()!=null) {
    		TimeTable_SubName.setText(d1h6.getText());
    	}
    	
    	TimeTable_DayOrder.setText("1");
    	TimeTable_Hour.setText("6");
    }
    public void d1h7_clicked(MouseEvent event) {
    	if(d1h7.getText()!=null) {
    		TimeTable_SubName.setText(d1h7.getText());
    	}
    	
    	TimeTable_DayOrder.setText("1");
    	TimeTable_Hour.setText("7");
    }
    public void d1h8_clicked(MouseEvent event) {
    	if(d1h8.getText()!=null) {
    		TimeTable_SubName.setText(d1h8.getText());
    	}
    	
    	TimeTable_DayOrder.setText("1");
    	TimeTable_Hour.setText("8");
    }
    public void d1h9_clicked(MouseEvent event) {
    	if(d1h9.getText()!=null) {
    		TimeTable_SubName.setText(d1h9.getText());
    	}
    	
    	TimeTable_DayOrder.setText("1");
    	TimeTable_Hour.setText("9");
    }
    public void d1h10_clicked(MouseEvent event) {
    	if(d1h10.getText()!=null) {
    		TimeTable_SubName.setText(d1h10.getText());
    	}
    	
    	TimeTable_DayOrder.setText("1");
    	TimeTable_Hour.setText("10");
    }
    
    
    
    public void d2h1_clicked(MouseEvent event) {
    	if(d2h1.getText()!=null) {
    		TimeTable_SubName.setText(d2h1.getText());
    	}
    	
    	TimeTable_DayOrder.setText("2");
    	TimeTable_Hour.setText("1");
    }
    public void d2h2_clicked(MouseEvent event) {
    	if(d2h2.getText()!=null) {
    		TimeTable_SubName.setText(d2h2.getText());
    	}
    	
    	TimeTable_DayOrder.setText("2");
    	TimeTable_Hour.setText("2");
    }
    public void d2h3_clicked(MouseEvent event) {
    	if(d2h3.getText()!=null) {
    		TimeTable_SubName.setText(d2h3.getText());
    	}
    	
    	TimeTable_DayOrder.setText("2");
    	TimeTable_Hour.setText("3");
    }
    public void d2h4_clicked(MouseEvent event) {
    	if(d2h4.getText()!=null) {
    		TimeTable_SubName.setText(d2h4.getText());
    	}
    	
    	TimeTable_DayOrder.setText("2");
    	TimeTable_Hour.setText("4");
    }
    public void d2h5_clicked(MouseEvent event) {
    	if(d2h5.getText()!=null) {
    		TimeTable_SubName.setText(d2h5.getText());
    	}
    	
    	TimeTable_DayOrder.setText("2");
    	TimeTable_Hour.setText("5");
    }
    public void d2h6_clicked(MouseEvent event) {
    	if(d2h6.getText()!=null) {
    		TimeTable_SubName.setText(d2h6.getText());
    	}
    
    	TimeTable_DayOrder.setText("2");
    	TimeTable_Hour.setText("6");
    }
    public void d2h7_clicked(MouseEvent event) {
    	if(d2h7.getText()!=null) {
    		TimeTable_SubName.setText(d2h7.getText());
    	}
    	
    	TimeTable_DayOrder.setText("2");
    	TimeTable_Hour.setText("7");
    }
    public void d2h8_clicked(MouseEvent event) {
    	if(d2h8.getText()!=null) {
    		TimeTable_SubName.setText(d2h8.getText());
    	}
    
    	TimeTable_DayOrder.setText("2");
    	TimeTable_Hour.setText("8");
    }
    public void d2h9_clicked(MouseEvent event) {
    	if(d2h9.getText()!=null) {
    		TimeTable_SubName.setText(d2h9.getText());
    	}
    	
    	TimeTable_DayOrder.setText("2");
    	TimeTable_Hour.setText("9");
    }
    public void d2h10_clicked(MouseEvent event) {
    	if(d2h10.getText()!=null) {
    		TimeTable_SubName.setText(d2h10.getText());
    	}
     
  	  TimeTable_DayOrder.setText("2");
  	  TimeTable_Hour.setText("10");
  }
    
    
    
    
  public void d3h1_clicked(MouseEvent event) {
    	if(d3h1.getText()!=null) {
    		TimeTable_SubName.setText(d3h1.getText());
    	}
     
  	  TimeTable_DayOrder.setText("3");
  	  TimeTable_Hour.setText("1");
  }
  public void d3h2_clicked(MouseEvent event) {
	  if(d3h2.getText()!=null) {
  		TimeTable_SubName.setText(d3h2.getText());
  	}
	
  	  TimeTable_DayOrder.setText("3");
  	  TimeTable_Hour.setText("2");
  }
  public void d3h3_clicked(MouseEvent event) {
	  if(d3h3.getText()!=null) {
  		TimeTable_SubName.setText(d3h3.getText());
  	}
	  
  	  TimeTable_DayOrder.setText("3");
  	  TimeTable_Hour.setText("3");
  }
  public void d3h4_clicked(MouseEvent event) {
	  if(d3h4.getText()!=null) {
  		TimeTable_SubName.setText(d3h4.getText());
  	}
	  
  	  TimeTable_DayOrder.setText("3");
  	  TimeTable_Hour.setText("4");
  }
  public void d3h5_clicked(MouseEvent event) {
	  if(d3h5.getText()!=null) {
  		TimeTable_SubName.setText(d3h5.getText());
  	}
	  
  	  TimeTable_DayOrder.setText("3");
  	  TimeTable_Hour.setText("5");
  }
  public void d3h6_clicked(MouseEvent event) {
	  if(d3h6.getText()!=null) {
  		TimeTable_SubName.setText(d3h6.getText());
  	}
	  
  	  TimeTable_DayOrder.setText("3");
  	  TimeTable_Hour.setText("6");
  }
  public void d3h7_clicked(MouseEvent event) {
	  if(d3h7.getText()!=null) {
  		TimeTable_SubName.setText(d3h7.getText());
  	}
	 
  	  TimeTable_DayOrder.setText("3");
  	  TimeTable_Hour.setText("7");
  }
  public void d3h8_clicked(MouseEvent event) {
	  if(d3h8.getText()!=null) {
  		TimeTable_SubName.setText(d3h8.getText());
  	}
	 
  	  TimeTable_DayOrder.setText("3");
  	  TimeTable_Hour.setText("8");
  }
  public void d3h9_clicked(MouseEvent event) {
	  if(d3h9.getText()!=null) {
  		TimeTable_SubName.setText(d3h9.getText());
  	}
	  
  	  TimeTable_DayOrder.setText("3");
  	  TimeTable_Hour.setText("9");
  }
  public void d3h10_clicked(MouseEvent event) {
	  if(d3h10.getText()!=null) {
  		TimeTable_SubName.setText(d3h10.getText());
  	}
	 
	  TimeTable_DayOrder.setText("3");
	  TimeTable_Hour.setText("10");
}
    
   
  
  
  
  public void d4h1_clicked(MouseEvent event) {
	  if(d4h1.getText()!=null) {
	  		TimeTable_SubName.setText(d4h1.getText());
	  	}
	  
  	  TimeTable_DayOrder.setText("4");
  	  TimeTable_Hour.setText("1");
  }
  public void d4h2_clicked(MouseEvent event) {
	  if(d4h2.getText()!=null) {
	  		TimeTable_SubName.setText(d4h2.getText());
	  	}
	
  	  TimeTable_DayOrder.setText("4");
  	  TimeTable_Hour.setText("2");
  }
  public void d4h3_clicked(MouseEvent event) {
	  if(d4h3.getText()!=null) {
	  		TimeTable_SubName.setText(d4h3.getText());
	  	}
	 
  	  TimeTable_DayOrder.setText("4");
  	  TimeTable_Hour.setText("3");
  }
  public void d4h4_clicked(MouseEvent event) {
	  if(d4h4.getText()!=null) {
	  		TimeTable_SubName.setText(d4h4.getText());
	  	}
	  
  	  TimeTable_DayOrder.setText("4");
  	  TimeTable_Hour.setText("4");
  }
  public void d4h5_clicked(MouseEvent event) {
	  if(d4h5.getText()!=null) {
	  		TimeTable_SubName.setText(d4h5.getText());
	  	}
	 
  	  TimeTable_DayOrder.setText("4");
  	  TimeTable_Hour.setText("5");
  }
  public void d4h6_clicked(MouseEvent event) {
	  if(d4h6.getText()!=null) {
	  		TimeTable_SubName.setText(d4h6.getText());
	  	}
	 
  	  TimeTable_DayOrder.setText("4");
  	  TimeTable_Hour.setText("6");
  }
  public void d4h7_clicked(MouseEvent event) {
	  if(d4h7.getText()!=null) {
	  		TimeTable_SubName.setText(d4h7.getText());
	  	}
	 
  	  TimeTable_DayOrder.setText("4");
  	  TimeTable_Hour.setText("7");
  }
  public void d4h8_clicked(MouseEvent event) {
	  if(d4h8.getText()!=null) {
	  		TimeTable_SubName.setText(d4h8.getText());
	  	}
	 
  	  TimeTable_DayOrder.setText("4");
  	  TimeTable_Hour.setText("8");
  }
  public void d4h9_clicked(MouseEvent event) {
	  if(d4h9.getText()!=null) {
	  		TimeTable_SubName.setText(d4h9.getText());
	  	}
	 
  	  TimeTable_DayOrder.setText("4");
  	  TimeTable_Hour.setText("9");
  }
  public void d4h10_clicked(MouseEvent event) {
	  if(d4h10.getText()!=null) {
	  		TimeTable_SubName.setText(d4h10.getText());
	  	}
	 
	  TimeTable_DayOrder.setText("4");
	  TimeTable_Hour.setText("10");
}

  
  
  
  public void d5h1_clicked(MouseEvent event) {
	  if(d5h1.getText()!=null) {
	  		TimeTable_SubName.setText(d5h1.getText());
	  	}
	  
  	  TimeTable_DayOrder.setText("5");
  	  TimeTable_Hour.setText("1");
  }
  public void d5h2_clicked(MouseEvent event) {
	  if(d5h2.getText()!=null) {
	  		TimeTable_SubName.setText(d5h2.getText());
	  	}
	 
  	  TimeTable_DayOrder.setText("5");
  	  TimeTable_Hour.setText("2");
  }
  public void d5h3_clicked(MouseEvent event) {
	  if(d5h3.getText()!=null) {
	  		TimeTable_SubName.setText(d5h3.getText());
	  	}
	 
  	  TimeTable_DayOrder.setText("5");
  	  TimeTable_Hour.setText("3");
  }
  public void d5h4_clicked(MouseEvent event) {
	  if(d5h4.getText()!=null) {
	  		TimeTable_SubName.setText(d5h4.getText());
	  	}
	 
  	  TimeTable_DayOrder.setText("5");
  	  TimeTable_Hour.setText("4");
  }
  public void d5h5_clicked(MouseEvent event) {
	  if(d5h5.getText()!=null) {
	  		TimeTable_SubName.setText(d5h5.getText());
	  	}
	 
  	  TimeTable_DayOrder.setText("5");
  	  TimeTable_Hour.setText("5");
  }
  public void d5h6_clicked(MouseEvent event) {
	  if(d5h6.getText()!=null) {
	  		TimeTable_SubName.setText(d5h6.getText());
	  	}
	
  	  TimeTable_DayOrder.setText("5");
  	  TimeTable_Hour.setText("6");
  }
  public void d5h7_clicked(MouseEvent event) {
	  if(d5h7.getText()!=null) {
	  		TimeTable_SubName.setText(d5h7.getText());
	  	}
	 
  	  TimeTable_DayOrder.setText("5");
  	  TimeTable_Hour.setText("7");
  }
  public void d5h8_clicked(MouseEvent event) {
	  if(d5h8.getText()!=null) {
	  		TimeTable_SubName.setText(d5h8.getText());
	  	}
	  
  	  TimeTable_DayOrder.setText("5");
  	  TimeTable_Hour.setText("8");
  }
  public void d5h9_clicked(MouseEvent event) {
	  if(d5h9.getText()!=null) {
	  		TimeTable_SubName.setText(d5h9.getText());
	  	}
	  
  	  TimeTable_DayOrder.setText("5");
  	  TimeTable_Hour.setText("9");
  }
  public void d5h10_clicked(MouseEvent event) {
	  if(d5h10.getText()!=null) {
	  		TimeTable_SubName.setText(d5h10.getText());
	  	}
	 
	  TimeTable_DayOrder.setText("5");
	  TimeTable_Hour.setText("10");
}
}