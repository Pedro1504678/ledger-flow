package com.ledgerflow.domain.shared;

import java.time.Instant;
import java.util.UUID;

/**
 * Marker interface for all domain events
 */
public interface DomainEvent {
    UUID aggregateId();

    Instant occuredAt();
}
