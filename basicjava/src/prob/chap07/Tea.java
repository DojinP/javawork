package prob.chap07;

public class Tea extends Beverage{
    static int amount;

    public Tea(String name) {
    	super(name);
    	// db에 저장된 내역을 조회해서 작업하면 되므로
    	// static 변수에 누적하는 작업은 하지 않는다.
    	// => static 변수를 사용하지 않고 배열에 저장
    	// 
        amount++;
        calcPrice();
    }

    @Override
    public void calcPrice() {
        if(getName().equals("lemonTea")){
            price = 1500;
        }else if(getName().equals("ginsengTea")){
            price = 2000;
        }else if (getName().equals("redginsengTea")) {
            price = 2500;
        }
    }
}
