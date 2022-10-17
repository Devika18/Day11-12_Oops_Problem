package Other;

import java.util.List;

public class StockModel {
    private List<Kitkat> Kitkat;
    private List<DairyMilk> DairyMilk;
    private List<FiveStar> FiveStar;
    private List<Munch> Munch;

    private int totalValueOfAllStock;

    public List<Kitkat> getKitkat() {
        return Kitkat;
    }

    public void setKitkat(List<Kitkat> kitkat) {
        Kitkat = kitkat;
    }

    public List<DairyMilk> getDairyMilk() {
        return DairyMilk;
    }

    public void setMarie(List<DairyMilk> dairymilk) {
        DairyMilk = dairymilk;
    }

    public List<FiveStar> getFiveStar() {
        return FiveStar;
    }

    public void setOreo(List<FiveStar> fivestar) {
        FiveStar = fivestar;
    }

    public List<Munch> getMunch() {
        return Munch;
    }

    public void setTiger(List<Munch> munch) {
        Munch = munch;
    }

    public int getTotalValueOfAllStock() {
        return totalValueOfAllStock;
    }

    public void setTotalValueOfAllStock(int totalValueOfAllStock) {
        this.totalValueOfAllStock = totalValueOfAllStock;
    }


}
