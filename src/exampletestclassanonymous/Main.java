package exampletestclassanonymous;

public class Main {
    public static void main(String[] args) {

        BehaviorWhenPressed b = new BehaviorWhenPressed() {
            @Override
            public void action() {
                System.out.println("I am from class anonymous.");
            }
        };

        ButtonFirst buttonFirst = new ButtonFirst();
        buttonFirst.addAction(b);

    }
}

interface BehaviorWhenPressed{

    void action();

}

class ButtonFirst {

   void addAction(BehaviorWhenPressed b){
       b.action();
   }

}


