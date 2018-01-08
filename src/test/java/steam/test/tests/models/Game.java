package steam.test.tests.models;

import org.jetbrains.annotations.NotNull;

public class Game implements Comparable<Game>{
    private String url;
    private float discount_pct;
    private float discount_original_price;
    private float discount_final_price;

    public Game(String url, float discount_pct, float discount_original_price, float discount_final_price) {
        this.url = url;
        this.discount_pct = discount_pct;
        this.discount_original_price = discount_original_price;
        this.discount_final_price = discount_final_price;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public int compareTo(@NotNull Game o) {
        return (int) (this.discount_pct-o.discount_pct);
    }

    @Override
    public String toString() {
        return "Game{" +
                "url='" + url + '\'' +
                ", discount_pct=" + discount_pct +
                ", discount_original_price=" + discount_original_price +
                ", discount_final_price=" + discount_final_price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Game game = (Game) o;

        if (Float.compare(game.discount_pct, discount_pct) != 0) return false;
        if (Float.compare(game.discount_original_price, discount_original_price) != 0) return false;
        return Float.compare(game.discount_final_price, discount_final_price) == 0;
    }

    @Override
    public int hashCode() {
        int result = (discount_pct != +0.0f ? Float.floatToIntBits(discount_pct) : 0);
        result = 31 * result + (discount_original_price != +0.0f ? Float.floatToIntBits(discount_original_price) : 0);
        result = 31 * result + (discount_final_price != +0.0f ? Float.floatToIntBits(discount_final_price) : 0);
        return result;
    }
}