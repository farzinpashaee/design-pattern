package behavioural.chainOfResponsibility;

public abstract class  RequestHandlerAbstract implements RequestHandler {

    RequestHandler nextRequestHandler;

    public RequestHandler andThen( RequestHandler requestHandler ){
        nextRequestHandler = requestHandler;
        return requestHandler;
    }

    public Response processNext(Request request, Response response){
        if(nextRequestHandler != null)
            return nextRequestHandler.process(request,response);
        return response;
    }

}
