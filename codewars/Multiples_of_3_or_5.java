package codewars;

public class Multiples_of_3_or_5 {
    /*
    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in. Additionally, if the number is negative, return 0 (for languages that do have them).

Note: If the number is a multiple of both 3 and 5, only count it once.
     */
    public int solution(int number) {
        //TODO: Code stuff here
        int n1, solution=0;

        for(int i =1; i<number;i++){
            n1 = number-i;

            if(n1 % 3 == 0 && n1 % 5 == 0){
                solution+=n1;
            }else if(n1 % 3 == 0 || n1 % 5 ==0){
                solution+=n1;
            }
        }
        return solution;}
}
