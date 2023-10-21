package com.cdsi.backend.inve.controllers.commons;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseRest {

    private String apiVerision;
    private ResponseEstado estado;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object resultado;

}
