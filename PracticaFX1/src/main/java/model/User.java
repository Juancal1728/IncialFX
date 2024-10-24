package model;

public class User {
    private String username;
    private String code;
    private double score;

    public User(String username, String code, double score) {
        this.username = username;
        this.code = code;
        this.score = score;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", codigo='" + code + '\'' +
                ", score=" + score +
                '}';
    }





}
