package prob.chap07;

public abstract class Beverage {
    private String name;
    protected int price;

    public Beverage(String name){
        this.name = name;
    }

    public abstract void calcPrice();

    // 모든 객체의 멤버에 대해 접근하기 위해서는 
    // 객체 자신의 메소드를 통해서만 접근을 허용하는 것이 일반적이다. 
    public void print(){
    	System.out.println("판매 음료는 " + getName() + "이며, 가격은 " + getPrice());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
