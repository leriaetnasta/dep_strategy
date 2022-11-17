public class Context2{
    private IStrategy strategy;
    public Context2(){
        this.strategy=new DefaultStrategyImpl();
    }
    public void process() {
        System.out.println("start");
        strategy.applyStrategy();
        System.out.println("Finish");
    }
    public void setStrategy(IStrategy strategy){
        this.strategy=strategy;
    }
}
