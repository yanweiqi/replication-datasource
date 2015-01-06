package kr.pe.kwonnam.replicationdatasource;

import kr.pe.kwonnam.replicationdatasource.config.WithLazyReplicationConnectionDataSourceProxyConfig;
import org.springframework.test.context.ContextConfiguration;

/**
 * Replication with {@link kr.pe.kwonnam.replicationdatasource.routingdatasource.ReplicationRoutingDataSource}.
 *
 */
@ContextConfiguration(classes = {WithLazyReplicationConnectionDataSourceProxyConfig.class})
public class ReplicationRoutingDataSourceIntegrationTest extends AbstractReplicationDataSourceIntegrationTest {
}
