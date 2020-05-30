package behavioural.chainOfResponsibility;

public class SecurityHandler extends RequestHandlerAbstract {

    @Override
    public Response process(Request request, Response response) {
        System.out.println("Security Handler");
        if( !request.getToken().equals("X"))
            return new Response(10,403, "Not Authorized");
        return processNext(request,response);
    }

}
