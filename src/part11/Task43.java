package part11;
class text{
    public void show(){};
};
class stroka {

    text asd;
    public void error(){

try {
    asd.show();
}catch (NullPointerException e){
    System.err.println("Error");
}finally {
    System.err.println("end");
}

    }
};

public class Task43 {
    public static void main(String[] args) {
        stroka asd=new stroka();
        asd.error();
    }}