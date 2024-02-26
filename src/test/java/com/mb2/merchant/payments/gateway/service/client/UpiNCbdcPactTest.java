package com.mb2.merchant.payments.gateway.service.client;

import au.com.dius.pact.consumer.Pact;
import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.consumer.junit5.PactConsumerTestExt;
import au.com.dius.pact.consumer.junit5.PactTestFor;
import au.com.dius.pact.model.RequestResponsePact;
import com.mb2.merchant.payments.gateway.service.client.testconstants.merchant.MerchantCollectJsons;
import com.mb2.merchant.payments.gateway.service.client.testconstants.merchant.MerchantIdAvailabilityJsons;
import com.mb2.merchant.payments.gateway.service.client.testconstants.merchant.MerchantPayJsons;
import com.mb2.merchant.payments.gateway.service.client.testconstants.merchant.MerchantRegistrationJsons;
import com.mb2.merchant.payments.gateway.service.client.pactcontract.UpiNCbdcPactContract;
import com.mb2.merchant.payments.gateway.service.client.sao.MPGSClient;
import com.mb2.merchant.payments.gateway.service.client.testconstants.transaction.TransactionStatusJsons;
import com.mb2.merchant.payments.gateway.service.client.testconstants.vpa.VpaAvailableJsons;
import com.mb2.merchant.payments.gateway.service.client.testconstants.vpa.VpaJsons;
import com.mb2.merchant.payments.gateway.service.client.testconstants.vpa.VpaStatusJsons;
import com.mb2.merchant.payments.gateway.service.client.testconstants.vpa.VpaVerifyJsons;
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
class UpiNCbdcPactTest {

	@Autowired
	MPGSClient mpgsClient;

	@Autowired
	UpiNCbdcPactContract pactContract;

	@Pact(consumer = "merchant-upi-n-cbdc-client", provider = "merchant-payment-gateway-service")
	public RequestResponsePact getContract(PactDslWithProvider builder) {
		return pactContract.generateContract(builder);
	}

	@Test
	@PactTestFor(port="8090")
	void runAllPactTests() throws Exception {
		// Merchant ID Availability
		mpgsClient.MPGSApi(URI.create("http://localhost:8090/merchant/available"),
				CONTENT_TYPE,
				AUTHORIZATION_HEADER_VALUE,
				X_VERIFY_HEADER_VALUE,
				MerchantIdAvailabilityJsons.checksum,
				MerchantIdAvailabilityJsons.apiRequest
		);

		// Merchant Collect
		mpgsClient.MPGSApi(URI.create("http://localhost:8090/merchant/collect"),
				CONTENT_TYPE,
				AUTHORIZATION_HEADER_VALUE,
				X_VERIFY_HEADER_VALUE,
				MerchantCollectJsons.checksum,
				MerchantCollectJsons.apiRequest
		);

		// Merchant Registration
		mpgsClient.MPGSApi(URI.create("http://localhost:8090/merchant/onboard"),
				CONTENT_TYPE,
				AUTHORIZATION_HEADER_VALUE,
				X_VERIFY_HEADER_VALUE,
				MerchantRegistrationJsons.checksum,
				MerchantRegistrationJsons.apiRequest
		);

		// Merchant Pay
		mpgsClient.MPGSApi(URI.create("http://localhost:8090/merchant/pay"),
				CONTENT_TYPE,
				AUTHORIZATION_HEADER_VALUE,
				X_VERIFY_HEADER_VALUE,
				MerchantPayJsons.checksum,
				MerchantPayJsons.apiRequest
		);

		// VPA Available
		mpgsClient.MPGSApi(URI.create("http://localhost:8090/vpa/available"),
				CONTENT_TYPE,
				AUTHORIZATION_HEADER_VALUE,
				X_VERIFY_HEADER_VALUE,
				VpaAvailableJsons.checksum,
				VpaAvailableJsons.apiRequest
		);

		// VPA Create
		mpgsClient.MPGSApi(URI.create("http://localhost:8090/vpa"),
				CONTENT_TYPE,
				AUTHORIZATION_HEADER_VALUE,
				X_VERIFY_HEADER_VALUE,
				VpaJsons.checksum,
				VpaJsons.apiRequest
		);

		// VPA Status
		mpgsClient.MPGSApi(URI.create("http://localhost:8090/vpa/status"),
				CONTENT_TYPE,
				AUTHORIZATION_HEADER_VALUE,
				X_VERIFY_HEADER_VALUE,
				VpaStatusJsons.checksum,
				VpaStatusJsons.apiRequest
		);

		// VPA Verify
		mpgsClient.MPGSApi(URI.create("http://localhost:8090/vpa/verify"),
				CONTENT_TYPE,
				AUTHORIZATION_HEADER_VALUE,
				X_VERIFY_HEADER_VALUE,
				VpaVerifyJsons.checksum,
				VpaVerifyJsons.apiRequest
		);

		// Transaction Status
		mpgsClient.MPGSApi(URI.create("http://localhost:8090/transaction/status"),
				CONTENT_TYPE,
				AUTHORIZATION_HEADER_VALUE,
				X_VERIFY_HEADER_VALUE,
				TransactionStatusJsons.checksum,
				TransactionStatusJsons.apiRequest
		);

	}
}
