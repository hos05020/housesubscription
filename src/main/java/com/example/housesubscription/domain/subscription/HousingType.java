package com.example.housesubscription.domain.subscription;

import com.example.housesubscription.domain.commons.PersistableEnum;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public enum HousingType implements PersistableEnum {

    PRIVATE("민영"),
    NATIONAL("국민");


    private final String code;

    HousingType(String code) {
        this.code = code;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
            .append("code",code)
            .toString();
    }
}
