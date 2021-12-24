package day13.inherit;

public class Mage extends Player {
    public int mana;

    public Mage(String name) {
        this.name = name;
        this.level = 1;
        this.hp = 50;
    }
    public void info(){

        System.out.println("\n============= 캐릭터 정보 ================");
        System.out.println("# 아이디 : "+name);
        System.out.println("# 레벨 : " + level);
        System.out.println("# 체력 : " + hp);
        System.out.println("# 마력 : " + mana);
    }
}
