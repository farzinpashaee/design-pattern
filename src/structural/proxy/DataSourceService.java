package structural.proxy;

public interface DataSourceService {

    public String connectAndRetrieve(String schema);
    public Boolean isSourceAlive();

}
