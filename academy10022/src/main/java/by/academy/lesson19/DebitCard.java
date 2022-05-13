package by.academy.lesson19;

import java.util.Date;

public class DebitCard implements Payment {
    private String issuer;
    private Long cardNo;
    private Date expireDate;

    @Override
    public void pay(int money) {
    }

    public DebitCard(String issuer, Long cardNo, Date expireDate) {
        this.issuer = issuer;
        this.cardNo = cardNo;
        this.expireDate = expireDate;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public Long getCardNo() {
        return cardNo;
    }

    public void setCardNo(Long cardNo) {
        this.cardNo = cardNo;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    @Override
    public String toString() {
        return "DebitCard{" +
                "issuer='" + issuer + '\'' +
                ", cardNo=" + cardNo +
                ", expireDate=" + expireDate +
                '}';
    }
}
