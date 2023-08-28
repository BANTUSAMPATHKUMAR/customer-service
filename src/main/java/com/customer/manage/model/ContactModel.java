package com.customer.manage.model;

import jakarta.validation.constraints.NotBlank;

public class ContactModel {
	private int contactId;

	//@Pattern(regexp = "^(Mobile)$", message = "ContactType Must be 'Mobile'")
	@NotBlank(message = "contactType should not be null")
	private String contactType;

	//@Pattern(regexp = "^[0-9]{10}$", message = "Mobile contact value must be 10 digits")
	@NotBlank(message = "contact value should not be null")
	private String value;

	public ContactModel() {
		super();
	}

	public ContactModel(int contactId, String contactType, String value) {
		super();
		this.contactId = contactId;
		this.contactType = contactType;
		this.value = value;
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getContactType() {
		return contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "ContactModel [contactId=" + contactId + ", contactType=" + contactType + ", value=" + value + "]";
	}

}
