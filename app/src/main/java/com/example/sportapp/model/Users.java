package com.example.sportapp.model;


import com.google.gson.annotations.SerializedName;
//pagina asta se sterge
public class Users {

    @SerializedName("username")
    private String username_login;
    @SerializedName("email")
    private String email_login;
    @SerializedName("password")
    private String password_login;
    @SerializedName("repassword")
    private String repassword_login;
    public Users()
    {}
    public Users( String username_login, String email_login, String password_login, String repassword_login) {

        this.username_login = username_login;
        this.email_login = email_login;
        this.password_login = password_login;
        this.repassword_login = repassword_login;
    }
    public String getUsername() {
        return username_login;
    }
    public void setUsername(String username_login) {
        this.username_login = username_login;
    }

    public String getEmail() {
        return email_login;
    }
    public void setEmail(String email_login) {
        this.email_login = email_login;
    }

    public String getPassword() {
        return password_login;
    }
    public void setPassword(String password_login) {
        this.password_login = password_login;
    }

    public String getRepassword() {
        return repassword_login;
    }
    public void setRepassword(String repassword_login) {
        this.repassword_login = repassword_login;
    }
    @Override
    public String toString() {
        return "Users{" +
                "username_login='" + username_login + '\'' +
                ", email_login='" + email_login + '\'' +
                ", password_login='" + password_login + '\'' +
                ", repassword_login='" + repassword_login + '\'' +
                '}';
    }
   /* @Override
    public String toString() {
        return "User{" +
               // "id=" + username_code +
                "password='" + password_login + '\'' +
                ", email='" + email_login + '\'' +
                ", repassword='" + repassword_login + '\'' +
                ",username='" + username_login + '\'' +
                '}';
    }*/

    /* public int getId() {
        return id_login;
    }

    public void setId(int id_login) {
        this.id_login = id_login;
    }*/


     /* @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_login;*/

  /* private String username_code;

    public String getUsername_code() {
        return username_code;
    }

    public void setUsername_code(String username_code) {
        this.username_code = username_code;
    }*/
}