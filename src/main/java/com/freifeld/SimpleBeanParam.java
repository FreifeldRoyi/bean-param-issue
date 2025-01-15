package com.freifeld;

import jakarta.ws.rs.PathParam;
import org.hibernate.validator.constraints.UUID;

public record SimpleBeanParam(
        @PathParam("min") @UUID(allowNil = false, version = 7) String min,
        @PathParam("max") @UUID(allowNil = false, version = 7) String max
) {
}
