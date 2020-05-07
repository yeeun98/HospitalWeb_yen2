package java;

public class Patient {

    String pno;
    String pname;
    String ppn;/*환자 전화번호*/
    String birth;
    String address;

    public Patient(){}

    public Patient(String pno, String pname, String ppn, String birth, String address){
        this.pno = pno;
        this.pname = pname;
        this.ppn = ppn;
        this.birth = birth;
        this.address = address;
    }

    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPpn() {
        return ppn;
    }

    public void setPpn(String ppn) {
        this.ppn = ppn;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
