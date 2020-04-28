package test.java.tests;
public class Party {
    public static void main(String[] args) {
        //public void buildlnvite() {
//            Frame f = new Frame();
//            Label l = new Label("Вечеринка у Тима");
//            Button b = new Button("Ваша ставка");
//            Button c = new Button("Сбровить");
//            Panel p = new Panel();
//            p.add(l);
//
//        }
         int min = 10;
         int max = 75;
         int total = total(min, max);
        System.out.println("Случайное число: " + total);
    }
        private static int total ( int min, int max){
        max-=min;
            return (int)(Math.random()* ++max)+min;
        }
    }
