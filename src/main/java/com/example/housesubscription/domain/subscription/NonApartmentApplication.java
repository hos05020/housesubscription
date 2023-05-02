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
@DiscriminatorValue("NON_APARTMENT")
public class NonApartmentApplication extends HousingApplication {

    @Column(name = "non_apartment_type",nullable = false)
    @Convert(converter = GenericEnumConverter.class)
    private NonApartmentType nonApartmentType;

    @Column(name = "executor_company",nullable = false)
    private String executorCompany;


    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
            .append("housingType", nonApartmentType)
            .append("rentOrSale",executorCompany)
            .toString();
    }



}