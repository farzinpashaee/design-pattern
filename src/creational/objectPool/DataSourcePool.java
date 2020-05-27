package creational.objectPool;

public class DataSourcePool extends ObjectPool<DataSource> {
    @Override
    public DataSource create() {
        return new DataSource();
    }

    @Override
    public void expire(DataSource dataSource) {
        dataSource = null;
    }
}
