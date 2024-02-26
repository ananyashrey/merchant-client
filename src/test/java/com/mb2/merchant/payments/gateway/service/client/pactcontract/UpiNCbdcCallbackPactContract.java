package com.mb2.merchant.payments.gateway.service.client.pactcontract;

import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.model.RequestResponsePact;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mb2.merchant.payments.gateway.service.client.testconstants.merchant.CbdcCallbackJsons;
import com.mb2.merchant.payments.gateway.service.client.testconstants.merchant.UpiCallbackJsons;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

import static com.mb2.merchant.payments.gateway.service.client.testconstants.TestConstants.*;

@RequiredArgsConstructor
@Component
public class UpiNCbdcCallbackPactContract {

    @Autowired
    ObjectMapper objectMapper;

    public RequestResponsePact generateContract(PactDslWithProvider builder) {

        Map<String, String> responseHeaders = new HashMap<>();
        responseHeaders.put(CONTENT_TYPE_HEADER_KEY, CONTENT_TYPE_TEXT);


        return builder
                // UPI Callback
                .given(REST_METHOD_POST)
                .uponReceiving("UPI CALLBACK REQUEST")
                .path(String.format("%s%s", "/callback/upi/", UPI_AGGREGATOR_ID))
                .method(REST_METHOD_POST)
                .body(UpiCallbackJsons.apiRequest)
                .willRespondWith()
                .status(200)
                .headers(responseHeaders)

                // CBDC Callback
                .given(REST_METHOD_POST)
                .uponReceiving("CBDC CALLBACK REQUEST")
                .path(String.format("%s%s", "/callback/cbdc/", CBDC_AGGREGATOR_ID))
                .method(REST_METHOD_POST)
                .body(CbdcCallbackJsons.apiRequest)
                .willRespondWith()
                .status(200)
                .headers(responseHeaders)
                .toPact();

    }
}
