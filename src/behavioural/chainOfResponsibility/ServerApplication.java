package behavioural.chainOfResponsibility;

public class ServerApplication {


    public void processRequest(Request request){

        RequestHandler requestHandler = new SecurityHandler();
        requestHandler.andThen(new ContentHandler()).andThen(new EncodeHandler());
        System.out.println(requestHandler.process(request,null));

    }

}
