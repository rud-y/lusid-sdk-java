/*
 * LUSID API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.10.1392
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.lusid.api;

import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.model.LusidProblemDetails;
import com.finbourne.lusid.model.LusidValidationProblemDetails;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LoginApi
 */
@Ignore
public class LoginApiTest {

    private final LoginApi api = new LoginApi();

    
    /**
     * Get SAML Identity Provider
     *
     * Get the unique identifier for the SAML 2.0 Identity Provider to be used for domain.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSamlIdentityProviderIdTest() throws ApiException {
        String domain = null;
        String response = api.getSamlIdentityProviderId(domain);

        // TODO: test validations
    }
    
}
