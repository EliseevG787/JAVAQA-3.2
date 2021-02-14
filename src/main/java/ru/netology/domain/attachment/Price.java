package ru.netology.domain.attachment;

public class Price {
    private String amount;
    private Currency currency;
    private String oldAmount;
    private String text;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getOldAmount() {
        return oldAmount;
    }

    public void setOldAmount(String oldAmount) {
        this.oldAmount = oldAmount;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
