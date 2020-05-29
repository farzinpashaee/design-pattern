package structural.dynamicProxy;

import structural.proxy.DataSourceService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SecurityHandler implements InvocationHandler {

    DataSourceService dataSourceService;
    public SecurityHandler(DataSourceService dataSourceService){
        this.dataSourceService = dataSourceService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before");
        System.out.println("Checking user access...");
        Object response = method.invoke(dataSourceService,args);
        System.out.println("After");
        return response;
    }
}
