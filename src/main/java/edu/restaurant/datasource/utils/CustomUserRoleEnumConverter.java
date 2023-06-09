package edu.restaurant.datasource.utils;

import edu.restaurant.datasource.entities.UserRole;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class CustomUserRoleEnumConverter implements AttributeConverter<UserRole, Integer> {

    @Override
    public Integer convertToDatabaseColumn(UserRole customEnum) {
        return customEnum.getCode();
    }

    @Override
    public UserRole convertToEntityAttribute(Integer code) {
        return UserRole.fromCode(code);
    }
}
