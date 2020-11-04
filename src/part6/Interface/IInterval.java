package part6.Interface;

public interface IInterval {
    default int AllSecond(int Hour, int Minuts, int Second) {
        return Allsecond(Hour, Minuts, Second);
    }
    private int Allsecond(int Hour, int Minuts, int Second){
        int allsec=Hour*3600+Minuts*60+Second;
        return allsec;
    }
    default  int AllMinuts(int allsec){
        int allmin=allsec/60;
        return allmin;
    }
    default  int AllHour(int allsec){
        int allhour=allsec/3600;
        return allhour;
    }
    default int compareTo(int allsecondFirst, int allsecondSecond){
        int k=0;
        if (allsecondFirst>allsecondSecond);
        k=-1;
        if(allsecondFirst==allsecondSecond);
        k=0;
        if(allsecondFirst<allsecondSecond);
        k=1;
        return k;



    }
}
