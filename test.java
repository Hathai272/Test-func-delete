// s = "This is thailand"
// r = "ai"
// my_fun(s,r) = "Ths s thlnd"
public class test {
    public static String delete(String a){
        String result = "";
        String finalResult = "";
        for(int i=0;i<a.length();i++){
            if (a.charAt(i) != 'a'){
                result += a.charAt(i);   
            }
        }
        for(int j=0;j<result.length();j++){
            if (result.charAt(j) != 'i'){
                finalResult += result.charAt(j);
            }
        }
    return finalResult;
    }

    public static void main(String[]args){
        String s = "This is thailand";
        System.out.print(delete(s));
    }
}
