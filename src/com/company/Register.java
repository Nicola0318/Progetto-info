package com.company;

public class Register  extends Login {
    protected String Username;
    protected String Password;
    private String Email;
    private int eta;

    public Register(String username, String password, String username1, String password1, String email, int eta) {
        super(username, password);
        Username = username1;
        Password = password1;
        Email = email;
        this.eta = eta;
    }

    @Override
    public String getUsername() {
        return Username;
    }

    @Override
    public void setUsername(String username) {
        Username = username;
    }

    @Override
    public String getPassword() {
        return Password;
    }

    @Override
    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;

    }
}
