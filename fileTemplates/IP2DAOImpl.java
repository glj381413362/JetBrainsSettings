package ${PACKAGE_NAME};  
#set($PARENT_PACKAGE_NAME=$PACKAGE_NAME.substring(0,$PACKAGE_NAME.lastIndexOf('.')))
#set($PARENT_PACKAGE_MODEL="com.hep.core.model")
#set($PARENT_PACKAGE_DAO="com.hep.core.daos")
#set($LOWER_NAME = ${NAME.substring(0,1).toLowerCase()}+${NAME.substring(1)})
#set($LOWER_ALLNAME = ${NAME.toLowerCase()})

import com.hep.core.daos.HepBaseDAO;
import com.hep.core.daos.Hep${NAME}DAO;
import de.hybris.platform.core.model.ItemModel;

/**
 * @Title DefaultHep${NAME}DAO
 * @Description
 * @Author ${USER}
 * @date: ${DATE} ${TIME}
 */
public class DefaultHep${NAME}DAO extends DefaultHepBaseDAO implements Hep${NAME}DAO {
    public DefaultHep${NAME}DAO(String typecode) {
        super(typecode);
    }
}
