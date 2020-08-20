import java.util.*;

class AsciiCharSequence implements java.lang.CharSequence {
    private byte[] byteArray;

    public AsciiCharSequence(byte[] byteArray) {
        this.byteArray = byteArray;
    }

    @Override
    public int length() {
        return byteArray.length;
    }

    @Override
    public char charAt(int i) {
        return (char) byteArray[i];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new  AsciiCharSequence(Arrays.copyOfRange(this.byteArray, start, end));
    }

    @Override
    public String toString() {
        return new String(this.byteArray);
    }
    // implementation
}
