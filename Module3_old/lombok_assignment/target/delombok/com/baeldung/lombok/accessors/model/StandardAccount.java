// Generated by delombok at Tue Jun 29 20:53:44 EDT 2021
package com.baeldung.lombok.accessors.model;

import java.math.BigDecimal;

public class StandardAccount {
    private String name;
    private BigDecimal balance;

    @SuppressWarnings("all")
    public String getName() {
        return this.name;
    }

    @SuppressWarnings("all")
    public BigDecimal getBalance() {
        return this.balance;
    }

    @SuppressWarnings("all")
    public void setName(final String name) {
        this.name = name;
    }

    @SuppressWarnings("all")
    public void setBalance(final BigDecimal balance) {
        this.balance = balance;
    }
}
