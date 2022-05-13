package by.academy.lesson19;

import java.util.Date;

public class CreditCard implements Payment {
    private String issuer;
    private Long cardNo;
    private Date expiryDate;

    @Override
    public void pay(int money) {
    }

    public CreditCard(String issuer, Long cardNo, Date expiryDate) {
        this.issuer = issuer;
        this.cardNo = cardNo;
        this.expiryDate = expiryDate;
    }

    public CreditCard(){
        super();
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

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "issuer='" + issuer + '\'' +
                ", cardNo=" + cardNo +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
