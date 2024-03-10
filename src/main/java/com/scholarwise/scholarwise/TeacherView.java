package com.scholarwise.scholarwise;

import java.io.IOException;
import java.sql.*;
import java.util.jar.Attributes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class TeacherView {


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
		System.out.println(course1);


	}

	@FXML
	void logoutBtn(ActionEvent event) throws IOException {
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

				System.out.println(NAME + "" + FACULTY_ID);

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


}