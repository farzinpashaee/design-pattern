package behavioural.chainOfResponsibility;

public class Response {

    private int size;
    private int statusCode;
    private String content;

    public Response(int size, String content) {
        this.size = size;
        this.content = content;
    }

    public Response(int size, int statusCode, String content) {
        this.size = size;
        this.statusCode = statusCode;
        this.content = content;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public String toString() {
        return "Request{" +
                "id=" + size +
                ", content=" + content +
                '}';
    }
}
