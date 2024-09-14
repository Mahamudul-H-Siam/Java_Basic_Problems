package factorial;

public class FactorialDemo {
    int factCalculate(int num){
        if(num== 1){
            return 1;
        }
        else{
            return num* factCalculate(num-1);
        }
    }
}
