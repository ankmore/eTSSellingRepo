/**
 *
 */
package com.etsselling.core.service;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.List;

import javax.annotation.Resource;

import com.etsselling.core.dao.DefaultComingSoonDao;


/**
 * @author ANKMORE
 *
 */
public class DefaultComingSoonService
{
	@Resource(name = "comingSoonDao")
	private DefaultComingSoonDao comingSoonDao;


	/**
	 * @return the comingSoonDao
	 */
	public DefaultComingSoonDao getComingSoonDao()
	{
		return comingSoonDao;
	}

	/**
	 * @param comingSoonDao
	 *           the comingSoonDao to set
	 */
	public void setComingSoonDao(final DefaultComingSoonDao comingSoonDao)
	{
		this.comingSoonDao = comingSoonDao;
	}

	/**
	 * @return the modelService
	 */
	public ModelService getModelService()
	{
		return modelService;
	}

	/**
	 * @param modelService
	 *           the modelService to set
	 */
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	public List<ProductModel> productreturnedlist()
	{
		final List<ProductModel> listproducts = comingSoonDao.findcomingsoonproduct();
		return listproducts;
	}

	@Resource(name = "modelService")
	private ModelService modelService;

	/*
	 * public void ComingSoonRegistration(final ComingSoonNotificationData registrationData) throws DuplicateUidException
	 * {
	 *
	 * final DetailsComingSoonModel notifyCustomerModel = new DetailsComingSoonModel();
	 * notifyCustomerModel.setFirstname(registrationData.getFirstName());
	 * notifyCustomerModel.setLastname(registrationData.getLastName());
	 * notifyCustomerModel.setEmailid(registrationData.getEmail());
	 *
	 * notifyCustomerModel.setProductCode(registrationData.getProductCode());
	 * notifyCustomerModel.setProductName(registrationData.getProductName());
	 *
	 * modelService.save(notifyCustomerModel);
	 *
	 * }
	 */
}





/*
 * @Resource(name = "modelService") private ModelService modelService;
 */

/*
 * (non-Javadoc)
 *
 * @see com.etsselling.core.service.ComingSoonService#getProducts()
 */

/*
 * public void ComingSoonRegistration(final ComingSoonNotificationData registrationData) throws DuplicateUidException {
 *
 * final DetailsComingSoonModel notifyCustomerModel = new DetailsComingSoonModel();
 * notifyCustomerModel.setFirstname(registrationData.getFirstName());
 * notifyCustomerModel.setLastname(registrationData.getLastName());
 * notifyCustomerModel.setEmailid(registrationData.getEmail());
 *
 * notifyCustomerModel.setProductCode(registrationData.getProductCode());
 * notifyCustomerModel.setProductName(registrationData.getProductName());
 *
 * modelService.save(notifyCustomerModel);
 *
 * }
 */

