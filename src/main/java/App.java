public class App {
    public static void main(String[] args) {
        Context2 context=new Context2();
        context.process();
        context.setStrategy(new StrategyImpl1());
        context.process();
        context.setStrategy(new StrategyImpl2());
        context.process();
        context.setStrategy(new StrategyImpl3());
        context.process();
    }
}
