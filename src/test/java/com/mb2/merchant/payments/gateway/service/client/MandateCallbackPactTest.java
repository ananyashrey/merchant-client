package com.mb2.merchant.payments.gateway.service.client;

import au.com.dius.pact.consumer.Pact;
import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.consumer.junit5.PactConsumerTestExt;
import au.com.dius.pact.consumer.junit5.PactTestFor;
import au.com.dius.pact.model.RequestResponsePact;
import com.mb2.merchant.payments.gateway.service.client.pactcontract.MandateCallbackPactContract;
import com.mb2.merchant.payments.gateway.service.client.sao.MPGSClient;
import com.mb2.merchant.payments.gateway.service.client.testconstants.mandate.MandateCallbackJsons;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;

import static com.mb2.merchant.payments.gateway.service.client.testconstants.TestConstants.*;

@ExtendWith(PactConsumerTestExt.class)
@SpringBootTest
@Slf4j
class MandateCallbackPactTest {

    @Autowired
    MPGSClient mpgsClient;

    @Autowired
    MandateCallbackPactContract mandatePactContract;

    @Pact(consumer = "olive-switch-mandate", provider = "merchant-payment-gateway-service")
    public RequestResponsePact getContract(PactDslWithProvider builder) {
        return mandatePactContract.generateContract(builder);
    }

    @Test
    @PactTestFor(port="8090")
    void runAllPactTests() throws Exception {
        mpgsClient.MPGSCallbackApi(URI.create(
                        String.format("%s%s", "http://localhost:8090/mandate/callback/", MANDATE_AGGREGATOR_ID)),
                MandateCallbackJsons.apiRequest);
    }

}
