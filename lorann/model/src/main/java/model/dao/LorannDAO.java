package model.dao;

import java.io.File;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * <h1>The Class ExampleDAO.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class LorannDAO extends AbstractDAO {

    /** The sql example by id. */
    private static String sqlExampleById   = "{call findMAPbyId(?)}";

    /**
     * Gets the level by id.
     * @param blob 
     * @param i 
     *
     * @param id
     *            the id
     * @return the example by id
     * @throws SQLException
     *             the SQL exception
     */
    
    public LorannDAO(){
    	super();
    }
    
    public InputStream getLevelById(final int id) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlExampleById);
        InputStream streamMap = null;
        callStatement.setInt(1, id);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                Blob loranndao = result.getBlob("name");
                streamMap = loranndao.getBinaryStream();
            }
            result.close();
        }
        return streamMap;
    }
    
}

  