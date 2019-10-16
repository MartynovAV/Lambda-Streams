package techPrimers;
//https://www.youtube.com/watch?v=Pr-p5LNjS0c
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LambdaTest {
    public static void main(String[] args) {

        Game football=new Game() {
            @Override
            public void play() {
                System.out.println("Im playing football");
            }
        };
        Game cricket=new Game() {
            @Override
            public void play() {
                System.out.println("Im playing cricket");
            }
        };
        football.play();
        cricket.play();

        Game footballLambda=()->
                System.out.println("Im playing football");
        footballLambda.play();


        Series odiSeries=(type)->
                System.out.println("Its "+type+ " series");
        odiSeries.play("ODI");

        List<String> players= Arrays.asList(
                "Tom","John","Kate","Jack","Freddy",
                "Julie","Robert","Ava","Aleks","Lucie"
        );
        System.out.println();

        boolean AleksFlag=false;
        for(String player:players){
            if(player.equals("Kate")){
                System.out.println("Yes, Kate is in the team");
                AleksFlag=true;
            }
        }
        if(AleksFlag){
            System.out.println("yes");
        }

        players.
                stream()
                .filter(player->player.equals("Aleks"))
                .forEach(player-> System.out.println("Yes Aleks is in the team"));


        Optional<String> aleks = players
                .stream()
                .filter(player -> player.equals("Aleks"))
                .findFirst();

        if(aleks.isPresent()){
            System.out.println("yes");
        }

    }
}

interface Game{
    void play();
}

interface Series{
    void play(String type);
}
