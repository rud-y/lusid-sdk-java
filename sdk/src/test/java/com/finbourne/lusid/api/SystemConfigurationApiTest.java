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
import com.finbourne.lusid.model.TransactionConfigurationDataRequest;
import com.finbourne.lusid.model.TransactionSetConfigurationData;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SystemConfigurationApi
 */
@Ignore
public class SystemConfigurationApiTest {

    private final SystemConfigurationApi api = new SystemConfigurationApi();

    
    /**
     * [EARLY ACCESS] Create transaction type
     *
     * Create a new transaction type by specifying a definition and the mappings to movements
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createConfigurationTransactionTypeTest() throws ApiException {
        TransactionConfigurationDataRequest type = null;
        TransactionSetConfigurationData response = api.createConfigurationTransactionType(type);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] List transaction types
     *
     * Get the list of persisted transaction types
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listConfigurationTransactionTypesTest() throws ApiException {
        TransactionSetConfigurationData response = api.listConfigurationTransactionTypes();

        // TODO: test validations
    }
    
}
