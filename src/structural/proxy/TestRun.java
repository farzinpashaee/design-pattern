package structural.proxy;

import creational.objectPool.DataSource;

public class TestRun {

    public static void main(String[] args) {

        DataSourceService service = new DataSourceLogProxy(new FileDataSourceService());
        System.out.println( service.connectAndRetrieve("file:///") );

        /*DataSourcePublisher publisher = new DataSourcePublisher( new DataSourceLogProxy(new FileDataSourceService()) );
        publisher.publish();

        DataSourcePublisher publisher2 = new DataSourcePublisher( new FileDataSourceService() );
        publisher2.publish();*/

    }

}
