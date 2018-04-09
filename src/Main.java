import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Card> C1 = new ArrayList<Card>();
        boolean a = true;
        while (a){
            int size = C1.size();
            System.out.println("功能表");
            System.out.println("=======================================");
            System.out.println("1. 新增卡片");
            System.out.println("2. 查詢卡片");
            System.out.println("3. 刪除卡片");
            System.out.println("0. 結束使用");
            System.out.println("=======================================");
            int x = scn.nextInt();
            switch (x){
                case 1 :
                    System.out.println("輸入名字");
                    String name = scn.next();
                    System.out.println("輸入種族");
                    String ethnicity = scn.next();
                    System.out.println("輸入生命力");
                    int life = scn.nextInt();
                    System.out.println("輸入攻擊力");
                    int attack = scn.nextInt();
                    System.out.println("輸入回復力");
                    int resilence = scn.nextInt();
                    System.out.println("選擇屬性");
                    System.out.println("1. 水\t2. 火\t3. 木\t4. 光\t5. 暗");
                    int y = scn.nextInt();
                    switch (y){
                        case 1 :
                            C1.add(new Water(name,ethnicity,life,attack,resilence));
                            break;
                        case 2 :
                            C1.add(new Fire(name,ethnicity,life,attack,resilence));
                            break;
                        case 3 :
                            C1.add(new Wood(name,ethnicity,life,attack,resilence));
                            break;
                        case 4 :
                            C1.add(new Light(name,ethnicity,life,attack,resilence));
                            break;
                        case 5 :
                            C1.add(new Dark(name,ethnicity,life,attack,resilence));
                            break;
                    }
                    break;
                case 2 :
                    int i = 0 ;
                    System.out.println("請輸入名字");
                    String search = scn.next();
                    while (i < size){
                        Card searchCard = (Card) C1.get(i);
                        if (search.equals(searchCard.getName())){
                            searchCard.show();
                            i = size;
                        }else {
                            i++;
                        }
                    }
                    break;
                case 3 :
                    int j = 0 ;
                    System.out.println("請輸入姓名");
                    String delCard = scn.next();
                    while (j < size){
                        Card dCard = C1.get(j);
                        if (delCard.equals(dCard.getName())){
                            C1.remove(j);
                            j = size;
                        }else {
                            j ++;
                        }
                    }
                    break;
                case 0 :
                    System.out.println("感謝使用");
                    a = false;
                    break;
            }
        }
    }
}

