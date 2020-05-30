package structural.proxy;

public class FileDataSourceService implements DataSourceService {

    @Override
    public String connectAndRetrieve(String schema) {
        return "File content";
    }

    @Override
    public Boolean isSourceAlive() {
        return true;
    }

}
