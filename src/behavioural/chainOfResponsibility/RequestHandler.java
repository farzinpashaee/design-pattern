package behavioural.chainOfResponsibility;

public interface RequestHandler {

    public RequestHandler andThen( RequestHandler requestHandler );
    public Response process( Request request , Response response);

}
