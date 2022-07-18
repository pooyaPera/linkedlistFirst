public class linky {

    public int iData;
    public linky next;

    public linky (int d){
        iData = d;
        next = null;
    }

    public void displayLink(){

        System.out.println(iData);
    }
}
