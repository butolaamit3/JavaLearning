class Gta{

    public void fight(){
        System.out.println("Fighting with enemy");
    }

    public void hit(){
        System.out.println("Hitting the enemy");
    }

    public void fire(){
        System.out.println("Firirng on the enemy");
    }
}

public class Ch8_PP5_Class_Game {
    public static void main(String[] args){
        Gta player1 = new Gta();
        player1.fight();
        player1.hit();
        player1.fire();
        
        System.out.println();
    }


    
}
