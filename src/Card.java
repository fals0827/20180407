public class Card {
    protected String name, ethnicity;
    protected int  life, attack, resilence;
    public Card (String name1, String ethnicity1, int life1, int attack1, int resilence1){
        this.setName(name1);
        this.setEthnicity(ethnicity1);
        this.setLife(life1);
        this.setAttack(attack1);
        this.setResilence(resilence1);
    }
    public void setName(String name1) {
        if (name1.length() > 30){
            this.name = name1.substring(0,30);
            System.out.println("Error:輸入格式有誤，已將輸入超過部分刪減");
        }else {
            this.name = name1;
        }
    }
    public void setEthnicity(String ethnicity1) {
        if (ethnicity1.length() > 5){
            this.ethnicity = ethnicity1.substring(0,5);
            System.out.println("Error:輸入格式有誤，已將輸入超過部分刪減");
        }else {
            this.ethnicity = ethnicity1;
        }
    }
    public void setLife(int life1) {
        if (life1 >= 0 && life1 <= 9999){
            this.life = life1;
        }else {
            this.life = 9999;
            System.out.println("Error:輸入格式有誤，已將輸入設定為9999");
        }
    }
    public void setAttack(int attack1) {
        if (attack1 >= 0 && attack1 <= 9999){
            this.attack = attack1;
        }else {
            this.attack = 9999;
            System.out.println("Error:輸入格式有誤，已將輸入設定為9999");
        }
    }
    public void setResilence(int resilence1) {
        if (resilence1 >= 0 && resilence1 <= 9999){
            this.resilence = resilence1;
        }else {
            this.resilence = 9999;
            System.out.println("Error:輸入格式有誤，已將輸入設定為9999");
        }
    }
    public String getName() {
        return name;
    }
    public String getEthnicity() {
        return ethnicity;
    }
    public int getLife() {
        return life;
    }
    public int getAttack() {
        return attack;
    }
    public int getResilence() {
        return resilence;
    }
    public void show (){
    }
}
