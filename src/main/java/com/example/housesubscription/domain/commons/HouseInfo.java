package com.example.housesubscription.domain.commons;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Getter
@Embeddable
public class HouseInfo {



    @Column(name = "name", nullable = false)
    private String name;


    @Column(name = "road_address", nullable = false)
    private String roadAddress;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "latitude", column = @Column(name = "house_latitude")),
        @AttributeOverride(name = "longitude", column = @Column(name = "house_longitude"))
    })
    private Coordinate coordinate;



    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
            .append("name", name)
            .append("roadAddress",roadAddress)
            .append("coordinate",coordinate)
            .toString();
    }


}