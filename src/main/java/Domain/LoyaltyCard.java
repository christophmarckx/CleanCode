package Domain;

/**
 * Created by rodrPMFF on 23/02/2017.
 */
public class LoyaltyCard {

    private long barCode;
    private int bonusPoints;

    public LoyaltyCard(long barCode, int bonusPoints) {
        this.barCode = barCode;
        this.bonusPoints = bonusPoints;
    }

    public long getBarCode() {
        return barCode;
    }

    public int getBonusPoints() {
        return bonusPoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoyaltyCard that = (LoyaltyCard) o;

        if (barCode != that.barCode) return false;
        return bonusPoints == that.bonusPoints;
    }

    @Override
    public int hashCode() {
        int result = (int) (barCode ^ (barCode >>> 32));
        result = 31 * result + bonusPoints;
        return result;
    }
}
