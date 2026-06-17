package com.ledgerflow.domain.account;

import java.util.UUID;

import static java.util.Objects.requireNonNull;

public record AccountId(UUID value) {

    public AccountId {
        requireNonNull(value, "accountId must not be null");
    }

    public static AccountId of(UUID value) {
        return new AccountId(value);
    }

    public static AccountId newId() {
        return new AccountId(UUID.randomUUID());
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
