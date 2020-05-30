package behavioural.chainOfResponsibility;

public class EncodeHandler extends RequestHandlerAbstract {
    @Override
    public Response process(Request request, Response response) {
        System.out.println("Encode Handler");
        response.setContent( "ENCODED: " + response.getContent());
        return processNext(request,response);
    }
}
