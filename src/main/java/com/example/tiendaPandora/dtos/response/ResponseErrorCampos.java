package com.example.tiendaPandora.dtos.response;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseErrorCampos {

    private Integer codigoHttp;

    private List<String> mensajes;

}
