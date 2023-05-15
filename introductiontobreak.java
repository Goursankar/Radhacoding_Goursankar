import java.util.Scanner;
class introductiontobreak{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of songs present in the playlist Motivational songs");
        int playlist= sc.nextInt();
        int song;
        Motivationalsongs:for(song=1;song<=playlist;song++){
            if(song==9){
                break Motivationalsongs;
            }
        }
        System.out.println("Total Songs to be played in the playlist Motivational songs are "+song);
    }
}