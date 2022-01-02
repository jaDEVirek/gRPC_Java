package org.jadevirek.database;

import com.google.cloud.spanner.DatabaseClient;
import com.google.cloud.spanner.DatabaseId;
import com.google.cloud.spanner.Spanner;
import com.google.cloud.spanner.SpannerOptions;

public final class DatabaseConfig {

    private Spanner createSpannerService() {
        SpannerOptions options = SpannerOptions.newBuilder()
                .build();
        return options.getService();
    }

    private DatabaseClient createDbClient(Spanner spanner) {
        SpannerOptions options = spanner.getOptions();
        String instance = "donnelson-dev-testing";
        String database = "donnelson-db";

        // Creates a database client
        return spanner.getDatabaseClient(DatabaseId.of(options.getProjectId(), instance, database));
    }
}
