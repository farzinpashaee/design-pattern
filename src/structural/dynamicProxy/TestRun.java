package structural.dynamicProxy;

import structural.proxy.DataSourceService;
import structural.proxy.FileDataSourceService;

import java.lang.reflect.Proxy;

public class TestRun {

    public static void main(String[] args) {

        SecurityHandler securityHandler = new SecurityHandler(new FileDataSourceService());
        DataSourceService service = (DataSourceService) Proxy.newProxyInstance(DataSourceService.class.getClassLoader(),
                new Class[] { DataSourceService.class },
                securityHandler);

        System.out.println(service.connectAndRetrieve("file:///"));
        System.out.println(service.isSourceAlive());

    }

}
