package ${PACKAGE_NAME};  
#set($PARENT_PACKAGE_NAME=$PACKAGE_NAME.substring(0,$PACKAGE_NAME.lastIndexOf('.')))
#set($PARENT_PACKAGE_MODEL="com.hep.core.model")
#set($PARENT_PACKAGE_DAO="com.hep.core.daos")

import ${PARENT_PACKAGE_MODEL}.${NAME}Model;
import java.util.HashMap;
import java.util.Map;

/**
 * @Title DefaultHep${NAME}DAO
 * @Description ${DESCRIPTION}
 * @Author ${USER}
 * @date: ${DATE}
 */  
public class IHep${NAME}DAO {
  
    /**
     * @Description: 通过${findEntityBy__}查询${NAME}Model  ImplDAO
     * @Date: ${DATE}
     * @param ${findEntityBy__}
     * @return ${NAME}Model
     */
    public ${NAME}Model get${NAME}ModelBy${findEntityBy__} (String ${findEntityBy__});

}
