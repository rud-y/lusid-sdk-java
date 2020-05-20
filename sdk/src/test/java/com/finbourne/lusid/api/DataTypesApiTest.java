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
import com.finbourne.lusid.model.DataType;
import com.finbourne.lusid.model.LusidProblemDetails;
import com.finbourne.lusid.model.LusidValidationProblemDetails;
import java.time.OffsetDateTime;
import com.finbourne.lusid.model.ResourceListOfDataType;
import com.finbourne.lusid.model.ResourceListOfIUnitDefinitionDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DataTypesApi
 */
@Ignore
public class DataTypesApiTest {

    private final DataTypesApi api = new DataTypesApi();

    
    /**
     * [EARLY ACCESS] Get data type definition
     *
     * Get the definition of a specified data type
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDataTypeTest() throws ApiException {
        String scope = null;
        String code = null;
        OffsetDateTime asAt = null;
        DataType response = api.getDataType(scope, code, asAt);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] Get units from data type
     *
     * Get the definitions of the specified units associated bound to a specific data type
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUnitsFromDataTypeTest() throws ApiException {
        String scope = null;
        String code = null;
        List<String> units = null;
        String filter = null;
        OffsetDateTime asAt = null;
        ResourceListOfIUnitDefinitionDto response = api.getUnitsFromDataType(scope, code, units, filter, asAt);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] List data types
     *
     * List all data types in a specified scope
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listDataTypesTest() throws ApiException {
        String scope = null;
        OffsetDateTime asAt = null;
        Boolean includeSystem = null;
        List<String> sortBy = null;
        Integer start = null;
        Integer limit = null;
        String filter = null;
        ResourceListOfDataType response = api.listDataTypes(scope, asAt, includeSystem, sortBy, start, limit, filter);

        // TODO: test validations
    }
    
}
