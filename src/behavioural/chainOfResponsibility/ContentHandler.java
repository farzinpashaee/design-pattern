package behavioural.chainOfResponsibility;

public class ContentHandler extends RequestHandlerAbstract {
    @Override
    public Response process(Request request, Response response) {
        System.out.println("Content Handler");
        String content = "<h1>Hello World</h1>";
        return processNext(request,new Response(content.length(),200,content));
    }
}
