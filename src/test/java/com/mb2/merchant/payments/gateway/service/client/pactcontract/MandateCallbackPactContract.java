package com.mb2.merchant.payments.gateway.service.client.pactcontract;

import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.model.RequestResponsePact;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mb2.merchant.payments.gateway.service.client.testconstants.mandate.MandateCallbackJsons;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

import static com.mb2.merchant.payments.gateway.service.client.testconstants.TestConstants.*;

@RequiredArgsConstructor
@Component
public class MandateCallbackPactContract {

    @Autowired
    ObjectMapper objectMapper;

    public RequestResponsePact generateContract(PactDslWithProvider builder) {

        Map<String, String> responseHeaders = new HashMap<>();
        responseHeaders.put(CONTENT_TYPE_HEADER_KEY, CONTENT_TYPE_TEXT);


        return builder
                // Mandate Callback
                .given(REST_METHOD_POST)
                .uponReceiving("MANDATE CALLBACK REQUEST")
                .path(String.format("%s%s", "/mandate/callback/", MANDATE_AGGREGATOR_ID))
                .method(REST_METHOD_POST)
                .body(MandateCallbackJsons.apiRequest)
                .willRespondWith()
                .status(200)
                .headers(responseHeaders)
                .toPact();
    }
}
