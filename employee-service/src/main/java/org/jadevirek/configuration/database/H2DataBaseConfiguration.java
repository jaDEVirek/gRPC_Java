package org.jadevirek.configuration.database;


import org.h2.tools.Server;
import org.jadevirek.configuration.annotations.DataConfiguration;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.sql.SQLException;
import java.util.logging.Logger;

@DataConfiguration
public final class H2DataBaseConfiguration {

    private static final Logger logger = Logger.getLogger(H2DataBaseConfiguration.class.getName());
    private static Server server;
    private static final String PERSISTENCE_UNIT_NAME = "h2config";
    private final EntityManager entityManager;
    private static volatile H2DataBaseConfiguration instance = null;

    private H2DataBaseConfiguration() {
        entityManager = Persistence.createEntityManagerFactory("h2config")
                .createEntityManager();
    }

    public static H2DataBaseConfiguration getDataBaseInstance() {
        if (instance != null) {
            return instance;
        } else {
            synchronized (H2DataBaseConfiguration.class) {
                if (instance == null) {
                    instance = new H2DataBaseConfiguration();
                }
                return instance;
            }
        }
    }

    public EntityManager getEntityManager() {
        return this.entityManager;
    }

    /*
     * Starts the database TCP server in case one needs to access it using a 3rd party(external) client
     *
     * */
    public static void startDatabase() throws SQLException {
        server = Server.createTcpServer()
                .start();
    }

    /*
     * Stops the database server
     *
     * */
    public static void stopDatabase() {
        server.stop();
    }
}
