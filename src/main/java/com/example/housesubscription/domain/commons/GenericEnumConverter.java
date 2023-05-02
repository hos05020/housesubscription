package com.example.housesubscription.domain.commons;

import java.util.Arrays;
import javax.persistence.AttributeConverter;
import javax.persistence.Convert;

@Convert
public class GenericEnumConverter <T extends Enum<T> & PersistableEnum> implements AttributeConverter<T,String> {


    private final Class<T> enumClass;


    public GenericEnumConverter(Class<T> enumClass) {
        this.enumClass = enumClass;
    }

    @Override
    public String convertToDatabaseColumn(T attribute) {
        return attribute != null ? attribute.getCode() : null;
    }

    @Override
    public T convertToEntityAttribute(String dbData) {
        if (dbData == null){
            return  null;
        }


        return Arrays.stream(enumClass.getEnumConstants())
            .filter(e -> e.getCode().equals(dbData))
            .findFirst()
            .orElseThrow(()-> new IllegalArgumentException("Unknown database value : "+dbData));
    }
}
