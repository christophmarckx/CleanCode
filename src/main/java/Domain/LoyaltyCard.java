package Domain;

import java.util.UUID;

/**
 * Created by rodrPMFF on 23/02/2017.
 */
public class LoyaltyCard {

    private String barCode;
    private int bonusPoints;

    public LoyaltyCard() {
        this.barCode = UUID.randomUUID().toString();
        this.bonusPoints = 0;
    }

    public String getBarCode() {
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

        if (bonusPoints != that.bonusPoints) return false;
        return barCode != null ? barCode.equals(that.barCode) : that.barCode == null;
    }

    @Override
    public int hashCode() {
        int result = barCode != null ? barCode.hashCode() : 0;
        result = 31 * result + bonusPoints;
        return result;
    }
}
