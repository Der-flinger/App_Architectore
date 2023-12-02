package Seminar4.Hometask.BusStation.src;

public class Person {

    private int id;
    private String fullName;
    private Long cardNumber;
    private Long hashPass;
    private String login;

    public Person(int id, String fullName, Long cardNumber, Long hashPass, String login) {
        this.id = id;
        this.fullName = fullName;
        this.cardNumber = cardNumber;
        this.hashPass = hashPass;
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public String getFIO() {
        return fullName;
    }

    public Long getCardNumber() {
        return cardNumber;
    }

    public Long getHashPass() {
        return hashPass;
    }

    public void setHashPass(Long hashPass) {
        this.hashPass = hashPass;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

}
