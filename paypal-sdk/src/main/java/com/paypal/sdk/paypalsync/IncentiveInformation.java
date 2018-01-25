// This class was generated on Thu, 25 Jan 2018 09:31:12 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// IncentiveInformation.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/7xVXWvcOhB9v79i8FMC3nXuvaWFfQsNhbQ0CW0olHRJZqXxWlSW3NEoW1Py34u83+vNR9vQJ2PNSHPO0ZnRj+yybSgbZadOkRNzS3DqSs81ivEuy7NPyAYnls6wTmlZnr2jdv1zQkGxabrkUXZZEZjVQZoEjQ3DLM+OmbGdVzrKsw+E+tzZNhuVaAOlhW/RMOnVwgX7hlgMhWx0tQfjyfzoPr5V9Wu9SlkD3hfdZnDsABNW8OWjTF7+PpP33lH7EHqsfXRyD/hVsK++iszkVAvoNMzzoPQMCKVx6JRBC7doIw2YLAppKA1ZPYQ3noG+Y91YymGCFp0i8AwNtjU5AR3p+S4yCBs37fNfor9WXtMW+d1In/mVVEw0UBUyKiGG04/ngxf//ftqrUnaOz4otFehME5oyp3LC22YlBRMQYpl8iAlh+IQpEIBo5P0paEAsqHyLykiHHcEcdHau/xRVbr72lJjudJXoYvkMKuMqqA200pgQqMv8ejofxVt96X5nzXzv2MHnRbEnVEW1BJTa74S3Ly9+HwzFwGZwHkBaRuj0NoWyiS18Q7tcH5osTx1pwZoUqZGu9qxv9bl2clGrRAn2twaTToh9CCVjwGdlirsL1csGSYzp3vihfjgYj0hTk29BNJYVBQWvbHlkBwCEVy93lwLMEh+guSn8UEl0oRRUcxms6EJfuh5WpjgO7cNtg00rKS2h8/hk/ETnLIeEb0G6oX2zA6vqWd3dOs5mEOIqgIMSTIfG+/+dCQ8sQPW4Bv2U8b6IX47KQ+9UIvUe5hDTawqdALWt2ilTfOwt/mvSyApcT/1RahPOQW2nrTNqwwNde+CL8vUI/ycdzu+G9/98xMAAP//
// DO NOT EDIT
package com.paypal.sdk.paypalsync;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The incentive details.
 */
@Model
public class IncentiveInformation {

    // Required default constructor
    public IncentiveInformation() {}

	/**
	* An array of incentive details.
	*/
	@SerializedName(value = "incentive_details", listClass = IncentiveDetails.class)
	private List<IncentiveDetails> incentiveDetails;

	public List<IncentiveDetails> incentiveDetails() { return incentiveDetails; }
	
	public IncentiveInformation incentiveDetails(List<IncentiveDetails> incentiveDetails) {
	    this.incentiveDetails = incentiveDetails;
	    return this;
	}
}
