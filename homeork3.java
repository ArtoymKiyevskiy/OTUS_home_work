import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;
public class gym {

    public static void main(String[]args){
        int a=0;
        Scanner scn=new Scanner(System.in);
        //a= scn.nextInt();
        String[] ask=new String[4];
        int[]ans=new int[ask.length];
        ask[0]="У какого легиона примарх имел железные руки?\n 1)Железные воины\n 2)Гвардия смерти" +
                "\n 3)Железные руки\n 4)Дети императора\n //################";
        ask[1]="Кто из примархов был подобен ангелу?\n 1)Мортарион\n 2)Сангвиний\n 3)Пертурабо\n " +
                "4)Аврелий\n //################";

        ask[2]="Какой легион остался лоялен Империуму, после событий Ереси Хоруса?\n 1)Железные воины" +
                "\n 2)Гвардия смерти\n 3)Железные руки\n 4)Дети императора";
        ask[3]="Бог заговоров и обмана?\n 1)Кхорн\n 2)Тзинч\n 3)Слаанеш\n 4)Нургл";
        int b;
        for(b=0; b<ask.length; b++){
            System.out.println(ask[b]);
            ans[b]= scn.nextInt();
            //System.out.print("\033[H\033[J"); ###очистка не помогает.
            System.out.println(ans[b]);
        }
        if (ans[0]==3){
            a++;
         }
        if (ans[1]==2){
            a++;
        }
        if (ans[2]==3){
            a++;
        }
        if (ans[3]==2){
            a++;
        }
        System.out.println("Результат: "+a);
        }
    }
	