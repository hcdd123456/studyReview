package code.compare;

/**
 * @author hc
 * @create 2020/10/10 0010 19:33
 */
public class Goods implements Comparable{

    private String name;

    private double price;

    public Goods() {
    }

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Goods){
            if(this.price > ((Goods) o).price){
                return 1;
            }else if(this.price <((Goods) o).price){
                return -1;
            }else {
                return this.name.compareTo(((Goods) o).name);
            }
        }
        throw new RuntimeException("数据不一致！");
    }
}
