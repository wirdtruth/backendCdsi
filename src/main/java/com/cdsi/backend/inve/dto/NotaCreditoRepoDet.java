package com.cdsi.backend.inve.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotaCreditoRepoDet {
   private String CONSECUTIVO;
   private String NO_ARTI;
   private String UM;
   private String NOMBRE;
   private BigDecimal CANTIDAD_FACT;
   private BigDecimal PRECIO_UNIT;
   private BigDecimal IMP_IGV;
   private BigDecimal TOTAL;
}
