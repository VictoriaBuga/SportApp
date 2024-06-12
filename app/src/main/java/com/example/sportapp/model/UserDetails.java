package com.example.sportapp.model;

import com.google.gson.annotations.SerializedName;
//pagina asta se va sterge
public class UserDetails
{
    @SerializedName("username")
    private String username;
    @SerializedName("gender")
    private String gender;
    @SerializedName("lose_gain")
    private String lose_gain;
    @SerializedName("actual_weight")
    private int actual_weight;
    @SerializedName("desired_weight")
    private int desired_weight;
    @SerializedName("age")
    private int age;
    @SerializedName("height")
    private String height;
    @SerializedName("hours_of_sleep")
    private int hours_of_sleep;
    @SerializedName("country")
    private String country;
    @SerializedName("how_active")
    private String how_active;
    @SerializedName("when_active")
    private String when_active;
    @SerializedName("health_problems")
    private String health_problems;

    public UserDetails()
    {}

    public UserDetails(String username,String gender)
    {
        this.username=username;
        this.gender=gender;
    }

    public UserDetails(String health_problems)
    {
        this.health_problems = health_problems;
    }

    public UserDetails(String lose_gain, int actual_weight, int desired_weight, int age, String height)
    {
        this.lose_gain = lose_gain;
        this.actual_weight = actual_weight;
        this.desired_weight = desired_weight;
        this.age = age;
        this.height = height;
    }

    public UserDetails(int hours_of_sleep, String country, String how_active, String when_active)
    {
        this.hours_of_sleep = hours_of_sleep;
        this.country =  country;
        this.how_active = how_active;
        this.when_active = when_active;
    }

    public UserDetails(String username, String gender, String lose_gain, int actual_weight, int desired_weight, int age, String height, int hours_of_sleep, String country, String how_active, String when_active, String health_problems) {
        this.username = username;
        this.gender = gender;
        this.lose_gain = lose_gain;
        this.actual_weight = actual_weight;
        this.desired_weight = desired_weight;
        this.age = age;
        this.height = height;
        this.hours_of_sleep = hours_of_sleep;
        this.country = country;
        this.how_active = how_active;
        this.when_active = when_active;
        this.health_problems = health_problems;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLose_gain() {
        return lose_gain;
    }

    public void setLose_gain(String lose_gain) {
        this.lose_gain = lose_gain;
    }

    public int getActual_weight() {
        return actual_weight;
    }

    public void setActual_weight(int actual_weight) {
        this.actual_weight = actual_weight;
    }

    public int getDesired_weight() {
        return desired_weight;
    }

    public void setDesired_weight(int desired_weight) {
        this.desired_weight = desired_weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public int getHours_of_sleep() {
        return hours_of_sleep;
    }

    public void setHours_of_sleep(int hours_of_sleep) {
        this.hours_of_sleep = hours_of_sleep;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHow_active() {
        return how_active;
    }

    public void setHow_active(String how_active) {
        this.how_active = how_active;
    }

    public String getWhen_active() {
        return when_active;
    }

    public void setWhen_active(String when_active) {
        this.when_active = when_active;
    }

    public String getHealth_problems() {
        return health_problems;
    }

    public void setHealth_problems(String health_problems) {
        this.health_problems = health_problems;
    }


    @Override
    public String toString() {
        return "UserDetailsDb{" +
                "username='" + username + '\'' +
                ", gender='" + gender + '\'' +
                ", lose_gain='" + lose_gain + '\'' +
                ", actual_weight='" + actual_weight + '\'' +
                ", desired_weight='" + desired_weight + '\'' +
                ", age=" + age +
                ", height='" + height + '\'' +
                ", hours_of_sleep=" + hours_of_sleep +
                ", country='" + country + '\'' +
                ", how_active='" + how_active + '\'' +
                ", when_active='" + when_active + '\'' +
                ", health_problems='" + health_problems + '\'' +
                '}';
    }
}
