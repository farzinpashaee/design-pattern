package structural.proxy;


public class DataSourcePublisher {

    DataSourceService dataSourceService = new FileDataSourceService();

    public void publish(){
        System.out.println("publishing "+dataSourceService.connectAndRetrieve("file:///c:..."));
    }
}
