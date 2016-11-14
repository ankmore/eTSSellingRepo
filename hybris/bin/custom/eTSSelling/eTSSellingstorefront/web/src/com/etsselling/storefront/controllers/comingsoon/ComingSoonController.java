/**
 *
 */
package com.etsselling.storefront.controllers.comingsoon;

import de.hybris.platform.acceleratorstorefrontcommons.breadcrumb.ResourceBreadcrumbBuilder;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.core.model.product.ProductModel;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.etsselling.facades.comingsoon.DefaultComingSoonFacades;
import com.etsselling.storefront.controllers.pages.ProductPageController;


/**
 * @author ANKMORE
 *
 */

@Controller
@Scope("tenant")
@RequestMapping("/coming-soon")
public class ComingSoonController extends ProductPageController
{

	protected static final String COMINGSOON_CMS_PAGE = "comingSoon";

	@Resource(name = "accountBreadcrumbBuilder")
	private ResourceBreadcrumbBuilder accountBreadcrumbBuilder;

	@Resource(name = "comingSoonFacades")
	private DefaultComingSoonFacades comingSoonFacades;

	@RequestMapping(method = RequestMethod.GET)
	public String productComingSoonHome(final Model model) throws CMSItemNotFoundException
	{

		final List<ProductModel> listProducts = comingSoonFacades.productreturnedlist();

		storeCmsPageInModel(model, getContentPageForLabelOrId(COMINGSOON_CMS_PAGE));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(COMINGSOON_CMS_PAGE));
		model.addAttribute("breadcrumbs", accountBreadcrumbBuilder.getBreadcrumbs("text.comingsoon.products"));
		model.addAttribute("metaRobots", "no-index,no-follow");
		model.addAttribute("productList", listProducts);
		return getViewForPage(model);
	}


	/*
	 * @RequestMapping(value = "/Save", method = RequestMethod.POST)
	 *
	 * @ResponseBody public String saveRegComingSoon(final NotifyRegisterForm saveCustomerDataForm, final Model model)
	 * throws CMSItemNotFoundException, DuplicateUidException { model.addAttribute("breadcrumbs",
	 * accountBreadcrumbBuilder.getBreadcrumbs("text.comingsoon.products")); model.addAttribute("metaRobots",
	 * "no-index,no-follow");
	 *
	 * final ComingSoonfacades facades = new ComingSoonfacades(); System.out.println("hello");
	 * facades.RComingSoon(saveCustomerDataForm);
	 *
	 * final ComingSoonNotificationData registrationData = new ComingSoonNotificationData();
	 *
	 * registrationData.setFirstName(saveCustomerDataForm.getFirstName());
	 * registrationData.setLastName(saveCustomerDataForm.getLastName());
	 * registrationData.setEmail(saveCustomerDataForm.getEmail());
	 *
	 * registrationData.setProductCode(saveCustomerDataForm.getProductCode());
	 * registrationData.setProductName(saveCustomerDataForm.getProductName());
	 *
	 * String result;
	 *
	 * try { comingSoonfacades.ComingSoonRegistration(registrationData); model.addAttribute("notifyStatus",
	 * "Data saved successfully"); result = "Data Saved Successfully"; } catch (final ModelSavingException e) { // YTODO:
	 * handle exception result = "An Error has occurred"; }
	 *
	 * return result;
	 *
	 * }
	 */
}
