package com.example.housesubscription.domain.subscription;


import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Embeddable
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Schedule {


    @Column(name = "announcement_date",nullable = false)
    private LocalDateTime announcementDate;
    @Column(name = "start_date",nullable = false)
    private LocalDateTime startDate;
    @Column(name = "end_date",nullable = false)
    private LocalDateTime endDate;

    @Column(name = "winner_announcement_date",nullable = false)
    private LocalDateTime winnerAnnouncementDate;

    @Column(name = "contact", nullable = false)
    private String contact;


    public Schedule(LocalDateTime announcementDate, LocalDateTime startDate, LocalDateTime endDate,
        LocalDateTime winnerAnnouncementDate,String contact) {
        this.announcementDate = announcementDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.winnerAnnouncementDate = winnerAnnouncementDate;
        this.contact = contact;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
            .append("announcementDate",announcementDate)
            .append("startDate",startDate)
            .append("endDate",endDate)
            .append("winnerAnnouncementDate",winnerAnnouncementDate)
            .append("contact",contact)
            .toString();
    }

}
