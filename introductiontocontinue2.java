public class introductiontocontinue2 {
    public static void main(String[] args) {
        int n=1;
        GauriShankar:while(n<51){
            if(n%3==0){
                n++;
                continue GauriShankar;
            }
            System.out.print(n+",");
            n++;
        }
    }
}
