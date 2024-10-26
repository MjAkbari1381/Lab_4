import java.time.LocalDate;
import java.util.Objects;

public class Vote {
    private final Person voter;
    private final String date;

    public Vote(Person voter) {
        this.voter = voter;
        this.date = LocalDate.now().toString(); // تنظیم تاریخ رای به تاریخ جاری
    }

    public Person getVoter() {
        return voter;
    }

    public String getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vote)) return false;
        Vote vote = (Vote) o;
        return getVoter().equals(vote.getVoter()) && getDate().equals(vote.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVoter(), getDate());
    }
}
