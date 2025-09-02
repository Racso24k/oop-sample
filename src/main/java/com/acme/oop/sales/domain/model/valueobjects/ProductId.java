package com.acme.oop.sales.domain.model.valueobjects;

import java.util.Objects;
import java.util.UUID;

/**
 * Value Objet representing a Product ID in the sales bounded context
 * @param value the UUID value of the Product ID
 *
 * @author Open-Source Aplications Develoment Team
 * @version 1.0
 */
public record ProductId(UUID value) {
    /**
     * Constructor with validation
     * @param value the UUID value of the Product ID
     */
    public ProductId {
        if (Objects.isNull(value))
            throw new NullPointerException("Product id cannot be null");
    }

    /**
     * Default constructor generating a random UUID
     */
    public ProductId(){
        this(UUID.randomUUID());
    }
}
