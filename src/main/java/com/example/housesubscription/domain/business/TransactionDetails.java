package com.example.housesubscription.domain.business;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Getter
@Embeddable
public class TransactionDetails {

    @Column(name = "price", nullable = false)
    private Integer price;

    @Column(name = "area", nullable = false)
    private Double area;

    @Column(name = "construction_year", nullable = false)
    private Integer constructionYear;

    @Column(name = "transaction_date", nullable = false)
    private LocalDateTime transactionDate;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
            .append("price",price)
            .append("area",area)
            .append("constructionYear",constructionYear)
            .append("transactionDate",transactionDate)
            .toString();
    }

}