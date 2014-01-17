/* Copyright (C) 2014 konik.io
 *
 * This file is part of the Konik library.
 *
 * The Konik library is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * The Konik library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with the Konik library. If not, see <http://www.gnu.org/licenses/>.
 */

package io.konik.zugferd.entity;

import io.konik.zugferd.datatype.unqualified.Amount;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class TradeAllowanceCharge represents the detail information about surcharges and discounts.
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeAllowanceChargeType", propOrder = { "chargeIndicator", "basisAmount", "actualAmount",
		"reason", "categoryTradeTax" })
public class AllowanceCharge {

	/** The charge indicator. */
	@XmlElement(name = "ChargeIndicator")
	private Boolean chargeIndicator;

	/** The basis amount. */
	@Valid
	@XmlElement(name = "BasisAmount")
	private Amount basisAmount;

	/** The actual amount. */
	@Valid
	@XmlElement(name = "ActualAmount")
	private Amount actualAmount;

	/** The reason. */
	@XmlElement(name = "Reason")
	private String reason;

	/** The category trade tax. */
	@XmlElement(name = "CategoryTradeTax")
	private List<TradeTax> categoryTradeTax;

	/**
	 * Checks if is charge indicator.
	 * 
	 * @return true if charge otherwise discount
	 */
	public Boolean isChargeIndicator() {
		return chargeIndicator;
	}

	/**
	 * Sets the charge indicator.
	 * 
	 * @param charge the new charge indicator
	 */
	public void setChargeIndicator(Boolean charge) {
		this.chargeIndicator = charge;
	}

	/**
	 * Gets the basis amount.
	 * 
	 * @return the basis amount
	 */
	public Amount getBasisAmount() {
		return basisAmount;
	}

	/**
	 * Sets the basis amount.
	 * 
	 * @param basisAmount the new basis amount
	 */
	public void setBasisAmount(Amount basisAmount) {
		this.basisAmount = basisAmount;
	}

	/**
	 * Gets the actual amount.
	 * 
	 * @return the actual amount
	 */
	public Amount getActualAmount() {
		return actualAmount;
	}

	/**
	 * Sets the actual amount.
	 * 
	 * @param actualAmount the new actual amount
	 */
	public void setActualAmount(Amount actualAmount) {
		this.actualAmount = actualAmount;
	}

	/**
	 * Gets the reason.
	 * 
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * Sets the reason.
	 * 
	 * @param reason the new reason
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}

	/**
	 * Gets the category trade tax.
	 * 
	 * @return the category trade tax
	 */
	public List<TradeTax> getCategoryTradeTax() {
		if (categoryTradeTax == null) {
			categoryTradeTax = new ArrayList<TradeTax>();
		}
		return this.categoryTradeTax;
	}

}