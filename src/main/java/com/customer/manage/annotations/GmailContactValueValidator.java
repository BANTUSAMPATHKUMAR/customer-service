package com.customer.manage.annotations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class GmailContactValueValidator implements ConstraintValidator<GmailValueConstraint, String>{

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		return value != null && value.endsWith("@gmail.com");
	}

}
