package lapoInvestment;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {
    private String reference;
    private BigDecimal amount;
    private LocalDateTime createdAt;

    public Transaction(String reference, BigDecimal amount) {
        this.reference = reference;
        this.amount = amount;
        createdAt=LocalDateTime.now();
    }
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }


}
