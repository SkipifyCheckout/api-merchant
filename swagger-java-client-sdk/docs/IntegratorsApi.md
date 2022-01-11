# IntegratorsApi

All URIs are relative to *https://virtserver.swaggerhub.com/GoCartPay/gocart-partner-callback-api/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculateShippingAndTax**](IntegratorsApi.md#calculateShippingAndTax) | **POST** /shipping-and-taxes | Calculates shipping and tax for an order.

<a name="calculateShippingAndTax"></a>
# **calculateShippingAndTax**
> ShippingAndTaxResponse calculateShippingAndTax(body)

Calculates shipping and tax for an order.

Calculates the shipping and tax charges for an order.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IntegratorsApi;


IntegratorsApi apiInstance = new IntegratorsApi();
ShippingAndTaxRequest body = new ShippingAndTaxRequest(); // ShippingAndTaxRequest | Shipping and tax request payload.
try {
    ShippingAndTaxResponse result = apiInstance.calculateShippingAndTax(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegratorsApi#calculateShippingAndTax");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ShippingAndTaxRequest**](ShippingAndTaxRequest.md)| Shipping and tax request payload. |

### Return type

[**ShippingAndTaxResponse**](ShippingAndTaxResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

