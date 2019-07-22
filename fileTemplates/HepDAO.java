package ${PACKAGE_NAME};  
#set($PARENT_PACKAGE_NAME=$PACKAGE_NAME.substring(0,$PACKAGE_NAME.lastIndexOf('.')))
#set($PARENT_PACKAGE_MODEL="com.hep.core.model")
#set($PARENT_PACKAGE_DAO="com.hep.core.daos")

import ${PARENT_PACKAGE_MODEL}.${NAME}Model;
import ${PARENT_PACKAGE_NAME}.Hep${NAME}DAO;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import org.apache.log4j.Logger;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

/**
 * @Title DefaultHep${NAME}DAO
 * @Description ${DESCRIPTION}
 * @Author ${USER}
 * @date: ${DATE}
 */  
public class DefaultHep${NAME}DAO extends DefaultGenericDao<${NAME}Model> implements Hep${NAME}DAO{
	/** logger */
    private static final Logger LOG = Logger.getLogger(DefaultHep${NAME}DAO.class);

   @Autowired
    private FlexibleSearchService flexibleSearchService;
   
    public DefaultHep${NAME}DAO() {
        super(${NAME}Model._TYPECODE);
    }

    /**
     * @Description: 
     * @Date: ${DATE}
     * @param ${findEntityBy__}
     * @return ${NAME}Model
     */
    @Override
    public ${NAME}Model get${NAME}By${findEntityBy__} (String ${findEntityBy__}){
        Map<String,Object> params=new HashMap();
        params.put(${NAME}Model.WRISTBANDID,${findEntityBy__});
        try {
           return find(params).get(0);
        }catch (Exception e){
            return null;
        }
    }

}
