package org.jpabook.jpashop.domain;

import javax.persistence.Embeddable;
import java.time.LocalDateTime;

@Embeddable
public class JobPeriod {

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public boolean isWorkNow() {
        if (endDate == null) {
            return false;
        }
        return true;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public JobPeriod() {
    }

    public JobPeriod(LocalDateTime startDate, LocalDateTime endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
