package libraryInterfaces;

public class GaussianBlurInterface {
    static {
        String libraryPath = System.getProperty("user.dir") + "\\Libraries\\GaussianBlurLibrary\\GaussianBlurLib.dll";
        System.load(libraryPath);
    }

    public static native Pixel[][] applyGaussianBlur(Pixel[][] image, float radius);
}
