package java;

public class Hospital {
    String hno;
    String hname;
    String hid;
    String hpwd;
    String htn;
    String haddress;

    public Hospital() {
    }

    public Hospital(String hno, String hname, String hid, String hpwd, String htn, String haddress) {
        this.hno = hno;
        this.hname = hname;
        this.hid = hid;
        this.hpwd = hpwd;
        this.htn = htn;
        this.haddress = haddress;
    }

    public String getHno() {
        return hno;
    }

    public void setHno(String hno) {
        this.hno = hno;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    public String getHid() {
        return hid;
    }

    public void setHid(String hid) {
        this.hid = hid;
    }

    public String getHpwd() {
        return hpwd;
    }

    public void setHpwd(String hpwd) {
        this.hpwd = hpwd;
    }

    public String getHtn() {
        return htn;
    }

    public void setHtn(String htn) {
        this.htn = htn;
    }

    public String getHaddress() {
        return haddress;
    }

    public void setHaddress(String haddress) {
        this.haddress = haddress;
    }
}
