package com.itacademy.jd2.lg.mobile_system.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;
@Repository
public interface PreparedStatementActionVoid {
	void doWithPreparedStatement(PreparedStatement preparedStatement) throws SQLException;

	PreparedStatement prepareStatement(Connection c) throws SQLException;
}