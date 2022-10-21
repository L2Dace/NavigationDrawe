package Manga;

public class Manga {

    private int resourceImg;
    private String name;

    public Manga(int resourceImg, String name) {
        this.resourceImg = resourceImg;
        this.name = name;
    }

    public int getResourceImg() {
        return resourceImg;
    }

    public void setResourceImg(int resourceImg) {
        this.resourceImg = resourceImg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
