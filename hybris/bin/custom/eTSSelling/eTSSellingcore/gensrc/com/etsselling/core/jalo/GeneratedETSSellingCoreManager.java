/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 14, 2016 11:20:31 AM                    ---
 * ----------------------------------------------------------------
 */
package com.etsselling.core.jalo;

import com.etsselling.core.constants.ETSSellingCoreConstants;
import com.etsselling.core.jalo.ApparelProduct;
import com.etsselling.core.jalo.ApparelSizeVariantProduct;
import com.etsselling.core.jalo.ApparelStyleVariantProduct;
import com.etsselling.core.jalo.ElectronicsColorVariantProduct;
import com.etsselling.jalo.ProductQuantityThresholdFreeGiftPromotion;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.order.AbstractOrderEntry;
import de.hybris.platform.jalo.order.CartEntry;
import de.hybris.platform.jalo.order.OrderEntry;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type <code>ETSSellingCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedETSSellingCoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("ComingSoon", AttributeMode.INITIAL);
		tmp.put("accessories", AttributeMode.INITIAL);
		tmp.put("rating", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("orderAddons", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.AbstractOrderEntry", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("cartAddons", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.CartEntry", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("OrderedAddons", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.OrderEntry", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.accessories</code> attribute.
	 * @return the accessories
	 */
	public List<String> getAccessories(final SessionContext ctx, final Product item)
	{
		List<String> coll = (List<String>)item.getProperty( ctx, ETSSellingCoreConstants.Attributes.Product.ACCESSORIES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.accessories</code> attribute.
	 * @return the accessories
	 */
	public List<String> getAccessories(final Product item)
	{
		return getAccessories( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.accessories</code> attribute. 
	 * @param value the accessories
	 */
	public void setAccessories(final SessionContext ctx, final Product item, final List<String> value)
	{
		item.setProperty(ctx, ETSSellingCoreConstants.Attributes.Product.ACCESSORIES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.accessories</code> attribute. 
	 * @param value the accessories
	 */
	public void setAccessories(final Product item, final List<String> value)
	{
		setAccessories( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CartEntry.cartAddons</code> attribute.
	 * @return the cartAddons
	 */
	public List<String> getCartAddons(final SessionContext ctx, final CartEntry item)
	{
		List<String> coll = (List<String>)item.getProperty( ctx, ETSSellingCoreConstants.Attributes.CartEntry.CARTADDONS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CartEntry.cartAddons</code> attribute.
	 * @return the cartAddons
	 */
	public List<String> getCartAddons(final CartEntry item)
	{
		return getCartAddons( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CartEntry.cartAddons</code> attribute. 
	 * @param value the cartAddons
	 */
	public void setCartAddons(final SessionContext ctx, final CartEntry item, final List<String> value)
	{
		item.setProperty(ctx, ETSSellingCoreConstants.Attributes.CartEntry.CARTADDONS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CartEntry.cartAddons</code> attribute. 
	 * @param value the cartAddons
	 */
	public void setCartAddons(final CartEntry item, final List<String> value)
	{
		setCartAddons( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.ComingSoon</code> attribute.
	 * @return the ComingSoon - Coming Soon Products
	 */
	public Boolean isComingSoon(final SessionContext ctx, final Product item)
	{
		return (Boolean)item.getProperty( ctx, ETSSellingCoreConstants.Attributes.Product.COMINGSOON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.ComingSoon</code> attribute.
	 * @return the ComingSoon - Coming Soon Products
	 */
	public Boolean isComingSoon(final Product item)
	{
		return isComingSoon( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.ComingSoon</code> attribute. 
	 * @return the ComingSoon - Coming Soon Products
	 */
	public boolean isComingSoonAsPrimitive(final SessionContext ctx, final Product item)
	{
		Boolean value = isComingSoon( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.ComingSoon</code> attribute. 
	 * @return the ComingSoon - Coming Soon Products
	 */
	public boolean isComingSoonAsPrimitive(final Product item)
	{
		return isComingSoonAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.ComingSoon</code> attribute. 
	 * @param value the ComingSoon - Coming Soon Products
	 */
	public void setComingSoon(final SessionContext ctx, final Product item, final Boolean value)
	{
		item.setProperty(ctx, ETSSellingCoreConstants.Attributes.Product.COMINGSOON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.ComingSoon</code> attribute. 
	 * @param value the ComingSoon - Coming Soon Products
	 */
	public void setComingSoon(final Product item, final Boolean value)
	{
		setComingSoon( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.ComingSoon</code> attribute. 
	 * @param value the ComingSoon - Coming Soon Products
	 */
	public void setComingSoon(final SessionContext ctx, final Product item, final boolean value)
	{
		setComingSoon( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.ComingSoon</code> attribute. 
	 * @param value the ComingSoon - Coming Soon Products
	 */
	public void setComingSoon(final Product item, final boolean value)
	{
		setComingSoon( getSession().getSessionContext(), item, value );
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ETSSellingCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ETSSellingCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ETSSellingCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ETSSellingCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductQuantityThresholdFreeGiftPromotion createProductQuantityThresholdFreeGiftPromotion(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ETSSellingCoreConstants.TC.PRODUCTQUANTITYTHRESHOLDFREEGIFTPROMOTION );
			return (ProductQuantityThresholdFreeGiftPromotion)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ProductQuantityThresholdFreeGiftPromotion : "+e.getMessage(), 0 );
		}
	}
	
	public ProductQuantityThresholdFreeGiftPromotion createProductQuantityThresholdFreeGiftPromotion(final Map attributeValues)
	{
		return createProductQuantityThresholdFreeGiftPromotion( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return ETSSellingCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.orderAddons</code> attribute.
	 * @return the orderAddons
	 */
	public List<String> getOrderAddons(final SessionContext ctx, final AbstractOrderEntry item)
	{
		List<String> coll = (List<String>)item.getProperty( ctx, ETSSellingCoreConstants.Attributes.AbstractOrderEntry.ORDERADDONS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.orderAddons</code> attribute.
	 * @return the orderAddons
	 */
	public List<String> getOrderAddons(final AbstractOrderEntry item)
	{
		return getOrderAddons( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.orderAddons</code> attribute. 
	 * @param value the orderAddons
	 */
	public void setOrderAddons(final SessionContext ctx, final AbstractOrderEntry item, final List<String> value)
	{
		item.setProperty(ctx, ETSSellingCoreConstants.Attributes.AbstractOrderEntry.ORDERADDONS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.orderAddons</code> attribute. 
	 * @param value the orderAddons
	 */
	public void setOrderAddons(final AbstractOrderEntry item, final List<String> value)
	{
		setOrderAddons( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderEntry.OrderedAddons</code> attribute.
	 * @return the OrderedAddons
	 */
	public List<String> getOrderedAddons(final SessionContext ctx, final OrderEntry item)
	{
		List<String> coll = (List<String>)item.getProperty( ctx, ETSSellingCoreConstants.Attributes.OrderEntry.ORDEREDADDONS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderEntry.OrderedAddons</code> attribute.
	 * @return the OrderedAddons
	 */
	public List<String> getOrderedAddons(final OrderEntry item)
	{
		return getOrderedAddons( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderEntry.OrderedAddons</code> attribute. 
	 * @param value the OrderedAddons
	 */
	public void setOrderedAddons(final SessionContext ctx, final OrderEntry item, final List<String> value)
	{
		item.setProperty(ctx, ETSSellingCoreConstants.Attributes.OrderEntry.ORDEREDADDONS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderEntry.OrderedAddons</code> attribute. 
	 * @param value the OrderedAddons
	 */
	public void setOrderedAddons(final OrderEntry item, final List<String> value)
	{
		setOrderedAddons( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.rating</code> attribute.
	 * @return the rating
	 */
	public String getRating(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, ETSSellingCoreConstants.Attributes.Product.RATING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.rating</code> attribute.
	 * @return the rating
	 */
	public String getRating(final Product item)
	{
		return getRating( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.rating</code> attribute. 
	 * @param value the rating
	 */
	public void setRating(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, ETSSellingCoreConstants.Attributes.Product.RATING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.rating</code> attribute. 
	 * @param value the rating
	 */
	public void setRating(final Product item, final String value)
	{
		setRating( getSession().getSessionContext(), item, value );
	}
	
}
