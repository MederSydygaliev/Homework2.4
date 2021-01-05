package com.company;

public class Runner extends Thread {
    private final int numbers;

    public Runner(String name, int numbers) {
        super(name);
        this.numbers = numbers;
    }

    @Override
    public void run() {
        super.run();
        System.out.println(this.getName() + this.numbers + " берет палочку");
        System.out.println(this.getName() + this.numbers + "  бежит к  " + this.getName() + (this.numbers + 1));
        if(this.numbers==4) {
            for (int i = this.numbers+1; i > 0; i--) {
                try{
                    Runner.sleep(1000);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(i==1){
                    System.out.println(this.getName()+1+" берет палочку и финиширует");
                    break;
                }
                System.out.println(this.getName() + i + " берет палочку");
                System.out.println(this.getName() + i + "  бежит к  " + this.getName() + (i- 1));
            }
        }
    }
}