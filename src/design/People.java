package design;

public  abstract class People {
    public double getHeight() {
        return height;

    }

    public void setHeight(double height) {
        this.height = height;
    }

    private double height;

    public String getBackground(String backgroud) {
        String background;
        this.background = background;
    }


    private String backgroud;
    public static final String type = "Excellent";

    public People(double height, String backgroud) {
        this.height = height;
        this.backgroud = backgroud;
    }

    public People() {

    }

    public String job() {
        System.out.println("Work starts at 9 am and finish at 5pm");
        String ans = "Work starts at 9 am and finish at 5pm";
        return ans;
    }

    public abstract double foodBill();

    public String function() {

        System.out.println("Lunch time");
        return "Lunch time";


    }
}

