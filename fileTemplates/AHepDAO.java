package ${PACKAGE_NAME};  
#set($PARENT_PACKAGE_NAME=$PACKAGE_NAME.substring(0,$PACKAGE_NAME.lastIndexOf('.')))
#set($PARENT_PACKAGE_MODEL="com.hep.core.model")
#set($PARENT_PACKAGE_DAO="com.hep.core.daos")

import ${PARENT_PACKAGE_MODEL}.${NAME}Model;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Title DefaultHep${NAME}DAO
 * @Description ${DESCRIPTION}
 * @Author ${USER}
 * @date: ${DATE}
 */  
@Component(value = "hep${NAME}DAO")
public class DefaultHep${NAME}DAO extends DefaultGenericDao<${NAME}Model> implements IHep${NAME}DAO{
   /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(DefaultHep${NAME}Service.class);
   @Autowired
    private FlexibleSearchService flexibleSearchService;
   

    /**
     * @Description: 通过${findEntityBy__}查询${NAME}Model  ImplDAO
     * @Date: ${DATE}
     * @param ${findEntityBy__}
     * @return ${NAME}Model
     */
    @Override
    public ${NAME}Model get${NAME}ModelBy${findEntityBy__} (String ${findEntityBy__}){
        Map<String,Object> params=new HashMap();
        params.put(${NAME}Model.WRISTBANDID,${findEntityBy__});
        try {
           return find(params).get(0);
        }catch (Exception e){
            return null;
        }
    }

}
