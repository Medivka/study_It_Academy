package part11;
class text1{
    public void show(){};
};
class stroka1 {

    text1 asd;
    public void error(){
    asd.show();

}};

public class Task45 {
    public static void main(String[] args) {
        stroka1 asd=new stroka1();
        try {
        asd.error();
        }catch (NullPointerException e){
            System.err.println("Error");
    }}}