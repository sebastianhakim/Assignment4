public class App {
int playerAge;
String playerName;


public App(int age, String name) {

playerAge = age;
playerName = name;

}
public static void main(String[] args) {
App player = new App(38, "Ronaldo");
System.out.println(player.playerName + " is " + player.playerAge + " years old");
}

}