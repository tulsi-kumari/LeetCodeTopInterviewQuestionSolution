package Medium;

public class MxNGridPrblem {
    //We have to tell the total number of permutations of the above given word. So, decrease both m & n by 1 and apply following formula:-
    //
    //Total permutations = (m+n)! / (m! * n!)
    public int uniquePaths(int m, int n) {
        if(m == 1 || n == 1)
            return 1;
        m--;
        n--;
        if(m < n) {              // Swap, so that m is the bigger number
            m = m + n;
            n = m - n;
            m = m - n;
        }
        long res = 1;
        int j = 1;
        for(int i = m+1; i <= m+n; i++, j++){       // Instead of taking factorial, keep on multiply & divide
            res *= i;
            res /= j;
        }

        return (int)res;
    }
}
