/**
 *
 */
package com.etsselling.storefront.addon.page;


import java.util.List;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


/**
 * @author ANKMORE
 *
 */
public class ETSSellingAddToCartForm
{


	/**
	 * Form for validating update field on cart page.
	 */

	@NotNull(message = "{basket.error.quantity.notNull}")
	@Min(value = 0, message = "{basket.error.quantity.invalid}")
	@Digits(fraction = 0, integer = 10, message = "{basket.error.quantity.invalid}")
	private long qty = 1L;

	private List<String> addonsCode;



	/**
	 * @return the addonsCode
	 */
	public List<String> getAddonsCode()
	{
		return addonsCode;
	}

	/**
	 * @param addonsCode
	 *           the addonsCode to set
	 */
	public void setAddonsCode(final List<String> addonsCode)
	{
		this.addonsCode = addonsCode;
	}

	public void setQty(final long quantity)
	{
		this.qty = quantity;
	}

	public long getQty()
	{
		return qty;
	}
}




