package io.swagger.api;

import io.swagger.model.ShippingAndTaxRequest;
import io.swagger.model.ShippingAndTaxResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-11T22:43:25.795Z[GMT]")
@RestController
public class ShippingAndTaxesApiController implements ShippingAndTaxesApi {

    private static final Logger log = LoggerFactory.getLogger(ShippingAndTaxesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ShippingAndTaxesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ShippingAndTaxResponse> calculateShippingAndTax(@Parameter(in = ParameterIn.DEFAULT, description = "Shipping and tax request payload.", required=true, schema=@Schema()) @Valid @RequestBody ShippingAndTaxRequest body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ShippingAndTaxResponse>(objectMapper.readValue("{\n  \"preferredShippingOptionId\" : 1,\n  \"shippingAddressId\" : \"53e2a852-be23-11eb-8529-0242ac130003\",\n  \"tax\" : 10.5,\n  \"currencyCode\" : \"USD\",\n  \"shippingOptions\" : [ {\n    \"price\" : 25.98,\n    \"name\" : \"Ground Freight\",\n    \"id\" : 1\n  }, {\n    \"price\" : 25.98,\n    \"name\" : \"Ground Freight\",\n    \"id\" : 1\n  }, {\n    \"price\" : 25.98,\n    \"name\" : \"Ground Freight\",\n    \"id\" : 1\n  }, {\n    \"price\" : 25.98,\n    \"name\" : \"Ground Freight\",\n    \"id\" : 1\n  }, {\n    \"price\" : 25.98,\n    \"name\" : \"Ground Freight\",\n    \"id\" : 1\n  }, {\n    \"price\" : 25.98,\n    \"name\" : \"Ground Freight\",\n    \"id\" : 1\n  }, {\n    \"price\" : 25.98,\n    \"name\" : \"Ground Freight\",\n    \"id\" : 1\n  }, {\n    \"price\" : 25.98,\n    \"name\" : \"Ground Freight\",\n    \"id\" : 1\n  }, {\n    \"price\" : 25.98,\n    \"name\" : \"Ground Freight\",\n    \"id\" : 1\n  }, {\n    \"price\" : 25.98,\n    \"name\" : \"Ground Freight\",\n    \"id\" : 1\n  } ]\n}", ShippingAndTaxResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ShippingAndTaxResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ShippingAndTaxResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
