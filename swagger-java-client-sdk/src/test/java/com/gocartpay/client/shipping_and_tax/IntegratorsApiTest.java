/*
 * GoCart Partner Callback API
 * API callbacks that need to be implemented by GoCart partners to enable a complete integration with the GoCart checkout workflows. <p/> For instance, a callback method that calculates the shipping options and taxes for an order based on the passed in shipping address.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@gocartpay.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.gocartpay.client.shipping_and_tax;

import com.gocartpay.client.ApiException;
import io.swagger.client.model.ShippingAndTaxRequest;
import io.swagger.client.model.ShippingAndTaxResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IntegratorsApi
 */
@Ignore
public class IntegratorsApiTest {

    private final IntegratorsApi api = new IntegratorsApi();

    /**
     * Calculates shipping and tax for an order.
     *
     * Calculates the shipping and tax charges for an order.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void calculateShippingAndTaxTest() throws ApiException {
        ShippingAndTaxRequest body = null;
        ShippingAndTaxResponse response = api.calculateShippingAndTax(body);

        // TODO: test validations
    }
}
