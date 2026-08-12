package lang.object.ex;

import java.util.Objects;

public class RectangleEx {

    private int width;
    private int height;

    public RectangleEx(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "RectangleEx{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        RectangleEx that = (RectangleEx) object;
        return width == that.width && height == that.height;
    }

}
