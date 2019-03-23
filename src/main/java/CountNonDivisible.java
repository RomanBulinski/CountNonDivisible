
public class CountNonDivisible {


    public int[] solution(int[] A){
        int[] result = new int[A.length];
        for (int i = 0; i<A.length; i++){
            int counter =0;
            for (int j = 0; j<A.length; j++){
                if(A[i]/A[j]!=0 ){
                    counter++;
                }
            }
            result[i]=counter;
        }
        return result;
    }



}
