package io.qase.api.models.v1.testrunresults;

import lombok.Data;

@Data
@SuppressWarnings("unused")
public class Step {
    private long position;
    private long status;
}