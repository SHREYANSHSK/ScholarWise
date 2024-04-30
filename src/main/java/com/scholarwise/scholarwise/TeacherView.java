package com.scholarwise.scholarwise;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TeacherView {
	@FXML
	private TextField TimeTable_Hour;

	@FXML
	private ListView<String> Attendance_absentStudent_listView;

	@FXML
	private ListView<String> Attendance_absentStudentRegNo_listView;

	@FXML
	private TextField TimeTable_SubName;
	@FXML
	private TextField TimeTable_DayOrder;

	@FXML
	private MenuButton Marks_subject_drop1;
	@FXML
	private MenuButton Marks_section_drop1;
	@FXML
	private MenuButton Marks_semester_drop;

	@FXML
	private MenuButton Marks_regid_drop;

	@FXML
	private MenuButton Marks_section_drop;

	@FXML
	private MenuButton Marks_subject_drop;

	@FXML
	private Label std_cgpa;

	@FXML
	private Label TeacherView_username;

	@FXML
	private Button std_contact;

	@FXML
	private Button std_email_id;

	@FXML
	private Label std_fa_name;

	@FXML
	private Label std_fa_ph;

	@FXML
	private Label std_name;

	@FXML
	private Label std_netid;

	@FXML
	private Label std_regid;

	@FXML
	private Label std_section;

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

	private String selectedSubject;
	private String selectedSection;

	private String selectedSubject1;
	private String selectedRegId;
	private String selectedSection1;
	private String selectedSemester;

	@FXML
	private Label faculty_id ;

	@FXML
	private Button Marks_Button ;

	@FXML
	private Label name ;

	@FXML
	private Label totalStudentsAbsent_attendance;

	@FXML
	private Label totalStudentsPresent_attendance;

	@FXML
	private Label totalStudents_attendance;

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

	@FXML
	private TextField ct_1_i;

	@FXML
	private TextField ct_1_p;

	@FXML
	private TextField ct_1_t;

	@FXML
	private TextField ct_2_i;

	@FXML
	private TextField ct_2_p;

	@FXML
	private TextField ct_2_t;

	@FXML
	private TextField ct_3_i;

	@FXML
	private TextField ct_3_p;

	@FXML
	private TextField ct_3_t;


	@FXML
	private ListView<String> attendanceNameList;

	@FXML
	private ListView<String> attendanceRegIdList;





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

	static String Semester;
	static String Password;
	static String Designation;


	static Connection con;
	static Connection con2;
	static PreparedStatement pst;
	static ResultSet rs;
	static PreparedStatement pst2;

	static ResultSet rs2;

	ObservableList<String> selectedNames = FXCollections.observableArrayList();
	ObservableList<String> selectedRegNo = FXCollections.observableArrayList();
	ObservableList<String> nameList = FXCollections.observableArrayList();
	ObservableList<String> regIdList = FXCollections.observableArrayList();

	private boolean changesMade = false;


	public void initialize() {
//		running trigger
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/ScholarWise_temp", "root", "0000");
			Statement stmt = con.createStatement();

			// Check if the trigger already exists
			ResultSet resultSet = stmt.executeQuery("SHOW TRIGGERS WHERE `Trigger`like 'calculate_attendance_percentage';");
			if (!resultSet.next()) { // If trigger does not exist
				// Create the trigger
				stmt.executeUpdate("SET SQL_SAFE_UPDATES = 0");
				stmt.executeUpdate("USE scholarwise_temp");
				stmt.executeUpdate("CREATE TRIGGER calculate_attendance_percentage " +
						"BEFORE UPDATE ON attendance " +
						"FOR EACH ROW " +
						"BEGIN " +
						"  IF NEW.Class_attended IS NOT NULL AND NEW.Class_conducted IS NOT NULL THEN " +
						"    SET NEW.Attendance = (NEW.Class_attended / NEW.Class_conducted) * 100; " +
						"  END IF; " +
						"END");
				stmt.executeUpdate("CREATE TRIGGER calculate_attendance_percentage " +
						"BEFORE INSERT ON attendance " +
						"FOR EACH ROW " +
						"BEGIN " +
						"  IF NEW.Class_attended IS NOT NULL AND NEW.Class_conducted IS NOT NULL THEN " +
						"    SET NEW.Attendance = (NEW.Class_attended / NEW.Class_conducted) * 100; " +
						"  END IF; " +
						"END");
			}


			resultSet.close(); // Close the result set
			stmt.close(); // Close the statement
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}


TeacherView_username.setText(NAME);
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
		attendanceRegIdList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
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
	private void TeacherView_ATTENDANCEVIEW(ActionEvent event) throws SQLException {
		PROFILE_PAGE.setVisible(false);
		MARKS_PAGE.setVisible(false);
		TIME_TABLE_PAGE.setVisible(false);
		ATTENDANCE_PAGE.setVisible(true);
		attendanceNameList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		attendanceRegIdList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

		Marks_subject_drop1.getItems().clear();
		Marks_section_drop1.getItems().clear();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		con = DriverManager.getConnection("jdbc:mysql://localhost/ScholarWise_temp", "root", "0000");
		pst = con.prepareStatement("SELECT DISTINCT Subject_Name FROM attendance WHERE Faculty_name=?");
		pst.setString(1, NAME);
		rs = pst.executeQuery();

		while (rs.next()) {
			String subjectName = rs.getString("Subject_Name");
			MenuItem subjectMenuItem = new MenuItem(subjectName);
			subjectMenuItem.setOnAction(e -> {
				Marks_subject_drop1.setText(subjectMenuItem.getText());
				selectedSubject = subjectMenuItem.getText();
				if (selectedSection != null && !selectedSection.isBlank()) {
					attendanceRetrieval();
				}
			});
			Marks_subject_drop1.getItems().add(subjectMenuItem);
		}

		con2 = DriverManager.getConnection("jdbc:mysql://localhost/ScholarWise_temp", "root", "0000");
		pst2 = con2.prepareStatement("SELECT DISTINCT section FROM attendance WHERE Faculty_name=?");
		pst2.setString(1, NAME);
		rs2 = pst2.executeQuery();

		while (rs2.next()) {
			String sectionName = rs2.getString("section");
			MenuItem sectionMenuItem = new MenuItem(sectionName);
			sectionMenuItem.setOnAction(e -> {
				Marks_section_drop1.setText(sectionMenuItem.getText());
				selectedSection = sectionMenuItem.getText();

				if (selectedSubject != null && !selectedSubject.isBlank()) {
					attendanceRetrieval();
				}
			});
			Marks_section_drop1.getItems().add(sectionMenuItem);
		}
	}

	void attendanceRetrieval() {

		String totalStudents_attendance_var="";


		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/ScholarWise_temp", "root", "0000");
			con2 = DriverManager.getConnection("jdbc:mysql://localhost/ScholarWise_temp", "root", "0000");

			pst = con.prepareStatement("SELECT studentdb.NAME, studentdb.REG_ID " +
					"FROM studentdb, attendance " +
					"WHERE attendance.Faculty_name=? AND " +
					"attendance.section=? AND " +
					"attendance.Subject_Name=? AND " +
					"studentdb.Net_id=attendance.Net_id");

			pst2 = con2.prepareStatement("SELECT count(studentdb.REG_ID) " +
					"FROM studentdb, attendance " +
					"WHERE attendance.Faculty_name=? AND " +
					"attendance.section=? AND " +
					"attendance.Subject_Name=? AND " +
					"studentdb.Net_id=attendance.Net_id");


			pst.setString(1, NAME);
			pst.setString(2, selectedSection);
			pst.setString(3, selectedSubject);

			pst2.setString(1, NAME);
			pst2.setString(2, selectedSection);
			pst2.setString(3, selectedSubject);

			rs = pst.executeQuery();
			rs2 = pst2.executeQuery();
			nameList.clear();
			regIdList.clear();

			while (rs.next()) {
				nameList.add(rs.getString("NAME"));
				regIdList.add(rs.getString("REG_ID"));
			}

			Platform.runLater(() -> {
				attendanceNameList.setItems(nameList);
				attendanceRegIdList.setItems(regIdList);
				attendanceNameList.setStyle("-fx-control-inner-background: #373737;-fx-border-color: #373737;-fx-text-fill: #121212;");
				attendanceRegIdList.setStyle("-fx-control-inner-background: #373737;-fx-border-color: #373737;-fx-text-fill: #121212;");
				Attendance_absentStudent_listView.setStyle("-fx-control-inner-background: #373737;-fx-border-color: #373737;-fx-text-fill: #121212;");
				Attendance_absentStudentRegNo_listView.setStyle("-fx-control-inner-background: #373737;-fx-border-color: #373737;-fx-text-fill: #121212;");
			});

			while (rs2.next()) {
				 totalStudents_attendance_var = (rs2.getString(1));
				totalStudents_attendance.setText(rs2.getString(1));

			}

		} catch (SQLException q) {
			q.printStackTrace();
		}




		attendanceNameList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		attendanceRegIdList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		attendanceNameList.setMouseTransparent( true );



		// Add a listener to the ListView to handle selection changes

		 final int TotalStudents_attendance_var = Integer.parseInt(totalStudents_attendance_var);

		attendanceRegIdList.setOnMouseClicked(event -> {
			if (event.getClickCount() == 1) {
				if(!selectedRegNo.containsAll(attendanceRegIdList.getSelectionModel().getSelectedItems())) {
//					selectedNames.addAll(attendanceNameList.getSelectionModel().getSelectedItems());
					selectedRegNo.addAll(attendanceRegIdList.getSelectionModel().getSelectedItems());
//					Attendance_absentStudent_listView.setItems(selectedNames);
					Attendance_absentStudentRegNo_listView.setItems(selectedRegNo);
					totalStudentsAbsent_attendance.setText(String.valueOf(selectedRegNo.size()));
					var temp= TotalStudents_attendance_var - selectedRegNo.size();
					totalStudentsPresent_attendance.setText(String.valueOf(temp));

				}
			}
			if (event.getClickCount() > 1) {
				if(selectedRegNo.containsAll(attendanceRegIdList.getSelectionModel().getSelectedItems())) {
					selectedNames.removeAll(attendanceNameList.getSelectionModel().getSelectedItems());
					selectedRegNo.removeAll(attendanceRegIdList.getSelectionModel().getSelectedItems());
//					Attendance_absentStudent_listView.setItems(selectedNames);
					Attendance_absentStudentRegNo_listView.setItems(selectedRegNo);
					totalStudentsAbsent_attendance.setText(String.valueOf(selectedRegNo.size()));
					var temp= TotalStudents_attendance_var - selectedRegNo.size();
					totalStudentsPresent_attendance.setText(String.valueOf(temp));


				}
			}

		});

	}


	public void TeacherView_update_attendanceAct(ActionEvent event) {
		try {
			// Start transaction
			con.setAutoCommit(false);


			for (String regNo : regIdList) {
				// Check if the student's regNo is not in the selectedRegNo list
				if (!selectedRegNo.contains(regNo)) {
					// Update class_attended for students not in the selectedRegNo list
					updateAttendanceStatus(regNo, NAME, selectedSection, selectedSubject, "Class_Attended");
				}
				// Update class_conducted for all students
				updateAttendanceStatus(regNo, NAME, selectedSection, selectedSubject, "Class_Conducted");
			}

			// Commit transaction when everything is successfully
			con.commit();

			Alert alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setTitle("Attendance Updated");
			alert.setHeaderText(null);
			alert.setContentText("Attendance has been updated successfully!");
			alert.showAndWait();
		} catch (SQLException e) {
			try {
				// Rollback the transaction if there is an error
				con.rollback();
			} catch (SQLException rollbackEx) {
				rollbackEx.printStackTrace();
			}

			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setTitle("ERROR!!");
			alert.setHeaderText(null);
			alert.setContentText("Error in updating attendance. Transaction rolled back.");
			alert.showAndWait();

			e.printStackTrace();
		} finally {
			try {
				// Set auto-commit back to true
				con.setAutoCommit(true);
			} catch (SQLException autoCommitEx) {
				autoCommitEx.printStackTrace();
			}
		}
	}

	private void updateAttendanceStatus(String regNo, String Faculty_name, String section, String Subject_Name, String statusColumn) throws SQLException {

		if (regNo.equals("RA2211003010389")) {
			throw new SQLException("Intentional error occurred. Rolling back transaction.");
		}

		String query = "UPDATE attendance AS a JOIN studentdb AS s ON a.Net_id = s.Net_id SET a." + statusColumn + " = a." + statusColumn + " + 1 WHERE a.Faculty_name = ? AND a.section = ? AND a.Subject_Name = ? AND s.REG_ID = ?";

		pst = con.prepareStatement(query);
		pst.setString(1, Faculty_name);
		pst.setString(2, section);
		pst.setString(3, Subject_Name);
		pst.setString(4, regNo);
		pst.executeUpdate();
	}






	@FXML
	private void TeacherView_MARKSVIEW(ActionEvent event) {
		PROFILE_PAGE.setVisible(false);
		MARKS_PAGE.setVisible(true);
		TIME_TABLE_PAGE.setVisible(false);
		ATTENDANCE_PAGE.setVisible(false);

		Marks_subject_drop.getItems().clear();
		Marks_section_drop.getItems().clear();
		Marks_semester_drop.getItems().clear();


		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con2 = DriverManager.getConnection("jdbc:mysql://localhost/ScholarWise_temp", "root", "0000");

			pst2 = con2.prepareStatement("SELECT DISTINCT Semester FROM marks WHERE Faculty=? ORDER BY Semester");
			pst2.setString(1, NAME);
			rs2 = pst2.executeQuery();


			while(rs2.next()) {
				String semesterName = rs2.getString("Semester");
				MenuItem semesterMenuItem = new MenuItem(semesterName);

				semesterMenuItem.setOnAction(e -> {
					Marks_section_drop.setText("Section");
					Marks_subject_drop.setText("Subject");
					Marks_regid_drop.setText("Registration Number");
					Marks_semester_drop.setText(semesterMenuItem.getText());
					selectedSemester = semesterMenuItem.getText();

					fetchSections();
				});
				Marks_semester_drop.getItems().add(semesterMenuItem);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	private void fetchSections() {

		try {
			pst2 = con2.prepareStatement("SELECT DISTINCT section FROM marks WHERE Faculty=? AND Semester=?");
			pst2.setString(1, NAME);
			pst2.setString(2, selectedSemester);
			rs2 = pst2.executeQuery();

			Marks_section_drop.getItems().clear();
			while (rs2.next()) {
				String sectionName = rs2.getString("section");
				MenuItem sectionMenuItem = new MenuItem(sectionName);
				sectionMenuItem.setOnAction(e -> {
					Marks_subject_drop.setText("Subject");
					Marks_regid_drop.setText("Registration Number");
					Marks_section_drop.setText(sectionMenuItem.getText());
					selectedSection1 = sectionMenuItem.getText();
					fetchSubjects();
				});
				Marks_section_drop.getItems().add(sectionMenuItem);
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	private void fetchSubjects() {
		try {
			pst = con.prepareStatement("SELECT DISTINCT Subject_Name FROM marks WHERE Faculty=? AND Semester=? AND section=?");
			pst.setString(1, NAME);
			pst.setString(2, selectedSemester);
			pst.setString(3, selectedSection1);
			rs = pst.executeQuery();

			Marks_subject_drop.getItems().clear();
			while (rs.next()) {
				String subjectName = rs.getString("Subject_Name");
				MenuItem subjectMenuItem = new MenuItem(subjectName);
				subjectMenuItem.setOnAction(e -> {
					Marks_regid_drop.setText("Registration Number");
					Marks_subject_drop.setText(subjectMenuItem.getText());
					selectedSubject1 = subjectMenuItem.getText();
					fetchRegIds();
				});
				Marks_subject_drop.getItems().add(subjectMenuItem);
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	private void fetchRegIds() {
		try {
			pst = con.prepareStatement("SELECT DISTINCT si.reg_id " +
					"FROM student_info si " +
					"JOIN student_credentials scred ON si.reg_id = scred.reg_id " +
					"JOIN marks m ON scred.net_id = m.net_id " +
					"WHERE m.semester = ? AND m.faculty = ? AND m.section = ? AND m.subject_name = ?");
			pst.setString(1, selectedSemester);
			pst.setString(2, NAME);
			pst.setString(3, selectedSection1);
			pst.setString(4, selectedSubject1);

			rs = pst.executeQuery();

			Marks_regid_drop.getItems().clear();
			while (rs.next()) {
				String regId = rs.getString("Reg_id");
				MenuItem regIdMenuItem = new MenuItem(regId);
				regIdMenuItem.setOnAction(e -> {
					Marks_regid_drop.setText(regIdMenuItem.getText());
					selectedRegId = regIdMenuItem.getText();
					if (!selectedSemester.isBlank() && selectedSection1 != null && selectedSubject1 != null && !selectedRegId.isBlank()) {
						try {
							marksSectionDataRetrieval();
							marksSectionMarksDataRetrieval();

						} catch (SQLException ex) {
							throw new RuntimeException(ex);
						}
					}
				});
				Marks_regid_drop.getItems().add(regIdMenuItem);
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}






void marksSectionDataRetrieval() throws SQLException {

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost/ScholarWise_temp", "root", "0000");
		pst = con.prepareStatement("SELECT si.*, sc.city, sc.state, sc.phno, sc.personal_mail_id, scred.net_id, fai.faculty_advisor, fai.fa_phno, fai.fa_email " +
				"FROM student_info si " +
				"JOIN student_contact sc ON si.reg_id = sc.reg_id " +
				"JOIN student_credentials scred ON si.reg_id = scred.reg_id " +
				"JOIN facultyad_info fai ON si.reg_id = fai.reg_id " +
				"WHERE si.reg_id = ?");
		pst.setString(1, selectedRegId);



		rs = pst.executeQuery();

		if (rs.next()) {
			std_name.setText(rs.getString("NAME"));
			std_regid.setText(rs.getString("REG_ID"));
			std_section.setText(rs.getString("SECTION"));
			std_fa_name.setText(rs.getString("FACULTY_ADVISOR"));
			std_fa_ph.setText(rs.getString("FA_PHNO"));
			std_netid.setText(rs.getString("Net_id"));

		}
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	Double sgpa_calculator= StudentView.SGPA_calculator(selectedSemester, rs.getString("Net_id"));
	if(sgpa_calculator==0.0) {
		std_cgpa.setText("-");
	}
	else {
		std_cgpa.setText(Double.toString(sgpa_calculator));
	}
}


void marksSectionMarksDataRetrieval(){


	try {
		pst = con.prepareStatement("SELECT* from marks WHERE  marks.semester=? AND marks.Faculty=? AND marks.section=? AND marks.Subject_Name = ?");
		pst.setString(1, selectedSemester);
		pst.setString(2, NAME);
		pst.setString(3, selectedSection1);
		pst.setString(4, selectedSubject1);
		rs = pst.executeQuery();

		Marks_regid_drop.getItems().clear();
		while (rs.next()) {
			ct_1_i.setText(rs.getString("CT_1_I"));
			ct_1_p.setText(rs.getString("CT_1_P"));
			ct_1_t.setText(rs.getString("CT_1_THEORY"));

			ct_2_i.setText(rs.getString("CT_2_I"));
			ct_2_p.setText(rs.getString("CT_2_P"));
			ct_2_t.setText(rs.getString("CT_2_THEORY"));

			ct_3_i.setText(rs.getString("CT_3_I"));
			ct_3_p.setText(rs.getString("CT_3_P"));
			ct_3_t.setText(rs.getString("CT_3_THEORY"));
		}

	} catch (SQLException ex) {
		ex.printStackTrace();
	}
}




	@FXML
	private void Update_MarksAct(ActionEvent event) {
		try {
			// Start transaction
			con.setAutoCommit(false);


			ct_1_i.textProperty().addListener((observable, oldValue, newValue) -> {
				changesMade = true;
			});
			ct_1_p.textProperty().addListener((observable, oldValue, newValue) -> {
				changesMade = true;
			});
			ct_1_t.textProperty().addListener((observable, oldValue, newValue) -> {
				changesMade = true;
			});

			ct_2_i.textProperty().addListener((observable, oldValue, newValue) -> {
				changesMade = true;
			});
			ct_2_p.textProperty().addListener((observable, oldValue, newValue) -> {
				changesMade = true;
			});
			ct_2_t.textProperty().addListener((observable, oldValue, newValue) -> {
				changesMade = true;
			});

			ct_3_i.textProperty().addListener((observable, oldValue, newValue) -> {
				changesMade = true;
			});
			ct_3_p.textProperty().addListener((observable, oldValue, newValue) -> {
				changesMade = true;
			});
			ct_3_t.textProperty().addListener((observable, oldValue, newValue) -> {
				changesMade = true;
			});

			// Check if any changes were made
			if (!changesMade) {
				Alert alert = new Alert(Alert.AlertType.INFORMATION);
				alert.setTitle("No Changes");
				alert.setHeaderText(null);
				alert.setContentText("No changes were made.");
				alert.showAndWait();
				return;
			}

			// Prepare and execute the update statement
			pst = con.prepareStatement("UPDATE marks SET CT_1_I=?, CT_1_P=?, CT_1_THEORY=?, CT_2_I=?, CT_2_P=?, CT_2_THEORY=?, CT_3_I=?, CT_3_P=?, CT_3_THEORY=? WHERE semester=? AND Faculty=? AND section=? AND Subject_Name=?");
			pst.setString(1, ct_1_i.getText());
			pst.setString(2, ct_1_p.getText());
			pst.setString(3, ct_1_t.getText());
			pst.setString(4, ct_2_i.getText());
			pst.setString(5, ct_2_p.getText());
			pst.setString(6, ct_2_t.getText());
			pst.setString(7, ct_3_i.getText());
			pst.setString(8, ct_3_p.getText());
			pst.setString(9, ct_3_t.getText());
			pst.setString(10, selectedSemester);
			pst.setString(11, NAME);
			pst.setString(12, selectedSection1);
			pst.setString(13, selectedSubject1);

			int rowsUpdated = pst.executeUpdate();

			if (rowsUpdated > 0) {
				// Commit transaction if update is successful
				con.commit();

				// Update successful
				Alert alert = new Alert(Alert.AlertType.INFORMATION);
				alert.setTitle("Success");
				alert.setHeaderText(null);
				alert.setContentText("Changes have been successfully updated in the database.");
				alert.showAndWait();
			} else {
				// No changes were made
				Alert alert = new Alert(Alert.AlertType.INFORMATION);
				alert.setTitle("No Changes");
				alert.setHeaderText(null);
				alert.setContentText("No changes were made.");
				alert.showAndWait();
			}
		} catch (SQLException ex) {
			try {
				// Rollback transaction if there is an error
				con.rollback();
			} catch (SQLException rollbackEx) {
				rollbackEx.printStackTrace();
			}

			ex.printStackTrace();

			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setTitle("Error");
			alert.setHeaderText(null);
			alert.setContentText("An error occurred while updating the database. Transaction rolled back.");
			alert.showAndWait();
		} finally {
			try {

				con.setAutoCommit(true);
			} catch (SQLException autoCommitEx) {
				autoCommitEx.printStackTrace();
			}
		}
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



		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/ScholarWise_temp", "root", "0000");

			pst = con.prepareStatement("SELECT td.*, d.department, tq1.qualification1, tq1.subq1, tq1.year1, tq1" +
					".qualification2, tq1.subq2, tq1.year2, tq1.qualification3,tq1.subq3,tq1.year3 ,te.campus, te" +
					".experience, " +
					"te.research, te.member, tc.course1, tc.course2, tc.course3, tc.course4, tc.course5, tc.course6, tc.course7, tc.course8, tc.course9, tc.course10 " +
					"FROM teacher_data td " +
					"JOIN dept d ON td.dept_id = d.dept_id " +
					"JOIN teacher_qual tq1 ON td.net_id = tq1.net_id " +
					"JOIN teacher_exp te ON td.net_id = te.net_id " +
					"JOIN teacher_course tc ON td.net_id = tc.net_id " +
					"JOIN teacher t ON td.net_id = t.net_id " +
					"WHERE td.net_id IN (SELECT net_id FROM login WHERE net_id = ?)");
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