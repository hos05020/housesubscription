package com.example.housesubscription.domain.subscription;

import com.example.housesubscription.domain.commons.PersistableEnum;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public enum RentOrSale implements PersistableEnum {

    SALE("분양"),
    RENT_TRANSFERABLE("분양전환가능임대"),
    RENT_NON_TRANSFERABLE("분양전환불가임대");


    private final String code;

    RentOrSale(String code) {
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
