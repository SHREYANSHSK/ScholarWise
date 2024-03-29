package com.scholarwise.scholarwise;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TeacherView {
	@FXML
	private TextField TimeTable_Hour;

	@FXML
	private TextField TimeTable_SubName;
	@FXML
	private TextField TimeTable_DayOrder;
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
	private AnchorPane MARKS_PAGE;
	@FXML
	private AnchorPane ATTENDANCE_PAGE;
	@FXML
	private AnchorPane PROFILE_PAGE;
	@FXML
	private AnchorPane TIME_TABLE_PAGE;
	@FXML
	private Button Course_Button;

	@FXML
	private Label faculty_id ;

	@FXML
	private Button Marks_Button ;

	@FXML
	private Label name ;

	@FXML
	private Button Profile_Button ;

	@FXML
	private Button TimeTable_Button ;

	@FXML
	private Label campus ;
	@FXML
	private Label member ;


	@FXML
	private Label course1;

	@FXML
	private Label course2;

	@FXML
	private Label course3 ;

	@FXML
	private Label course4 ;

	@FXML
	private Label course5;
	@FXML
	private Label course6;

    @FXML
	private Label course7;

	@FXML
	private Label course8;

	@FXML
	private Label course9 ;
	@FXML
	private Label course10 ;

	@FXML
	private Label experience ;

	@FXML
	private Button logout_btn ;

	@FXML
	private Label designation ;

	@FXML
	private Label net_id ;

	@FXML
	private Label qualification1;

	@FXML
	private Label qualification2;

	@FXML
	private Label qualification3;

	@FXML
	private Label research;

	@FXML
	private Label subq1;

	@FXML
	private Label subq2;

	@FXML
	private Label subq3;

	@FXML
	private Label year1;

	@FXML
	private Label year2;

	@FXML
	private Label year3;




	static String NAME;
	static String FACULTY_ID;
	static String DEPARTMENT;

	static String FA_EMAIL ;
	static String DEPT_ID ;
	static String CITY ;

	static String PHNO ;
	static String QUALIFICATION1 ;
	static String QUALIFICATION2 ;
	static String QUALIFICATION3 ;
	static String SUBQ1 ;
	static String SUBQ2 ;
	static String SUBQ3;
	static String YEAR1;
	static String YEAR2;
	static String YEAR3;
	static String CAMPUS;
	static String EXPERIENCE;
	static String COURSE1;
	static String COURSE2;
	static String COURSE3;
	static String COURSE4;
	static String COURSE5;
	static String COURSE6;
	static String COURSE7;
	static String COURSE8;
	static String COURSE9;
	static String COURSE10;
	static String RESEARCH;
	static String MEMBER;

	static String Desingnation;
	static String QUALIFICATION;
	static String Net_id;
	static String Password;
	static String Designation;

	static Connection con;
	static PreparedStatement pst;
	static ResultSet rs;



	public void initialize() {
		name.setText(NAME);
		campus.setText(CAMPUS);
		research.setText(RESEARCH);
		course1.setText(COURSE1);
		course2.setText(COURSE2);
		course3.setText(COURSE3);
		course4.setText(COURSE4);
		course5.setText(COURSE5);
		course6.setText(COURSE6);
		course7.setText(COURSE7);
		course8.setText(COURSE8);
		course9.setText(COURSE9);
		course10.setText(COURSE10);
		name.setText(NAME);
		member.setText(MEMBER);
		faculty_id.setText(FACULTY_ID);
		experience.setText(EXPERIENCE);
		net_id.setText(Net_id);
		faculty_id.setText(FACULTY_ID);
		designation.setText(Designation);
		experience.setText(EXPERIENCE);
		qualification1.setText(QUALIFICATION1);
		qualification2.setText(QUALIFICATION2);
		qualification3.setText(QUALIFICATION3);
		subq1.setText(SUBQ1);
		subq2.setText(SUBQ2);
		subq3.setText(SUBQ3);
		year1.setText(YEAR1);
		year2.setText(YEAR2);
		year3.setText(YEAR3);



		PROFILE_PAGE.setVisible(true);
		MARKS_PAGE.setVisible(false);
		TIME_TABLE_PAGE.setVisible(false);
		ATTENDANCE_PAGE.setVisible(false);
	}

	@FXML
	private void logoutBtn(ActionEvent event) throws IOException {
		Stage primaryStage;
		primaryStage = (Stage) logout_btn.getScene().getWindow();
		primaryStage.close();


		Stage mainstage = new Stage();

		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/com/scholarwise/scholarwise/LoginMain.fxml"));


		Parent root = loader.load();
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("/com/scholarwise/scholarwise/style.css").toExternalForm());
		mainstage.setScene(scene);

		Image icon = new Image(String.valueOf(getClass().getResource("images/logo_icon.png")));
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

	@FXML
	private void TeacherView_ATTENDANCEVIEW(ActionEvent event) {
		PROFILE_PAGE.setVisible(false);
		MARKS_PAGE.setVisible(false);
		TIME_TABLE_PAGE.setVisible(false);
		ATTENDANCE_PAGE.setVisible(true);
	}

	@FXML
	private void TeacherView_MARKSVIEW(ActionEvent event) {
		PROFILE_PAGE.setVisible(false);
		MARKS_PAGE.setVisible(true);
		TIME_TABLE_PAGE.setVisible(false);
		ATTENDANCE_PAGE.setVisible(false);
	}

	@FXML
	private void TeacherView_PROFILEVIEW(ActionEvent event) {
		PROFILE_PAGE.setVisible(true);
		MARKS_PAGE.setVisible(false);
		TIME_TABLE_PAGE.setVisible(false);
		ATTENDANCE_PAGE.setVisible(false);
	}

	@FXML
	private void TeacherView_TIMETABLEVIEW(ActionEvent event) {
		PROFILE_PAGE.setVisible(false);
		MARKS_PAGE.setVisible(false);
		TIME_TABLE_PAGE.setVisible(true);
		ATTENDANCE_PAGE.setVisible(false);
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



	public void credential1(String netId, String password, String designation) {

		Net_id = netId;
		Password = password;
		Designation = designation;
		System.out.println(Net_id+" "+Password);


		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/ScholarWise_temp", "root", "0000");
			pst = con.prepareStatement("SELECT * FROM teacherdb JOIN teacherabout on teacherdb.NET_ID=teacherabout.net_id where teacherabout.net_id  IN(SELECT net_id FROM login where teacherdb.NET_ID=?);");

			pst.setString(1, Net_id);
			rs = pst.executeQuery();

			while(rs.next()) {
				NAME = rs.getString("NAME");
				FACULTY_ID = rs.getString("FACULTY_ID");
				DEPARTMENT = rs.getString("DEPARTMENT");
				FA_EMAIL = rs.getString("EMAIL_ID");
				DEPT_ID = rs.getString("DEPT_ID");
				CITY = rs.getString("CITY");
				PHNO = rs.getString("PH_NO");
				Net_id = rs.getString("NET_ID");
				Desingnation = rs.getString("DESIGNATION");
				QUALIFICATION = rs.getString("QUALIFICATION");
				QUALIFICATION1 = rs.getString("qualification1");
				QUALIFICATION2 = rs.getString("qualification2");
				QUALIFICATION3 = rs.getString("qualification3");
				SUBQ1 = rs.getString("subq1");
				SUBQ2 = rs.getString("subq2");
				SUBQ3 = rs.getString("subq3");
				YEAR1 = rs.getString("year1");
				YEAR2 = rs.getString("year2");
				YEAR3 = rs.getString("year3");
				CAMPUS = rs.getString("campus");
				EXPERIENCE = rs.getString("experience");
				RESEARCH = rs.getString("research");
				MEMBER = rs.getString("member");
				COURSE1 = rs.getString("course1");
				COURSE2 = rs.getString("course2");
				COURSE3 = rs.getString("course3");
				COURSE4 = rs.getString("course4");
				COURSE5 = rs.getString("course5");
				COURSE6 = rs.getString("course6");
				COURSE7 = rs.getString("course7");
				COURSE8 = rs.getString("course8");
				COURSE9 = rs.getString("course9");
				COURSE10 = rs.getString("course10");

//				System.out.println(NAME + "" + FACULTY_ID);

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			try {
				if (rs != null) rs.close();
				if (pst != null) pst.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private void TimeTable_dataDeletion() throws SQLException, ClassNotFoundException {

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
	private void TimeTable_dataRetrieval() throws SQLException {
		ArrayList netIdList= new ArrayList<String>(){};





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


	@FXML
	private void TEACHERVIEW_TimeTable_EnterButtonAct(ActionEvent event) {

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
	private void TEACHERVIEW_TimeTable_RemoveButtonAct(ActionEvent event) {

			@SuppressWarnings("unused")
			String SubName=TimeTable_SubName.getText();
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





	@FXML
	private void Update_MarksAct(ActionEvent event) {

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


	public void TeacherView_update_attendanceAct(ActionEvent event) {
	}
}