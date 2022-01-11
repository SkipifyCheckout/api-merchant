# ShippingAndTaxResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shippingAddressId** | [**UUID**](UUID.md) | Send back the value provided in the request. This value is used for correlation and validation purposes. | 
**currencyCode** | **String** | The ISO 4217 three character currency code. | 
**shippingOptions** | [**List&lt;Shipping&gt;**](Shipping.md) | The collection of shipping options for the order can include zero to 10 shipping options. |  [optional]
**preferredShippingOptionId** | **Integer** | The prefered pre-selected shipping option identifier (&#x27;id&#x27;) from the shippingOptions array. |  [optional]
**tax** | **Double** | The taxes for the order factoring in the shipping address. |  [optional]
