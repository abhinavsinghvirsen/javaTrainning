package com.crud.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneNumberValidator implements ConstraintValidator<IndiaPhoneNumber,String> {




    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {

        if(null==value || value.isEmpty()){
            return  false;
        }
        if(value.startsWith("91") && value.length()<=12 && value.length()>10){

            return  true;

        }

        return false;
    }
}
