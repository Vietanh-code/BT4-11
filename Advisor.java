public class Advisor {
    private String fullname;
    private  String email;

    public Advisor(String fullname, String email) {
        this.fullname = fullname;
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Advisor:" +
                "fullname='" + fullname + '\'' +
                ", email='" + email + '\'' +
                '.';
    }
}

