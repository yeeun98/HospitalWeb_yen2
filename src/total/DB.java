package java;

import java.sql.*;

public class DB {

    static  Connection con = null ;
    static  Statement stmt = null;
    static  ResultSet rs           = null ;
    static  PreparedStatement prStmt  = null;
    static CallableStatement cs   = null;

    public static void loadConnect() {
        String server = "localhost"; // MySQL 서버 주소
        String database = "mechedular"; // MySQL DATABASE 이름
        String user_name = "root"; //  MySQL 서버 아이디
        String password = "onlyroot"; // MySQL 서버 비밀번호


        // 1.드라이버 로딩
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println(" !! <JDBC 오류> Driver load 오류: " + e.getMessage());
            e.printStackTrace();
        }

        // 2.연결
        try {
            con = DriverManager.getConnection("jdbc:mysql://" + server + "/" + database + "?useSSL=false", user_name, password);
            System.out.println("정상적으로 연결되었습니다.");

        } catch(SQLException e) {
            System.err.println("con 오류:" + e.getMessage());
            e.printStackTrace();
        }

    }

    /*--------------------------------------------------------------------------------------*/
    //아이디로 병원 비밀번호 찾기
    public static Hospital findhospitalPwd(String hid){
        try {
            stmt = con.createStatement();
            String sql="select * from hospital where hid ="+ hid ;
            rs = stmt.executeQuery(sql);
            while (rs.next())  {
                Hospital pwd = getHospitalFromRS(rs);
                return pwd;
            }
        }
        catch( SQLException ex ) {
            System.err.println("** SQL exec error in insertUserTuple: " + ex.getMessage() );
        }

        return null;
    }

    //java.Hospital id Hospital_pwd로 java.Hospital 찾기 ==> login
    public static Hospital findhospital(String id, String pwd){
        DB.loadConnect();
        try {
            stmt = con.createStatement();
            String sql="select * from hospital where hid ='"+id+"' and hpwd ='"+pwd+"' ";
            rs = stmt.executeQuery(sql);
            while (rs.next())  {
                Hospital hospital = getHospitalFromRS(rs);
                return hospital;
            }
        }
        catch( SQLException ex ) {
            System.err.println("** SQL exec error in insertUserTuple: " + ex.getMessage() );
        }

        return null;
    }

    //resultset에서 java.Hospital 칼럼 값 갖고 오기
    public static Hospital getHospitalFromRS(ResultSet rs) {
        Hospital hospital = new Hospital();

        try {
            hospital.hno = rs.getString("hno");
            hospital.hname = rs.getString("hname");
            hospital.hid = rs.getString("hid");
            hospital.hpwd = rs.getString("hpwd");
            hospital.htn = rs.getString("htn");
            hospital.haddress = rs.getString("haddress");
        } catch( SQLException ex )        {
            System.err.println("** SQL exec error in getHospitalFromRS : " + ex.getMessage() );
        }

        return hospital;
    }

}
