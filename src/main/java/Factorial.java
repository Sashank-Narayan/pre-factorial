import java.util.ArrayList;
import java.util.List;

public class Factorial{
    int num;
    List<Integer> fact_list = new ArrayList<>();
    Factorial(int fact_num){
        this.num = fact_num;
    }
    List<Integer> factorial(){
        if(num == 0) {
            fact_list.add(1);
            return fact_list;
        }

        for(int i=1; i <= num/2; i++){
            if(num%i == 0)
                fact_list.add(i);
        }
        return fact_list;
    }
}
