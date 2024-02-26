package com.mb2.merchant.payments.gateway.service.client.sao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.net.URI;


@FeignClient(name = "MPGSClient", url = "placeHolder")
public interface MPGSClient {

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Object> MPGSApi(URI uri,
                                   @RequestHeader(value = "Content-Type") String contentType,
                                   @RequestHeader(value = "Authorization") String authorization,
                                   @RequestHeader(value = "X-VERIFY") String xVerify,
                                   @RequestHeader(value = "X-CHECK") String xCheck,
                                   @RequestBody String requestBody);

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Object> MPGSCallbackApi(URI uri,
                                   @RequestBody String requestBody);
}
