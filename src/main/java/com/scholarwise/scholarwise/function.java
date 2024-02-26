	package com.scholarwise.scholarwise;
	
	
	import java.io.IOException;
	import java.net.URL;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

    import java.util.Objects;
    import java.util.ResourceBundle;
	import java.util.prefs.Preferences;
	
	import javafx.animation.PauseTransition;

	import javafx.fxml.FXML;
	import javafx.fxml.FXMLLoader;
	import javafx.fxml.Initializable;
	import javafx.scene.Parent;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.control.CheckBox;
	import javafx.scene.control.ComboBox;
	import javafx.scene.control.Label;
	import javafx.scene.control.PasswordField;
	import javafx.scene.control.TextField;
	import javafx.scene.image.Image;
	import javafx.scene.image.ImageView;
	import javafx.scene.paint.Color;
	import javafx.stage.Stage;
	import javafx.util.Duration;
	
	public class function extends StudentView implements Initializable {
		@FXML
		private ComboBox<String> login_combo;
	
	    @FXML
	    private TextField Netid;
	
	    @FXML
	    private PasswordField Password;
	    @FXML
	    private ImageView ProgressBar;
	    @FXML
	    private CheckBox Login_Remember;
	    @FXML
	    private Button LognButton;
	    @FXML
	    private Label error_label;
	    @FXML
	    private Label combo_error;
	    @FXML
	    private Label NetId_error;
	    @FXML
	    private Label Pass_error;
	   
	    Connection con;
	    PreparedStatement pst;
	    
	    ResultSet rs;
	    Preferences preferences;
	    String combo_state;
	
	
	
	private final String[] login_combo_list = {"Student","Teacher"};
	
	
	@Override
		public void initialize (URL arg0, ResourceBundle arg1) {
		
		
		preferences =Preferences.userNodeForPackage(getClass());
		if (preferences != null && preferences.get("RememberMe", null) != null) {
	        Login_Remember.setSelected(true); 
	
	        if (!preferences.get("Netid", "").isEmpty() && login_combo.getSelectionModel().getSelectedItem() == null) {
	            Netid.setText(preferences.get("Netid", ""));
	            Password.setText(preferences.get("Password", ""));
	            login_combo.setValue(preferences.get("login_combo", ""));
	        }
	    }
		
		
			ProgressBar.setVisible(false);
			Netid.setStyle("-fx-text-inner-color:#a0a2ab");
			Password.setStyle("-fx-text-inner-color:#a0a2ab");
			// TODO Auto-generated method stub
			login_combo.getItems().addAll(login_combo_list);
		
	
		
			
		}
	
	
		
		@FXML
		public void LoginAction() {
			combo_state= login_combo.getSelectionModel().getSelectedItem();
			
			
	
			if(Netid.getText().isEmpty() && Password.getText().isEmpty() && combo_state==null)  {
				error_label.setText("*ALL FIELDS REQUIRED*");
				  combo_error.setText("*");
				    
				  NetId_error.setText("*");
				    
				  Pass_error.setText("*");
			}
			else if(Netid.getText().isEmpty() && Password.getText()!=null && combo_state!=null) {
				error_label.setText("*ALL FIELDS REQUIRED*");
				combo_error.setText("");
				Pass_error.setText("");
				NetId_error.setText("*");
			}
			else if(Password.getText().isEmpty() && combo_state!=null && Netid.getText()!=null) {
				error_label.setText("*ALL FIELDS REQUIRED*");
				combo_error.setText("");
				NetId_error.setText("");
				Pass_error.setText("*");
			}
			else if(combo_state==null && Netid.getText()!=null && Password.getText()!=null) {
				error_label.setText("*ALL FIELDS REQUIRED*");
				Pass_error.setText("");
				NetId_error.setText("");
				combo_error.setText("*");
			}
			
			else {
				//jdbc connection
				try {
					if (Login_Remember.isSelected()) {
			            preferences.put("RememberMe", "true");
			            preferences.put("Netid", Netid.getText());
			            preferences.put("Password", Password.getText());
			            preferences.put("login_combo", login_combo.getSelectionModel().getSelectedItem());
			        } else {
			            preferences.put("RememberMe", "false");
			            preferences.put("Netid", "");
			            preferences.put("Password", "");
			            preferences.put("login_combo", "");
			        }
	
					Class.forName("com.mysql.cj.jdbc.Driver");
					
	
					con=DriverManager.getConnection("jdbc:mysql://localhost/ScholarWise_DB","root","0000");
					pst=con.prepareStatement("select net_id,password,designation from login where net_id=? and " +
							"password=? and designation=?;");
					pst.setString(1, Netid.getText());
					pst.setString(2, Password.getText());
					pst.setString(3, login_combo.getSelectionModel().getSelectedItem());
					rs=pst.executeQuery();
					if(rs.next()) {
						error_label.setTextFill(Color.web("green"));
						error_label.setText("Login Successful");
						String netId = rs.getString("net_id");
						String password =rs.getString("password");
						String designation =rs.getString("designation");			
						credential(netId,password,designation);
	
						ProgressBar.setVisible(true);
						PauseTransition pt=new PauseTransition();     
						pt.setDuration(Duration.seconds(2));
						pt.setOnFinished(ev -> {
							LognButton.getScene().getWindow().hide();
							Stage mainstage = new Stage();
							if(login_combo.getSelectionModel().getSelectedItem().equals("Student")) {
							try {

								FXMLLoader loader = new FXMLLoader();
								loader.setLocation(getClass().getResource("/com/scholarwise/scholarwise/StudentView.fxml"));
								Parent root = loader.load();

							Scene scene =new Scene(root);
							scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("/com/scholarwise/scholarwise/style.css")).toExternalForm());
							mainstage.setScene(scene);
							
							Image icon= new Image(String.valueOf(getClass().getResource("/com/scholarwise/scholarwise/images/logo_icon.png")));
							mainstage.getIcons().add(icon);
							mainstage.setTitle("ScholarWise");
							mainstage.setScene(scene);
							mainstage.setResizable(true);
							mainstage.setX(1);
							mainstage.setY(1);
	//						mainstage.setFullScreen(true);
	//						mainstage.setFullScreenExitHint("Press ESC to escape");
	//						mainstage.setFullScreenExitKeyCombination(KeyCombination.valueOf("esc"));
							mainstage.show();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							}
							
							else {
								try {
									FXMLLoader loader = new FXMLLoader();
									loader.setLocation(getClass().getResource("/com/scholarwise/scholarwise/TeacherView.fxml"));


									Parent root = loader.load();
								Scene scene =new Scene(root);
								scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("/com/scholarwise/scholarwise/style.css")).toExternalForm());
								mainstage.setScene(scene);

								Image icon= new Image(String.valueOf(getClass().getResource("/com/scholarwise/scholarwise/images/logo_icon.png")));
								mainstage.getIcons().add(icon);
								mainstage.setTitle("ScholarWise");
								mainstage.setScene(scene);
								mainstage.setX(1);
								mainstage.setY(1);
	//							mainstage.setFullScreen(true);
	//							mainstage.setFullScreenExitHint("Press ESC to escape");
	//							mainstage.setFullScreenExitKeyCombination(KeyCombination.valueOf("esc"));
								mainstage.show();
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								}
						
						});
						
						pt.play();		
					}
					else {
						error_label.setTextFill(Color.web("red"));
						error_label.setText("login credentials failed!");
						Netid.setText("");
						Password.setText("");
						Netid.requestFocus();
					}
					
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}


            }
			}
			}
		
	
		
