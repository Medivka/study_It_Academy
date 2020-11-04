package Part8;


public interface ITask34 {
    default int Zarplata(int Hour){
        return 24*Hour;
    }
    default int Zarplata(int Percent, int AllCash){
        return (AllCash*Percent)/100;

    }
    default int Zarplata(int percent, int AllCash, int Hour){
        return (AllCash*percent)/100+ 24*Hour;
    }

}
