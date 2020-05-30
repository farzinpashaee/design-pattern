package structural.proxy;

public class DataSourceLogProxy implements DataSourceService {

    DataSourceService dataSourceService;
    DataSourceLogProxy(DataSourceService sourceService){
        this.dataSourceService = sourceService;
    }

    @Override
    public String connectAndRetrieve(String schema) {
        System.out.println("do some logging");
        return dataSourceService.connectAndRetrieve(schema);
    }

    @Override
    public Boolean isSourceAlive() {
        return null;
    }


}
