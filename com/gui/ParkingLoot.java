package com.gui;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Contact Infor:
 +Mail: BaoPQSE161084@fpt.edu.vn
 +Phone: +84372392473
 +Linkedin: www.linkedin.com/in/bao-phan-quang-b7570521a/
 +Git: github.com/quangbao368
 * @author HoangDeShotgun
 */
public class ParkingLoot {
    static File FileData = new File("src\\dto\\data.bat").getAbsoluteFile();
    static File FileDataHistory = new File("src\\dto\\history.bat").getAbsoluteFile();
    static File FileDataDeleted = new File("src\\dto\\dataDeleted.bat").getAbsoluteFile();
    static File MP3_XacnhanVAO = new File("src\\dto\\moivao.wav").getAbsoluteFile();
    static File MP3_XacnhanRA = new File("src\\dto\\moira.wav").getAbsoluteFile();
    static File MP3_loi = new File("src\\dto\\theloi.wav").getAbsoluteFile();
    static File note = new File("src\\dto\\data.wav").getAbsoluteFile();
    static File Fileravao = new File("src\\dto\\Ra,vao.bat").getAbsoluteFile();
    static File FileAccount = new File("src\\dto\\Account.bat").getAbsoluteFile();



    static JFrame menuGiuXe = new JFrame();
    static JFrame dangkithe = new JFrame();
    static JFrame xoathe = new JFrame();
    static JFrame hienThiThongTinThe = new JFrame();
    static JFrame suaThongTinThe = new JFrame();
    static JFrame dangNhap = new JFrame();
    static JFrame dangki=new JFrame();
    static Controler con = new Controler();
    //của jframe menu
    static JButton but = new JButton("ĐĂNG KÍ THẺ");
    static JButton button_quetThe_menu = new JButton("QUÉT THẺ");
    static JButton but3 = new JButton("XÓA THẺ");
    static JButton but4 =new JButton("SỬA THÔNG TIN");

    static JButton phu1 = new JButton("DỮ LIỆU");
    static JButton phu2 = new JButton("LỊCH SỬ QUÉT");
    static JButton phu3 = new JButton("DỮ LIỆU THẺ CŨ");
    static JButton phu4 = new JButton("TỰ ĐỘNG XÓA DỮ LIỆU CŨ");
    static JButton phu5 = new JButton("ĐĂNG KÌ TÀI KHOẢN");
    static JButton phu6 = new JButton("ĐĂNG XUẤT");

    //của jframe đăng kí thẻ
    static JButton returnButton = new JButton("Quay lại");
    static JLabel l0, l1, l2, l3, l4, l5, l6;
    static JTextField t1, t2, t3, t4, t5, t6;
    static JButton rg = new JButton("ĐĂNG KÍ");

    //jframe xóa thẻ
    static JButton returnButton1 = new JButton("Quay lại");
    static JLabel x0, x2;
    static JTextField iddel;
    static JButton xoa = new JButton("XÁC NHẬN");

    // của jframe quét thẻ
    static JButton returnButton2 = new JButton("Quay lại");
    static JLabel show0, show1, show2, show3, show4, show5, show6;
    static JTextField quetTheNgay_hienThi;

    // của jframe SỬA THÔNG TIN thẻ
    static JButton returnButton3 = new JButton("Quay lại");
    static JLabel tieude, suaThongTinshow0, suaThongTinshow1, suaThongTinshow2, suaThongTinshow3, suaThongTinshow4;
    static JTextField suaThongTinField0, suaThongTinField1, suaThongTinField2, suaThongTinField3, suaThongTinField4;
    static JButton suaThongTinButton = new JButton("Sửa Thông Tin"),getSuaThongTinReturnButton =  new JButton("Quay lại");
    static String suaThongTincardProperty[] = null;
    static String ID_CARD = "0";
    static String ID_CARD_2 = "0";

    // của jframe đăng nhập accout
    static JLabel dangNHapTieuDe, dangNhapTaiKhoanLable,dangNhapMatKhauLable,dangNhapMatKhauMoiLable,dangNhapMatKhauMoiNhapLaiLable;
    static JTextField dangNhaptaikhoanField;
    static JPasswordField dangNhapmatkhauField,dangNhapmatkhauMoiField,dangNhapmatkhauMoiNhapLaiField;
    static JButton dangnhapbutton  = new JButton("Đăng Nhập"),
            thayDoiMKButton = new JButton("Thay Đổi Mật Khẩu"),
            QuayLaiDangNhapButton =  new JButton("Quay lại");

    // cua jfram dang ki accout
    static JLabel dangkitieude, dangkiTaiKhoan, dangkiMatkhau,nhaplaimatkhauDangKi;
    static JTextField taiKhoanDangki;
    static JPasswordField MatkhauDangKi, NhaplaiMatKhau;
    static JButton dangkibutton=new JButton("ĐĂNG KÍ");
    static JButton dangKiReturn=new JButton("Quay lại");


    public static void main(String[] args) {

//        System.out.println(FileData);
//        File FileData = new File("C:\\\\Users\\\\HoangDeShotgun\\\\IdeaProjects\\\\RIFD Card\\\\src\\\\du_lieu_the\\\\data.txt");
//        File FileDataDeleted = new File("C:\\Users\\HoangDeShotgun\\IdeaProjects\\RIFD Card\\src\\du_lieu_the\\dataDeleted.txt");
//        File FileDataHistory = new File("C:\\Users\\HoangDeShotgun\\IdeaProjects\\RIFD Card\\src\\du_lieu_the\\history.txt");
        //khởi tạo frame cho 4 giao diện menu, đăng kí, xóa thẻ và hiển thị thông tin
        //các button có trên các frame ( trừ menu)
        // jrame đăng nhập
        dangNhap.setBounds(100, 0, 1360, 768);
        dangNhap.setTitle("Đăng nhập");

        dangNHapTieuDe = new JLabel("Đăng Nhập");
        dangNHapTieuDe.setFont(new Font("Đăng Nhập", Font.PLAIN, 30));
        dangNHapTieuDe.setBounds(452, 35, 632, 156);

        dangNhapTaiKhoanLable = new JLabel("Tài Khoản");
        dangNhapTaiKhoanLable.setBounds(246, 221, 280, 37);

        dangNhapMatKhauLable = new JLabel("Mật Khẩu");
        dangNhapMatKhauLable.setBounds(246, 298, 280, 37);

        dangNhapMatKhauMoiLable = new JLabel("Mật Khẩu Mới");
        dangNhapMatKhauMoiLable.setBounds(246, 375, 280, 37);

        dangNhapMatKhauMoiNhapLaiLable = new JLabel("Nhập Lại Mật khẩu mới Mới");
        dangNhapMatKhauMoiNhapLaiLable.setBounds(220, 450, 280, 37);

        dangNhaptaikhoanField = new JTextField("");
        dangNhaptaikhoanField.setBounds(400, 221, 564, 44);

        dangnhapbutton.setBounds(400, 608, 200, 50);//x axis, y axis, width, height
        thayDoiMKButton.setBounds(600, 608, 200, 50);//x axis, y axis, width, height

        dangNhapmatkhauField = new JPasswordField("");
        dangNhapmatkhauField.setEchoChar('*');
        dangNhapmatkhauField.setBounds(400, 298, 564, 44);

        dangNhapmatkhauMoiField = new JPasswordField("");
        dangNhapmatkhauMoiField.setEchoChar('*');
        dangNhapmatkhauMoiField.setBounds(400, 375, 564, 44);

        dangNhapmatkhauMoiNhapLaiField = new JPasswordField("");
        dangNhapmatkhauMoiNhapLaiField.setEchoChar('*');
        dangNhapmatkhauMoiNhapLaiField.setBounds(400, 450, 564, 44);

        QuayLaiDangNhapButton.setFont(new Font("Quay lại", Font.PLAIN, 20));
        QuayLaiDangNhapButton.setBounds(72, 618, 289, 74);//x axis, y axis, width,

        dangNhapMatKhauMoiLable.setVisible(false);
        dangNhapmatkhauMoiField.setVisible(false);
        dangNhapMatKhauMoiNhapLaiLable.setVisible(false);
        dangNhapmatkhauMoiNhapLaiField.setVisible(false);
        dangNhap.setVisible(false);
        QuayLaiDangNhapButton.setVisible(false);

        dangNhap.setVisible(true);
        menuGiuXe.setVisible(false);
        dangkithe.setVisible(false);
        xoathe.setVisible(false);
        hienThiThongTinThe.setVisible(false);
        suaThongTinThe.setVisible(false);
        dangki.setVisible(false);

        thayDoiMKButton.addActionListener(e -> {

            dangNhapmatkhauMoiField.setText("");
            dangNhapmatkhauMoiNhapLaiField.setText("");
            if (dangNhaptaikhoanField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(dangNhap, "ô tài khoản chưa điền");
            } else if (dangNhapmatkhauField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(dangNhap, "ô mật khẩu chưa điền");
            } else {
                File filename = new File(String.valueOf(FileAccount));
                if (filename.length() != 0) {
                    try {
                        boolean dangNhapThanhCong = false;
                        FileReader myObj = new FileReader(filename);
                        Scanner myReader = new Scanner(myObj);
                        boolean isData = false;


                        do {
                            String data = myReader.nextLine();
                            String dataArray[] = data.split("_");
                            if (dangNhaptaikhoanField.getText().equals(dataArray[0])) {
                                if (String.valueOf(dangNhapmatkhauField.getPassword()).equals(dataArray[1])) {
                                    dangNhapThanhCong = true;

                                    String UserLine = dangNhaptaikhoanField.getText() + "_" + String.valueOf(dangNhapmatkhauField.getPassword());
                                    String UserAccout = con.getData(UserLine, FileAccount);
                                    String[] UserAccoutArray = UserAccout.split("_");
                                    if (UserAccoutArray[2].equals("admin")) {
                                        JOptionPane.showMessageDialog(dangNhap, "Hãy gọi điện cho chung tôi để đổi mật khẩu admin");
                                    } else {
                                        JOptionPane.showMessageDialog(dangNhap, "nhập ô mật khẩu mới xong hãy enter\n   để hệ thống thay đổi mật khẩu");

                                        dangNhapTaiKhoanLable.setVisible(false);
                                        dangNhapMatKhauLable.setVisible(false);
                                        dangNhaptaikhoanField.setVisible(false);
                                        dangNhapmatkhauField.setVisible(false);
                                        dangnhapbutton.setVisible(false);
                                        thayDoiMKButton.setVisible(false);

                                        dangNhapMatKhauMoiLable.setVisible(true);
                                        dangNhapmatkhauMoiField.setVisible(true);
                                        dangNhapMatKhauMoiNhapLaiLable.setVisible(true);
                                        dangNhapmatkhauMoiNhapLaiField.setVisible(true);
                                        QuayLaiDangNhapButton.setVisible(true);

                                        QuayLaiDangNhapButton.addActionListener(E -> {
                                            dangNhapmatkhauMoiField.setText("");

                                            dangNhapTaiKhoanLable.setVisible(true);
                                            dangNhapMatKhauLable.setVisible(true);
                                            dangNhaptaikhoanField.setVisible(true);
                                            dangNhapmatkhauField.setVisible(true);
                                            dangnhapbutton.setVisible(true);
                                            thayDoiMKButton.setVisible(true);

                                            dangNhapMatKhauMoiLable.setVisible(false);
                                            dangNhapmatkhauMoiField.setVisible(false);
                                            dangNhapMatKhauMoiNhapLaiLable.setVisible(false);
                                            dangNhapmatkhauMoiNhapLaiField.setVisible(false);
                                            QuayLaiDangNhapButton.setVisible(false);
                                        });

                                        dangNhapmatkhauMoiField.addActionListener(E -> {
                                            if (dangNhapmatkhauMoiField.getText().isEmpty()) {
                                                JOptionPane.showMessageDialog(dangNhap, "ô mật khẩu mới chưa điền");
                                            }else if(dangNhapmatkhauMoiNhapLaiField.getText().isEmpty()){
                                                JOptionPane.showMessageDialog(dangNhap, "ô mật khẩu nhập lại mới chưa điền");
                                            }else if(!String.valueOf(dangNhapmatkhauMoiNhapLaiField.getPassword()).equals(String.valueOf(dangNhapmatkhauMoiField.getPassword()))){
                                                JOptionPane.showMessageDialog(dangNhap, "ô mật khẩu mới chưa điền và ô mật khẩu nhập lại mới không bằng nhau");
                                            } else {
                                                try {

                                                    File inFile = new File(String.valueOf(FileAccount));
                                                    BufferedReader br = new BufferedReader(new FileReader(FileAccount));
                                                    File tempFile = new File(inFile.getAbsolutePath() + ".tmp");
                                                    PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

                                                    String line = null;
                                                    //Read from the original file and write to the new
                                                    //unless content matches data to be removed.
                                                    while ((line = br.readLine()) != null) {
                                                        if (!line.trim().equals(dangNhaptaikhoanField.getText() + "_" + String.valueOf(dangNhapmatkhauField.getPassword()) + "_user")) {
                                                            pw.println(line);
                                                            pw.flush();
                                                        } else {
                                                            pw.println(dangNhaptaikhoanField.getText() + "_" + String.valueOf(dangNhapmatkhauMoiField.getPassword()) + "_user");
                                                            pw.flush();
                                                        }
                                                    }
                                                    pw.close();
                                                    br.close();

                                                    if (!inFile.delete()) {
                                                        System.out.println("Could not delete file");
                                                    }

                                                    //Rename the new file to the filename the original file had.
                                                    if (!tempFile.renameTo(inFile)) {
                                                        System.out.println("Could not rename file");
                                                    }
                                                    JOptionPane.showMessageDialog(dangNhap, "thay đổi mk thành công");

                                                } catch (FileNotFoundException ex) {
                                                    System.out.println("file not fould exception");
                                                } catch (IOException ex) {
                                                    System.out.println("IO error exception");
                                                }



                                                dangNhaptaikhoanField.setText("");
                                                dangNhapmatkhauField.setText("");

                                                dangNhapTaiKhoanLable.setVisible(true);
                                                dangNhapMatKhauLable.setVisible(true);
                                                dangNhaptaikhoanField.setVisible(true);
                                                dangNhapmatkhauField.setVisible(true);
                                                dangnhapbutton.setVisible(true);
                                                thayDoiMKButton.setVisible(true);



                                                dangNhapMatKhauMoiLable.setVisible(false);
                                                dangNhapmatkhauMoiField.setVisible(false);
                                                dangNhapMatKhauMoiNhapLaiLable.setVisible(false);
                                                dangNhapmatkhauMoiNhapLaiField.setVisible(false);
                                                QuayLaiDangNhapButton.setVisible(false);
                                            }

                                        });

                                        dangNhapmatkhauMoiNhapLaiField.addActionListener(E -> {
                                            if (dangNhapmatkhauMoiField.getText().isEmpty()) {
                                                JOptionPane.showMessageDialog(dangNhap, "ô mật khẩu mới chưa điền");
                                            }else if(dangNhapmatkhauMoiNhapLaiField.getText().isEmpty()){
                                                JOptionPane.showMessageDialog(dangNhap, "ô mật khẩu nhập lại mới chưa điền");
                                            }else if(!String.valueOf(dangNhapmatkhauMoiNhapLaiField.getPassword()).equals(String.valueOf(dangNhapmatkhauMoiField.getPassword()))){
                                                JOptionPane.showMessageDialog(dangNhap, "ô mật khẩu mới chưa điền và ô mật khẩu nhập lại mới không bằng nhau");
                                            } else {
                                                try {

                                                    File inFile = new File(String.valueOf(FileAccount));
                                                    BufferedReader br = new BufferedReader(new FileReader(FileAccount));
                                                    File tempFile = new File(inFile.getAbsolutePath() + ".tmp");
                                                    PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

                                                    String line = null;
                                                    //Read from the original file and write to the new
                                                    //unless content matches data to be removed.
                                                    while ((line = br.readLine()) != null) {
                                                        if (!line.trim().equals(dangNhaptaikhoanField.getText() + "_" + String.valueOf(dangNhapmatkhauField.getPassword()) + "_user")) {
                                                            pw.println(line);
                                                            pw.flush();
                                                        } else {
                                                            pw.println(dangNhaptaikhoanField.getText() + "_" + String.valueOf(dangNhapmatkhauMoiField.getPassword()) + "_user");
                                                            pw.flush();
                                                        }
                                                    }
                                                    pw.close();
                                                    br.close();

                                                    if (!inFile.delete()) {
                                                        System.out.println("Could not delete file");
                                                    }

                                                    //Rename the new file to the filename the original file had.
                                                    if (!tempFile.renameTo(inFile)) {
                                                        System.out.println("Could not rename file");
                                                    }


                                                    JOptionPane.showMessageDialog(dangNhap, "thay đổi mk thành công");


                                                } catch (FileNotFoundException ex) {
                                                    System.out.println("file not fould exception");
                                                } catch (IOException ex) {
                                                    System.out.println("IO error exception");
                                                }



                                                dangNhaptaikhoanField.setText("");
                                                dangNhapmatkhauField.setText("");



                                                dangNhapTaiKhoanLable.setVisible(true);
                                                dangNhapMatKhauLable.setVisible(true);
                                                dangNhaptaikhoanField.setVisible(true);
                                                dangNhapmatkhauField.setVisible(true);
                                                dangnhapbutton.setVisible(true);
                                                thayDoiMKButton.setVisible(true);


                                                dangNhapMatKhauMoiLable.setVisible(false);
                                                dangNhapmatkhauMoiField.setVisible(false);
                                                dangNhapMatKhauMoiNhapLaiLable.setVisible(false);
                                                dangNhapmatkhauMoiNhapLaiField.setVisible(false);
                                                QuayLaiDangNhapButton.setVisible(false);
                                            }

                                        });



                                    }
                                }

                                isData = true;
                            }
                        } while (myReader.hasNextLine() && isData == false);
                        myReader.close();

                        if (dangNhapThanhCong == false) {
                            JOptionPane.showMessageDialog(dangNhap, "tài khoản hay mật khẩu chưa hợp lệ");
                        };
                    } catch (FileNotFoundException ex) {
                        System.out.println("file khong tim thay");
                    }
                } else {
                    JOptionPane.showMessageDialog(dangNhap, "tài khoản hoặc mật khẩu không hợp lệ");
                }

            }



        });


        dangnhapbutton.addActionListener(e -> {
            if (dangNhaptaikhoanField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(dangNhap, "ô tài khoản chưa điền");
            } else if (dangNhapmatkhauField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(dangNhap, "ô mật khẩu chưa điền");
            } else {
                File filename = new File(String.valueOf(FileAccount));
                if (filename.length() != 0) {
                    try {
                        boolean dangNhapThanhCong = false;
                        FileReader myObj = new FileReader(filename);
                        Scanner myReader = new Scanner(myObj);
                        boolean isData = false;

                        do {
                            String data = myReader.nextLine();
                            String dataArray[] = data.split("_");
                            if (dangNhaptaikhoanField.getText().equals(dataArray[0])) {
                                if (String.valueOf(dangNhapmatkhauField.getPassword()).equals(dataArray[1])) {
                                    dangNhapThanhCong = true;
                                    if(dataArray[2].equals("admin"))  {
                                        for (JButton jButton : Arrays.asList(but, button_quetThe_menu, but3, but4, phu1, phu2, phu3, phu4, phu5, phu6)) {
                                            menuGiuXe.add(jButton);
                                        }
                                    }
                                    else if(dataArray[2].equals("user")) {
                                        for (JButton jButton : Arrays.asList( button_quetThe_menu, phu6)) {
                                            menuGiuXe.add(jButton);
                                        }
                                    }
                                } else {
                                    dangNhapThanhCong = false;
                                }
                                isData = true;
                            }
                        } while (myReader.hasNextLine() && isData == false);
                        if (dangNhapThanhCong == true) {


                            JOptionPane.showMessageDialog(dangNhap, "đăng nhập thành công");


                            dangNhap.setVisible(false);
                            menuGiuXe.setVisible(true);
                            dangkithe.setVisible(false);
                            xoathe.setVisible(false);
                            hienThiThongTinThe.setVisible(false);
                            suaThongTinThe.setVisible(false);
                            dangki.setVisible(false);

                            dangNhaptaikhoanField.setText("");
                            dangNhapmatkhauField.setText("");
                        } else {
                            JOptionPane.showMessageDialog(dangNhap, "tài khoản hoặc mật khẩu không hợp lệ");
                        }
                        myReader.close();
                    } catch (FileNotFoundException ex) {
                        ex.getStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(dangNhap, "tài khoản hoặc mật khẩu không hợp lệ");
                }
            }
        });





        dangNhap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dangNhap.setExtendedState(JFrame.MAXIMIZED_BOTH);
        dangNhap.getContentPane().setBackground(new Color(243, 233, 221));
        dangNhap.setLayout(null);//using no layout managers
        dangNhap.setResizable(true);

        dangNhap.add(dangNHapTieuDe);
        dangNhap.add(dangNhapTaiKhoanLable);
        dangNhap.add(dangNhapMatKhauLable);
        dangNhap.add(dangNhapMatKhauMoiLable);
        dangNhap.add(dangNhaptaikhoanField);
        dangNhap.add(dangNhapmatkhauField);
        dangNhap.add(dangNhapmatkhauMoiField);
        dangNhap.add(dangNhapMatKhauMoiNhapLaiLable);
        dangNhap.add(dangNhapmatkhauMoiNhapLaiField);
        dangNhap.add(thayDoiMKButton);
        dangNhap.add(dangnhapbutton);
        dangNhap.add(QuayLaiDangNhapButton);

        returnButton.setFont(new Font("Quay lại", Font.PLAIN, 20));
        returnButton.setBounds(72, 618, 289, 74);//x axis, y axis, width

        returnButton1.setFont(new Font("Quay lại", Font.PLAIN, 20));
        returnButton1.setBounds(72, 618, 289, 74);//x axis, y axis, width,

        returnButton2.setFont(new Font("Quay lại", Font.PLAIN, 20));
        returnButton2.setBounds(72, 618, 289, 74);//x axis, y axis, width,

        returnButton3.setFont(new Font("Quay lại", Font.PLAIN, 20));
        returnButton2.setBounds(72, 618, 289, 74);//x axis, y axis, width,

        getSuaThongTinReturnButton.setFont(new Font("Quay lại", Font.PLAIN, 20));
        getSuaThongTinReturnButton.setBounds(72, 618, 289, 74);//x axis, y axis, width,

        dangKiReturn.setFont(new Font("Quay lại", Font.PLAIN, 20));
        dangKiReturn.setBounds(72, 618, 289, 74);//x axis, y axis, width

//        dangnhapReturn.setFont(new Font("Quay lại", Font.PLAIN, 20));
//        dangnhapReturn.setBounds(72, 618, 289, 74);//x axis, y axis, width
//
//        returnButton.setFont(new Font("Quay lại", Font.PLAIN, 20));
//        returnButton.setBounds(72, 618, 289, 74);//x axis, y axis,

        dangkithe.add(returnButton);
        xoathe.add(returnButton1);
        hienThiThongTinThe.add(returnButton2);
        suaThongTinThe.add(getSuaThongTinReturnButton);
        dangki.add(dangKiReturn);

        returnButton.addActionListener(e -> {
            menuGiuXe.setVisible(true);
            dangkithe.setVisible(false);
            xoathe.setVisible(false);
            hienThiThongTinThe.setVisible(false);
            suaThongTinThe.setVisible(false);
            dangNhap.setVisible(false);
            dangki.setVisible(false);
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
        });

        returnButton1.addActionListener(e -> {
            menuGiuXe.setVisible(true);
            dangkithe.setVisible(false);
            xoathe.setVisible(false);
            hienThiThongTinThe.setVisible(false);
            suaThongTinThe.setVisible(false);
            dangki.setVisible(false);
            dangNhap.setVisible(false);
            iddel.setText("");
        });

        returnButton2.addActionListener(e -> {
            menuGiuXe.setVisible(true);
            dangkithe.setVisible(false);
            xoathe.setVisible(false);
            suaThongTinThe.setVisible(false);
            hienThiThongTinThe.setVisible(false);
            dangki.setVisible(false);
            dangNhap.setVisible(false);
            hienThiThongTinThe.dispose();

            show4.setText("");
            show5.setText("");
            show6.setText("");

            quetTheNgay_hienThi.setText("");

            hienThiThongTinThe.getContentPane().setBackground(new Color(243, 233, 221));

            show4.setVisible(false);
            show5.setVisible(false);
            show6.setVisible(false);
        });

        returnButton3.addActionListener(e -> {
            menuGiuXe.setVisible(true);
            dangkithe.setVisible(false);
            xoathe.setVisible(false);
            hienThiThongTinThe.setVisible(false);
            dangki.setVisible(false);
            dangNhap.setVisible(false);
            suaThongTinThe.setVisible(false);
        });

        getSuaThongTinReturnButton.addActionListener(e -> {
            menuGiuXe.setVisible(true);
            dangkithe.setVisible(false);
            xoathe.setVisible(false);
            hienThiThongTinThe.setVisible(false);
            suaThongTinThe.setVisible(false);
            dangNhap.setVisible(false);
            dangki.setVisible(false);
            suaThongTinField0.setText("");
            suaThongTinField1.setText("");
            suaThongTinField2.setText("");
            suaThongTinField3.setText("");
            suaThongTinField4.setText("");
        });

        dangKiReturn.addActionListener(e -> {
            menuGiuXe.setVisible(true);
            dangkithe.setVisible(false);
            xoathe.setVisible(false);
            hienThiThongTinThe.setVisible(false);
            suaThongTinThe.setVisible(false);
            dangNhap.setVisible(false);
            dangki.setVisible(false);
            taiKhoanDangki.setText("");
            MatkhauDangKi.setText("");
            NhaplaiMatKhau.setText("");
        });

        //code giao diện cho hàm menu
        menuGiuXe.setBounds(100, 0, 1360, 768);
        menuGiuXe.setTitle("App giu xe");
        //background cho menu

        but.setFont(new Font("ĐĂNG KÍ THẺ", Font.PLAIN, 36));
        but.setBackground(new Color(177, 208, 224));
        but.setBounds(600, 60, 600, 120);//x axis, y axis, width, height
//        but.setIcon(new ImageIcon("C:\\Users\\HoangDeShotgun\\IdeaProjects\\RIFD Card\\src\\icon\\register.png"));
        but.addActionListener(e -> {
            menuGiuXe.setVisible(false);
            dangkithe.setVisible(true);
            xoathe.setVisible(false);
            hienThiThongTinThe.setVisible(false);
            dangki.setVisible(false);
            suaThongTinThe.setVisible(false);
        });

        button_quetThe_menu.setFont(new Font("QUÉT THẺ", Font.PLAIN, 36));
        button_quetThe_menu.setBackground(new Color(177, 208, 224));
        button_quetThe_menu.setBounds(600, 225, 600, 120);//x axis, y axis, width, height

        but4.setFont(new Font("SỬA THÔNG TIN", Font.PLAIN, 36));
        but4.setBackground(new Color(177, 208, 224));
        but4.setBounds(600, 388, 600, 120);//x axis, y axis, width, height
        but4.addActionListener(e -> {
            menuGiuXe.setVisible(false);
            dangkithe.setVisible(false);
            xoathe.setVisible(false);
            dangki.setVisible(false);
            hienThiThongTinThe.setVisible(false);
            suaThongTinThe.setVisible(false);

            ID_CARD = JOptionPane.showInputDialog(suaThongTinThe,"enter ID card");
            // khi khách nhấn nút cancel
            if( ID_CARD == null){
                menuGiuXe.setVisible(true);
            }else if(con.checkcard(ID_CARD, FileData) == false || ID_CARD.isEmpty()){
                do {
                    ID_CARD_2 = JOptionPane.showInputDialog(suaThongTinThe," ID không tồn tại \n enter ID card");
                    if(ID_CARD_2 == null) break;
                }while (con.checkcard(ID_CARD_2,FileData) == false || ID_CARD_2.isEmpty());
                if(ID_CARD_2 == null)    menuGiuXe.setVisible(true);
            }
            if(ID_CARD != null && ID_CARD_2 != null){
                suaThongTinThe.setVisible(true);
            }
        });

        but3.setFont(new Font("XÓA THẺ", Font.PLAIN, 36));
        but3.setBackground(new Color(177, 208, 224));
        but3.setBounds(600, 553, 600, 120);//x axis, y axis, width, height
        but3.addActionListener(e -> {
            menuGiuXe.setVisible(false);
            dangkithe.setVisible(false);
            xoathe.setVisible(true);
            dangki.setVisible(false);
            hienThiThongTinThe.setVisible(false);
            suaThongTinThe.setVisible(false);
        });

        //creating instance of JButton
        phu1.setFont(new Font("DỮ LIỆU", Font.PLAIN, 18));
        phu1.setBounds(-38, 72, 341, 75);//x axis, y axis, width, height
        phu1.setBackground(new Color(177, 208, 224));
        phu1.addActionListener(e -> {
            ProcessBuilder pc = new ProcessBuilder("notepad.exe", String.valueOf(FileData));
            try {
                pc.start();
                con.runFileMp3(String.valueOf(note));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        //creating instance of JButton
        phu2.setFont(new Font("LỊCH SỬ QUÉT", Font.PLAIN, 18));
        phu2.setBounds(-38, 175, 341, 75);//x axis, y axis, width, height
        phu2.setBackground(new Color(177, 208, 224));
        phu2.addActionListener(e -> {
            ProcessBuilder pc1 = new ProcessBuilder("notepad.exe", String.valueOf(FileDataHistory));
            try {
                pc1.start();
                con.runFileMp3(String.valueOf(note));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        //creating instance of JButton
        phu3.setFont(new Font("DỮ LIỆU THẺ CŨ", Font.PLAIN, 18));
        phu3.setBounds(-38, 278, 341, 75);//x axis, y axis, width, height
        phu3.setBackground(new Color(177, 208, 224));
        phu3.addActionListener(e -> {
            ProcessBuilder pc2 = new ProcessBuilder("notepad.exe", String.valueOf(FileDataDeleted));
            try {
                pc2.start();
                con.runFileMp3(String.valueOf(note));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        //creating instance of JButton
        phu4.setFont(new Font("TỰ ĐỘNG XÓA DỮ LIỆU CŨ", Font.PLAIN, 15));
        phu4.setBounds(-38, 384, 341, 75);//x axis, y axis, width, height
        phu4.setBackground(new Color(177, 208, 224));
        phu4.addActionListener(e -> {
            Controler con = new Controler();
            if (Controler.countLineNumberReader(FileDataHistory) >= 38400) {
                long count = Controler.countLineNumberReader(FileDataHistory);
                while (count > 36000) {
                    try (Stream<String> lines = Files.lines(Paths.get(String.valueOf(FileDataHistory)))) {
                        String line = lines.skip(0).findFirst().get();
                        con.removeLineFromFile(line, FileDataHistory);
                        count = Controler.countLineNumberReader(FileDataHistory);
                        System.out.println(count);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        phu5.setFont(new Font("ĐĂNG KÌ TÀI KHOẢN", Font.PLAIN, 18));
        phu5.setBounds(-38, 490, 341, 75);//x axis, y axis, width, height
        phu5.setBackground(new Color(177, 208, 224));
        phu5.addActionListener(e -> {
            menuGiuXe.setVisible(false);
            dangkithe.setVisible(false);
            xoathe.setVisible(false);
            hienThiThongTinThe.setVisible(false);
            suaThongTinThe.setVisible(false);
            dangNhap.setVisible(false);
            dangki.setVisible(true);
        });

        phu6.setFont(new Font("ĐĂNG XUẤT", Font.PLAIN, 25));
        phu6.setBounds(-38, 596, 288, 88);//x axis, y axis, width, height
        phu6.setBackground(new Color(177, 208, 224));
        phu6.addActionListener(e -> {
                menuGiuXe.setVisible(false);
                dangkithe.setVisible(false);
                xoathe.setVisible(false);
                hienThiThongTinThe.setVisible(false);
                suaThongTinThe.setVisible(false);
                dangNhap.setVisible(true);
                dangki.setVisible(false);
            for (JButton jButton : Arrays.asList(but, button_quetThe_menu, but3, but4, phu1, phu2, phu3, phu4, phu5, phu6)) {
                menuGiuXe.remove(jButton);
            }
        });





        menuGiuXe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuGiuXe.setExtendedState(JFrame.MAXIMIZED_BOTH);
        menuGiuXe.getContentPane().setBackground(new Color(243, 233, 221));
        menuGiuXe.setLayout(null);//using no layout managers
        menuGiuXe.setResizable(true);

        //code Jfram dang ki tai khoan
        dangki.setBounds(100, 0, 1360, 768);

        //4ude, dangdiTaiKhoan, dangkiMatkhau,nhaplaimatkhauDangKi
        dangkitieude = new JLabel("ĐĂNG KÍ TÀI KHOẢN");
        dangkitieude.setFont(new Font("ĐĂNG KÍ TÀI KHOẢN", Font.PLAIN, 30));
        dangkitieude.setBounds(452, 35, 632, 156);

        dangkiTaiKhoan= new JLabel("TÊN TÀI KHOẢN");
        dangkiTaiKhoan.setFont(new Font("TÊN TÀI KHOẢN", Font.PLAIN, 25));
        dangkiTaiKhoan.setBounds(120, 232, 250, 139);

        dangkiMatkhau= new JLabel("MẬT KHẨU");
        dangkiMatkhau.setFont(new Font("MẬT KHẨU", Font.PLAIN, 25));
        dangkiMatkhau.setBounds(120, 356, 250, 139);

        nhaplaimatkhauDangKi= new JLabel("NHẬP LẠI MẬT KHẨU");
        nhaplaimatkhauDangKi.setFont(new Font("NHẬP LẠI MẬT KHẨU", Font.PLAIN, 25));
        nhaplaimatkhauDangKi.setBounds(120, 480, 250, 139);

        dangki.add(dangkitieude);
        dangki.add(dangkiTaiKhoan);
        dangki.add(dangkiMatkhau);
        dangki.add(nhaplaimatkhauDangKi);

        taiKhoanDangki = new JTextField("");
        taiKhoanDangki.setBounds(402, 232, 556, 90);
        MatkhauDangKi = new JPasswordField("");
        MatkhauDangKi.setEchoChar('*');
        MatkhauDangKi.setBounds(402, 356, 556, 90);

        NhaplaiMatKhau = new JPasswordField("");
        MatkhauDangKi.setEchoChar('*');
        NhaplaiMatKhau.setBounds(402, 480, 556, 90);

        dangki.add(taiKhoanDangki);
        dangki.add(MatkhauDangKi);
        dangki.add(NhaplaiMatKhau);

        dangkibutton.setFont(new Font("ĐĂNG KÍ", Font.PLAIN, 25));
        dangkibutton.setBounds(527, 608, 359, 74);
        dangkibutton.addActionListener(e -> {
            if(taiKhoanDangki.getText().isEmpty()){
                JOptionPane.showMessageDialog(dangki,"ô tài khoản chưa điền");
            }else if(MatkhauDangKi.getText().isEmpty()){
                JOptionPane.showMessageDialog(dangki,"ô mật khẩu chưa điền");
            }else if(NhaplaiMatKhau.getText().isEmpty()){
                JOptionPane.showMessageDialog(dangki,"ô mật khẩu nhập lại chưa điền");
            }else if(!String.valueOf(MatkhauDangKi.getPassword()).equals(String.valueOf(NhaplaiMatKhau.getPassword()))){
                JOptionPane.showMessageDialog(dangki,"ô mật khẩu nhập lại và ô mật khẩu không trùng nhau");
            }else{
                File filename = new File(String.valueOf(FileAccount));
                if (filename.length() != 0) {
                    try {
                        FileReader myObj = new FileReader(filename);
                        Scanner myReader = new Scanner(myObj);
                        boolean isData = false;
                        do {
                            String data = myReader.nextLine();
                            String dataArray[] = data.split("_");
                            if(taiKhoanDangki.getText().equals(dataArray[0])){
                                isData = true;
                            }
                        } while (myReader.hasNextLine() && isData == false);
                        myReader.close();

                        if(isData == true){
                            JOptionPane.showMessageDialog(dangki,"tài khoản đã tồn tại");
                            taiKhoanDangki.setText("");
                        }else{

                            FileWriter myWriter;
                            try {
                                myWriter = new FileWriter(String.valueOf(FileAccount), true);
                                BufferedWriter bw = new BufferedWriter(myWriter);
                                bw.write(taiKhoanDangki.getText() + "_" + String.valueOf(MatkhauDangKi.getPassword()) +"_"+"user"+"\n");
                                bw.close();
                                JOptionPane.showMessageDialog(dangki,"đăng ký thành công");

                                taiKhoanDangki.setText("");
                                MatkhauDangKi.setText("");
                                NhaplaiMatKhau.setText("");

                            } catch (IOException ex) {
                               ex.printStackTrace();
                            }
                        }
                    } catch (FileNotFoundException ex) {
                        ex.printStackTrace();
                    }
                }else{
                    FileWriter myWriter;
                    try {
                        myWriter = new FileWriter(String.valueOf(FileAccount), true);
                        BufferedWriter bw = new BufferedWriter(myWriter);
                        bw.write(taiKhoanDangki.getText() + "_" + String.valueOf(MatkhauDangKi.getPassword()) + "\n");
                        bw.close();
                        JOptionPane.showMessageDialog(dangki, "đăng ký thành công");

                        taiKhoanDangki.setText("");
                        MatkhauDangKi.setText("");
                        NhaplaiMatKhau.setText("");

                    } catch (IOException ex) {
                        System.out.println("error");
                    }
                }
            }
        });
        dangki.add(dangkibutton);
        dangki.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dangki.setExtendedState(JFrame.MAXIMIZED_BOTH);
        dangki.getContentPane().setBackground(new Color(243, 233, 221));
        dangki.setLayout(null);//using no layout managers
        dangki.setResizable(true);

        //code giao dien cho frame dang ki the
        dangkithe.setBounds(100, 0, 1360, 768);//x axis, y axis, width, height
        dangkithe.getContentPane().setBackground(new Color(243, 233, 221));
        l0 = new JLabel("ĐĂNG KÍ THẺ GIỮ XE");
        l0.setFont(new Font("ĐĂNG KÍ THẺ GIỮ XE", Font.PLAIN, 30));
        l0.setBounds(452, 35, 632, 156);
        l1 = new JLabel("Họ và Tên");
        l1.setBounds(246, 160, 280, 37);
        l2 = new JLabel("Giới tính");
        l2.setBounds(246, 225, 280, 37);
        l3 = new JLabel("Mã phòng");
        l3.setBounds(246, 302, 280, 37);
        l4 = new JLabel("Biển số xe");
        l4.setBounds(246, 377, 280, 37);
        l5 = new JLabel("Loại xe");
        l5.setBounds(246, 449, 280, 37);
        l6 = new JLabel("Quét ID thẻ");
        l6.setBounds(246, 525, 280, 37);
        dangkithe.add(l0);
        dangkithe.add(l1);
        dangkithe.add(l2);
        dangkithe.add(l3);
        dangkithe.add(l4);
        dangkithe.add(l5);
        dangkithe.add(l6);

        rg.setFont(new Font("ĐĂNG KÍ", Font.PLAIN, 30));
        rg.setBounds(587, 608, 520, 104);//x axis, y axis, width, height
        dangkithe.add(rg);

        t1 = new JTextField("");
        t1.setBounds(400, 156, 564, 44);
        t2 = new JTextField("");
        t2.setBounds(400, 221, 564, 44);
        t3 = new JTextField("");
        t3.setBounds(400, 298, 564, 44);
        t4 = new JTextField("");
        t4.setBounds(400, 373, 564, 44);
        t5 = new JTextField("");
        t5.setBounds(400, 445, 564, 44);
        t6 = new JTextField("");
        t6.setBounds(400, 522, 564, 44);
        dangkithe.add(t1);
        dangkithe.add(t2);
        dangkithe.add(t3);
        dangkithe.add(t4);
        dangkithe.add(t5);
        dangkithe.add(t6);
        dangkithe.setResizable(true);
        dangkithe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dangkithe.setExtendedState(JFrame.MAXIMIZED_BOTH);
        dangkithe.setLayout(null);//making the frame visible

        //nhap du lieu the
        rg.addActionListener(e -> {

            try {
                String s1 = t6.getText();

                if (t1.getText().isEmpty() || t2.getText().isEmpty() || t3.getText().isEmpty() || t3.getText().isEmpty() || t4.getText().isEmpty() || t5.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(hienThiThongTinThe, "cac o trong chua dien du thong tin");
                } else if (!con.checkcard(s1, FileData)) {
                    FileWriter myWriter = new FileWriter(String.valueOf(FileData), true);
                    BufferedWriter bw = new BufferedWriter(myWriter);
                    bw.write(t3.getText() + "_" + t1.getText() + "_" + t4.getText() + "_" + t2.getText() + "_" + t5.getText() + "_" + new Date() + "_" + t6.getText() + "." + "\n");
                    bw.close();
                    JFrame nf = new JFrame();
                    JOptionPane.showMessageDialog(nf, "Đăng kí thành công!");

                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                    t5.setText("");
                    t6.setText("");
                } else {
                    JFrame nf = new JFrame();
                    JOptionPane.showMessageDialog(nf, "Thẻ đã tồn tại!");
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                    t5.setText("");
                    t6.setText("");
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        //code giao dien cho frame xoa the
        xoathe.setBounds(100, 0, 1360, 768);//x axis, y axis, width, height
        xoathe.getContentPane().setBackground(new Color(243, 233, 221));
        x0 = new JLabel("XÓA THẺ");
        x0.setFont(new Font("XÓA THẺ", Font.PLAIN, 40));
        x0.setBounds(450, 0, 632, 156);
        x2 = new JLabel("HÃY QUÉT ID THẺ VÀO Ô ĐỂ XÓA ");
        x2.setFont(new Font("HÃY ID THẺ VÀO Ô ĐỂ XÓA ", Font.PLAIN, 30));
        x2.setBounds(414, 466, 783, 118);
        xoathe.add(x0);
        xoathe.add(x2);

        iddel = new JTextField("");
        iddel.setBounds(414, 398, 300, 44);
        xoathe.add(iddel);

        xoa.setFont(new Font("XÁC NHẬN", Font.PLAIN, 15));
        xoa.setBounds(757, 398, 137, 44);//x axis, y axis, width, height
        xoathe.add(xoa);

        xoathe.setResizable(true);
        xoathe.setLocationByPlatform(true);
        xoathe.setLayout(null);//using no layout managers
        xoathe.setExtendedState(JFrame.MAXIMIZED_BOTH);
        xoathe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        xoa.addActionListener(e -> {
            Controler del = new Controler();
            String linetoremove = del.getData(iddel.getText(), FileData);
            if (del.checkcard(linetoremove, FileData)) {
                String[] cardProperty = linetoremove.split("_");
                del.WriteToFile(cardProperty, FileDataDeleted);
                del.removeLineFromFile(linetoremove, FileData);
                JFrame nf1 = new JFrame();
                JOptionPane.showMessageDialog(nf1, "Xóa thẻ thành công!");
            } else if (!del.checkcard(linetoremove, FileData)) {
                JFrame nf2 = new JFrame();
                JOptionPane.showMessageDialog(nf2, "Thẻ không tồn tại!");
            }
        });
        //code giao dien cho fram hien thi thong tin the
        hienThiThongTinThe.setBounds(100, 0, 1360, 768);//x axis, y axis, width, height
        hienThiThongTinThe.getContentPane().setBackground(new Color(243, 233, 221));
        quetTheNgay_hienThi = new JTextField("");
        quetTheNgay_hienThi.setBounds(523, 485, 448, 37);
        show0 = new JLabel("QUÉT THẺ");
        show0.setFont(new Font("QUÉT THẺ", Font.PLAIN, 40));
        show0.setBounds(564, 8, 632, 156);

        show1 = new JLabel("Mã phòng");
        show1.setFont(new Font("Mã phòng", Font.PLAIN, 35));
        show1.setBounds(61, 197, 448, 37);

        show2 = new JLabel("Biển số xe");
        show2.setFont(new Font("Biển số xe", Font.PLAIN, 35));
        show2.setBounds(61, 332, 448, 37);

        show3 = new JLabel("Loại xe");
        show3.setFont(new Font("Loại xe", Font.PLAIN, 35));
        show3.setBounds(61, 468, 448, 37);

        show4 = new JLabel("Mã phòng_content");
        show4.setFont(new Font("Mã phòng_content", Font.PLAIN, 35));
        show4.setBounds(300, 228, 448, 37);

        show5 = new JLabel("Biển số xe_content");
        show5.setFont(new Font("Biển số xe_content", Font.PLAIN, 35));
        show5.setBounds(300, 362, 448, 37);

        show6 = new JLabel("Loại xe_content");
        show6.setFont(new Font("Loại xe_content", Font.PLAIN, 35));
        show6.setBounds(300, 499, 448, 37);

        hienThiThongTinThe.add(show0);
        hienThiThongTinThe.add(show1);
        hienThiThongTinThe.add(show2);
        hienThiThongTinThe.add(show3);
        hienThiThongTinThe.add(show4);
        hienThiThongTinThe.add(show5);
        hienThiThongTinThe.add(show6);
        hienThiThongTinThe.add(quetTheNgay_hienThi);
        hienThiThongTinThe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hienThiThongTinThe.setExtendedState(JFrame.MAXIMIZED_BOTH);
        hienThiThongTinThe.setLayout(null);

        show0.setVisible(true);
        show1.setVisible(true);
        show2.setVisible(true);
        show3.setVisible(true);
        show4.setVisible(false);
        show5.setVisible(false);
        show6.setVisible(false);
        returnButton2.setVisible(true);
        quetTheNgay_hienThi.setVisible(true);

        //mai khi quay lại , xóa hết mọi thông tin cũ đã show, đưa setVisible các show0,show1,show2,show3,show4,... về lại false
        //và khi nút quét thẻ, nó sẽ lại in lại thông tin mới
        //vòng lặp liên tục
        button_quetThe_menu.addActionListener(e -> {

            menuGiuXe.setVisible(false);
            dangkithe.setVisible(false);
            xoathe.setVisible(false);
            suaThongTinThe.setVisible(false);
            dangki.setVisible(false);
            hienThiThongTinThe.setVisible(true);

            Controler con = new Controler();
            quetTheNgay_hienThi.addActionListener(E -> {
                String[] cardProperty;
                boolean existCard = con.checkcard(quetTheNgay_hienThi.getText(), FileData);

                if (existCard) {

                    cardProperty = con.readfile(quetTheNgay_hienThi.getText(), FileData);
                    con.WriteToFile(cardProperty, FileDataHistory);
                    show4.setText(cardProperty[0]);
                    show5.setText(cardProperty[2]);
                    show6.setText(cardProperty[4]);

                    hienThiThongTinThe.getContentPane().setBackground(new Color(243, 233, 221));

                    show4.setVisible(true);
                    show5.setVisible(true);
                    show6.setVisible(true);

                } else {
                    hienThiThongTinThe.getContentPane().setBackground(Color.RED);
                    show4.setText("Không Tồn Tại Thẻ");
                    show5.setText("");
                    show6.setText("");

                    show4.setVisible(true);
                    show5.setVisible(true);
                    show6.setVisible(true);
                }
            });

        });
        quetTheNgay_hienThi.addActionListener(E -> quetTheNgay_hienThi.setText(""));

        quetTheNgay_hienThi.addActionListener(E -> {
            boolean checkravao = con.checkcard(quetTheNgay_hienThi.getText(), Fileravao);
            String chuoithe = con.getData(quetTheNgay_hienThi.getText(), Fileravao);
            if (show4.getText().equals("Không Tồn Tại Thẻ")) {
                con.runFileMp3(String.valueOf(MP3_loi));
            } else {
                if (checkravao) {
                    con.runFileMp3(String.valueOf(MP3_XacnhanRA));
                    con.removeLineFromFile(chuoithe, Fileravao);
                } else {
                    con.runFileMp3(String.valueOf(MP3_XacnhanVAO));
                    FileWriter myWriter;
                    try {
                        myWriter = new FileWriter(String.valueOf(Fileravao), true);
                        BufferedWriter bw = new BufferedWriter(myWriter);
                        bw.write(quetTheNgay_hienThi.getText() + "_" + new Date() + "_" + t6.getText() + "." + "\n");
                        bw.close();
                    } catch (IOException ignored) {
                    }
                }
            }
        });

        //frame sua thong tin the
        suaThongTinThe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        suaThongTinThe.setExtendedState(JFrame.MAXIMIZED_BOTH);
        suaThongTinThe.getContentPane().setBackground(new Color(243, 233, 221));
        suaThongTinThe.setLayout(null);

//        JLabel suaThongTinshow0, suaThongTinshow1, suaThongTinshow2, suaThongTinshow3, suaThongTinshow4, suaThongTinshow5;
//        JTextField suaThongTinField0, suaThongTinField1, suaThongTinField2, suaThongTinField3, suaThongTinField4, suaThongTinField5;
//        JButton suaThongTinButton,getSuaThongTinReturnButton;
        tieude = new JLabel("SỬA THÔNG TIN THẺ");
        tieude.setFont(new Font("SỬA THÔNG TIN THẺ", Font.PLAIN, 30));
        tieude.setBounds(452, 35, 632, 156);

        suaThongTinshow0 = new JLabel("Họ và tên");
        suaThongTinshow0.setBounds(246,156,156,30);

        suaThongTinshow1 = new JLabel("Giới tính");
        suaThongTinshow1.setBounds(246,221,156,30);

        suaThongTinshow2 = new JLabel("Mã Phòng");
        suaThongTinshow2.setBounds(246,298,156,30);

        suaThongTinshow3 = new JLabel("Biển Số Xe");
        suaThongTinshow3.setBounds(246,373,156,30);

        suaThongTinshow4 = new JLabel("Loại Xe");
        suaThongTinshow4.setBounds(246,445,156,30);


        if(con.checkcard(ID_CARD,FileData)) {
            suaThongTincardProperty = con.readfile(ID_CARD, FileData);
        }else if(con.checkcard(ID_CARD_2,FileData)){
            suaThongTincardProperty = con.readfile(ID_CARD_2, FileData);
        }


        suaThongTinField0 = new JTextField(suaThongTincardProperty[1]);
        suaThongTinField0.setBounds(400, 156, 564, 44);
        suaThongTinField1 = new JTextField(suaThongTincardProperty[3]);
        suaThongTinField1.setBounds(400, 221, 564, 44);
        suaThongTinField2 = new JTextField(suaThongTincardProperty[0]);
        suaThongTinField2.setBounds(400, 298, 564, 44);
        suaThongTinField3 = new JTextField(suaThongTincardProperty[2]);
        suaThongTinField3.setBounds(400, 373, 564, 44);
        suaThongTinField4 = new JTextField(suaThongTincardProperty[4]);
        suaThongTinField4.setBounds(400, 445, 564, 44);

        for (JTextField jTextField : Arrays.asList(suaThongTinField0, suaThongTinField1,suaThongTinField2,suaThongTinField3,suaThongTinField4)) {
            suaThongTinThe.add(jTextField);
        }
        for (JLabel jLabel : Arrays.asList(tieude, suaThongTinshow0, suaThongTinshow1, suaThongTinshow2, suaThongTinshow3, suaThongTinshow4)) {
            suaThongTinThe.add(jLabel);
        }

        suaThongTinButton.setFont(new Font("ĐĂNG KÍ", Font.PLAIN, 30));
        suaThongTinButton.setBounds(587, 608, 520, 104);//x axis, y axis, width, height
        suaThongTinThe.add(suaThongTinButton);
        suaThongTinButton.addActionListener(e -> {
            if(suaThongTinField0.getText().isEmpty() || suaThongTinField1.getText().isEmpty() || suaThongTinField2.getText().isEmpty() || suaThongTinField3.getText().isEmpty() || suaThongTinField4.getText().isEmpty()){
                JOptionPane.showMessageDialog(suaThongTinThe, "các ô thông tin chứa điền đủ");
            }else{
                if(suaThongTinField0.getText().isEmpty() || suaThongTinField1.getText().isEmpty() || suaThongTinField2.getText().isEmpty() || suaThongTinField3.getText().isEmpty() || suaThongTinField4.getText().isEmpty()){
                    JOptionPane.showMessageDialog(suaThongTinThe, "các ô thông tin chứa điền đủ");
                }else{
                    try {
                        String card = null;
                        if(con.checkcard(ID_CARD,FileData)) {
                            card = con.getData(ID_CARD, FileData);
                        }else if(con.checkcard(ID_CARD_2,FileData)){
                            card = con.getData(ID_CARD_2, FileData);
                        }

                        File inFile = new File(String.valueOf(FileData));
                        BufferedReader br = new BufferedReader(new FileReader(FileData));
                        File tempFile = new File(inFile.getAbsolutePath() + ".tmp");
                        PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

                        String line = null;
                        //Read from the original file and write to the new
                        //unless content matches data to be removed.
                        while ((line = br.readLine()) != null) {
                            if (!line.trim().equals(card)) {
                                pw.println(line);
                                pw.flush();
                            }else {
                                pw.println(suaThongTinField2.getText() + "_" + suaThongTinField0.getText() + "_" + suaThongTinField3.getText() + "_" +  suaThongTinField1.getText() + "_" +  suaThongTinField4.getText() + "_" + suaThongTincardProperty[5] + "_" + suaThongTincardProperty[6] );
                                pw.flush();
                            }
                        }
                        pw.close();
                        br.close();

                        if (!inFile.delete()) {
                            System.out.println("Could not delete file");
                        }

                        //Rename the new file to the filename the original file had.
                        if (!tempFile.renameTo(inFile)) {
                            System.out.println("Could not rename file");
                        }

                        JOptionPane.showMessageDialog(suaThongTinThe, "sửa thông tin thành công");

                        suaThongTinField0.setText("");
                        suaThongTinField1.setText("");
                        suaThongTinField2.setText("");
                        suaThongTinField3.setText("");
                        suaThongTinField4.setText("");

                    } catch (FileNotFoundException ex) {
                        System.out.println("error file not fould");
                    }catch (IOException ex) {
                        System.out.println("error IO ");
                    }
                }
            }
        });


    }
}
