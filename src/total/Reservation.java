package java;

public class Reservation {

    String uno;
    String rno;
    String rdate;
    String hno;

    public Reservation(){}

    public Reservation(String uno, String rno, String rdate, String hno){
        this.uno = uno;
        this.rno = rno;
        this.rdate = rdate;
        this.hno = hno;
    }

    public String getUno() {
        return uno;
    }

    public void setUno(String uno) {
        this.uno = uno;
    }

    public String getRno() {
        return rno;
    }

    public void setRno(String rno) {
        this.rno = rno;
    }

    public String getRdate() {
        return rdate;
    }

    public void setRdate(String rdate) {
        this.rdate = rdate;
    }

    public String getHno() {
        return hno;
    }

    public void setHno(String hno) {
        this.hno = hno;
    }
}
