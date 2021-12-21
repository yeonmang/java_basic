package day11.player;

public class Player {
    public String name; // 닉네임
    public int level; // 레벨
    public int hp; // 체력

    public Player(){

        level = 1;
        hp = 50;
    }

    public Player(String name,int level){
        name = name;
        level = level;
        hp = 50;
    }

    public void attack(Player target){
        System.out.println("this = " + this);
        System.out.println("target = " + target);

        System.out.printf("%s님이 %s님을 공격합니다.\n",this.name,target.name);
    }
}
