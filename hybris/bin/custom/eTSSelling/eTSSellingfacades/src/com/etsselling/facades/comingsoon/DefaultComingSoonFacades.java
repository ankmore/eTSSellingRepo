package com.etsselling.facades.comingsoon;

import de.hybris.platform.core.model.product.ProductModel;

import java.util.List;

import javax.annotation.Resource;

import com.etsselling.core.service.DefaultComingSoonService;




public class DefaultComingSoonFacades
{
	@Resource(name = "comingSoonService")
	private DefaultComingSoonService comingSoonService;

	public List<ProductModel> productreturnedlist()
	{
		final List<ProductModel> facadesList = comingSoonService.productreturnedlist();
		return facadesList;
	}

	/*
	 * public void ComingSoonRegistration(final ComingSoonNotificationData registrationData) throws DuplicateUidException
	 * {
	 *
	 * comingSoonService.ComingSoonRegistration(registrationData);
	 *
	 * }
	 */
}