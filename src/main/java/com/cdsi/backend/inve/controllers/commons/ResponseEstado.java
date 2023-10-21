package com.cdsi.backend.inve.controllers.commons;

import com.cdsi.backend.inve.controllers.enums.ResponseEnum;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@JsonPropertyOrder({"codigo","mensaje","detalle","estado","error","fechaHora"})
@Data
@Builder
public class ResponseEstado {
    @Builder.Default
    private Date fechaHora = new Date();
    private Integer estado;
    private String error;
    private ResponseEnum codigo;
    private Object mensaje;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object detalle;



}
