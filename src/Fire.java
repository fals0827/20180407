public class Fire extends Card {
    private String attributes;
    public Fire (String name1, String ethnicity1, int life1, int attack1, int resilence1){
        super(name1, ethnicity1, life1, attack1, resilence1);
        this.setAttributes();
    }
    public void setAttributes(){
        this.attributes = "火";
    }
    public String getAttributes() {
        return attributes;
    }
    public void show (){
        System.out.println("==============================================================================");
        System.out.println("名字:\t"+getName());
        System.out.println("種族:\t"+getEthnicity());
        System.out.println("生命力:\t"+getLife());
        System.out.println("攻擊力:\t"+getAttack());
        System.out.println("回復力:\t"+getResilence());
        System.out.println("屬性:\t"+getAttributes());
        System.out.println("==============================================================================");
    }
}
