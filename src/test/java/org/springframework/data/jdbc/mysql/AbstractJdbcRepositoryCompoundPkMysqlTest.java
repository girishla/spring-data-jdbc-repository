package org.springframework.data.jdbc.mysql;

import org.springframework.data.jdbc.AbstractJdbcRepositoryCompoundPkTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static org.springframework.data.jdbc.mysql.AbstractJdbcRepositoryTestMysqlConfig.MYSQL_PORT;

/**
 * @author Tomasz Nurkiewicz
 * @since 1/9/13, 10:20 PM
 */
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = AbstractJdbcRepositoryTestMysqlConfig.class)
public class AbstractJdbcRepositoryCompoundPkMysqlTest extends AbstractJdbcRepositoryCompoundPkTest {
	public AbstractJdbcRepositoryCompoundPkMysqlTest() {
		super(MYSQL_PORT);
	}
}
