public class Main {
    public static void main(String[] args){
        bar bar = new bar();
        Human human = bar.createHuman(32, "Oleg");
        int i = 0;
        Pivo pivo = bar.buyPivo(35, human.getAge());

        bar.fillForExample();
    }
}
