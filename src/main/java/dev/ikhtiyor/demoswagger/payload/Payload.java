package dev.ikhtiyor.demoswagger.payload;

public class Payload {
    private String src;
    private boolean check;

    @Override
    public String toString() {
        return "Request{" +
                "src='" + src + '\'' +
                ", check=" + check +
                '}';
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }
}
