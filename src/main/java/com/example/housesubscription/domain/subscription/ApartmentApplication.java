package com.example.housesubscription.domain.subscription;

import com.example.housesubscription.domain.commons.GenericEnumConverter;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@DiscriminatorValue("APARTMENT")
public class ApartmentApplication extends HousingApplication {

    @Column(name = "house_type",nullable = false)
    @Convert(converter = GenericEnumConverter.class)
    private HousingType housingType;

    @Column(name = "rent_or_sale",nullable = false)
    @Convert(converter = GenericEnumConverter.class)
    private RentOrSale rentOrSale;

    @Column(name = "constructor_company",nullable = false)
    private String constructorCompany;


    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
            .append("housingType", housingType)
            .append("rentOrSale",rentOrSale)
            .append("constructorCompany",constructorCompany)
            .toString();
    }


}