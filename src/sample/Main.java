//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package sample;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    private StackPane root1 = new StackPane();
    Scene scene;
    private Stage stage;
    String res="",res1="";
    String logi;
    Scene scene1;
    Scene scene2;
    Scene scene3;
    Scene scene4;
    Scene scene5;
    Scene scene6;
    Scene scene7;
    Scene scene8;
    String data;
    String teachdata;
    String studdata;
    String classdata;
    String reportdata;
    String stures;
    String teares;
    Button students;
    Button view_students;
    Button stud_back;
    Button classes;
    Button view_class;
    Button class_back;
    Button reports;
    Button view_reports;
    Button report_back;
    Button stusearchbutton;
    Button teasearchbtn;
    Button search1;
    Button search2;
    Button back1;
    Button back2;
    Button inssubj;
    Button insteacher;
    Button insstud;
    Button insclass;
    Button insreport;
    Text text4;
    Text text5;
    Text text6;
    Text stusearchname;
    Text teachsearchname;
    Text result1;
    Text result2;
    Text ins1;
    Text ins2;
    Text ins3;
    Text ins4;
    Text ins5;
    TextField stusearch;
    TextField teasearch;
    TextField inssubjip;
    TextField ipinsteach;
    TextField ipstudins;
    TextField ipclassins;
    TextField ipreport;
    Text success1;
    Text success2;
    Text success3;
    Text success4;
    Text success5;
    Separator separator1;
    Separator separator2;
    Separator separator3;
    Separator separator4;
    Separator separator5;

    public Main() {
    }

    public void start(final Stage primaryStage) throws Exception {
        this.data = "";
        this.teachdata = "";
        this.studdata = "";
        this.classdata = "";
        this.reportdata = "";
        Label label4 = new Label("Class Database");
        Label label1 = new Label("Teacher Database");
        Label label3 = new Label("Student Database");
        Label label5 = new Label("Reports Database");
        Label label6 = new Label("Search for Student and their report");
        Label label7 = new Label("Search for Teacher and their class");
        VBox root = new VBox(20.0D);
        VBox vBox = new VBox();
        VBox root2 = new VBox(20.0D);
        VBox root3 = new VBox(20.0D);
        VBox root4 = new VBox(20.0D);
        VBox root5 = new VBox(20.0D);
        VBox root6 = new VBox(20.0D);
        VBox root7 = new VBox(20.0D);
        VBox root8 = new VBox(20.0D);
        vBox.setSpacing(8);
        vBox.setPadding(new Insets(10,10,10,10));
        root.setAlignment(Pos.CENTER);
        root2.setAlignment(Pos.CENTER);
        root3.setAlignment(Pos.CENTER);
        root4.setAlignment(Pos.CENTER);
        root5.setAlignment(Pos.CENTER);
        root6.setAlignment(Pos.CENTER);
        root7.setAlignment(Pos.CENTER);
        root8.setAlignment(Pos.CENTER);
        this.separator1 = new Separator();
        this.separator2 = new Separator();
        this.separator3 = new Separator();
        this.separator4 = new Separator();
        this.separator5 = new Separator();
        this.teasearch = new TextField();
        this.teasearch.setPrefWidth(200.0D);
        this.teasearch.setMaxWidth(200.0D);
        this.stusearch = new TextField();
        this.stusearch.setPrefWidth(200.0D);
        this.stusearch.setMaxWidth(200.0D);
        this.inssubjip = new TextField();
        this.inssubjip.setPrefWidth(400.0D);
        this.inssubjip.setMaxWidth(400.0D);
        this.ipinsteach = new TextField();
        this.ipinsteach.setPrefWidth(500.0D);
        this.ipinsteach.setMaxWidth(500.0D);
        this.ipstudins = new TextField();
        this.ipstudins.setPrefWidth(500.0D);
        this.ipstudins.setMaxWidth(500.0D);
        this.ipclassins = new TextField();
        this.ipclassins.setPrefWidth(500.0D);
        this.ipclassins.setMaxWidth(500.0D);
        this.ipreport = new TextField();
        this.ipreport.setPrefWidth(500.0D);
        this.ipreport.setMaxWidth(500.0D);
        Button subjects = new Button("Subject Database");
        final Button view_subjects = new Button("View  all Subject details");
        Button sub_back = new Button("Back to Home page");
        Button teachers = new Button("Teachers Database");
        final Button view_teachers = new Button("View all Teacher details");
        Button teach_back = new Button("Back to Home page");

        this.students = new Button("Students Database");
        this.view_students = new Button("View all Student details");
        this.stud_back = new Button("Go back to home page");
        this.classes = new Button("Class Database");
        this.view_class = new Button("View all classes details");
        this.class_back = new Button("Go back to home page");
        this.reports = new Button("Reports Database");
        this.report_back = new Button("Go Back to Home Page");
        this.view_reports = new Button("View all report details");
        this.stusearchbutton = new Button("Search");
        this.search1 = new Button("Search student and their report");
        this.back1 = new Button("Go back");
        this.back2 = new Button("Go Back");
        this.teasearchbtn = new Button("Search");
        this.inssubj = new Button("Insert data");
        this.insteacher = new Button("Insert Data");
        this.insstud = new Button("Insert Data");
        this.insclass = new Button("Insert Data");
        this.insreport = new Button("Insert Data");
        this.search2 = new Button("Search for teacher and their class");
        Label label2 = new Label("Subjects Database");
        label2.setStyle("-fx-font: 24 arial");
        label1.setStyle("-fx-font: 24 arial");
        label3.setStyle("-fx-font: 24 arial");
        label4.setStyle("-fx-font: 24 arial");
        label5.setStyle("-fx-font: 24 arial");
        label7.setStyle("-fx-font: 24 arial");
        label6.setStyle("-fx-font: 24 arial");
        subjects.setAlignment(Pos.CENTER);
        Text text = new Text();
        final Text text2 = new Text();
        final Text text3 = new Text();
        this.text4 = new Text();
        this.text5 = new Text();
        this.text6 = new Text();
        this.success1 = new Text();
        this.success2 = new Text();
        this.success3 = new Text();
        this.success4 = new Text();
        this.success5 = new Text();
        this.stusearchname = new Text("Enter Student id");
        this.teachsearchname = new Text("Enter Teacher ID");
        this.result1 = new Text();
        this.result2 = new Text();
        this.ins1 = new Text("    (Insert subject as this format - id,'subject name',timereq)");
        this.ins2 = new Text("    Insert teacher  as this format - 'Teacher name','M/F',id,'DOB','DOJ',subject id");
        this.ins3 = new Text("    Insert student as this format - 'DOB','M/F','first name','last name',id,contact,teacher id");
        this.ins4 = new Text("    Insert class as this format - 'Class name', class id,'start date','end date',Teacher ID\n       Studednt id, subject id");
        this.ins5 = new Text("    Insert report  as this format - 'Report ID,Grades,Marks,Teacher ID,StudentID");
        text.setX(100.0D);
        text.setY(40.0D);
        text.setUnderline(true);
        text.setStyle("-fx-font: 32 algerian;");
        text.setText("School Management System");
        Text text0=new Text();
        text0.setX(120.0D);
        text0.setY(100.0D);
        text0.setUnderline(true);
        text0.setStyle("-fx-font: 20 algerian;");
        text0.setText("School Management System");
        root.getChildren().addAll(new Node[]{text, subjects, teachers, this.students, this.classes, this.reports, this.search1, this.search2});
        FileInputStream inp = new FileInputStream("C:\\Users\\eswar\\Desktop\\s4.jpg");
        Image im = new Image(inp);
        BackgroundImage bi = new BackgroundImage(im,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(1.0, 1.0, true, true, false, false));
        Background background = new Background(bi);
        TextField log,pass;
        Button login;
        org.w3c.dom.Text result = null;
        vBox.getChildren().addAll(
                text0,
                new Label("Your Username"),
                log=new TextField(),
                new Label("Your Password"),
                pass=new PasswordField(),
                login=new Button("LOGIN"));
                login.setDefaultButton(true);
        login.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                String passw = pass.getText().toString();
                logi = log.getText().toString();

                try {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password");
                    Statement stmt = con.createStatement();
                    String datasq = "select password from login where id='" + logi + "'";
                    ResultSet rs=stmt.executeQuery(datasq);
                    if (rs == null) {
                        System.out.println("error");
                    } else {
                        while(rs.next()) {
                            res = res + rs.getString("password") ;
                            System.out.println();
                        }

                    }
                    con.close();

                } catch (Exception var6) {
                    System.out.println(var6);
                }
                if(res.equals(passw) && res != "")
                {
                    System.out.println("login success");
                    //*********************************************************************************
                    //visible
                    try {
                        Class.forName("oracle.jdbc.driver.OracleDriver");
                        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password");
                        Statement stmt = con.createStatement();
                        String datasq = "select type from login where id='" + logi + "'";
                        ResultSet rs=stmt.executeQuery(datasq);
                        if (rs == null) {
                            System.out.println("error");
                        } else {
                            while(rs.next()) {
                                res1 = res1 + rs.getString("type") ;
                                System.out.println(res1);
                            }

                        }
                        con.close();

                    } catch (Exception var6) {
                        System.out.println(var6);
                    }
                    if(res1.equals("student")) {
                        search1.setVisible(false);
                        search2.setVisible(false);
                        students.setText("My Profile");
                        teachers.setText("My Teachers Details");
                        classes.setText("Class Details");
                        reports.setText("My Reports");
                        ins1.setVisible(false);
                        inssubjip.setVisible(false);
                        inssubj.setVisible(false);
                        ins2.setVisible(false);
                        ipinsteach.setVisible(false);
                        insteacher.setVisible(false);
                        ins3.setVisible(false);
                        ipstudins.setVisible(false);
                        insstud.setVisible(false);
                        ins4.setVisible(false);
                        ipclassins.setVisible(false);
                        insclass.setVisible(false);
                        ins5.setVisible(false);
                        ipreport.setVisible(false);
                        insreport.setVisible(false);
                    }
                    else if(res1.equals("teacher")) {
                        search2.setVisible(false);
                        students.setText("My Students Details");
                        teachers.setText("My Profile");
                        classes.setText("Class Details");
                        reports.setText("My Students Reports");
                        ins1.setVisible(false);
                        inssubjip.setVisible(false);
                        inssubj.setVisible(false);
                        ins2.setVisible(false);
                        ipinsteach.setVisible(false);
                        insteacher.setVisible(false);
                        ins3.setVisible(false);
                        ipstudins.setVisible(false);
                        insstud.setVisible(false);
                        ins4.setVisible(false);
                        ipclassins.setVisible(false);
                        insclass.setVisible(false);
                    }
                    //*****************************************************************************************/
                    primaryStage.setScene(Main.this.scene1);
                }
                else
                {
                    System.out.println("invalid username/password try again");
                }
            }
        });
        root1.getChildren().addAll(vBox);
        Button button = new Button("OPEN");


        button.setOnAction(actionEvent-> {
            if(stage!=null){
                stage.requestFocus();
                return;
            }
            stage = new Stage();
            StackPane stackPane = new StackPane();
            stage.setScene(new Scene(stackPane, 200,200));
            stage.show();
        });
        this.insreport.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                String initdata = Main.this.ipreport.getText().toString();

                try {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password");
                    Statement stmt = con.createStatement();
                    String datasq = "insert into report values(" + initdata + ")";
                    stmt.executeQuery(datasq);
                    con.close();
                    Main.this.success5.setText("Inserted successfully");
                } catch (Exception var6) {
                    System.out.println(var6);
                }

            }
        });
        root2.getChildren().addAll(new Node[]{label2, view_subjects, text2, this.separator1, this.ins1, this.inssubjip, this.inssubj, this.success1, sub_back});
        root3.getChildren().addAll(new Node[]{label1, view_teachers, text3, this.separator2, this.ins2, this.ipinsteach, this.insteacher, this.success2, teach_back});
        root4.getChildren().addAll(new Node[]{label3, this.view_students, this.text4, this.separator3, this.ins3, this.ipstudins, this.insstud, this.success3, this.stud_back});
        root5.getChildren().addAll(new Node[]{label4, this.view_class, this.text5, this.separator4, this.ins4, this.ipclassins, this.insclass, this.success4, this.class_back});
        root6.getChildren().addAll(new Node[]{label5, this.view_reports, this.text6, this.separator5, this.ins5, this.ipreport, this.insreport, this.success5, this.report_back});
        stusearchbutton.setDefaultButton(true);
        teasearchbtn.setDefaultButton(true);
        root7.getChildren().addAll(new Node[]{label6, this.stusearchname, this.stusearch, this.result1, this.stusearchbutton, this.back1});
        root8.getChildren().addAll(new Node[]{label7, this.teachsearchname, this.teasearch, this.result2, this.teasearchbtn, this.back2});
        root.setBackground(background);
        vBox.setBackground(background);
        root2.setBackground(background);
        root3.setBackground(background);
        root4.setBackground(background);
        root5.setBackground(background);
        root6.setBackground(background);
        root7.setBackground(background);
        root8.setBackground(background);
        this.scene1 = new Scene(root, 600.0D, 600.0D, Color.RED);
        this.scene2 = new Scene(root2, 600.0D, 600.0D);
        this.scene3 = new Scene(root3, 600.0D, 600.0D);
        this.scene4 = new Scene(root4, 600.0D, 600.0D);
        this.scene5 = new Scene(root5, 600.0D, 600.0D);
        this.scene6 = new Scene(root6, 600.0D, 600.0D);
        this.scene7 = new Scene(root7, 600.0D, 600.0D);
        this.scene8 = new Scene(root8, 600.0D, 600.0D);
        Scene scene = new Scene(root1,400,600);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setTitle("School Management System");

        this.insclass.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                String initdata = Main.this.ipclassins.getText().toString();

                try {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password");
                    Statement stmt = con.createStatement();
                    String datasq = "insert into class values(" + initdata + ")";
                    stmt.executeQuery(datasq);
                    con.close();
                    Main.this.success4.setText("Inserted successfully");
                } catch (Exception var6) {
                    System.out.println(var6);
                }

            }
        });
        this.insstud.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                String initdata = Main.this.ipstudins.getText().toString();

                try {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password");
                    Statement stmt = con.createStatement();
                    String datasq = "insert into student values(" + initdata + ")";
                    stmt.executeQuery(datasq);
                    con.close();
                    Main.this.success4.setText("Inserted successfully");
                } catch (Exception var6) {
                    System.out.println(var6);
                }

            }
        });
        this.insteacher.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                String initdata = Main.this.ipinsteach.getText().toString();

                try {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password");
                    Statement stmt = con.createStatement();
                    String datasq = "insert into teacher values(" + initdata + ")";
                    stmt.executeQuery(datasq);
                    con.close();
                    Main.this.success2.setText("Inserted successfully");
                } catch (Exception var6) {
                    System.out.println(var6);
                }

            }
        });
        this.inssubj.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                String initdata = Main.this.inssubjip.getText().toString();

                try {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password");
                    Statement stmt = con.createStatement();
                    String datasq = "insert into subject values(" + initdata + ")";
                    stmt.executeQuery(datasq);
                    con.close();
                    Main.this.success1.setText("Inserted successfully");
                } catch (Exception var6) {
                    System.out.println(var6);
                }

            }
        });
        this.back1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                Main.this.result1.setText("");
                Main.this.stusearch.clear();
                primaryStage.setScene(Main.this.scene1);
            }
        });
        this.back2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                Main.this.result2.setText("");
                Main.this.teasearch.clear();
                primaryStage.setScene(Main.this.scene1);
            }
        });
        this.teasearchbtn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                String res = "";
                Main.this.teares = Main.this.teasearch.getText().toString();
                if (Main.this.teares.isEmpty()) {
                    Main.this.result2.setText("Enter details");
                } else {
                    int i = Integer.parseInt(Main.this.teares);

                    try {
                        Class.forName("oracle.jdbc.driver.OracleDriver");
                        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password");
                        Statement stmt = con.createStatement();
                        ResultSet rs = stmt.executeQuery("select teacher.tname,class.classname,class.cid,class.startdate from teacher,class where teacher.tid=class.tid and teacher.tid=" + i);
                        if (rs == null) {
                            System.out.println("error");
                        } else {
                            while(rs.next()) {
                                res = res + "Name: " + rs.getString("tname") + "\nClass name:  " + rs.getString("classname") + "\nClass id: " + rs.getString("cid") + "\nclass startdate:  " + rs.getDate("startdate") + "\n";
                                System.out.println();
                            }

                            Main.this.result2.setText(res);
                        }

                        con.close();
                    } catch (Exception var7) {
                        System.out.println(var7);
                    }
                }

            }
        });
        this.stusearchbutton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                String res = "";
                Main.this.stures = Main.this.stusearch.getText().toString();
                if (Main.this.stures.isEmpty()) {
                    Main.this.result1.setText("Enter details");
                } else {
                    int i = Integer.parseInt(Main.this.stures);

                    try {
                        Class.forName("oracle.jdbc.driver.OracleDriver");
                        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password");
                        Statement stmt = con.createStatement();
                        ResultSet rs;
                        if(res1.equals("teacher"))
                            rs = stmt.executeQuery("select student.fname,student.lname,report.grades,report.marks from student,report where student.id=report.id and student.id=" + i + "and student.tid=" +logi);
                        else
                            rs = stmt.executeQuery("select student.fname,student.lname,report.grades,report.marks from student,report where student.id=report.id and student.id=" + i );

                        System.out.println("select student.fname,student.lname,report.grades,report.marks from student,report where student.id=report.id and student.id=" + i+ "and student.tid=" +logi);
                        if (rs.equals("")) {
                            System.out.println("error");
                        } else {
                            while(rs.next()) {
                                res = res + "Name: " + rs.getString("fname") + " " + rs.getString("lname") + "\nGrade: " + rs.getString("grades") + "\nMarks: " + rs.getString("marks") + "\n\n";
                                System.out.println();
                            }

                            Main.this.result1.setText(res);
                        }

                        con.close();
                    } catch (Exception var7) {
                        System.out.println(var7);
                    }
                }

            }
        });
        this.search1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                primaryStage.setScene(Main.this.scene7);
            }
        });
        this.search2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                primaryStage.setScene(Main.this.scene8);
            }
        });
        subjects.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                primaryStage.setScene(Main.this.scene2);
            }
        });
        teachers.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                primaryStage.setScene(Main.this.scene3);
            }
        });
        this.students.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                primaryStage.setScene(Main.this.scene4);
            }
        });
        this.classes.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                primaryStage.setScene(Main.this.scene5);
            }
        });
        this.reports.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                primaryStage.setScene(Main.this.scene6);
            }
        });
        this.class_back.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                Main.this.view_class.setVisible(true);
                Main.this.text5.setText("");
                Main.this.classdata = "";
                Main.this.ipclassins.clear();
                primaryStage.setScene(Main.this.scene1);
            }
        });
        sub_back.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                view_subjects.setVisible(true);
                text2.setText((String)null);
                Main.this.data = "";
                Main.this.inssubjip.clear();
                Main.this.success1.setText("");
                primaryStage.setScene(Main.this.scene1);
            }
        });
        teach_back.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                view_teachers.setVisible(true);
                text3.setText("");
                Main.this.teachdata = "";
                Main.this.ipinsteach.clear();
                Main.this.success2.setText("");
                primaryStage.setScene(Main.this.scene1);
            }
        });
        this.stud_back.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                Main.this.view_students.setVisible(true);
                Main.this.text4.setText("");
                Main.this.studdata = "";
                Main.this.ipstudins.clear();
                primaryStage.setScene(Main.this.scene1);
            }
        });
        this.report_back.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                Main.this.view_reports.setVisible(true);
                Main.this.text6.setText("");
                Main.this.reportdata = "";
                Main.this.ipreport.clear();
                primaryStage.setScene(Main.this.scene1);
            }
        });
        this.view_reports.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                Main.this.view_reports.setVisible(false);
                Main var10000 = Main.this;
                var10000.reportdata = var10000.reportdata + "Report details details in the order :- \n\n\nReport ID  Grades  Marks  Teacher ID  Student Id\n";

                try {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password");
                    Statement stmt = con.createStatement();
                    ResultSet rs;
                    if(res1.equals("student")) {
                        rs= stmt.executeQuery("select * from report where id="+logi);
                    }
                    else if(res1.equals("teacher"))
                    {
                        rs=stmt.executeQuery("select * from report where tid="+logi);
                    }
                    else
                    {
                        rs = stmt.executeQuery("select * from report");
                    }
                    System.out.println("data");
                    if (rs != null) {
                        while(rs.next()) {
                            var10000 = Main.this;
                            String var10001 = var10000.reportdata;
                            var10000.reportdata = var10001 + "  " + rs.getInt(1) + "               " + rs.getString(2) + "              " + rs.getInt(3) + "              " + rs.getInt(4) + "                 " + rs.getInt(5) + "           \n";
                            System.out.println();
                            Main.this.text6.setText(Main.this.reportdata);
                        }
                    } else {
                        System.out.println("error");
                    }

                    con.close();
                } catch (Exception var5) {
                    System.out.println(var5);
                }

            }
        });
        this.view_class.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                Main.this.view_class.setVisible(false);
                Main var10000 = Main.this;
                var10000.classdata = var10000.classdata + "Class details in the order :- Class ID, Class name, Start Date, End Date, Teacher ID, Student Id, Subject ID\n\n\n";

                try {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password");
                    Statement stmt = con.createStatement();
                    ResultSet rs;
                    if(res1.equals("student")) {
                        rs= stmt.executeQuery("select * from class where id="+logi);
                    }
                    else if(res1.equals("teacher"))
                    {
                        rs=stmt.executeQuery("select * from class where tid="+logi);
                    }
                    else
                    {
                        rs = stmt.executeQuery("select * from class");
                    }
                    System.out.println("data");
                    if (rs != null) {
                        while(rs.next()) {
                            var10000 = Main.this;
                            String var10001 = var10000.classdata;
                            var10000.classdata = var10001 + "  " + rs.getInt("cid") + "    " + rs.getString(1) + "   " + rs.getDate(3) + "   " + rs.getDate(4) + "   " + rs.getInt(5) + "    " + rs.getInt(6) + "      " + rs.getInt(7) + "\n";
                            System.out.println();
                            Main.this.text5.setText(Main.this.classdata);
                        }
                    } else {
                        System.out.println("error");
                    }

                    con.close();
                } catch (Exception var5) {
                    System.out.println(var5);
                }

            }
        });
        this.view_students.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                Main.this.view_students.setVisible(false);
                Main var10000 = Main.this;
                var10000.studdata = var10000.studdata + "Student details in the order :- Student ID, DOB, Gender, First name, Last name, Contact, Teacher id for the student\n\n\n";

                try {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password");
                    Statement stmt = con.createStatement();
                    ResultSet rs;
                    if(res1.equals("student")) {
                         rs= stmt.executeQuery("select * from student where id="+logi);
                    }
                    else if(res1.equals("teacher"))
                    {
                        rs=stmt.executeQuery("select * from student where tid="+logi);
                    }
                    else
                    {
                        rs = stmt.executeQuery("select * from student");
                    }
                    System.out.println("data");
                    if (rs != null) {
                        while(rs.next()) {
                            var10000 = Main.this;
                            String var10001 = var10000.studdata;
                            var10000.studdata = var10001 + "  " + rs.getInt("id") + "    " + rs.getDate(1) + "   " + rs.getString(2) + "    " + rs.getString(3) + "   " + rs.getString(4) + "      " + rs.getString(6) + "    " + rs.getInt(7) + "\n";
                            System.out.println();
                            Main.this.text4.setText(Main.this.studdata);
                        }
                    } else {
                        System.out.println("error");
                    }

                    con.close();
                } catch (Exception var5) {
                    System.out.println(var5);
                }

            }
        });
        view_teachers.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                view_teachers.setVisible(false);
                Main var10000 = Main.this;
                var10000.teachdata = var10000.teachdata + "Teacher details in the order- Teacher name,Gender,TeacherID,DOJB,DOJ,Subject id\n\n\n";

                try {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password");
                    Statement stmt = con.createStatement();
                    ResultSet rs;
                    if(res1.equals("teacher")) {
                        rs= stmt.executeQuery("select * from teacher where tid="+logi);
                    }
                    else if(res1.equals("student"))
                    {
                        rs=stmt.executeQuery("select * from teacher where tid in (select tid from student where id="+logi+" )");
                    }
                    else
                    {
                        rs = stmt.executeQuery("select * from teacher");
                    }
                    System.out.println("data");
                    if (rs != null) {
                        while(rs.next()) {
                            var10000 = Main.this;
                            String var10001 = var10000.teachdata;
                            var10000.teachdata = var10001 + "  " + rs.getString(1) + "   " + rs.getString(2) + "    " + rs.getInt(3) + "      " + rs.getDate(4) + "   " + rs.getDate(5) + "   " + rs.getInt(6) + "\n";
                            System.out.println();
                            text3.setText(Main.this.teachdata);
                        }
                    } else {
                        System.out.println("error");
                    }

                    con.close();
                } catch (Exception var5) {
                    System.out.println(var5);
                }

            }
        });
        view_subjects.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                view_subjects.setVisible(false);
                Main var10000 = Main.this;
                var10000.data = var10000.data + "SID       Subject Name          Time Required \n";

                try {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password");
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery("select * from subject");
                    System.out.println("data");
                    if (rs != null) {
                        while(rs.next()) {
                            var10000 = Main.this;
                            String var10001 = var10000.data;
                            var10000.data = var10001 + "  " + rs.getInt(1) + "        " + rs.getString(2) + "               " + rs.getInt(3) + "\n";
                            System.out.println(Main.this.data);
                            text2.setText(Main.this.data);
                        }
                    } else {
                        System.out.println("error");
                    }

                    con.close();
                } catch (Exception var5) {
                    System.out.println(var5);
                }

            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
