public class bar {




    public Human createHuman(int age, String name){
        Human human = new Human();
        human.setAge(age);
        human.setName(name);
        return human;
    }

    public Pivo buyPivo(Integer cash, int pizduk){
        Pivo pivo = new Pivo();
        pivo.setCost(cash);
        if (pivo.getCost() > 50) {
            pivo.setName("темное");
        }
        if (cash < 50){
            pivo.setName("светлое");
        }

        if (pizduk < 18 || cash <= 0){
            pivo.setName("пошел нахуй пиздюк");
            pivo.setSale(false);
            return pivo;
        }
        pivo.setSale(true);
        return pivo;
    }

    public void fillForExample(){
        String slovo = "Иди на хуй";
        int age = 0;

        for (int i = 0; i < 20; i++){
            if (i == 15){
                continue;
            }

            if (i == 18){
                return;
            }
            System.out.println(i + "итерация # " + i + " ");

        }
    }

    private boolean isPrivateMethod(){
        return true;
    }




}

