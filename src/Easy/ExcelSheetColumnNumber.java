package Easy;

public class ExcelSheetColumnNumber {
    //Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding
    // column number.
    public static void main(String[] args) {
        System.out.println(titleToNumber("AB"));
    }
    public static int titleToNumber(String columnTitle) {
        return help(columnTitle.length()-1,columnTitle,0);
    }
    public static int help(int i,String str,int k){
        if(i==0){
            return (int)str.charAt(k)-64;
        }
        int temp=1;
        for(int j=i;j>0;j--){
            temp*=26;
        }
        int x=(int)str.charAt(k)-64;
        return temp*x +help(i-1,str,k+1);
    }
}
