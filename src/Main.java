public class Main {
    public static void main(String[] args) {
        //завдання 1
        System.out.println(" завдання 1");

        int n = 120;
        if (n > 50 & n < 100)
            System.out.println("міститься: " + n);

        else
            System.out.println("не міститься: " + n);

        //завдання 2
        System.out.println("авдання 2");

        int a1 = 789;
        int b1 = a1/100;
        int c1 = (a1/10)%10;
        int d1 = a1%10;
        if (b1 > c1 & b1 > d1)
            System.out.println(b1);
        if (c1 > d1 & c1 > b1)
            System.out.println(c1);
        else
            System.out.println(d1);



        System.out.println("завдання 3");


        int a = 1; //початковий поверх
        int b = 6; //введений вами поверх
        if(b>0 & b<=9){ //перевірка чи існує поверх
            if(b==a){//перевірка чи знаходиться ви на поверсі який вам потрібно
                System.out.println("ви зараз знаходиться на 6 поверсі");

            }
            //вгору
            if(b>a){
                if(b==2){
                    System.out.println("Ви піднялися на 3 поверх");
                }else if(b == 3){
                    System.out.println("Ви піднялися на 3 поверх");
                }else if(b == 4){
                    System.out.println("Ви піднялися на 4 поверх");
                }else if(b == 5){
                    System.out.println("Ви піднялися на 5 поверх");
                }else if(b == 6){
                    System.out.println("Ви піднялися на 6 поверх");
                }else if(b == 7){
                    System.out.println("Ви піднялися на 7 поверх");
                }else if(b == 8){
                    System.out.println("Ви піднялися на 8 поверх");
                }else if(b == 9){
                    System.out.println("Ви піднялися на 9 поверх");
                }


            }
            //вниз
            if(b<a){
                if(b == 8){
                    System.out.println("Ви спустилися на 8 поверх");
                }else if(b == 7){
                    System.out.println("Ви спустились на 7 поверх");
                }else if(b == 6){
                    System.out.println("Ви спустились на 6 поверх");
                }else if(b == 5){
                    System.out.println("Ви спустились на 5 поверх");
                }else if(b == 4){
                    System.out.println("Ви спустились на 4 поверх");
                }else if(b == 3){
                    System.out.println("Ви спустилисьна 3 поверх");
                }else if(b == 2){
                    System.out.println("Ви спустились на 2 поверх");
                }else if(b == 1){
                    System.out.println("Ви спустились на 1 поверх");
                }
            }

        }
        else{
            System.out.println("ви ввели неіснуючий поверх");
        }
        System.out.println("завдання 4");

        String  с = "NO";
        switch(с){
            case "так":
            case "OK":
            case "YES":
            case "Y":
            case "+":
            case "Ok":
                System.out.println("Я погоджуюсь!");
                break;
            case "Ні":
            case "NO":
            case "N":
            case "-":
            case "No":
                System.out.println("Я відмовляюсь!");
                break;
        }
    }
}