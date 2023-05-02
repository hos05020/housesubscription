package com.example.housesubscription.domain.business;

import com.example.housesubscription.domain.commons.HouseInfo;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Getter
@Entity
@Table(name = "housing_transaction")
public class HousingTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Embedded
    private HouseInfo houseInfo;


    @Column(name = "city_district", nullable = false)
    private String cityDistrict;

    @Embedded
    private TransactionDetails transactionDetails;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HousingTransaction that = (HousingTransaction) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
            .append("id",id)
            .append("houseInfo",houseInfo)
            .append("cityDistrict",cityDistrict)
            .append("transactionDetails",transactionDetails)
            .toString();
    }

}