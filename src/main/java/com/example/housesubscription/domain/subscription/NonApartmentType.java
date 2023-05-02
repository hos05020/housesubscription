package com.example.housesubscription.domain.subscription;

import com.example.housesubscription.domain.commons.PersistableEnum;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public enum NonApartmentType implements PersistableEnum {

    OFFICETEL("오피스텔"),
    LIVING_ACCOMMODATION("생활숙박시설"),
    URBAN_HOUSING("도시형생활주택"),
    PRIVATE_RENTAL("민간임대");

    private final String code;

    NonApartmentType(String code) {
        this.code = code;
    }

    @Override
    public String getCode() {
        return null;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
            .append("code",code)
            .toString();
    }
}
