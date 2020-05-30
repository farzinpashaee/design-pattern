package behavioural.chainOfResponsibility;

public class Request {

    private String token;
    private String resource;

    public Request(String resource) {
        this.resource = resource;
    }

    public Request(String token, String resource) {
        this.token = token;
        this.resource = resource;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    @Override
    public String toString() {
        return "Request{" +
                ", resource=" + resource +
                '}';
    }
}
