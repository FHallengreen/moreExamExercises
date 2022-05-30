package exercise14;

public class Image {

    private String fileName;
    private int width;
    private int height;

    public Image(String fileName, int width, int height) {
        this.fileName = fileName;
        this.width = width;
        this.height = height;
        System.out.println(isKnownFileFormat());
        System.out.println(isPortrait());
        System.out.println(isLandscape());
    }

    public boolean isKnownFileFormat(){
        int findIndex = fileName.indexOf(".");
        String fileType = fileName.substring(findIndex);

        if (fileType.equals(".gif") || fileType.equals(".jpg") || fileType.equals(".jpeg") || fileType.equals(".png") ||
                fileType.equals(".webp") || fileType.equals(".bmp")){
            return true;
        }
        else return false;
    }

    public boolean isPortrait () {
        return height > width;
    }
    public boolean isLandscape(){
        return width > height;
    }


    public static void main(String[] args) {
        Image image = new Image("Godmorgensol.jpg",200,500);
    }
}
