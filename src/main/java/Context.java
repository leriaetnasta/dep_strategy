public class Context {
    public void process(int type){
        System.out.println("Start");

        if (type==1){
            System.out.println("Intermediate stage with strategy "+type);

        }
        else if(type==2) {
            System.out.println("Intermediate stage with strategy "+type);
        }
        else if (type==3) {
            System.out.println("Intermediate stage with strategy "+type);

        }
        System.out.println("Finish");

    }
}
