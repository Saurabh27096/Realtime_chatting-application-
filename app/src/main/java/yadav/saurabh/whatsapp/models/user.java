package yadav.saurabh.whatsapp.models;

public class user {

    String profil_picture , username , email , pos , userid ,last_msg ;

    public user(String profil_picture, String username, String email, String pos, String userid, String last_msg) {
        this.profil_picture = profil_picture;
        this.username = username;
        this.email = email;
        this.pos = pos;
        this.userid = userid;
        this.last_msg = last_msg;
    }
    public  user(){}
    // signup constructor


    public user(String username, String email, String pos) {
        this.username = username;
        this.email = email;
        this.pos = pos;
    }



    public String getProfil_picture() {
        return profil_picture;
    }

    public void setProfil_picture(String profil_picture) {
        this.profil_picture = profil_picture;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getLast_msg() {
        return last_msg;
    }

    public void setLast_msg(String last_msg) {
        this.last_msg = last_msg;
    }
}
