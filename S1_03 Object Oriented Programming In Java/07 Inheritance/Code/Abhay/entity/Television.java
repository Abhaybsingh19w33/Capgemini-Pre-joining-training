package Abhay.entity;

public class Television extends Product
{   
    private String screenType;
    private int screenSize;

    public Television() {

    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public void print() {
        super.print();
        System.out.println("Screen Type    = " + screenType);
        System.out.println("Screen Size    = " + screenSize);
  }
}

