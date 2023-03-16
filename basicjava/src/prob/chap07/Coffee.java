package prob.chap07;

public class Coffee extends Beverage{
    static int amount;
    // 물건이 구매되면 생성자가 호출
    public Coffee(String name) {
        super(name);
        amount++;
        calcPrice();
    }

    @Override
    public void calcPrice() {
        if(getName().equals("Americano")){
            price = 1500;
        }else if(getName().equals("CafeLatte")){
            price = 2500;
        }else if (getName().equals("Cappuccino")) {
            price = 3000;
        }
    }
}
