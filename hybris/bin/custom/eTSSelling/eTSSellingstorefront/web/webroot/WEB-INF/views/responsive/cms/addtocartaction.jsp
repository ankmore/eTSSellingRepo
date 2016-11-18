
<%@ page trimDirectiveWhitespaces="true" %>

<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>

<c:url value="${url}" var="addToCartUrl"/>


<!-- **************ANKITA************** -->



<!-- We Added -->

<%-- <c:if test="${not empty allAddonsMap}">
<div id="addonsId">
<b>Addons:</b><br>

<c:forEach items="${allAddonsMap}" var="allAddonsMap">
   
       <input type="checkbox" id="addons" name="addons" value="${allAddonsMap.key}"/>${allAddonsMap.key} <br>
    
</c:forEach> --%>

<c:if test="${not empty accessoryList}">
<div id="accessoryList">
<b>Addons:</b><br>

<c:forEach items="${accessoryList}" var="accessoryList">
   
       <input type="checkbox" id="addons" name="addons" value="${accessoryList}"/>${accessoryList} <br>
    
</c:forEach>


<b>Rating</b> : ${rating} 

</div>
</c:if>

<!-- We Added -->

<br>
<div id="addToCartTitle" style="display:none"><spring:theme code="basket.added.to.basket"/></div>
<form:form method="post" id="addToCartForm" class="add_to_cart_form" action="${addToCartUrl}">
<c:if test="${product.purchasable}">
	<input type="hidden" maxlength="3" size="1" id="qty" name="qty" class="qty js-qty-selector-input" value="1">
	<input type="hidden" id="addonsCode" name="addonsCode" value="">
</c:if>
<input type="hidden" name="productCodePost" value="${product.code}"/>

<c:if test="${empty showAddToCart ? true : showAddToCart}">
	<c:set var="buttonType">button</c:set>
	
	<c:if test="${product.purchasable and product.stock.stockLevelStatus.code ne 'outOfStock' }">
		<c:set var="buttonType">submit</c:set>
	</c:if>
	
	<c:choose>
		<c:when test="${fn:contains(buttonType, 'button')}">
			<button type="${buttonType}" class="btn btn-primary btn-block js-add-to-cart btn-icon glyphicon-shopping-cart outOfStock" disabled="disabled">
				<spring:theme code="product.variants.out.of.stock"/>
			</button>
		</c:when>
	
		<c:otherwise>
			<ycommerce:testId code="addToCartButton">
				<button id="addToCartButton" onclick="chkextras()" type="${buttonType}" class="btn btn-primary btn-block js-add-to-cart js-enable-btn btn-icon glyphicon-shopping-cart" disabled="disabled">
					<spring:theme code="basket.add.to.basket"/>
				</button>
			</ycommerce:testId>
		</c:otherwise>
	</c:choose>
</c:if>
</form:form>


<script type="text/javascript">
function chkextras(){


var allAddons = [];
var j = 0;

$("#accessoryList input[type=checkbox]:checked").each(function() {
	allAddons[j] =   $(this).val();
		j= j+1;
		});
	document.getElementById('addonsCode').value = allAddons;
	alert(allAddons);
}
</script> 
 
