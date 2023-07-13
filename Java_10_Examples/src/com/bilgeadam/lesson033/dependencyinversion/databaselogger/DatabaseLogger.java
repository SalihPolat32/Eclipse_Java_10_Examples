package com.bilgeadam.lesson033.dependencyinversion.databaselogger;

public class DatabaseLogger {
	
	MongoDb mongoDb = new MongoDb();
	PostgreSql postgreSql = new PostgreSql();

	public void logToMongo(String ex) {

		mongoDb.Log(ex);
	}

	public void logToPostgre(String ex) {

		postgreSql.Log(ex);
	}
}